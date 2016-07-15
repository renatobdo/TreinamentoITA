package Week2.ExerciciosPizza6;

import java.util.ArrayList;

public class CarrinhoDeCompra {
    
    public ArrayList<Pizza> listaDePizzas = new ArrayList<>();
    
    
    public void adicionaPizza(Pizza pizza){
        //verifica se a pizza que esta sendo adicionada possui ingredientes
        if(pizza.contadorIngredientes <= 0){
            System.out.println("Não é possivel Adicionar pizzas sem ingrediente");
        }else{  
        getListaDePizzas().add(pizza);
        }
    
    }
    
    public double contabilizaTotal(){
        double precoTotal = 0;
        for(Pizza pizza :getListaDePizzas()){
        	pizza.calculaPreco();
            precoTotal = precoTotal + pizza.getPreco();
        }
        return precoTotal;
    }

	public ArrayList<Pizza> getListaDePizzas() {
		return listaDePizzas;
	}

	void setListaDePizzas(ArrayList<Pizza> listaDePizzas) {
		this.listaDePizzas = listaDePizzas;
	}
    
}
