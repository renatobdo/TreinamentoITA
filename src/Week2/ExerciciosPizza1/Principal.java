package Week2.ExerciciosPizza1;

import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        final Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Mussarela");
        pizza1.adicionaIngrediente("Catupiry");

        final Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Mussarela");
        pizza2.adicionaIngrediente("Catupiry");
        pizza2.adicionaIngrediente("Provolone");
        pizza2.adicionaIngrediente("Parmesao");

        final Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Mussarela");
        pizza3.adicionaIngrediente("Catupiry");
        pizza3.adicionaIngrediente("Provolone");
        pizza3.adicionaIngrediente("Parmesao");
        pizza3.adicionaIngrediente("Cheddar");
        pizza3.adicionaIngrediente("Gorgonzola");


        final CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adciona(pizza1);
        carrinho.adciona(pizza2);
        carrinho.adciona(pizza3);

        System.out.println("Total: " + carrinho.getValorTotal() +"\n");
        System.out.println("Totais de ingredientes usados:" +"\n");
        Pizza.getIngredientesUsados().entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(ingredienteQuantidade ->
                        System.out.println(ingredienteQuantidade.getKey() + ": "
                                + ingredienteQuantidade.getValue()));
    }
}
