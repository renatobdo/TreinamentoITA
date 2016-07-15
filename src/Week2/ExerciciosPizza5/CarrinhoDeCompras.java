package Week2.ExerciciosPizza5;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe respons�vel por armazenar as informa��es sobre a compra de pizzas
 * @author Diego Ortiz
 *
 */
public class CarrinhoDeCompras {

	/**
	 * Atributos da classe CarrinhoDeCompras
	 */
	private List<Pizza> pizzas = new ArrayList<>();
	
	
	/**
	 * M�todo que adiciona uma pizza no carrinho de compras
	 * @param pizza
	 * @return { String } - mensagem de falha ou sucesso na inclus�o da pizza na lista
	 */
	public String adicionarPizza(Pizza pizza){
		if (pizza.getIngredientes().size() == 0){
			return "A pizza de " + pizza.getNome() + " N�O PODE SER ADICIONADA ao carrinho de compras porque n�o possui ingredientes.";
		} else {
			pizzas.add(pizza);
			return "A pizza de " + pizza.getNome() + " de R$ " + pizza.getPreco() + " foi adicionada com sucesso ao carrinho de compras.";
		}
	}
	
	/**
	 * M�todo que retorna a quantidade de pizzas no carrinho de compras
	 * @return { Integer } Quantidade total de pizzas no carrinho de compras
	 */
	public Integer getQuantidadeDePizzaNoCarrinho(){
		return pizzas.size();
	}
	
	/**
	 * M�todo que efetua a somat�ria do valor total de todas as pizzas
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
