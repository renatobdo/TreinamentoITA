package Week2.ExerciciosPizza5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class PizzaTeste {

	@BeforeClass 
	public static void iniciarPizzaTeste() {
		Pizza.zerarQuantidadeDeIngredientes();
	}
	
	@Test
	public void testePrecoPizzaPelaQuantidadeDeIngredientes() {
		Pizza pizza = new Pizza("Mussarela");
		pizza.adicionaIngrediente("Massa para pizza");
		pizza.adicionaIngrediente("Pacote de molho de tomate");
		pizza.adicionaIngrediente("250g de queijo de mussarela");
		pizza.adicionaIngrediente("250g de queijo de mussarela");
		pizza.adicionaIngrediente("120g de tomates em rodela"); 
		assertEquals("O valor da pizza com 5 ingredientes deve ser R$ 20.0", Double.valueOf(20.0), pizza.getPreco());
	}
	
	@Test
	public void testeTotalIngredientesDaPizza() {
		Pizza pizza = new Pizza("Portuguesa");
		Pizza.zerarQuantidadeDeIngredientes();
		pizza.adicionaIngrediente("Massa para pizza");
		pizza.adicionaIngrediente("Pacote de molho de tomate");
		pizza.adicionaIngrediente("250g de queijo de mussarela");
		pizza.adicionaIngrediente("50g de presunto");
		pizza.adicionaIngrediente("Ovo cozido");
		pizza.adicionaIngrediente("Cebola");
		assertEquals("O total de ingredientes deve ser 6", Integer.valueOf(6), Pizza.getQuantidadeGeralDeIngredientes());
	}
	
	@AfterClass 
	public static void finalizaPizzaTeste() {
		Pizza.zerarQuantidadeDeIngredientes();
	}
	

}
