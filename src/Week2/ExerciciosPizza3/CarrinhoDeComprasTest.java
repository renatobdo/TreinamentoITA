package Week2.ExerciciosPizza3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarrinhoDeComprasTest {

    @Test
    public void addPizzas() throws Exception {

        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        Pizza p1 = new Pizza();

        assertEquals(false, cc.addPizzas(p1));

        p1.adicionaIngrediente("Queijo");

        assertEquals(true, cc.addPizzas(p1));
    }

    @Test
    public void getValor() throws Exception {

        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        p1.adicionaIngrediente("Queijo");
        p2.adicionaIngrediente("Tomate");
        cc.addPizzas(p1);
        cc.addPizzas(p2);

        assertEquals(30, cc.getValor());

    }

}