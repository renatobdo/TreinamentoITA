package Week4.review;

import java.util.HashMap;

public class CarrinhoDeCompras {

	private HashMap<ProdutoComTamanho, Integer> carrinho;
	
	public CarrinhoDeCompras(){
		carrinho = new HashMap<>();
	}
	
	public void adicionaProduto(ProdutoComTamanho produto, int quantidade){
		if(carrinho.containsKey(produto))
		{
			quantidade += carrinho.get(produto);
			carrinho.put(produto,quantidade);
		}
		else
		{
			carrinho.put(produto, quantidade);
		}
	}
	
	public void removeProduto(ProdutoComTamanho p, int quantidade) {
		if(carrinho.get(p) > quantidade)
			carrinho.replace(p, (carrinho.get(p) - quantidade));
		else
			carrinho.remove(p);
	}
	
	public double valorTotalDoCarrinho(){
		double valorTotal = 0;
		for (ProdutoComTamanho produto : carrinho.keySet()) {
			valorTotal += produto.getPreco();
		}
		return valorTotal;
	}

	public String[] getCarrinho() {
		String[] imprimeCarrinho = new String[carrinho.size()];
		int i=0;
		for (ProdutoComTamanho produto : carrinho.keySet()) {
			imprimeCarrinho[i] = produto.getNome() + " " + produto.getTamanho() + ":" + carrinho.get(produto);
			i++;
		}
		return imprimeCarrinho;
	}
	
	public int getSize(){
		return carrinho.size();
	}
}
