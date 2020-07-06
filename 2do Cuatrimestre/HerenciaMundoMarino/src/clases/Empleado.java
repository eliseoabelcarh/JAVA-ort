package clases;

public class Empleado {
	
	private String nombre;
	//atributo horarios no necesarios

	public Empleado(String nombre) {
		setNombre(nombre);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + getNombre() ;
	}
	
	

}
