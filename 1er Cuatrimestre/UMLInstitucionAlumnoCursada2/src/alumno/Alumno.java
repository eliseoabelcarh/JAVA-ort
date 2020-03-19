package alumno;
import escolaridad.Escolaridad;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private Escolaridad escolaridad;
	
	
	
	
	public Alumno(String dni, String nombre, String apellido, Escolaridad escolaridad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.escolaridad = escolaridad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Escolaridad getEscolaridad() {
		return escolaridad;
	}
	public void setEscolaridad(Escolaridad escolaridad) {
		this.escolaridad = escolaridad;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", escolaridad=" + escolaridad
				+ "]";
	}
	
	
	

}
