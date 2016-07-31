package Week4.Exercicio;

public class Produto {

	String nome;
	int codigo;
	double preco;


	public Produto(String nome, int codigo, double preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;

	}

	
	public boolean equals(Produto outro) {
		if ((nome   == outro.getNome()) && 
		    (codigo == outro.getCodigo()) && 
		    (preco  == outro.getPreco())) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode(Produto outro) {
		if (codigo == outro.getCodigo()) {
			return codigo;
		} else {
			return 0;
		}
	}

	private String getNome() {

		return nome;
	}

	private int getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	public double getPreco() {
		// TODO Auto-generated method stub
		return preco;
	}



	public boolean equals(ProdutoComTamanho outro) {
		// TODO Auto-generated method stub
		return false;
	}
}
