package tratamento;

public class Autoridade {
	FormatadorNome f;
	
	public Autoridade(String nome, String sobrenome) {
		f = new Informal(nome, sobrenome);
	}
	
	public Autoridade(String nome, String sobrenome, boolean sexoFeminino) {
		f = new Respeitoso( nome, sobrenome, sexoFeminino);
	}
	
	public Autoridade(String nome, String sobrenome, String titulo) {;
		f = new ComTitulo(titulo, nome, sobrenome);
	}

	public String getTratamento() {
		return f.formatarNome();
	}
}
