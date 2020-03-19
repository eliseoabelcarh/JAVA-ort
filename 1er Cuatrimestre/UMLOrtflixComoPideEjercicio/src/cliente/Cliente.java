package cliente;
import historial.Historial;
import pelicula.Pelicula;
import capitulo.Capitulo;


public class Cliente {

	String dni;
	double saldo;
	boolean esPremium;
	Historial historial;
	
	public double obtenerSaldo(){
		//forzando valores iniciales
		this.saldo=0;
		return saldo;
	}
	
	
	public boolean tieneDeuda() {
		boolean result= false;
		double saldo;
		saldo=obtenerSaldo();
		if(saldo>0) {result=true;}
		return result;
	}
	
	public boolean esPremium() {
		return this.esPremium;
	}
	
	 public void agregarPeliculaAlHistorial(Pelicula pelicula) {
		 this.historial.getPeliculas().add(pelicula);
	 }
	 
	 public void agregarCapituloAlHistorial(Capitulo capitulo) {
		 this.historial.getCapitulo().add(capitulo);
	 }


	public String getDni() {
		return dni;
	}
	 
	 
}
