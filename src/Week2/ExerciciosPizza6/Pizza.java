
package Week2.ExerciciosPizza6;

import java.util.ArrayList;
import java.util.HashMap;


public class Pizza {
    
//declaração de variaveis de apoio
    private static int quantidadeIngredientes = 0;
    int contadorIngredientes = 0;
    private double preco;
    public static HashMap<String,Integer> map = new HashMap<>();    
    
    
    public void adicionaIngrediente(String ingrediente){
        
        contabilizaIngrediente();  
        
        if(map.containsKey(ingrediente)){
         map.put(ingrediente, map.get(ingrediente)+1);
            
        }else{
            map.put(ingrediente,1);
        }
        contadorIngredientes++;
    }
    
    public void calculaPreco(){
        if(contadorIngredientes <= 2){           
            this.setPreco(15);
        }     
        if(contadorIngredientes >=3 & contadorIngredientes<=5){
           this.setPreco(20.00);
        }    
        if(contadorIngredientes > 5){
            this.setPreco(23);
        }
      
    }
    
    public static void contabilizaIngrediente(){
        setQuantidadeIngredientes(getQuantidadeIngredientes() + 1);
    }

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static int getQuantidadeIngredientes() {
		return quantidadeIngredientes;
	}

	public static void setQuantidadeIngredientes(int quantidadeIngredientes) {
		Pizza.quantidadeIngredientes = quantidadeIngredientes;
	}
    
	public static void zeraQuantidadeIngredientes(){
		Pizza.quantidadeIngredientes = 0;
		map.clear();
	}
}
