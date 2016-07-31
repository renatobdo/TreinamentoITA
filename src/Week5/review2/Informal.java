
public class Informal extends Autoridade implements FormatadorNome {

	public Informal(String nome, String sobrenome) {
		super(nome, sobrenome);
	}
	
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome;
	}
}
