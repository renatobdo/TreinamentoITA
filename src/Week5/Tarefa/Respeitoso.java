package Week5.Tarefa;

public class Respeitoso implements FormatadorNome {

	String sexo;	
	
	public Respeitoso(String sexo) {
		super();
		this.sexo = sexo;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (sexo == "feminino"){
			return "Sra." +sobrenome;
		}else{
			return "Sr."+sobrenome;
		}
		
	}

}
