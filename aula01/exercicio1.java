package aula01;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitura = new Scanner(System.in);
	
		
		System.out.println("Digite seu salario:");
		float salario = leitura.nextFloat();
		System.out.print("Digite o Abono: ");
		float abono = leitura.nextFloat();
		
		System.out.println("Novo Salário: "+(salario+abono));
	
	}

}
