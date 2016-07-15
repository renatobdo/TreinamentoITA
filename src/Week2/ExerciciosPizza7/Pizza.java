package Week2.ExerciciosPizza7;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pizza {

	// valor total dos ingredientes gastos nas pizzas
	private static Map<String, Integer> valorTotal = new HashMap<String, Integer>();
	// ingredientes presentes em uma pizza
	private List<String> ingredientes = new ArrayList<String>();
		
	/**
	 * Metodo para adicao de ingredientes na pizza
	 * 
	 * @param ingrediente
	 * @return void
	 */
	public void adicionaIngrediente(String nomeIngrediente) {
		//Ingrediente ingrediente = new Ingrediente(nomeIngrediente);
		ingredientes.add(nomeIngrediente);
		Pizza.contabilizaIngrediente(nomeIngrediente);
	}
	
	/**
	 * Metodo responsavel por retornar o valor da pizza
	 * 
	 * @return valor
	 */
	public double getPreco() {
		double valor = 0;
		
		if(ingredientes.size() <= 2) {
			valor = 15.0;
		} else if((ingredientes.size() > 2) && (ingredientes.size() <= 5)) {
			valor = 20.0;
		} else {
			valor = 23.0;
		}
		
		return valor;
	}
	
	/**
	 * Metodo resonsavel por contabilizar o valor total dos ingredientes usados nas pizzas
	 * 
	 * @return void
	 */
	public static void contabilizaIngrediente(String ingrediente) {
		if(!Pizza.valorTotal.containsKey(ingrediente))
			Pizza.valorTotal.put(ingrediente, 1);
		else {
			//Pizza.valorTotal.put(ingrediente, 2);
			int valor = Pizza.valorTotal.get(ingrediente) + 1;
			System.out.println(ingrediente);
			
			Pizza.valorTotal.put(ingrediente, valor);
		}
	}
	
	/**
	 * Retorna os ingredientes presentes na pizza
	 * 
	 * @return ingredientes
	 */
	public List<String> getIngredientes() {
		return this.ingredientes;
	}
	
	/**
	 * Retona os igredientes e sua quantidade
	 * 
	 * @return valorTotal
	 */
	public static Map<String, Integer> getQuantidadeTotalDeIngredientes() {
		return Pizza.valorTotal;
	}
	
	/**
	 * Exibe os ingredientes e as quantidades usadas em todas as pizzas
	 */
	public static void exibirIngredientesUsadosEQuantidade() {
		Set<String> chaves = Pizza.getQuantidadeTotalDeIngredientes().keySet();
		for (String chave : chaves)
		{
			if(chave != null)
				System.out.println("Ingrediente: " + chave 
						+ " | quantidade: " + Pizza.getQuantidadeTotalDeIngredientes().get(chave));
		}
	}
	
	/**
	 * Metodo responsável por zerar a lista de ingredientes
	 * 
	 * @return void
	 */
	public static void zeraIngredientes() {
		Pizza.valorTotal.clear();
	}

}
