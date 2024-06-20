package livronations;

import java.util.InputMismatchException;
import java.util.Scanner;

import livronations.controller.ProdutoController;
import livronations.model.Ebook;
import livronations.model.LivroFisico;

public class Menu {
	static ProdutoController produtos = new ProdutoController();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choice = 0;
		
		while (true) {
			
			System.out.println("1 - Criar produto");
			System.out.println("2 - Listar todos os produtos");
			System.out.println("3 - Atualizar produto");
			System.out.println("4 - Excluir produto");
			System.out.println("5 - Sobre");
			System.out.println("6 - Sair");
			System.out.println("Digite a opção desejada: ");
			
			try {
				choice = sc.nextInt();
				sc.skip("\\R?");
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
				produtos.listar();
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

	private static void criarProduto() {
		int tipoLivro, tipoCapa, formato;
		
		System.out.printf("\nCadastro de livro!");
		System.out.printf("\nTítulo: ");
		String titulo = sc.next();
		sc.skip("\\R?");
		System.out.printf("Nome do autor: ");
		String autor = sc.next();
		sc.skip("\\R?");
		System.out.printf("Quantidade de páginas: ");
		int quantidadePaginas = sc.nextInt();
		sc.skip("\\R?");
		
		do {
			System.out.printf("Tipo (1 - Livro físico ou 2 - Ebook): ");
			tipoLivro = sc.nextInt();
		} while(tipoLivro != 1 && tipoLivro != 2);
		
		switch(tipoLivro) {
			case 1 -> {
				do {
					System.out.printf("Tipo de capa (1 - Capa comum ou 2 - Capa dura): ");
					tipoCapa = sc.nextInt();
				} while(tipoLivro != 1 && tipoLivro != 2);
				System.out.printf("Custo de envio (R$): ");
				float custoEnvio = sc.nextFloat();
				produtos.cadastrar(new LivroFisico(produtos.gerarId(), quantidadePaginas, tipoLivro, titulo, autor, custoEnvio, tipoCapa));
			}
			case 2 -> {
				do {
					System.out.printf("Formato do livro (1 - EPUB ou 2 - PDF): ");
					formato = sc.nextInt();
				} while(formato != 1 && formato !=2);
				produtos.cadastrar(new Ebook(produtos.gerarId(), quantidadePaginas, tipoLivro, titulo, autor, formato));
			}
		}
	}
	
	private static void exluirProduto() {
		System.out.println("Digite o id do livro: ");
		int id = sc.nextInt();
		
		produtos.deletar(id);
	}

	private static void atualizarProduto() {
		int tipoCapa, formato;
		System.out.println("Digite o id do livro: ");
		int id = sc.nextInt();
		
		var busca = produtos.buscar(id);
		
		if(busca != null) {
			var tipoLivro = busca.getTipo();
			
			System.out.printf("\nCadastro de livro!");
			System.out.printf("\nTítulo: ");
			String titulo = sc.next();
			System.out.printf("Nome do autor: ");
			String autor = sc.next();
			System.out.printf("Quantidade de páginas: ");
			int quantidadePaginas = sc.nextInt();
			
			switch(tipoLivro) {
				case 1 -> {
					do {
						System.out.printf("Tipo de capa (1 - Capa comum ou 2 - Capa dura): ");
						tipoCapa = sc.nextInt();
					} while(tipoLivro != 1 && tipoLivro != 2);
					System.out.printf("Custo de envio (R$): ");
					float custoEnvio = sc.nextFloat();
					produtos.cadastrar(new LivroFisico(produtos.gerarId(), quantidadePaginas, tipoLivro, titulo, autor, custoEnvio, tipoCapa));
				}
				case 2 -> {
					do {
						System.out.printf("Formato do livro (1 - EPUB ou 2 - PDF): ");
						formato = sc.nextInt();
					} while(formato != 1 && formato !=2);
					produtos.cadastrar(new Ebook(produtos.gerarId(), quantidadePaginas, tipoLivro, titulo, autor, formato));
				}
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\nLIVRONATIONS®\n");
		System.out.println("Projeto desenvolvido por: ");
		System.out.println("Rodrigo Araujo - ziparaujo@gmail.com");
		System.out.println("github.com/ziparaujo\n\n");
	}
}
