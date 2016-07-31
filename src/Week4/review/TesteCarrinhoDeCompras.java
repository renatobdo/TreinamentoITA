package Week4.review;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {

	@Test
	public void testeAdicionaUmProduto() {
		
		ProdutoComTamanho p = new ProdutoComTamanho("Camisa", 101, 25, "M");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		assertEquals(0, c.getSize());
		
		c.adicionaProduto(p,1);
		assertEquals(1, c.getSize());
		assertEquals("Camisa M:1", c.getCarrinho()[0]);
	}
	
	@Test
	public void testeAdicionaDoisProdutosIguaisEUmDiferente() {
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Calça", 150, 80, "42");
		ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 101, 25, "M");
		ProdutoComTamanho p3 = new ProdutoComTamanho("Camisa", 101, 25, "M");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		assertEquals(0, c.getSize());
		
		c.adicionaProduto(p1,5);
		c.adicionaProduto(p2,2);
		c.adicionaProduto(p3,1);
		
		assertEquals(2, c.getCarrinho().length);
		
		assertEquals("Calça 42:5", c.getCarrinho()[0]);
		assertEquals("Camisa M:3", c.getCarrinho()[1]);
		
		assertEquals(2, c.getSize());
	}
	
	@Test
	public void testeAdicionaTresProdutosDiferentes() {
		
		ProdutoComTamanho p1 = new ProdutoComTamanho("Calça", 150, 80, "42");
		ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 101, 25, "G");
		ProdutoComTamanho p3 = new ProdutoComTamanho("Camisa", 101, 25, "M");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		assertEquals(0, c.getSize());
		
		c.adicionaProduto(p1,2);
		c.adicionaProduto(p2,1);
		c.adicionaProduto(p3,3);
		
		assertEquals(3, c.getCarrinho().length);
		
		assertEquals("Calça 42:2", c.getCarrinho()[0]);
		assertEquals("Camisa G:1", c.getCarrinho()[1]);
		assertEquals("Camisa M:3", c.getCarrinho()[2]);
		
		assertEquals(3, c.getSize());
	}
	
	@Test
	public void testeRemoveUmProduto() {
		
		ProdutoComTamanho p = new ProdutoComTamanho("Camisa", 101, 25, "M");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		assertEquals(0, c.getSize());
		
		c.adicionaProduto(p,1);
		assertEquals(1, c.getSize());
		assertEquals("Camisa M:1", c.getCarrinho()[0]);
		
		c.removeProduto(p,1);
		assertEquals(0, c.getSize());
	}
	
	@Test
	public void testeRemoveQuantidadeProduto() {
		
		ProdutoComTamanho p = new ProdutoComTamanho("Camisa", 101, 25, "M");
		ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 101, 25, "P");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		assertEquals(0, c.getSize());
		
		c.adicionaProduto(p,10);
		c.adicionaProduto(p2,3);
		assertEquals(2, c.getSize());
		assertEquals("Camisa M:10", c.getCarrinho()[0]);
		
		c.removeProduto(p,5);
		c.removeProduto(p2,1);
		assertEquals("Camisa M:5", c.getCarrinho()[0]);
		assertEquals("Camisa P:2", c.getCarrinho()[1]);
	}
	
	@Test
	public void testeRemoveDoisProduto() {
		
		ProdutoComTamanho p = new ProdutoComTamanho("Camisa", 101, 25, "M");
		ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 101, 25, "P");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		assertEquals(0, c.getSize());
		
		c.adicionaProduto(p,10);
		c.adicionaProduto(p2,3);
		assertEquals(2, c.getSize());
		assertEquals("Camisa M:10", c.getCarrinho()[0]);
		
		c.removeProduto(p,5);
		c.removeProduto(p2,3);
		assertEquals("Camisa M:5", c.getCarrinho()[0]);
		assertEquals(1, c.getSize());
	}
	
	@Test
	public void testeValorTotalDoCarrinho(){
		ProdutoComTamanho p1 = new ProdutoComTamanho("Calça", 120, 50, "40");
		ProdutoComTamanho p2 = new ProdutoComTamanho("Camiseta", 180, 17, "M");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();	
		c.adicionaProduto(p1,1);
		c.adicionaProduto(p2,2);
		
		assertEquals(67, c.valorTotalDoCarrinho(), 0.01);
		
	}


}
