package Week3;

public class Paciente {
	double peso;
	double altura;

	public Paciente(double p, double a) {
		// TODO Auto-generated constructor stub
		peso = p;
		altura = a;
	}

	public double calcularIMC() {
		double IMC;
		IMC = peso / (altura * altura);

		return IMC;

	}

	public String diagnostico() {

		double IMC;

		IMC = calcularIMC();

		if (IMC <= 16) {
			return ("Baixo peso muito grave ");
		} else if ((IMC <= 16.99) && (16 < IMC)) {
			return ("Baixo peso grave ");
		} else if ((IMC <= 18.49) && (17 < IMC)) {
			return ("Baixo peso ");
		} else if ((IMC <= 24.99) && (18.5 < IMC)) {
			return ("Peso normal ");
		} else if ((IMC < 29.99) && (25 < IMC)) {
			return ("Sobrepeso ");
		} else if ((IMC < 34.99) && (30 < IMC)) {
			return ("Obesidade grau 1: ");
		} else if ((IMC < 39.99) && (35 < IMC)) {
			return ("Obesidade grau 2: ");
		} else if (IMC >= 40) {
			return ("Obesidade grau 3 mórbida: ");
		} else {
			return null;
					}
	}

}
