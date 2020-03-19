package lector;
import prestamo.Prestamo;
import java.util.ArrayList;

public class Lector {
	
	String dni;
	String nombre;
	String direccion;
	String telefono;
	ArrayList<Prestamo> prestamos;
	final int MAX_PRESTAMOS=3;


	
	public Lector(String dni, String nombre, String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.prestamos= new ArrayList<Prestamo>();
	}
	public boolean alcanzoTopePrestamos() {
		boolean result = false;
		if(this.prestamos.size()>=MAX_PRESTAMOS) {
			result = true;
		}
		return result;
	}
	public boolean tieneMulta() {
		boolean result=false;
		for(int i=0; i<this.prestamos.size();i++) {
			if(prestamos.get(i).tieneMulta()) {
				result=true;
			}
		}
		
		return result;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	@Override
	public String toString() {
		return "Lector [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", prestamos=" + prestamos + ", MAX_PRESTAMOS=" + MAX_PRESTAMOS + "]";
	}
	public String getDni() {
		return dni;
	} 

	
}
