package exercícios;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

		String nomeColaborador;
		int codigoCargo;
		float salario, reajuste;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Nome do colaborador:");
		nomeColaborador = leia.nextLine();
		System.out.println("Código do cargo do colaborador (1 a 6):");
		codigoCargo = leia.nextInt();
		System.out.println("Salario: R$");
		salario = leia.nextFloat();
		
		String cargo = "";
		reajuste = 0;
		
		switch (codigoCargo) {
		case 1:
            cargo = "Gerente";
            reajuste = 0.10f;
            break;
        case 2:
            cargo = "Vendedor";
            reajuste = 0.07f;
            break;
        case 3:
            cargo = "Supervisor";
            reajuste = 0.09f;
            break;
        case 4:
            cargo = "Motorista";
            reajuste = 0.06f;
            break;
        case 5:
            cargo = "Estoquista";
            reajuste = 0.05f;
            break;
        case 6:
            cargo = "Técnico de TI";
            reajuste = 0.08f;
            break;
        default:
            System.out.println("Código de cargo inválido!");
            return;
    }

    float novoSalario = salario + (reajuste * salario);

    System.out.println("\nNome do colaborador: " + nomeColaborador);
    System.out.println("Cargo: " + cargo);
    System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
}
}