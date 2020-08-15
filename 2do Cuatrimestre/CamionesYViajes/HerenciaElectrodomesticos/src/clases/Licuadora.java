package clases;

public class Licuadora extends Producto {
	private float potencia;
	private int cantVelocidades;

	public Licuadora(Nombre nombre, Marca marca, String modelo, String nroSerie, float voltaje, Estado estado,
			float precio, float potencia, int cantVelocidades) {
		super(nombre, marca, modelo, nroSerie, voltaje, estado, precio);
		setPotencia(potencia);
		setCantVelocidades(cantVelocidades);
	}

	private float getPotencia() {
		return potencia;
	}

	private void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	private int getCantVelocidades() {
		return cantVelocidades;
	}

	private void setCantVelocidades(int cantVelocidades) {
		this.cantVelocidades = cantVelocidades;
	}

	@Override
	public String toString() {
		return super.toString() +" potencia= " + getPotencia() + ", cantVelocidades=" + getCantVelocidades() + " ";
	}
	
	

	
}
