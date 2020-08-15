package clases;

public class Subcontratado extends Empleado{
	
	private float cantHoras;
	private float precioHora;
	
	
	//constructor con parámetros
	public Subcontratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		setCantHoras(cantHoras);
		setPrecioHora(precioHora);
	}

	/**
	 * método abtstracto en superclase
	 * que devuelve el pago del subcontratado
	 */
	@Override
	public float calcularPago() {
		//System.out.println("calculando pago..");
		return getPrecioHora() * getCantHoras();
	}

	// método que especializa/redefine el método de la superclase
	@Override
	public float calcularPago2() {
		//System.out.println("calculando pago..");
		return getPrecioHora() * getCantHoras();
	}

	private float getCantHoras() {
		return this.cantHoras;
	}

	private void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	private float getPrecioHora() {
		return this.precioHora;
	}

	private void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	
	
	@Override
	public String toString() {
		return super.toString() + " Subcontratado [cantHoras=" + cantHoras + ", precioHora=" + precioHora +  ", sueldo= "+ calcularPago() +  "]";
	}
	
	
	
	
}
