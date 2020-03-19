package pizza;

public class Pizza {
	String tipo;
	String gusto;
	
	public Pizza(String tipo, String gusto) {
		super();
		this.tipo = tipo;
		this.gusto = gusto;
	}

	@Override
	public String toString() {
		return "Pizza [tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	

}
