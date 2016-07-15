
package Week2.ExerciciosPizza6;

import java.util.HashMap;

/**
 *
 * @author luiz fernando correa augusto
 */
public class Principal {

    public static String imprimiTotalIngrediente(){
            
        String impressao ="";
        HashMap<String,Integer> apoio = Pizza.map;
            for(HashMap.Entry<String,Integer> ingrediente: apoio.entrySet()){
                impressao += ingrediente.getKey()+" : "+ingrediente.getValue()+"\n";
            }
        return impressao;
    }
    public static void main(String[] args) {
       
        
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        
        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("calabresa");
        p1.adicionaIngrediente("cebola");
        p1.adicionaIngrediente("queijo");
       p1.adicionaIngrediente("ovo");
       p1.adicionaIngrediente("bacon");
        
       Pizza p2 = new Pizza();
       p2.adicionaIngrediente("ovo");
       p2.adicionaIngrediente("bacon");
       p2.adicionaIngrediente("queijo");
       p2.adicionaIngrediente("brocolis");
       
       Pizza p3 = new Pizza();
       p3.adicionaIngrediente("queijo");
       
       
       carrinho.adicionaPizza(p1);
       carrinho.adicionaPizza(p2);
       carrinho.adicionaPizza(p3);
       
       
       
       
       
        System.out.println("Total de Pizzas:"+carrinho.getListaDePizzas().size());
        System.out.println("O valor da compra é: "+carrinho.contabilizaTotal());
        System.out.println("\nForam Utilizados : "+Pizza.getQuantidadeIngredientes()+" Ingredientes no TOTAL\n");
        System.out.println("Lista de Ingredientes usados em todas as pizzas:");
        System.out.println(imprimiTotalIngrediente());
    }
    
   
    
}

