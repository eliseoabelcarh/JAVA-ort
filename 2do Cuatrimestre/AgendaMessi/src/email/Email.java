package email;

public class Email {
	
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		String[] resultado = email.split("@");
		this.cuenta = resultado[0];
		this.dominio = resultado[1];
	}

	public String getValor() {
		return this.cuenta + "@" +this.dominio;
	}

	@Override
	public String toString() {
		return getValor();
	}
	
}
