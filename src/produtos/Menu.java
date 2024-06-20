package produtos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while (true) {
			
			exibirMenu();
			
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros.");
				sc.nextLine();
				continue;
			}
			
			switch (choice) {
			case 1:
				criarProduto();
				break;
			case 2:
				listarProdutos();
				break;
			case 3:
				atualizarProduto();
				break;
			case 4:
				exluirProduto();
				break;
			case 5:
				sobre();
				break;
			case 6:
				sobre();
				System.out.println("Saindo...");
				sc.close();
				System.exit(0);
			}
		}
		
	}

	public static void exibirMenu() {
		System.out.println("1 - Criar produto");
		System.out.println("2 - Listar todos os produtos");
		System.out.println("3 - Atualizar produto");
		System.out.println("4 - Excluir produto");
		System.out.println("5 - Sobre");
		System.out.println("6 - Sair");
		System.out.println("Digite a opção desejada: ");
	}

	private static void criarProduto() {
		// TODO Auto-generated method stub
		
	}
	
	private static String listarProdutos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static void exluirProduto() {
		// TODO Auto-generated method stub
		
	}

	private static void atualizarProduto() {
		// TODO Auto-generated method stub
		
	}
	
	public static void sobre() {
		System.out.println("\nLIVRONATION®\n");
		System.out.println("Projeto desenvolvido por: ");
		System.out.println("Rodrigo Araujo - ziparaujo@gmail.com");
		System.out.println("github.com/ziparaujo\n\n");
	}
}
