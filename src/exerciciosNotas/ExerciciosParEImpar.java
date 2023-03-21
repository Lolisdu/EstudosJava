package exerciciosNotas;

import java.util.Scanner;

public class ExerciciosParEImpar {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	 int quantNumeros;
	 int numeros;
	 int quantPares = 0 , quantImpares = 0 ;
	 
	 System.out.println("Quantidade de números: ");
	 quantNumeros = scan.nextInt();
	 
	 int count = 0;
	 
	 do {
		 System.out.println("Numeros: ");
		 numeros = scan.nextInt();
		 
		 if (numeros % 2 == 0 ) quantPares++;
		 else quantImpares++;
		 
		 count ++;
		 
	 } while (count < quantNumeros);
	 
	 System.out.println("Quantidade Par:  " + quantPares);
	 System.out.println("Quantidade Impar:  " + quantImpares);
	
	}

}
