
public class Respeitoso implements FormatadorNome {

	private String sexo;
	
	public Respeitoso(String sexo) {
		super();
		this.sexo = sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(sexo == "masculino") {
			return "Sr. " + nome + " " + sobrenome;
		} else if (sexo == "feminino") {
			return "Sra. " + nome + " " + sobrenome;
		} else {
			return nome + " " + sobrenome;
		}
	}

}
