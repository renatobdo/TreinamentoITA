package Week2.ExerciciosPizza4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestePizza {

	//testa o valor da pizza
	
	@BeforeClass
	public static void zeraRegistros(){
		Pizza.zeraRegistroIngredientes();
	}
	
	@Test
	public void testValor() {
		Pizza p = new Pizza();
		
		p.adicionaIngrediente("Teste", 10);
		
		assertEquals(23, p.getPreco());
	}
	
	
	@Test
	public void testRegistroIngredientes() {
		Pizza p = new Pizza();
		
		p.adicionaIngrediente("Teste", 10);
		p.adicionaIngrediente("Teste2", 10);
		assertEquals(20, p.getQtdIngredientes());
	}
	
	@Test
	public void testSomaCarrinho(){
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("teste", 6);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("teste", 5);
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionaPizza(p1);
		cc.adicionaPizza(p2);
		assertEquals(43, cc.getTotalCarrinho());
	}
	
	@Test
	public void testNaoAdicionaSemIngrediente(){
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("teste", 0);
		
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		assertEquals(false, cc.adicionaPizza(p1));
		
	}
	

}
