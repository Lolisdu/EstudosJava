package exerciciosNotas;

import java.util.Scanner;

public class ExerciciosMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		int soma= 0;
		
		int count  = 0;
		
		do {
			
			System.out.println("Número: ");
			numero = scan.nextInt();
			soma = soma + numero;
			//System.out.println("Soma : " + soma);
			
			if(numero > maior) maior = numero;
			
			count = count + 1;
			//System.out.println("Maior : " + maior);
			
		} while(count < 5);
		
		System.out.println("Maior : " + maior);
		System.out.println("Media : " + (soma/5));
	}

}
