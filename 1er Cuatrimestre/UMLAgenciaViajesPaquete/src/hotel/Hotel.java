package hotel;
import cantidadEstrellas.CantidadEstrellas;
import tipoServicio.TipoServicio;
import ciudad.Ciudad;
import java.util.ArrayList;

public class Hotel {
	private String nombre;
	private String direccion;
	private String telefono;
	private CantidadEstrellas cantidadEstrellas;
	private double precioDiaBD;
	private Ciudad ciudad;
	private ArrayList<TipoServicio> tipoServicio;
	
	public Hotel(String nombre, String direccion, String telefono, CantidadEstrellas cantidadEstrellas,
			double precioDiaBD, Ciudad ciudad, ArrayList<TipoServicio> tipoServicio) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cantidadEstrellas = cantidadEstrellas;
		this.precioDiaBD = precioDiaBD;
		this.ciudad = ciudad;
		this.tipoServicio = tipoServicio;
	}

	public double getPrecioDiaBD() {
		return precioDiaBD;
	}
	
	
	
	
}
