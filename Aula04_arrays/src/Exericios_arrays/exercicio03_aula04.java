package Exericios_arrays;

import java.util.Scanner;

public class exercicio03_aula04 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		  int matrizInteiros[] [] = new int[3][3];
		  
			for (int i = 0; i <3; i++) {
				for (int j = 0; j <3; j++) {
					System.out.println("Digite um número para a posição ["+ i +"] ["+ j +"]: ");
					matrizInteiros [i][j] = leia.nextInt();
				}
				}	
			 System.out.println("Elementos da Diagonal Principal:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matrizInteiros[i][i] + " ");    
		        }
		        System.out.println("\nElementos da Diagonal Secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matrizInteiros[i][2 - i] + " ");
		        }
		        System.out.println();

		        int somaDiagonalPrincipal = 0;
		        int somaDiagonalSecundaria = 0;
			
		        for (int i = 0; i < 3; i++) {
		            somaDiagonalPrincipal += matrizInteiros[i][i];
		            somaDiagonalSecundaria += matrizInteiros[i][2 - i];
		        }       
		        System.out.println("Soma dos elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		        System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
         }
      }