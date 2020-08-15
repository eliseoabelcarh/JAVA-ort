package clases;

public abstract class Empleado {
	
	private String nombre;
	private int edad;	
	
	
	
	public Empleado(String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}



	public abstract float calcularPago();
	
	/**
	 * Método implementado para ser redefinido por las
	 * subclases
	 * @return un valor float
	 */
	public float calcularPago2() {
		return 0.0f;
	}
	

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + getNombre() + ", edad=" + getEdad()+ "]";
	}
	


}
