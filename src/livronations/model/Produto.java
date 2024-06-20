package livronations.model;

public abstract class Produto {
	
	private int id;	
	private int quantidadePaginas;
	private int tipo;
	private String titulo;
	private String autor;
	
	public Produto(int id, int quantidadePaginas, int tipo, String titulo, String autor) {
		this.id = id;
		this.quantidadePaginas = quantidadePaginas;
		this.tipo = tipo;
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}
	
	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void listarProdutos() {
		String tipo = "";
		
		tipo = (this.tipo == 1) ? "Livro físico" : (this.tipo == 2) ? "Ebook" : tipo;
		
		System.out.printf("\n"
				+ "Id: %d\n"
				+ "Tipo: %d\n"
				+ "Titulo: %s\n"
				+ "Autor: %s\n"
				+ "Quantidade de páginas: %d\n",
				+ this.id, tipo, this.titulo, this.autor, this.quantidadePaginas);
	}
}
