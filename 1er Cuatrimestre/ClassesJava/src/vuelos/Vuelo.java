package vuelos;

public class Vuelo {

	private String origen;
	private String destino;
	private String fecha;
	private int numero;
	private int capacidadTotal;
	private int asientosOcupados;
	
	
	public Vuelo( String origen,String destino, String fecha,int numero, int capacidadTotal) {
		this.origen=origen;
		this.destino=destino;
		this.fecha=fecha;
		this.numero= numero;
		this.capacidadTotal=capacidadTotal;
	}
	
	
	public int getDisponibles() {
		return (this.capacidadTotal-this.asientosOcupados);
	}
	public boolean reservar(int cantidadDeReservas) {
		boolean esPosibleReservar=false;
		if (cantidadDeReservas<= getDisponibles()) {
			this.asientosOcupados+=cantidadDeReservas;
			esPosibleReservar=true;
		}
		return esPosibleReservar;
	}
	
	public boolean liberarAsientos(int cantidadALiberar) {
		boolean sePuedeLiberar=false;
		if(cantidadALiberar<=this.asientosOcupados) {
			this.asientosOcupados-=cantidadALiberar;
			sePuedeLiberar=true;
		}
		
		return sePuedeLiberar;
	}
	
	public void setAsientosOcupados(int setCantidadOcupados){
		this.asientosOcupados=setCantidadOcupados;
	}
	
	public int getAsientosOcupados() {
		return this.asientosOcupados;
	}


	
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", numero=" + numero
				+ ", capacidadTotal=" + capacidadTotal + ", asientosOcupados=" + asientosOcupados + "]";
	}
	
	

}
