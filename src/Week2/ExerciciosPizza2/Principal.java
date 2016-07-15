package Week2.ExerciciosPizza2;

import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Gorgonzola");
        pizza1.adicionaIngrediente("Presunto");
        pizza1.adicionaIngrediente("Mussarela");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Manjericão");
        pizza2.adicionaIngrediente("Mussarela");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Frango");
        pizza3.adicionaIngrediente("Catupiry");
        pizza3.adicionaIngrediente("Milho");
        pizza3.adicionaIngrediente("Mussarela");
        pizza3.adicionaIngrediente("Mussarela");
        pizza3.adicionaIngrediente("Mussarela");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        System.out.println("Preço da pizza1: " + pizza1.getPreco());
        System.out.println("Preço da pizza2: " + pizza2.getPreco());
        System.out.println("Preço da pizza3: " + pizza3.getPreco());

        System.out.println("\nTotal do carrinho: "+ carrinho.totalDoCarrinho());

        System.out.println("\nIgredientes utilizados e quantidades");

        for (Map.Entry<String, Integer> igrediente : Pizza.ingredientesTotais.entrySet()) {
            System.out.println("Igrediente: "+ igrediente.getKey() + " - Quantidade: " + igrediente.getValue());
        }
    }
}