package Week4.review;


public class ProdutoComTamanho extends Produto{

	private String tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object produto) {
		if(super.getCodigo() == Produto.class.cast(produto).getCodigo()){
			if(hashCode() == produto.hashCode())
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		char[] tamanho = this.tamanho.toCharArray();
		String tamanhoConvertido = "";
		for (int i = 0; i < tamanho.length; i++) {
			tamanhoConvertido += "" + Character.getNumericValue(tamanho[i]);
		}
		return Integer.parseInt(getCodigo() + "" + tamanhoConvertido);
	}
	
	public String getTamanho(){
		return tamanho;
	}
}
