package pizza;

public class Pizza {
	
	TipoPizza tipo;
	GustoPizza gusto;
	
	public Pizza(TipoPizza tipo, GustoPizza gusto) {
		super();
		this.tipo = tipo;
		this.gusto = gusto;
	}
	public TipoPizza getTipo() {
		return tipo;
	}
	public void setTipo(TipoPizza tipo) {
		this.tipo = tipo;
	}
	public GustoPizza getGusto() {
		return gusto;
	}
	public void setGusto(GustoPizza gusto) {
		this.gusto = gusto;
	}
	@Override
	public String toString() {
		return "Pizza [tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	
	

}
