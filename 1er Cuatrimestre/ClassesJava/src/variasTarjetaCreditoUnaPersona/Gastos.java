package variasTarjetaCreditoUnaPersona;

public class Gastos {
	private String concepto;
	private double precio;
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public Gastos(String concepto, double precio) {
		this.concepto= concepto;
		this.precio= precio;
	}
	
	

}
