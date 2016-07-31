package Week4.review;


public class Produto {

	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object produto) {
		if(hashCode() == produto.hashCode())
			return true;
		else 
			return false;
	}
	@Override
	public int hashCode() {
		return this.getCodigo();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
}
