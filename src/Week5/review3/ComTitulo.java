package tratamento;

public class ComTitulo implements FormatadorNome {

	String titulo, nome, sobrenome;
	
	public ComTitulo(String titulo, String nome, String sobrenome) {
		super();
		this.titulo = titulo;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String formatarNome() {
		return titulo + " " + nome + " " + sobrenome;
	}

}
