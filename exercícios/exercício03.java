package exercícios;

import java.util.Scanner;

public class exercício03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade; 
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador:");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador:");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue:(true/false)");
		primeiraDoacao = leia.nextBoolean();
		
		
		
		if(idade > 18 && idade < 60) {
			System.out.println(nome + " está apto(a) para doar sangue");
			
		}else if (idade > 60 && idade < 69 && false){
			System.out.println(nome + " está apto(a) para doar sangue");
			
		}else if (idade > 60 && idade < 69 && true){
			System.out.println(nome + " não apto(a) para doar sangue");
		}else {
			System.out.println(nome + " não apto(a) para doar sangue");
		}

	}

}
