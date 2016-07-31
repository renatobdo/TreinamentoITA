package tratamento;

public class Informal implements FormatadorNome {
	String nome, sobrenome;
	
	Informal(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String formatarNome() {
		return nome;
	}

}
