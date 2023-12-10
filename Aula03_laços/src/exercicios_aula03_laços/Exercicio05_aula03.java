package exercicios_aula03_laços;

import java.util.Scanner;

public class Exercicio05_aula03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int num;
		int somaPositivos = 0;
		
		do {
			System.out.print("Digite um número:");
			num = leia.nextInt();
			
			if (num > 0) {
				somaPositivos += num;
			}
		
			
			
		}while(num != 0);
		
		System.out.println("A soma dos números positivos é:" +somaPositivos );
		
	}

}
