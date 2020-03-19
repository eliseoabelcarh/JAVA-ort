package AutomovilViaje;

public class Automovil {
	
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTotalCombustible;
	private double cantidadCombustible;//en litros
	private double kmPorLitro;//en kmsxlitro
	
	/*rinde 50km x litro
	tengo 100litros - 50*100= me alcanza para 50000kms
	ksm a recorrer= loque rinde * 
	5000/cantidadCombustible >= kmPorlitro
	
	1000kms
	rinde 50km/lt
	.
	necesto 20lt (1000/50)
	
	2000/20<= 50km
	100/20<= 50
	*/
	
	public Automovil(String marca, String modelo, String patente) {
		this.marca = marca;
		this.modelo= modelo;
		this.patente= patente;
	}
	
	public boolean sePuedeViajar(double cantidadDeKmARecorrer) {
		return (cantidadDeKmARecorrer / this.cantidadCombustible<= this.kmPorLitro );
	}
	
	public double getCombustibleNecesarioParaViajar(double cantidadDeKmARecorrer) {
		return (cantidadDeKmARecorrer/this.kmPorLitro);
	}
	
	public boolean viajar(double cantidadDeKmARecorrer){
		boolean viaja = false;
		
		if(sePuedeViajar(cantidadDeKmARecorrer)) {
			this.cantidadCombustible -= getCombustibleNecesarioParaViajar(cantidadDeKmARecorrer);
			viaja=true;
		}
		
		
		return viaja;
	}
	
	
	private boolean sePuedeCargarCombustible (double cantidadDeCarga) {
		return cantidadDeCarga <= this.getCapacidadTotalCombustible()-this.getCantidadCombustible();
	}
	
	public boolean cargarCombustible(double cantidadDeCarga) {
		boolean result=false;
		if(sePuedeCargarCombustible(cantidadDeCarga)) {
			this.cantidadCombustible += cantidadDeCarga;
			result= true;
		}
		return result;
		
	}

	public double getCapacidadTotalCombustible() {
		return capacidadTotalCombustible;
	}

	public void setCapacidadTotalCombustible(double capacidadTotalCombustible) {
		this.capacidadTotalCombustible = capacidadTotalCombustible;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
	


	
	
	
}
