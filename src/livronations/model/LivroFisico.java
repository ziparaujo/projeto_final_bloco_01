package livronations.model;

public class LivroFisico extends Produto {
	
	private float custoEnvio;
	private int tipoCapa;
	
	public LivroFisico(int id, int quantidadePaginas, int tipo, String titulo, String autor, float custoEnvio, int tipoCapa) {
		super(id, quantidadePaginas, tipo, titulo, autor);
		this.custoEnvio = custoEnvio;
		this.tipoCapa = tipoCapa;
	}
	
	public double getCustoEnvio() {
		return custoEnvio;
	}
	
	public void setCustoEnvio(float custoEnvio) {
		this.custoEnvio = custoEnvio;
	}
	
	public int getTipoCapa() {
		return tipoCapa;
	}
	
	public void setTipoCapa(int tipoCapa) {
		this.tipoCapa = tipoCapa;
	}
	
	@Override
	public void listarProdutos() {
		String tipoCapa = "";
		
		tipoCapa = (this.tipoCapa == 1) ? "Comum" : (this.tipoCapa == 2) ? "Dura" : tipoCapa;
		
		super.listarProdutos();
		System.out.printf("\nTipo de capa: %s\n"
				+ "Custo de envio (R$): %f.2\n", tipoCapa, this.custoEnvio);
	}
}
