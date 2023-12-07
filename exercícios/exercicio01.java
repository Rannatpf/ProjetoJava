package exercícios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numA, numB, numC, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		numA = leia.nextInt();
		
		System.out.println("Digite o número B:");
		numB = leia.nextInt();
		
		System.out.println("Digite o número c:");
		numC = leia.nextInt();
		
		soma = numA + numB;
		
		
		if(soma > numC) {
			System.out.println(numA + "+" + numB + "=" + soma + ">" + numC);
			System.out.println("A Soma de A + B é Maior que C");
		}else if (soma < numC){
			System.out.println(numA + "+" + numB + "=" + soma +  "<" + numC);
			System.out.println("A Soma de A + B é Menor que C");
		}else {
			System.out.print(numA + "+" + numB + "=" + soma + "=" + numC);
			System.out.println("A Soma de A + B é Igual que C");
		}
		

	}

}
