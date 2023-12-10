package exercicios_aula03_laços;

import java.util.Scanner;

public class Exercicio03_aula03 {

	public static void main(String[] args) {
		 int x; 
		    int menores = 0; 
		    int maiores = 0;
				
		   Scanner leia = new Scanner(System.in);

			do {
		   System.out.print("Digite uma idade: ");
		   x = leia.nextInt();
			if(x>= 0) { 		
			  if(x < 21){
				  menores++;
			  }else if(x > 50) {
				  maiores++;
			}
			}  
			}while(x >= 0);
			
			System.out.println("Total de pessoas menores de 21 anos: " +menores);
			System.out.println("Total de pessoas maiores de 50 anos: " +maiores);
	}

}
