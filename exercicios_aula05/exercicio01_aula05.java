package exercicios_aula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio01_aula05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		String cores2;
		
		
		 for (int i = 0; i < 5; i++) {
			 
				System.out.println("Digite uma cor: ");
				cores2 = leia.nextLine();
				cores.add(cores2);
		 	}
		 
		 System.out.println("\nListar todas as cores: ");
		 for (String lista : cores) {
	            System.out.println(lista);
	        }
		 
		 Collections.sort(cores);
		 
		 System.out.println("\nOrdenar as cores:");
		 
		 for (String list : cores) {
	            System.out.println(list);

	}
	}
}
