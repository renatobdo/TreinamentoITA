package Week2.ExerciciosPizza4;

public class Principal {
	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Tomate", 2);
		p1.adicionaIngrediente("Cebola", 3);
		
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Pepino", 4);
		p2.adicionaIngrediente("Bacon", 3);
		
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Bacon", 2);
		p3.adicionaIngrediente("Oregano", 2);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		carrinho.adicionaPizza(p3);
		
		carrinho.getTotalCarrinho();
		carrinho.getListaIngredientes();

	}
}
