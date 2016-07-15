package Week2.ExerciciosPizza3;


public class Pricipal {

    public static void main(String args[]){

        /*Pizza 1*/
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Cebola");
        pizza1.adicionaIngrediente("Milho");
        pizza1.adicionaIngrediente("Azeitona");
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");
        pizza1.adicionaIngrediente("Inhame");


        /*Pizza 2*/
        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Tomate");

        /*Pizza 3*/
        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Tomate");
        pizza3.adicionaIngrediente("Manga");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.addPizzas(pizza1);
        carrinhoDeCompras.addPizzas(pizza2);
        carrinhoDeCompras.addPizzas(pizza3);


        System.out.println("Valor total: " + carrinhoDeCompras.getValor());

        for(String s : Pizza.ingredientes.keySet()){
            System.out.println(s + " : " +  Pizza.ingredientes.get(s));
        }

    }
}
