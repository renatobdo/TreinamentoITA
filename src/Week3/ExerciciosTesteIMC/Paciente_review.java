package Week3.ExerciciosTesteIMC;


public class Paciente_review {

	private double altura;
	private double peso;

	public Paciente_review(double altura, double peso) {
		setAltura(altura);
		setPeso(peso);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularIMC() {
		return (getPeso() / (getAltura() * getAltura()));
	}

	public String diagnostico() {
		if (calcularIMC() < 16) {
			return Mensagens_review.getMuitoGrave();
		} else if (calcularIMC() < 17) {
			return Mensagens_review.getGrave();
		} else if (calcularIMC() < 18.5) {
			return Mensagens_review.getBaixo();
		} else if (calcularIMC() < 25) {
			return Mensagens_review.getNormal();
		} else if (calcularIMC() < 30) {
			return Mensagens_review.getSobrePeso();
		} else if (calcularIMC() < 35) {
			return Mensagens_review.getObesidadeG1();
		} else if (calcularIMC() < 40) {
			return Mensagens_review.getObesidadeG2();
		} else {
			return Mensagens_review.getObesidadeG3();
		}
	}

}
