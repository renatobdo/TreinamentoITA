import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void testNomeDoProduto() {
		ProdutoTamanho produto = new ProdutoTamanho("Sapato Social", 0012345, 120);
						  produto.setTamanho(42);
						  
		assertEquals("Sapato Social", produto.getNome());
		
		
		
	}

}
