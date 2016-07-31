
public class Produto {
	// atributos produto
	protected String nome;
	protected int codigo;
	protected int preco;

	// definindo o construtor
	protected Produto(String nome, int codigo, int preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;

	}

	// getters

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

}
