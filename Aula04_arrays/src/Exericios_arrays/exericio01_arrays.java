package Exericios_arrays;

import java.util.Scanner;

public class exericio01_arrays {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int posicao = -1;
		
		System.out.print("\nDigite o número que você deseja encontrar: ");
        int numProcurado = leia.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == numProcurado) {
            posicao = i;
            }
        }

        if (posicao != -1) {
            System.out.println("\nO número " + numProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("\nO número " + numProcurado + " não foi encontrado!");
        }


	}

}
