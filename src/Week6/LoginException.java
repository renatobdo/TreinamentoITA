package Week6;

public class LoginException extends Exception {

	private String login;
	
	
	public LoginException(String message, String login) {
		super(message);
		this.login = login;
		
	}


	public String getLogin() {
		return login;
	}

	
}
