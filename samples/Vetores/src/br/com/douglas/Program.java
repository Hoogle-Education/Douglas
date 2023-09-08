package br.com.douglas;

public class Program {

	public static void main(String[] args) {
		
		int[] array = new int[110];

		for (int i = 0; i < array.length; i++) {
		  array[i] = i;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
