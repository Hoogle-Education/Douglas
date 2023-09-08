package com.douglas.convesor.program;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class HelpWindow extends JDialog implements ActionListener {
	
	
	private static final long serialVersionUID = 1L;

	private ImagePainter imgPainter;
	
	public HelpWindow(JFrame frame) {
		super(frame, "Conversor de Unidades", true);
		
		BorderLayout borderLayout = new BorderLayout(30, 50);
		this.setLayout(borderLayout);
		this.setSize(200, 600);
		
		imgPainter = new ImagePainter("logo.png");
		
		this.add(imgPainter, BorderLayout.WEST);
		
	}
	
	
	public void open() {
		this.setVisible(true);
	}
	
	public void close() {
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand()) {
			case "0":
				this.close();
				break;		
		}
		
	}
	
}
