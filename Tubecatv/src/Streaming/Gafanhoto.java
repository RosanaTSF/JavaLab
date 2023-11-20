package Streaming;
public class Gafanhoto extends Seguidores {

	public Gafanhoto(String nome, int idade, String sexo, String login, int experiencia) {
		super(nome, idade, sexo, experiencia);
		this.login = login;
		this.toAssistido = 0;
	}

	private String login;
	private int toAssistido;
	
	public void assistido() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistido() {
		return toAssistido;
	}

	public void setToAssistido(int toAssistido) {
		this.toAssistido = toAssistido;
	}

	@Override
	public String toString() {
		return "Gafanhoto" 
		+ super.toString() 
		+ "\n Login = " + login 
		+ ", totalAssistido = " + toAssistido;
	}

}
