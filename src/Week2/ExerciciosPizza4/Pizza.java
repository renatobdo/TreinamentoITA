package Week2.ExerciciosPizza4;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
	private int qtdIngredientes = 0;
	private Map<String,Integer> listaIngredientes = new HashMap<String,Integer>();
	public static Map<String,Integer> listaIngredientesTotal = new HashMap<String,Integer>();
	
	public void adicionaIngrediente(String ingrediente, Integer qtdIngrediente) {
		listaIngredientes.put(ingrediente, qtdIngrediente);
		contabilizaIngrediente(ingrediente, qtdIngrediente);
		atualizaPreco(qtdIngrediente);
	}

	public int getPreco() {
		int valor = 0;
		
		
		if(qtdIngredientes <= 2){
			valor = 15;
		}
		else if(qtdIngredientes >= 3 && qtdIngredientes <= 5){
			valor = 20;
		}
		else{
			valor = 23;
		}
		
		return valor;
	}

	public static void contabilizaIngrediente(String k, Integer v){
		listaIngredientesTotal.put(k, v);
	}
	public void atualizaPreco(int valor){
			qtdIngredientes += valor;
	}
	
	public int getQtdIngredientes(){
		return qtdIngredientes;
	}
	
	public static void zeraRegistroIngredientes(){
		listaIngredientesTotal.clear();
	}
}
