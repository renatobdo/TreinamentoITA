package Week2;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Pizza> pizzas= new ArrayList<Pizza>();
	public double preco;
	
	public double calculaValorTotalDasPizzas(Pizza p){
	
		for(int i=0;i<pizzas.size();i++){
			this.preco = p.getPreco() + preco;  
		}
	
		
			
		return preco;
	}
}
