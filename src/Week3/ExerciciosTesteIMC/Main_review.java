package Week3.ExerciciosTesteIMC;


import Week3.Paciente;

public class Main_review {
	public static void main(String[] args) {
		Paciente paulo = new Paciente(1.83, 97.8);
		Paciente marcos = new Paciente(1.77, 75.2);
		Paciente filipe = new Paciente(1.62, 85.4);

		System.out.println("IMC de Paulo: " + paulo.calcularIMC()
				+ "\nDiagn�stico: " + paulo.diagnostico() + "\n");
		System.out.println("IMC de Marcos: " + marcos.calcularIMC()
				+ "\nDiagn�stico: " + marcos.diagnostico() + "\n");
		System.out.println("IMC de Filipe: " + filipe.calcularIMC()
				+ "\nDiagn�stico: " + filipe.diagnostico());
	}
}
