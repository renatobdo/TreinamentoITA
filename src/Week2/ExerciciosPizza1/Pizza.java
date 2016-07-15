package Week2.ExerciciosPizza1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {

    private static final Map<String, Integer> ingredientesUsados = new HashMap<>();

    private final List<String> ingredientes = new ArrayList<>();

    private static void contabilizaIngrediente(String ingrediente) {
        ingredientesUsados.merge(ingrediente, 1, (quantidade, um) -> quantidade + um);
    }

    public static Map<String, Integer> getIngredientesUsados() {
        return Collections.unmodifiableMap(ingredientesUsados);
    }

    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
        ingredientes.add(ingrediente);
    }

    public double getPreco() {
        if (ingredientes.size() <= 2) {
            return 15;
        } else if (ingredientes.size() >= 3 && ingredientes.size() <= 5) {
            return 20;
        }
        return 23;

    }

    public boolean semIngredientes() {
        return ingredientes.isEmpty();
    }
}
