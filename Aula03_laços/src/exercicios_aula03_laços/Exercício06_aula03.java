package exercicios_aula03_laços;

import java.util.Scanner;

public class Exercício06_aula03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		float somaMultiplos = 0;
		int contadorMultiplos = 0;
		float media = 0; 
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num != 0) {
//				soma de todos os multiplos por 3
				somaMultiplos += num;
//				conta a quantidade de numeros multiplos por 3 
				contadorMultiplos++;
			}
		
		}while(num != 0);
		
		if(contadorMultiplos > 0) {
		
		media = somaMultiplos/contadorMultiplos;
		}
		
		System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		

	}

}
