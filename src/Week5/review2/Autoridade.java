
public class Autoridade implements FormatadorNome{
	
	private String nome;
	private String sobrenome;
	
	public Autoridade(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getTratamento(){
		return formatarNome(nome, sobrenome);
	
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome + " " + sobrenome;
	}	
	
	
}
