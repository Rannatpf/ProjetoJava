package aula01;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Nota 1:");
		float nota1 = leitura.nextFloat();
		System.out.print("Nota 2:");
		float nota2 = leitura.nextFloat();
		System.out.print("Nota 3:");
		float nota3 = leitura.nextFloat();
		System.out.print("Nota 4:");
		float nota4 = leitura.nextFloat();
		
		System.out.printf("Média final: %.1f ", + ((nota1+nota2+nota3+nota4)/4));
	}

}
