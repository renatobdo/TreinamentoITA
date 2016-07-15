package Week2.ExerciciosPizza5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Classe respons�vel pelo aramzenamento das informa��es sobre o objeto pizza
 * @author Diego
 *
 */
public class Pizza {
	/**
	 * Atributos da classe
	 */
	private String nome;
	private List<String> ingredientes = new ArrayList<>();
	private static HashMap<String, Integer> acumulaIngredientes = new HashMap<String, Integer>();
	
	/**
	 * Construtor da classe pizza
	 * @param nome - nome da pizza
	 */
	public Pizza(String nome){
		this.nome = nome;
	}
	
	/**
	 * M�todo que retorna os ingredientes de uma pizza
	 * @return { List<String> }  ingredientes
	 */
	public List<String> getIngredientes(){
		return this.ingredientes;
	}
	
	/**
	 * M�todo que retorna o nome da pizza
	 * @return { String } nome
	 */
	public String getNome(){
		return this.nome;
	}
	
	/**
	 * M�todo que adiciona um registro na lista de ingredientes da pizza
	 * @param ingrediente
	 */
	public void adicionaIngrediente(String ingrediente){
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	/**
	 * M�todo que carrega a quantidade de ingredientes de todas as pizzas
	 * @param ingrediente
	 */
	public static Integer getQuantidadeGeralDeIngredientes(){
		Integer total = 0;
		for (String key : acumulaIngredientes.keySet()) {
			total += Integer.valueOf(acumulaIngredientes.get(key));
		}
		return total;
	}
	
	/**
	 * M�todo que zera a quantidade de ingredientes acumulados em todos os objetos pizza
	 */
	public static void zerarQuantidadeDeIngredientes(){
		acumulaIngredientes = new HashMap<String, Integer>();
	}
	
	
	
	
	/**
	 * M�todo que carrega o pre�o da pizza
	 * @return { Double } valor da pizza pelos ingredientes
	 */
	public Double getPreco(){
		Double preco = 0.00;
		 if(ingredientes.size() <= 2){
			 preco = 15.00;
		 } else if ((ingredientes.size() >= 3) && (ingredientes.size() <= 5)){
			 preco = 20.00;
		 } else if (ingredientes.size() > 5){
			 preco = 23.00;
		 }
		 return preco;
	}
	
	/**
	 * M�todo que adiciona o ingrediente a lista de ingredientes utilizados em todas as pizzas
	 * @param ingrediente
	 */
	public static void contabilizaIngrediente(String ingrediente){
		if (acumulaIngredientes.containsKey(ingrediente)){
			Integer total = (Integer)acumulaIngredientes.get(ingrediente);
			total ++;
			acumulaIngredientes.replace(ingrediente, total);
		} else {
			acumulaIngredientes.put(ingrediente, 1);
		}
	}
	
	/**
	 * M�todo que monta a string de produtos utilizados na fabrica��o de todas as pizzas
	 * @return { String } Tabela formatada com Qtde e descri��o do produto
	 */
	public static String getTextoTotalIngredientes(){
		String texto = "\n===================================================="+
						"\nQtde - Produto\n====================================================\n";
		for (String key : acumulaIngredientes.keySet()) {
			texto += acumulaIngredientes.get(key) + "    - " + key + "\n";
		}
		return texto;
	}
}
