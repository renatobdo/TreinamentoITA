package Week2.ExerciciosPizza7;


public class Principal {

	public static void main(String[] args) {
		
		// Pizza simples
		Pizza pizzaSimples = new Pizza();
		// ingrediente
		String azeitona = "Azeitona";
		// adicionando ingrediente
		pizzaSimples.adicionaIngrediente(azeitona);
		
		// Pizza quatro queijos
		Pizza pizzaQuatroQueijos = new Pizza();
		// ingredientes
		String queijoPrato = "Queijo Prato";
		String queijoMargherita = "Queijo Margherita";
		String queijoGorgonzola = "Queijo Gorgonzola ";
		String queijoMucarela = "Queijo Mucarela";
		// adicionando ingredientes
		pizzaQuatroQueijos.adicionaIngrediente(queijoPrato);
		pizzaQuatroQueijos.adicionaIngrediente(queijoMargherita);
		pizzaQuatroQueijos.adicionaIngrediente(queijoGorgonzola);
		pizzaQuatroQueijos.adicionaIngrediente(queijoMucarela);
		
		// Pizza calabresa
		Pizza pizzaCalabreza = new Pizza();
		// ingredientes
		String ovo = "Ovo";
		String calabresa = "Calabresa";
		// adicionando ingredientes
		pizzaCalabreza.adicionaIngrediente(ovo);
		pizzaCalabreza.adicionaIngrediente(calabresa);
		
		// Carrinho de compra
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizzaSimples);
		carrinho.adicionarPizza(pizzaQuatroQueijos);
		carrinho.adicionarPizza(pizzaCalabreza);
		
		// Valor total das pizzas
		double valorTotalDasPizzas = carrinho.valorTotalDasPizzas();
		
		System.out.println("O valor total das pizzas são "+valorTotalDasPizzas+"\n");
		
		// Exibindo todos ingredientes e as quantidades usadas
		Pizza.exibirIngredientesUsadosEQuantidade();

	}
}
