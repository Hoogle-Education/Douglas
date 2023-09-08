package com.douglas.convesor.program;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

import com.douglas.convesor.enums.MeasureUnits;

public class ConversorApplication implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static Conversor conversor;

	JFrame frame;
	JTextField inputTextField, outputTextField;
	JComboBox inputUnitField, outputUnitField;
	
	public ConversorApplication() {
		conversor = new Conversor();

		String[] distances = {"Centimeter", "Hectometer", "Decameter", "Decimeter", "Hectometer", "Inch", "Kilometer", "Metre", "Micrometer", "Milimeter", "Nanometer", "Yard"};

		inputUnitField = new JComboBox(distances);

		inputTextField = new JTextField("Insira a unidade");
		outputTextField = new JTextField("Valor convertido");
		frame.add(inputTextField);

		frame.setSize(600, 300);
		frame.setLayout(new GridLayout(2, 2));
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ConversorApplication();
		
		double value = 1000;
		MeasureUnits actualUnit = MeasureUnits.CENTIMETER;
		MeasureUnits targetUnit = MeasureUnits.METRE;
		
		
        System.out.println(Arrays.toString(conversor.getConvertiblesUnits(actualUnit).toArray()));
        System.out.println(Arrays.toString(conversor.getConvertiblesUnits(targetUnit).toArray()));

        
		System.out.println(conversor.convert(value, actualUnit, targetUnit));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
