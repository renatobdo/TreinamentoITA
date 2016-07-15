package Week3.ExerciciosTesteIMC;
import Week3.Paciente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente(46.5, 1.72);				
		Paciente p2 = new Paciente(48.5, 1.72);				
		Paciente p3 = new Paciente(54.5, 1.72);
		Paciente p4 = new Paciente(64.5, 1.72);
		Paciente p5 = new Paciente(84.5, 1.72);
		Paciente p6 = new Paciente(94.5, 1.72);
		Paciente p7 = new Paciente(104.5, 1.72);
		Paciente p8 = new Paciente(124.5, 1.72);
		
		
		
		System.out.println(p1.diagnostico()+p1.calcularIMC()+" "+Math.abs(15.9-p1.calcularIMC()));
		System.out.println(p2.diagnostico()+p2.calcularIMC());
		System.out.println(p3.diagnostico()+p3.calcularIMC());
		System.out.println(p4.diagnostico()+p4.calcularIMC());
		System.out.println(p5.diagnostico()+p5.calcularIMC());
		System.out.println(p6.diagnostico()+p6.calcularIMC());
		System.out.println(p7.diagnostico()+p7.calcularIMC());
		System.out.println(p8.diagnostico()+p8.calcularIMC());
		

	
	}

}
