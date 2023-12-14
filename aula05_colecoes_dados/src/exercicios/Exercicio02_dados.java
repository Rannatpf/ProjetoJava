package exercicios;



import java.util.Scanner;
import java.util.Stack;

public class Exercicio02_dados {

	public static void main(String[] args) {
		
		         Stack <String> pilha = new Stack <String> ();
			
				 Scanner leia = new Scanner(System.in);

				 int livro = 0;
				 String nomeLivro;
				
				 do {
				 System.out.println("***********************************\n");
				 System.out.println("1 - Adicionar Livro na Pilha");
				 System.out.println("2 - Listar todos os livros ");
				 System.out.println("3 - Retirar livro da pilha ");
				 System.out.println("0 - Sair \n");
				 System.out.println("************************************\n");
				 System.out.println("Entre com a opção desejada :");
				 livro = leia.nextInt();
				 leia.nextLine();
				 
				switch (livro) {
				case 1: 
			            System.out.println("Digite o nome: ");
			            nomeLivro = leia.nextLine();
			            pilha.push(nomeLivro);
			            System.out.println("\nPilha: \n" + pilha + "\nCliente Adicionado!");
			          
			            break;
				case 2:
					System.out.println("\nLista de Clientes : " + pilha);
					break;
				case 3:
					 if (!pilha.isEmpty()) {
						 pilha.peek();
			                System.out.println("Fila: " + pilha +"\nO cliente foi chamado!");
			            } else {
			                System.out.println("A Pilha está vazia!");
			            }
					 break;
				case 0:
					System.out.println("Programa Finalizado!");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}
				 }while(livro != 0);
			}



	}


