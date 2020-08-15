package clases;

public class Lavarropa extends Producto{
	
	private int cargaMaxima;
	private Tipo tipo;

	public Lavarropa(Nombre nombre, Marca marca, String modelo, String nroSerie, float voltaje, Estado estado,
			float precio, int cargaMaxima, Tipo tipo) {
		super(nombre, marca, modelo, nroSerie, voltaje, estado, precio);
		setCargaMaxima(cargaMaxima);
		setTipo(tipo);
	}

	private int getCargaMaxima() {
		return cargaMaxima;
	}

	private void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	private Tipo getTipo() {
		return tipo;
	}

	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " cargaMaxima= " + getCargaMaxima() + " kgs, tipo=" + getTipo() + "]";
	}

	
	
}
