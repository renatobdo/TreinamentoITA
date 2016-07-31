
public class Respeitoso extends Autoridade implements FormatadorNome {
	
	protected String sexo;
	
	public Respeitoso(String nome, String sobrenome, String sexo) {
		super(nome, sobrenome);
		this.sexo = sexo;
	}
	
	
	public String getSexo() {
			return sexo;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(sexo == "M"){
			return "Sr. " +sobrenome;
		}else{
			return "Sra. " +sobrenome;
		}
	}
	
	

}
