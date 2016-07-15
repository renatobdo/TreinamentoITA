package Week1;

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar(){
		velocidade = velocidade + potencia;
	}
	
	void frear(){
		velocidade = velocidade / 2;
	}
	int getVelocidade(){
		return velocidade ;
	}
	void iprimir(){
		System.out.println("O carro "+nome+" está a velocidade "+getVelocidade()+"Km/h");
	}
}
