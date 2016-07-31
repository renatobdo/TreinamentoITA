import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoTamanho {

	@Test
	public void testTamanhoProduto() {
		ProdutoTamanho produto = new ProdutoTamanho("Casaul", 001234567, 150);
		  				  produto.setTamanho(42);
		  
		  assertEquals(42, produto.getTamanho());
	}

}
