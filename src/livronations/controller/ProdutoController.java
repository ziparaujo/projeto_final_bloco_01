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
		System.out.printf("\nO livro %s foi cadastrado com sucesso sob o id: %d", produto.getTitulo(), produto.getId());
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarDesconto(int id, float desconto) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarId() {
		return ++id;
	}
	
}
