import java.util.HashMap;
import java.util.Map;

public class Carrinho {
	protected String quantidade;

	Map<Produto, String> carrinho = new HashMap<Produto, String>();

	// Adiciona produto
	public void adicionaProdutoCarrinho(Produto produto) {
		this.quantidade = carrinho.get(produto);

		// verifica se há produto adicionado.
		if (this.quantidade != null && this.quantidade.isEmpty()) {
			int quat = Integer.parseInt(this.quantidade);
			quat++;
			this.quantidade = Integer.toString(quat);
		} else {
			this.quantidade = "1";
		}

		carrinho.put(produto, this.quantidade);
	}
//tira carrinho
	public void tiraProdutoCarrinho(Produto produto) {
		this.carrinho.remove(produto);
	}

	public int valorCompra() {
		int valorProdutos = 0;
		for (Produto item : this.carrinho.keySet()) {
			valorProdutos += item.getPreco();
		}

		return valorProdutos;
	}

}
