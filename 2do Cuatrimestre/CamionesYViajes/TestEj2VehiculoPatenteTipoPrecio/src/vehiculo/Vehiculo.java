package vehiculo;

public class Vehiculo {
	
	private String patente;
	private int tipo;
	private float precio;
	
	public Vehiculo(String patente , int tipo, float precio) {
		this.patente = patente;
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getPatente() {
		return patente;
	}

	public int getTipo() {
		return tipo;
	}

	public float getPrecio() {
		return precio;
	}
	
	

}
