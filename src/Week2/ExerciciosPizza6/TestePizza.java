package Week2.ExerciciosPizza6;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;


public class TestePizza {

	@Before
	public void zeraQuantidadeIngredientes(){
		Pizza.zeraQuantidadeIngredientes();	
	}

	@Test
	public void testeCalculaValorPizza() {
	Pizza pizza = new Pizza();
	pizza.adicionaIngrediente("atum");
	pizza.calculaPreco();
	assertEquals(15.00,pizza.getPreco(),0);
	
	Pizza p1 = new Pizza();
	p1.adicionaIngrediente("atum");
	p1.adicionaIngrediente("atum");
	p1.adicionaIngrediente("atum");
	p1.calculaPreco();
	assertEquals(20,p1.getPreco(),0);
	
	Pizza p2 = new Pizza();
	p2.adicionaIngrediente("atum");
	p2.adicionaIngrediente("atum");
	p2.adicionaIngrediente("atum");
	p2.adicionaIngrediente("calabresa");
	p2.adicionaIngrediente("catupiry");
	p2.calculaPreco();
	assertEquals(20,p2.getPreco(),0);
	
	Pizza p3 = new Pizza();
	p3.adicionaIngrediente("atum");
	p3.adicionaIngrediente("atum");
	p3.adicionaIngrediente("atum");
	p3.adicionaIngrediente("atum");
	p3.adicionaIngrediente("atum");
	p3.adicionaIngrediente("calabresa");

	p3.calculaPreco();
	assertEquals(23,p3.getPreco(),0);
	}
	
	@Test
	public void testaContabilizadorIngrediente(){
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("atum");

		
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("atum");
		p1.adicionaIngrediente("atum");
		p1.adicionaIngrediente("atum");
		
	
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("atum");
		p2.adicionaIngrediente("atum");
		p2.adicionaIngrediente("atum");
		p2.adicionaIngrediente("calabresa");
		p2.adicionaIngrediente("catupiry");

		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("atum");
		p3.adicionaIngrediente("atum");
		p3.adicionaIngrediente("atum");
		p3.adicionaIngrediente("atum");
		p3.adicionaIngrediente("atum");
		p3.adicionaIngrediente("calabresa");
		
	assertEquals(15,Pizza.getQuantidadeIngredientes());
	HashMap<String,Integer> apoio = Pizza.map;
	int valorIngredienteAtum = 0;
	int valorIngredienteCatupiry = 0;
	int valorIngredienteCalabresa = 0;
	
	for(HashMap.Entry<String,Integer> ingrediente : apoio.entrySet()){
		if(ingrediente.getKey() == "atum"){
			valorIngredienteAtum = ingrediente.getValue();			
		}
		if(ingrediente.getKey() == "catupiry"){
			valorIngredienteCatupiry = ingrediente.getValue();			
		}
		if(ingrediente.getKey() == "calabresa"){
			valorIngredienteCalabresa = ingrediente.getValue();			
		}
	}
	assertEquals(1,valorIngredienteCatupiry);
	assertEquals(12,valorIngredienteAtum);
	assertEquals(2, valorIngredienteCalabresa);	
	
	
	}

}
