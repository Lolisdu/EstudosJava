package exerciciosNotas;

/*
 * Crie um vetor de 6 números inteiros e mostre-os
 * na ordem inversa.
 */
public class ExercicioOrdemInversa {

	public static void main(String[] args) {

		int [] vetor = {2, -3, 15, 17, -8, 1};
		
		System.out.print(" Vetor: ");
		int count =0;
		while(count < (vetor.length -1)) {
			System.out.print(vetor[count] + " ");
			count ++;
		}
		 System.out.print("\nVetor:  ");
		 for(int i = (vetor.length - 1); i >= 0 ; i--) {
			 System.out.print(vetor[i] + " ");
		 }
	}

}
