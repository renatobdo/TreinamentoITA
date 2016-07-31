package Week4.review;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testeIgualdade() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Camisa", 11, 10.50, "G");
		ProdutoComTamanho p2 = new ProdutoComTamanho("Camisa", 11, 10.50, "P");
		ProdutoComTamanho p3 = new ProdutoComTamanho("Chinelo", 5, 10.50, "42");
		ProdutoComTamanho p4 = new ProdutoComTamanho("Camisa", 11, 10.50, "G");

		assertEquals(false, p1.equals(p2));
		assertEquals(false, p3.equals(p2));
		assertEquals(true, p4.equals(p1));
	}
}
