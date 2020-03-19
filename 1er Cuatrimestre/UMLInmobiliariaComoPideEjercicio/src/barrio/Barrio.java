package barrio;
import propiedad.Propiedad;
import java.util.ArrayList;
import tipo.Tipo;

public class Barrio {
	
	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	
	public void mostrarPropiedades(Tipo tipo){
		
		ArrayList<Propiedad> propiedadesTipo = new ArrayList<Propiedad>();
		
		for(Propiedad propiedad: this.propiedades) {
			if(propiedad.getTipo() == tipo) {
				propiedadesTipo.add(propiedad);
			}
		}
		
		System.out.println(propiedadesTipo);
		
	}
	
	
	public int getCantidadPropiedades() {
		return this.propiedades.size();
	}
	
	public void getPrecioDireccionPropiedades() {
		for(Propiedad propiedad: this.propiedades) {
			propiedad.mostrarPrecioDireccion();
		}
	}


	@Override
	public String toString() {
		return "Barrio [nombre=" + nombre + ", propiedades=" + propiedades + "]";
	}
	
	
	
}
