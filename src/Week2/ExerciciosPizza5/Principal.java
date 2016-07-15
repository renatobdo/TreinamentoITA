package Week2.ExerciciosPizza5;

public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("Frango");
		pizza1.adicionaIngrediente("Massa para pizza");
		pizza1.adicionaIngrediente("Pacote de frango");
		pizza1.adicionaIngrediente("250g de frango");
		pizza1.adicionaIngrediente("500g de frango");
		pizza1.adicionaIngrediente("120g de cebola");
		
		//Pizza2 sem ingredientes
		Pizza pizza2 = new Pizza("Frango");
		
		Pizza pizza3 = new Pizza("Portuguesa");
		pizza3.adicionaIngrediente("Massa para pizza");
		pizza3.adicionaIngrediente("Pacote de molho de tomate");
		pizza3.adicionaIngrediente("250g de queijo de mussarela");
		pizza3.adicionaIngrediente("50g de presunto");
		pizza3.adicionaIngrediente("Ovo cozido");
		pizza3.adicionaIngrediente("Cebola");
		
		Pizza pizza4 = new Pizza("Lombo");
		pizza4.adicionaIngrediente("Massa para pizza");
		pizza4.adicionaIngrediente("Pacote de molho de tomate");
		pizza4.adicionaIngrediente("250g de queijo de mussarela");
		pizza4.adicionaIngrediente("500g de lombo canadense");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		System.out.println(carrinho.adicionarPizza(pizza1));
		System.out.println(carrinho.adicionarPizza(pizza2));
		System.out.println(carrinho.adicionarPizza(pizza3));
		System.out.println(carrinho.adicionarPizza(pizza4));
		
		System.out.println(" ");
		System.out.println("Total do carrinho de compras: R$ " + carrinho.getValorTotal()); 
		System.out.println(" ");
		System.out.println("Total de ingredientes utilizados em todas as pizzas: " + pizza4.getTextoTotalIngredientes());
		
		
		System.out.println("==============: " + pizza3.getQuantidadeGeralDeIngredientes());
		
		
	}
}
