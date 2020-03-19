package profesor;

public class Profesor {
	private String nombre;
	
	

	public Profesor(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + "]";
	}

	
}
