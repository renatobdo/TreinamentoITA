package tratamento;

public class Respeitoso implements FormatadorNome {

	boolean isFeminino;
	String nome, sobrenome;
	
	public Respeitoso(String nome, String sobrenome, boolean isFeminino) {
		super();
		this.isFeminino = isFeminino;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String formatarNome() {
		String prefixo; 
		
		if(isFeminino){
			prefixo = "Sra. ";
		}else{
			prefixo = "Sr. ";
		}
		
		return prefixo + sobrenome;
	}

}
