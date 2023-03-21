package exerciciosNotas;

import java.util.Scanner;

/*
 * Exercicio de Fatorial, programa que calcule de um numero inteiro fornecido pelo usuário.
 * Ex: 5! = 120 (5x 4x 3x 2x 1)
 */

public class ExercicioFatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial + " ! = ");
		for(int i = fatorial ; i >= 1 ; i --) {
			multiplicacao = multiplicacao*i;	
		}
		System.out.println(multiplicacao);
		
	}

}
