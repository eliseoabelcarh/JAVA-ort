package paquete;
import ciudad.Ciudad;
import pasaje.Pasaje;
import hotel.Hotel;
import excursion.Excursion;
import java.util.ArrayList;
import tipoServicio.TipoServicio;

public class Paquete {
	private String nombre;
	private Ciudad ciudad;
	private int diasDuracion;
	private Pasaje pasaje;
	private Hotel hotel;
	private ArrayList<Excursion> excursiones;
	private TipoServicio tipoServicioHotel;
	
	
	
	public Ciudad getCiudad() {
		return ciudad;
	}



	@Override
	public String toString() {
		return "Paquete [nombre=" + nombre + ", ciudad=" + ciudad + ", diasDuracion=" + diasDuracion + ", pasaje="
				+ pasaje + ", hotel=" + hotel + ", excursiones=" + excursiones + ", tipoServicioHotel="
				+ tipoServicioHotel + "]";
	}

	public double calcularValor( int cantPasajeros ) {
		double result=0;
		double totalBD;
		
		totalBD = totalPrecioPasajeBD() + totalPreciohotelBD()  +  totalPrecioExcursionesBD(); 
		
		boolean esImpar;
		esImpar=esImpar(cantPasajeros);
		
		int cantPaquetesBD;
		cantPaquetesBD=cantPasajeros/2;
		
		if(esImpar) {
			
			result = (double)  (  (cantPaquetesBD*totalBD) + totalBD*0.7 )    ;
			
		} else {result = (double)cantPaquetesBD*totalBD;}
		
		return result;
		
		
	}
	
	public double totalPrecioExcursionesBD() {
		double total=0;
		for(Excursion excursion: this.excursiones) {
			total += excursion.getPrecioBD();
		}
		
		return total;
	}
	
	public double totalPreciohotelBD() {
		return this.diasDuracion*hotel.getPrecioDiaBD();
	}
	
	public double totalPrecioPasajeBD() {
		return this.pasaje.getPrecioBD();
	}
	
	public boolean esImpar(int nro) {
		return  (nro%2 != 0);
	}
	
	
	
	
	
	
	
}
