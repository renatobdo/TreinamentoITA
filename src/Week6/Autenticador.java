package Week6;

public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		//dar erro quando nao conseguir autenticar
		if (login.equals("guerra") && senha.equals("senhadoguerra")){
			return new Usuario(login);
		}
		throw new LoginException("O usuario e a senha nao batem", login);
	}
}
