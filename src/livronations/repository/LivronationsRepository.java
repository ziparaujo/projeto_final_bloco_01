package livronations.repository;

import livronations.model.Produto;

public interface LivronationsRepository {
	public void cadastrar(Produto produto);
	public void listar();
	public void atualizar(Produto produto);
	public void deletar(int id);
	
	public void aplicarDesconto(int id, float desconto);
}
