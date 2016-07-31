
public class ComTitulo extends Autoridade implements FormatadorNome {
	
	protected String titulo;
	
	public ComTitulo(String nome, String sobrenome, String titulo) {
		super(nome, sobrenome);
		this.titulo = titulo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}
	
}
