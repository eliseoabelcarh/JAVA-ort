package alumno;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	boolean escolaridad;
	
	
	public Alumno(String dni, String nombre, String apellido, boolean escolaridad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.escolaridad = escolaridad;
	}


	public String getDni() {
		return dni;
	}


	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", escolaridad=" + escolaridad
				+ "]";
	}
	
	
	
	
	
}
