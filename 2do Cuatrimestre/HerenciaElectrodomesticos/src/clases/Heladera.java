package clases;

public class Heladera extends Producto{
	
	private float capacidad;
	private Tipo tipo;

	public Heladera(Nombre nombre, Marca marca, String modelo, String nroSerie, float voltaje, Estado estado,
			float precio, float capacidad, Tipo tipo) {
		super(nombre, marca, modelo, nroSerie, voltaje, estado, precio);
		setCapacidad(capacidad);
		setTipo(tipo);
	}

	private float getCapacidad() {
		return capacidad;
	}

	private void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	private Tipo getTipo() {
		return tipo;
	}

	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "capacidad= " + getCapacidad() + " litros, tipo= " + getTipo() + " ";
	}

	
}
