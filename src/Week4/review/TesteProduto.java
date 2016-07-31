package Week4.review;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void testeIgualdade() {
		Produto p = new Produto("Produto1",111,10.50);
		Produto p2 = new Produto("Produto2",111,10.50);
		Produto p3 = new Produto("Produto3",121,55.90);
		
		assertEquals(true, p.equals(p2));
		assertEquals(false, p3.equals(p2));
	}
	
	

}
