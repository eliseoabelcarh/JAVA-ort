package TarjetaCredito;

public class Tarjeta {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double disponible;
	private double gastosActuales;

	// Constructor
	public Tarjeta(String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.disponible = limiteDeCompra;
	}
	
	private double getGastosActuales() {
		return (this.limiteDeCompra-this.disponible);
	}

	private boolean puedoComprar(double _monto) {
		return (_monto <= this.disponible);
	}

	public boolean realizarCompra(double monto) {
		boolean result = false;
		if (puedoComprar(monto)) {
			this.disponible = this.limiteDeCompra - monto;
			gastosActuales= getGastosActuales();
		}
		return result;
	}

	public void actualizarLimite(double nuevoLimite) {
		actualizarDisponible(nuevoLimite);//ejecuto antes que cambie el limiteDeCompra
		this.limiteDeCompra = nuevoLimite;

	}

	private void actualizarDisponible(double nuevoLimite) {
		if (  nuevoLimite < getGastosActuales()  ) {
			this.disponible = 0;
		} else {
			this.disponible = nuevoLimite - ( getGastosActuales() );
		}
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", disponible=" + disponible + "]";
	}

}
