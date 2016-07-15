package Week2.ExerciciosPizza6;

import static org.junit.Assert.*;

import org.junit.Test;


public class CarrinhoTeste {

	@Test
	public void testeSomaPizza() {
		CarrinhoDeCompra carCompra = new  CarrinhoDeCompra();
		
		Pizza p1 = new Pizza();
		
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("calabresa");
		
		carCompra.adicionaPizza(p1);
		
		assertEquals(20, carCompra.contabilizaTotal(),0);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("atum");
		carCompra.adicionaPizza(p2);
		
		assertEquals(35, carCompra.contabilizaTotal(),0);
		

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("mussarela");
		carCompra.adicionaPizza(p3);
		
		assertEquals(58, carCompra.contabilizaTotal(),0);
	
		
	
	}
	//testa se o metodo adicionaPizza, adiciona pizzas sem ingrediente.
	@Test
	public void testaAdicaoPizza(){
		
		Pizza p1 = new Pizza();
		CarrinhoDeCompra carCompra = new CarrinhoDeCompra();
		carCompra.adicionaPizza(p1);
		assertEquals(true,carCompra.getListaDePizzas().isEmpty());
		
		
		CarrinhoDeCompra carCompra2 = new CarrinhoDeCompra();
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Atum");
		carCompra2.adicionaPizza(p2);
		
		assertEquals(false,carCompra2.getListaDePizzas().isEmpty());
		
		
	}
}
