package clases;

public class Asalariado extends Empleado {

	
	private float sueldo;
	
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		setSueldo(sueldo);;
	}

	/**
	 * m�todo abstracto que debe ser implementado
	 */
	@Override
	public float calcularPago() {
		return getSueldo();
	}
	
	/**
	 * redefiniendo m�todo de superclase
	 * @return valor float
	 */
	@Override
	public float calcularPago2() {
		return getSueldo();
	}

	private float getSueldo() {
		return this.sueldo;
	}

	//m�todo que deber�a validar lo que ingresa
	private void setSueldo(float sueldo) {
		System.out.println("validando sueldo asignado..");
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + " Asalariado [sueldo=" + calcularPago() + "]";
	}
	
	
	
	
	
	
	
}
