package exercícios;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int codigo, quantidade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Produto (1 a 6):");
		codigo = leia.nextInt();
		System.out.println("Quantidade");
		quantidade = leia.nextInt();
		
		double preco = 0;
		String produto = " ";
		
		switch (codigo) {
		case 1:
            produto = "Cachorro Quente";
            preco = 10.00;
            break;
        case 2:
           produto = "X-Salada";
            preco = 15.00;
            break;
		case 3:
            produto= "X-Bacon";
            preco = 18.00;
            break;
        case 4:
            produto = "Bauru";
            preco = 12.00;
            break;
        case 5:
            produto = "Refrigerante";
            preco = 8.00;
            break;
        case 6:
            produto = "Suco de laranja";
            preco = 13.00;
            break;
        default:
             System.out.println("Código de produto inválido!");
             return;
        }

        double valorTotal = quantidade * preco;

        System.out.println("\nProduto: " + produto);
        System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
    }
					
}

