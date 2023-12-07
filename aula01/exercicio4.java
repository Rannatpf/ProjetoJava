package aula01;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leitura = new Scanner(System.in);
		
		System.out.print("numero1: ");
		float n1 = leitura.nextFloat();
		System.out.print("numero2: ");
		float n2 = leitura.nextFloat();
		System.out.print("numero3: ");
		float n3= leitura.nextFloat();
		System.out.print("numero4: ");
		float n4 = leitura.nextFloat();
	
		
		
		System.out.printf("Diferença:%.1f", + (n1*n2)-(n3*n4));
	}

}
