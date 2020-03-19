package empanada;

public class Empanada {
	
	TipoEmp tipo;
	GustoEmp gusto;
	
	
	public Empanada(TipoEmp tipo, GustoEmp gusto) {
		super();
		this.tipo = tipo;
		this.gusto = gusto;
	}
	public TipoEmp getTipo() {
		return tipo;
	}
	public void setTipo(TipoEmp tipo) {
		this.tipo = tipo;
	}
	public GustoEmp getGusto() {
		return gusto;
	}
	public void setGusto(GustoEmp gusto) {
		this.gusto = gusto;
	}
	@Override
	public String toString() {
		return "Empanada [tipo=" + tipo + ", gusto=" + gusto + "]";
	}
	
	

}
