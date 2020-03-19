package empanada;

public class Empanada {
	String tipo;
	String gusto;
	
	
	public Empanada(String tipo, String gusto) {
		super();
		this.tipo = tipo;
		this.gusto = gusto;
	}


	@Override
	public String toString() {
		return "Empanada [tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	
	

}
