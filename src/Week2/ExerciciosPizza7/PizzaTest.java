package Week2.ExerciciosPizza7;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PizzaTest {
	
	@Before
	public void before() {
		Pizza.zeraIngredientes();
	}
	
	@After
	public void after() {
		Pizza.zeraIngredientes();
	}
	
	@Test
	public void testRetornaIngredienteAdicionado() {
		
		String ingrediente = "queijo";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente);
		
		String ingrediente1 = pizza.getIngredientes().get(0);
		
		assertEquals("queijo", ingrediente1);
		
	}
	
	@Test
	public void testRetornaValorDaPizzaComUmIngrediente() {
		
		String ingrediente = "queijo";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente);
		
		assertEquals(15.0, pizza.getPreco(), 0.001);
		
	}
	
	@Test
	public void testRetornaValorDaPizzaComDoisIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		
		assertEquals(15.0, pizza.getPreco(), 0.001);
		
	}
	
	@Test
	public void testRetornaValorDaPizzaComTresIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		String ingrediente3 = "bacon";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		
		assertEquals(20.0, pizza.getPreco(), 0.001);
		
	}
	
	@Test
	public void testRetornaValorDaPizzaComQuatroIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		String ingrediente3 = "bacon";
		String ingrediente4 = "massa";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		pizza.adicionaIngrediente(ingrediente4);
		
		assertEquals(20.0, pizza.getPreco(), 0.001);
		
	}
	
	@Test
	public void testRetornaValorDaPizzaComCincoIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		String ingrediente3 = "bacon";
		String ingrediente4 = "massa";
		String ingrediente5 = "cebola";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		pizza.adicionaIngrediente(ingrediente4);
		pizza.adicionaIngrediente(ingrediente5);
		
		assertEquals(20.0, pizza.getPreco(), 0.001);
		
	}
	
	@Test
	public void testRetornaValorDaPizzaComMaisDeCincoIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		String ingrediente3 = "bacon";
		String ingrediente4 = "massa";
		String ingrediente5 = "cebola";
		String ingrediente6 = "sal";
		String ingrediente7 = "azeite";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		pizza.adicionaIngrediente(ingrediente4);
		pizza.adicionaIngrediente(ingrediente5);
		pizza.adicionaIngrediente(ingrediente6);
		pizza.adicionaIngrediente(ingrediente7);
		
		assertEquals(23.0, pizza.getPreco(), 0.001);
		
	}
	
	@Test
	public void testContabilizaIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		String ingrediente3 = "bacon";
		String ingrediente4 = "massa";
		String ingrediente5 = "cebola";
		String ingrediente6 = "sal";
		String ingrediente7 = "azeite";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		
		assertEquals(1, pizza.getQuantidadeTotalDeIngredientes().size());
		
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		pizza.adicionaIngrediente(ingrediente4);
		pizza.adicionaIngrediente(ingrediente5);
		pizza.adicionaIngrediente(ingrediente6);
		pizza.adicionaIngrediente(ingrediente7);
		
		assertEquals(7, pizza.getQuantidadeTotalDeIngredientes().size());
		
		Pizza pizza2 = new Pizza();
		String ingrediente8 = "azeite";
		pizza2.adicionaIngrediente(ingrediente8);
		
		assertEquals(7, pizza2.getQuantidadeTotalDeIngredientes().size());
		
	}
	
	@Test
	public void testRetornaNumeroDeIngredientes() {
		
		String ingrediente1 = "queijo";
		String ingrediente2 = "atum";
		String ingrediente3 = "bacon";
		String ingrediente4 = "massa";
		String ingrediente5 = "cebola";
		String ingrediente6 = "sal";
		String ingrediente7 = "azeite";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente1);
		int quantidadeQueijo = pizza.getQuantidadeTotalDeIngredientes().get("queijo");
		assertEquals(1, quantidadeQueijo);
		
		pizza.adicionaIngrediente(ingrediente2);
		pizza.adicionaIngrediente(ingrediente3);
		pizza.adicionaIngrediente(ingrediente4);
		pizza.adicionaIngrediente(ingrediente5);
		pizza.adicionaIngrediente(ingrediente6);
		pizza.adicionaIngrediente(ingrediente7);
		
		Pizza pizza2 = new Pizza();
		String ingrediente8 = "azeite";
		pizza2.adicionaIngrediente(ingrediente8);
		
		int quantidadeAzeite = pizza2.getQuantidadeTotalDeIngredientes().get("azeite");
		
		assertEquals(2, quantidadeAzeite);
		
	}

}
