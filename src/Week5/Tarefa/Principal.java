package Week5.Tarefa;

public class Principal {

	public static void main(String[] args) {
		
		Autoridade i = new Autoridade("Renato", null, new Informal());
		System.out.println(i.getTratamento());
		Autoridade r = new Autoridade("Renato", "Bueno", new Respeitoso("masculino"));
		System.out.println(r.getTratamento());
		Autoridade c = new Autoridade("Renato", "Bueno", new ComTitulo("professor"));
		System.out.println(c.getTratamento());
				
	}

}
