package pizza;

public class Pizza {
	
	String tipo;
	String gusto;
	
	
	
	
	
	public Pizza(String tipo, String gusto) {
		super();
		this.tipo = tipo;
		this.gusto = gusto;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGusto() {
		return gusto;
	}
	public void setGusto(String gusto) {
		this.gusto = gusto;
	}


	@Override
	public String toString() {
		return "Pizza [tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	
	

}
