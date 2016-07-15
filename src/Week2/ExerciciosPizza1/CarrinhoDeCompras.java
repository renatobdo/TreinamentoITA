package Week2.ExerciciosPizza1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Pizza> pizzas = new ArrayList<>();

    public double getValorTotal() {
        return pizzas.stream().mapToDouble(Pizza::getPreco).sum();
    }

    public void adciona(Pizza pizza) {
        if (pizza.semIngredientes()) {
            throw new IllegalStateException("A pizza deve ter pelo menos um ingrediente.");
        }
        pizzas.add(pizza);
    }
}
