package curso;
import escolaridad.Escolaridad;

public class Curso {

	private String nombre;
	private Escolaridad escolaridad;
	
	
	
	
	public Curso(String nombre, Escolaridad escolaridad) {
		super();
		this.nombre = nombre;
		this.escolaridad = escolaridad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Escolaridad getEscolaridad() {
		return escolaridad;
	}
	public void setEscolaridad(Escolaridad escolaridad) {
		this.escolaridad = escolaridad;
	}
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", escolaridad=" + escolaridad + "]";
	}
	
	
}
