package exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01_dados {

	public static void main(String[] args) {
		
		 Queue<String> clientesFila = new LinkedList<>();
		
		 
		 Scanner leia = new Scanner(System.in);

		 int clienteNum = 0;
		 String clientes;
		
		 do {
		 System.out.println("***********************************\n");
		 System.out.println("1 - Adicionar Cliente na Fila");
		 System.out.println("2 - Listar todos os clientes ");
		 System.out.println("3 - Retirar Cliente da fila ");
		 System.out.println("0 - Sair \n");
		 System.out.println("************************************\n");
		 System.out.println("Entre com a opção desejada :");
		 clienteNum = leia.nextInt();
		 leia.nextLine();
		 
		switch (clienteNum) {
		case 1: 
	            System.out.println("Digite o nome: ");
	            clientes = leia.nextLine();
	            clientesFila.add(clientes);
	            System.out.println("\nFila: \n");
	            System.out.println(clientesFila);
	            System.out.println("\nCliente Adicionado!");
	            break;
		case 2:
			System.out.println("\nLista de Clientes : " + clientesFila);
			break;
		case 3:
			 if (!clientesFila.isEmpty()) {
				 clientesFila.poll();
	                System.out.println("Fila: " + clientesFila +"\nO cliente foi chamado!");
	            } else {
	                System.out.println("A fila está vazia!");
	            }
			 break;
		case 0:
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Opção inválida. Tente novamente.");
			break;
		}
		 }while(clienteNum != 0);
	}


}
