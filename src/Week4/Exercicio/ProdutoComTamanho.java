package Week4.Exercicio;

public class ProdutoComTamanho extends Produto {
	int tamanho;
	int numeracao;

	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho, int numeracao) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
		this.numeracao = numeracao;
	}

	@Override
	public boolean equals(ProdutoComTamanho outro) {
		if (codigo == outro.codigo){
			if (tamanho != outro.tamanho){
				return false;
			}
		}else{
			return true;
		}
		return super.equals(outro);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	
}
