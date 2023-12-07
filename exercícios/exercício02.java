package exercícios;

import java.util.Scanner;

public class exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		num = leia.nextInt();
		
		
		
		if(num % 2 == 0 && num >= 0) {
			System.out.println("O número " + num  + " é par e positivo!");
			
		}else if (num % 2 == 0 && num < 0) {
			System.out.println("O número " + num  + " é par e negativo!");
			
		}else if (num % 2 != 0 && num < 0) {
			System.out.println("O número " + num  + " é ímpar e negativo!");
		}else {
			System.out.println("O número " + num  + " é ímpar e positivo!");
		}

	}

}

