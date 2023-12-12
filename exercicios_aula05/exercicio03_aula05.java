package exercicios_aula05;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio03_aula05 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
	
         for (int i = 0; i < 10; i++) {
         System.out.print("Digite o valor " + (i + 1) + "º número: ");
         int numero = leia.nextInt();
         numeros.add(numero);
     }
         
         System.out.println("\nListar dados do Set:");
         Iterator <Integer> num = numeros.iterator();
         while (num.hasNext()) {
             System.out.println(num.next());
         }

         
	

}
}
