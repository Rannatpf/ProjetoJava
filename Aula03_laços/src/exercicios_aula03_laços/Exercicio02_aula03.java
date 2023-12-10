package exercicios_aula03_laços;

import java.util.Scanner;

public class Exercicio02_aula03 {

	public static void main(String[] args) {
		
		int num;
		int pares = 0;
		int impares = 0;
				
		
		Scanner leia = new Scanner(System.in);
		
		
		for(int i = 1; i<=10; i++) {
			System.out.print("Digite o "+i+"º numero: ");
				num = leia.nextInt();
				if(num % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
		}
		
		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("\nTotal de números ímpares: " + impares);
		}
	
	}

