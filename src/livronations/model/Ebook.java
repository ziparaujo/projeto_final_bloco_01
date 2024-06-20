package livronations.model;

public class Ebook extends Produto {
	
	private int formato;
	
	public Ebook(int id, int quantidadePaginas, int tipo, String titulo, String autor, int formato) {
		super(id, quantidadePaginas, tipo, titulo, autor);
		this.formato = formato;
	}

	public int getFormato() {
		return formato;
	}

	public void setFormato(int formato) {
		this.formato = formato;
	}
	
	@Override
	public void listarProdutos() {
		String formato = "";
		
		formato = (this.formato == 1) ? "EPUB" : (this.formato == 2) ? "PDF" : "Formato não identificado.";
		
		super.listarProdutos();
		System.out.printf("Formato do ebook: %s\n\n", formato);
	}
}
