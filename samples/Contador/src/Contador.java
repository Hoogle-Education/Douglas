
public class Contador {

	public static void main(String[] args) {
		
//		int contador = 0;
//		
//		while ( contador <= 10 ) {
//		  System.out.println(contador);		  
//		  contador++;
//		}
		
		for (int i = 0; i <= 10 ; i++) {
			
			if ( i == 7 ) break;
			
			if ( i == 4 ) continue;
			
			System.out.println(i); 
			
		}
		
		int soma = 0;
		int numero = 1;
		int objetivo = 46;
		
		while ( true ) {					
			soma += numero;
			if (soma >= objetivo) break;
			numero++;
		}
		
		System.out.println("quantida necessária = " + numero);
	}
	
}
