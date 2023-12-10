package exercicios_aula03_laços;

import java.util.Scanner;

public class Exercicio04_aula03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, genero, dev;
		int totalDev = 0;
		int totalM = 0;
		int totalH = 0;
		int totalNB = 0;
		float contadorP = 0;
		int total = 0;
		float media; 
		String continuar = "S";
		
		
		
		do {
		System.out.print("Idade: ");
		idade = leia.nextInt();
		System.out.println("1 – Mulher Cis\n2 – Homem Cis\n3 – Não Binário\n4 – Mulher Trans\n5 – Homem Trans\n6 – Outros");
		System.out.print("Identidade de Gênero: ");
		genero = leia.nextInt();
		System.out.println("1 – Backend\r\n"
				+ "2 – Frontend\r\n"
				+ "3 – Mobile\r\n"
				+ "4 – FullStack\r\n");
		System.out.println("Pessoa desenvolvedora: ");
		dev = leia.nextInt();
		
		 if(dev == 1) {
			 totalDev++;
		 }
		 if((genero == 1 || genero == 4) && dev == 2) {
			 totalM++;
		 } 
		 if ((genero == 2 || genero == 5) && dev == 3 && idade > 40 ) {
			 totalH++;
		 }
		 if(genero == 3 && dev == 4 && idade > 30) {
			 totalNB++;
		 }
		 
		 contadorP+=idade;
		 total++;
		 media = contadorP/total;
		 
		 System.out.println("Deseja continuar(S/N): ");
		continuar = leia.next();
					
					
		}while (continuar.equals("S")) ;
		
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+totalDev);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+totalM);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+totalH);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+totalNB);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+total);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: "+media);
		
		}	
		}	
	

	


