
public class ProdutoTamanho extends Produto{
	
	public int tamanho;
	
protected ProdutoTamanho(String nome, int codigo, int preco) {
		super(nome, codigo, preco);
	
	}

public int setTamanho(int tamanho){
	this.tamanho = tamanho;
	return this.tamanho;
}

public int getTamanho() {
	// TODO Auto-generated method stub
	return this.tamanho;
}


	


}
