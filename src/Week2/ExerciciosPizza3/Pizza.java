package Week2.ExerciciosPizza3;

import java.util.HashMap;

public class Pizza {

    public static HashMap<String, Integer> ingredientes = new HashMap<>();

    private int qtdeIngredientes;

    public Pizza() {
        qtdeIngredientes = 0;
    }

    public int getQtdeIngredientes() {
        return qtdeIngredientes;
    }

    public void adicionaIngrediente(String ingrediente){

        if(ingredientes.containsKey(ingrediente)){
            contabilizaIngrediente(ingrediente);
        }else{
            ingredientes.put(ingrediente, 1);
        }

        qtdeIngredientes++;
    }

    public int getPreco(){

        if(qtdeIngredientes < 3){
            return 15;
        }else if(qtdeIngredientes < 6){
            return 20;
        }else{
            return 23;
        }
    }

    private void contabilizaIngrediente(String ingrediente){
        Integer oldValue = ingredientes.get(ingrediente);
        System.out.println(oldValue);
        ingredientes.replace(ingrediente, ++oldValue);
    }
}
