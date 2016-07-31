package Week5.Tarefa;

public class Autoridade {
	String nome;
	String sobrenome;
	private FormatadorNome f;

	public Autoridade(String nome, String sobrenome, FormatadorNome a) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.f = a;
	}
	
	public String getTratamento() {	
		return f.formatarNome(nome, sobrenome);
	}

}
