package livronations.controller;

import java.util.ArrayList;

import livronations.model.Produto;
import livronations.repository.LivronationsRepository;

public class ProdutoController implements LivronationsRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.printf("\nO livro %s foi cadastrado com sucesso com o id: %d\n\n", produto.getTitulo(), produto.getId());
	}

	@Override
	public void listar() {
		for(var livro : listaProdutos) {
			livro.listarProdutos();
		}
	}

	@Override
	public void atualizar(Produto produto) {
		var livro = buscar(produto.getId());
		
		if(livro != null) {
			listaProdutos.set(listaProdutos.indexOf(livro), produto);
			System.out.printf("\nO livro %s foi atualizado com sucesso.", livro.getTitulo());
		} else 
			System.out.println("\nLivro não encontrado.");
	}

	@Override
	public void deletar(int id) {
		var livro = buscar(id);
		
		if(livro != null) {
			if(listaProdutos.remove(livro) == true) {
				System.out.printf("\nO livro %s foi deletado com sucesso.\n", livro.getTitulo());
			}
		} else
			System.out.println("\nLivro não encontrado.");
	}

	@Override
	public void aplicarDesconto(int id, float desconto) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarId() {
		return ++id;
	}
	
	public Produto buscar(int id) {
		for(var livro : listaProdutos) {
			if(livro.getId() == id) {
				return livro;
			}
		}
		
		return null;
	}
	
}
