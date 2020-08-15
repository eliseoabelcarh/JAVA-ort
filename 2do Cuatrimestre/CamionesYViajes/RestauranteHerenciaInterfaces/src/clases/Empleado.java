package clases;

public abstract class Empleado {
	private String nombre;
	private int nroLegajo;

	public Empleado(String nombre, int nroLegajo) {
		this.nroLegajo = nroLegajo;
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nroLegajo=" + nroLegajo + "]";
	}
	
	
}
