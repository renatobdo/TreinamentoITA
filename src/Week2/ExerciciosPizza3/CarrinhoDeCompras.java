package Week2.ExerciciosPizza3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Pizza> pizzas;

    public CarrinhoDeCompras() {
        this.pizzas = new ArrayList<>();
    }

    public boolean addPizzas(Pizza z){

        if(z.getQtdeIngredientes() != 0){

            return pizzas.add(z);
        }

        return false;
    }

    public int getValor(){

        int total = 0;

        for(Pizza p : pizzas){
            total += p.getPreco();
        }

        return total;
    }
}
