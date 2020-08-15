package clases;

public class Asalariado extends Empleado {

	
	private float sueldo;
	
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		setSueldo(sueldo);;
	}

	/**
	 * método abstracto que debe ser implementado
	 */
	@Override
	public float calcularPago() {
		return getSueldo();
	}
	
	/**
	 * redefiniendo método de superclase
	 * @return valor float
	 */
	@Override
	public float calcularPago2() {
		return getSueldo();
	}

	private float getSueldo() {
		return this.sueldo;
	}

	//método que debería validar lo que ingresa
	private void setSueldo(float sueldo) {
		System.out.println("validando sueldo asignado..");
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + " Asalariado [sueldo=" + calcularPago() + "]";
	}
	
	
	
	
	
	
	
}
