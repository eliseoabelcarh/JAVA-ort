package lector;
import java.util.ArrayList;
import prestamo.Prestamo;

public class Lector {
	String dni;
	String nombre;
	String direccion; 
	String telefono;
	final int MAX_PRESTAMOS=3;
	ArrayList<Prestamo> prestamos;
	
	public Lector(String dni, String nombre, String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.prestamos= new ArrayList<Prestamo>();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public int getMAX_PRESTAMOS() {
		return MAX_PRESTAMOS;
	}

	@Override
	public String toString() {
		return "Lector [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", MAX_PRESTAMOS=" + MAX_PRESTAMOS + ", prestamos=" + prestamos + "]";
	}
	
	public boolean puedePrestarseTope() {
		boolean result= false;
		int cont=this.prestamos.size();
		if(cont < getMAX_PRESTAMOS()) {result=true;}
		return result;
	}
	
	public boolean tieneMulta() {
		boolean result=false;
		for(Prestamo prestamo: prestamos) {
		 if(prestamo.getDiasDeMulta() > 0 ) {result=true;}
		}
		return result;
	}
}
