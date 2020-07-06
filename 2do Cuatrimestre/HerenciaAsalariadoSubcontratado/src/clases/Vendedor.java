package clases;

public class Vendedor extends Subcontratado {

	private float porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		setPorcentaje(porcentaje);
	}

	@Override
	public float calcularPago() {
		return ((super.calcularPago() * getPorcentaje())/100)+super.calcularPago();
	}

	private float getPorcentaje() {
		return porcentaje;
	}

	private void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
	@Override
	public String toString() {
		return "Vendedor [nombre= " + super.getNombre() + " gana " + calcularPago() + ", getPorcentaje()= "
				+ getPorcentaje() + "]";
	}
	
}
