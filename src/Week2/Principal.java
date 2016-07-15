package Week2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza();			
		p1.adicionaIngrediente("ovo",1);
		p1.adicionaIngrediente("cebola",1);
		
		CarrinhoDeCompras c= new CarrinhoDeCompras();
		c.pizzas.add(p1);
					
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("rucula",1);
		p2.adicionaIngrediente("calabreza",1);
		p2.adicionaIngrediente("ovo",1);
		c.pizzas.add(p2);
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("azeitona",1);
		p3.adicionaIngrediente("pimentao",1);
		p3.adicionaIngrediente("cebola",1);
		p3.adicionaIngrediente("ketchup",1);
		p3.adicionaIngrediente("mostarda",1);
		p3.adicionaIngrediente("salsa",1);
		c.pizzas.add(p3);
		

		System.out.println("Preço total do carrinho de compras: "+c.calculaValorTotalDasPizzas(p1));
		System.out.println("Quantidade utilizada de cada ingrediente: "+p1.qtdIngrediente);
		
	}

}
