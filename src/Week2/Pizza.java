package Week2;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Pizza {

	String ingrediente;
	static int qtdIngrediente;
	static HashMap<String, Integer> ingredientes = new HashMap<>();
	double preco;	
	
	CarrinhoDeCompras c = new CarrinhoDeCompras();

	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	
	public void adicionaIngrediente(String ingrediente, Integer quantidade) {
		this.ingrediente = ingrediente;
		this.qtdIngrediente = contabilizaIngrediente(quantidade);
	}		

	public double getPreco() {
		
		if (qtdIngrediente <= 2) {
			preco = 15;
		} else if (qtdIngrediente <= 5) {
			preco = 20;
		} else {
			preco = 23;
		}
		return preco;
		
	}

	public static int contabilizaIngrediente(int qtd) {
		qtd += 0;
		return qtd;
	}


	
}