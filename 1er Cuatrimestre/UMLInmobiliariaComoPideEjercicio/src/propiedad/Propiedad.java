package propiedad;
import tipo.Tipo;

public class Propiedad {
	
	private String direccion;
	private double precio;
	private Tipo tipo;

	
	public Tipo getTipo () {
		return this.tipo;
	}


	public String getDireccion() {
		return direccion;
	}


	public double getPrecio() {
		return precio;
	}
	
	public void mostrarPrecioDireccion() {
		System.out.println( "Precio: " +  this.precio + " - Dirección: " + this.direccion);
			}

	//se puede modificar este método y quitar "tipo" para lo que pide ejercicio
	@Override
	public String toString() {
		return "Propiedad [direccion=" + direccion + ", precio=" + precio + ", tipo=" + tipo + "]";
	}


	
	
}
