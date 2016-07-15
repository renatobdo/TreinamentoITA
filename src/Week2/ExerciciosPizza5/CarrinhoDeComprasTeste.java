package Week2.ExerciciosPizza5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarrinhoDeComprasTeste {

	@Test
	public void testeTotalDoCarrinhoDeCompras() {
		Pizza pizza1 = new Pizza("Mussarela");
		pizza1.adicionaIngrediente("Massa para pizza");
		pizza1.adicionaIngrediente("Pacote de molho de tomate");
		pizza1.adicionaIngrediente("250g de queijo de mussarela");
		pizza1.adicionaIngrediente("250g de queijo de mussarela");
		pizza1.adicionaIngrediente("120g de tomates em rodela");
		
		Pizza pizza2 = new Pizza("Portuguesa");
		pizza2.adicionaIngrediente("Massa para pizza");
		pizza2.adicionaIngrediente("Pacote de molho de tomate");
		pizza2.adicionaIngrediente("250g de queijo de mussarela");
		pizza2.adicionaIngrediente("50g de presunto");
		pizza2.adicionaIngrediente("Ovo cozido");
		pizza2.adicionaIngrediente("Cebola");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		
		assertEquals("O preço das pizzas de Mussarela e Portuguesa no carrinho de compras deve ser de R$ 43.0 ", Double.valueOf(43.0), Double.valueOf(carrinho.getValorTotal()));
	}
	
	@Test
	public void testeSeCarrinhoDeComprasAdicionaPizzaSemIngredientes() {
		Pizza pizza = new Pizza("Frango");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza);
		assertEquals("Teste se pizzas sem ingredientes são adicionadas ao carrinho de compras", Integer.valueOf(0), Integer.valueOf(carrinho.getQuantidadeDePizzaNoCarrinho()));
	}

}
