package Week2.ExerciciosPizza7;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	// lista de pizzas
	private List<Pizza> pizzas = new ArrayList<Pizza>();
	
	/**
	 * Adiciona a pizza no carrinho
	 * 
	 * @param pizza
	 * @return void
	 */
	public void adicionarPizza(Pizza pizza) {
		if(pizza.getIngredientes().size() > 0) {
			this.pizzas.add(pizza);
		}
	}
	
	public double valorTotalDasPizzas() {
		double valorTotal = 0;
		
		for(Pizza pizza: pizzas) {
			valorTotal += pizza.getPreco();
		}
		return valorTotal;
	}
	
	public List<Pizza> getPizzas() {
		return this.pizzas;
	}
}
