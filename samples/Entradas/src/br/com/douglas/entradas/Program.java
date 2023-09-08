package br.com.douglas.entradas;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		
		int idade = sc.nextInt();
		sc.nextLine();
		
		String apelido = sc.nextLine();
		double altura = sc.nextDouble();
	
		System.out.println(nome + " || " + apelido);
		System.out.println(idade + " || " + altura );
		
	}
	
}
