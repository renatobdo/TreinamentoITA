package Week2.ExerciciosPizza5;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por armazenar as informações sobre a compra de pizzas
 * @author Diego Ortiz
 *
 */
public class CarrinhoDeCompras {

	/**
	 * Atributos da classe CarrinhoDeCompras
	 */
	private List<Pizza> pizzas = new ArrayList<>();
	
	
	/**
	 * Método que adiciona uma pizza no carrinho de compras
	 * @param pizza
	 * @return { String } - mensagem de falha ou sucesso na inclusão da pizza na lista
	 */
	public String adicionarPizza(Pizza pizza){
		if (pizza.getIngredientes().size() == 0){
			return "A pizza de " + pizza.getNome() + " NÃO PODE SER ADICIONADA ao carrinho de compras porque não possui ingredientes.";
		} else {
			pizzas.add(pizza);
			return "A pizza de " + pizza.getNome() + " de R$ " + pizza.getPreco() + " foi adicionada com sucesso ao carrinho de compras.";
		}
	}
	
	/**
	 * Método que retorna a quantidade de pizzas no carrinho de compras
	 * @return { Integer } Quantidade total de pizzas no carrinho de compras
	 */
	public Integer getQuantidadeDePizzaNoCarrinho(){
		return pizzas.size();
	}
	
	/**
	 * Método que efetua a somatória do valor total de todas as pizzas
	 * @return { Double } - Valor todas as pizzas adicionadas no carrinho de compras
	 */
	public Double getValorTotal(){
		double valorTotal = 0;
		for (Pizza pizza : pizzas) {
			valorTotal += pizza.getPreco();
		}
		return valorTotal;
	}
}
