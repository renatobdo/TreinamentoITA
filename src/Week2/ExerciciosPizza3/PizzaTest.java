package Week2.ExerciciosPizza3;

import static org.junit.Assert.*;


public class PizzaTest {


    @org.junit.Test
    public void adicionaIngrediente() throws Exception {

        Pizza pizza1 = new Pizza();

        assertEquals(0,pizza1.getQtdeIngredientes());
        pizza1.adicionaIngrediente("Tomato");
        pizza1.adicionaIngrediente("Queijo");
        assertEquals(2,pizza1.getQtdeIngredientes());
    }

    @org.junit.Test
    public void getPreco() throws Exception {

        Pizza pizza1 = new Pizza();

        pizza1.adicionaIngrediente("Tomato");
        assertEquals(15,pizza1.getPreco());
        pizza1.adicionaIngrediente("Queijo");
        assertEquals(15,pizza1.getPreco());
        pizza1.adicionaIngrediente("Carne");
        assertEquals(20,pizza1.getPreco());
        pizza1.adicionaIngrediente("Milho");
        assertEquals(20,pizza1.getPreco());
        pizza1.adicionaIngrediente("Azeitona");
        assertEquals(20,pizza1.getPreco());
        pizza1.adicionaIngrediente("Inhame");
        assertEquals(23,pizza1.getPreco());

    }

}