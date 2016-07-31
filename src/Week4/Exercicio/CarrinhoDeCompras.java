package Week4.Exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Week2.ExerciciosPizza3.Pizza;

public class CarrinhoDeCompras {
	public HashMap<String, Integer> produtos = new HashMap<>();
	List<Produto> produtos2;

	public CarrinhoDeCompras() {
		this.produtos2 = new ArrayList<>();
	}

	public void adicionaProduto(String produto) {
		if (produtos.containsKey(produto)) {
			contabilizaProduto(produto);
		} else {
			produtos.put(produto, 1);
		}
	}

	public void removeProduto(String produto) {

		produtos.remove(produto, 1);

	}

	private void contabilizaProduto(String produto) {
		Integer oldValue = produtos.get(produto);
		System.out.println(oldValue);
		produtos.replace(produto, ++oldValue);
	}

	

	public int valorTotalCompra() {

		int total = 0;

		for (Produto p : produtos2) {
		

				total += p.getPreco();
			}
		

		return total;
	}
}
