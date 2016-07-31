import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCarrinho {

	@Test
	public void testeCarrinho() {
		//instanciando o carrinho
		Carrinho carrinho = new Carrinho();
		
		// instanciando os produtos
		ProdutoTamanho produtoSapato1 = new ProdutoTamanho("Casual", 0012345, 120);
						  produtoSapato1.setTamanho(37);
						  
		ProdutoTamanho produtoSapato2 = new ProdutoTamanho("Casual", 00123456, 120);
		produtoSapato2.setTamanho(42);
		
		ProdutoTamanho produtoSapato3 = new ProdutoTamanho("Casual", 001234567, 120);
		produtoSapato3.setTamanho(42);
		
		// colocando os produtos no carrinho
		carrinho.adicionaProdutoCarrinho(produtoSapato1);
		carrinho.adicionaProdutoCarrinho(produtoSapato2);
		carrinho.adicionaProdutoCarrinho(produtoSapato3);
		
		
		// tirando um produto do carrinho
		carrinho.tiraProdutoCarrinho(produtoSapato3);
		
		// verificand o valor total da compra
		assertEquals(240, carrinho.valorCompra());
	}

}
