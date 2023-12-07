package exercícios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra1, palavra2, palavra3;
		String vertebrado, invertebrado, ave, mamifero, inseto, anelideo, carnivoro, onivoro, herbivoro, hematofago;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua primeira palavra:");
		palavra1 = leia.nextLine();
		System.out.println("Digite sua segunda palavra:");
		palavra2 = leia.nextLine();
		System.out.println("Digite sua terceira palavra:");
		palavra3 = leia.nextLine();
		
		if(palavra1.equals("vertebrado")){
			if(palavra2.equals("ave")) {
				if(palavra3.equals("carnivoro")) {
					System.out.println("aguia");
				}else {
					System.out.println("pomba");
				}
			}else {
				if(palavra3.equals("onivoro")) {
					System.out.println("homem");
				}else {
					System.out.println("vaca");
				}
			}
		}else {
			if(palavra2.equals("inseto")) {
				if(palavra3.equals("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			}if(palavra2.equals("anelideo")) {
				if(palavra3.equals("hematofago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("minhoca");
				}
			}
		}
	}
}

			
		


