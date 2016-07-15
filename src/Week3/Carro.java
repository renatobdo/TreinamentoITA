package Week3;

public class Carro {
	public int potencia;
	int velocidade;
	String nome;
	
	public void acelerar(){
		velocidade = velocidade + potencia;
	}
	
	public void frear(){
		velocidade = velocidade / 2;
	}
	public int getVelocidade(){
		return velocidade ;
	}
	void iprimir(){
		System.out.println("O carro "+nome+" está a velocidade "+getVelocidade()+"Km/h");
	}
}
