package aula01;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		float salarioBruto = leitura.nextFloat();
		System.out.print("Adicional Noturno: ");
		float adicionalNoturno = leitura.nextFloat();
		System.out.print("Horas extras: ");
		float horasExtras = leitura.nextFloat();
		System.out.print("Descontos: ");
		float descontos = leitura.nextFloat();
	
		
		
		System.out.printf("Salário Líquido: %.2f ", + (salarioBruto+adicionalNoturno+(horasExtras*5)+(-descontos)));
	}

}
