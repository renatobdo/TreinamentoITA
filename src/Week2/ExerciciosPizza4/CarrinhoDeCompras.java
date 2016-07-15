package Week2.ExerciciosPizza4;

public class CarrinhoDeCompras {
	private int totalCarrinho = 0;
	
	public boolean adicionaPizza(Pizza pizza){
		if(pizza.getQtdIngredientes() > 0){
			totalCarrinho += pizza.getPreco();
			return true;
		}else{
			System.out.println("Pizza sem ingrediente!!");
			return false;
		}
	}
	
	public int getTotalCarrinho(){
		System.out.println("Valor total no carrinho R$" + totalCarrinho);
		return totalCarrinho;
	}
	
	public void getListaIngredientes(){
		System.out.println("Ingredientes\tQuantidade:\n");
		for(String k : Pizza.listaIngredientesTotal.keySet()){
			System.out.println(k+"\t\t" + Pizza.listaIngredientesTotal.get(k) + "\n");
			
		}
	}
	
}
