package Week2.ExerciciosPizza7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CarrinhoDeComprasTest {

	@Test
	public void testRetornaPizzaAdicionada() {
		
		String ingrediente = "queijo";
		
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente(ingrediente);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza);
		
		assertEquals(pizza, carrinho.getPizzas().get(0));
		assertEquals(1, carrinho.getPizzas().size());
		
	}
	
	@Test
	public void testRecusaAAdicaoDePizzaSemIngredientes() {
		
		Pizza pizza = new Pizza();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza);
		
		assertEquals(0, carrinho.getPizzas().size());
		
	}
	
	@Test
	public void testRetornaOsValoresDasPizzas() {
		
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
		
		Pizza pizza2 = new Pizza();
		String ingrediente8 = "azeite";
		pizza2.adicionaIngrediente(ingrediente8);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza);
		carrinho.adicionarPizza(pizza2);
		
		assertEquals(38, carrinho.valorTotalDasPizzas(), 0.001);
		
	}
	
}
