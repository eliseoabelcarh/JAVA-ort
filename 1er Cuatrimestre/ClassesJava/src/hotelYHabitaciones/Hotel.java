package hotelYHabitaciones;
import java.util.ArrayList;

public class Hotel {

	private String nombre;
	private ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
	
	public Hotel (String nombre) {
		this.nombre= nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Habitacion getHabitacion(int i){
		return habitaciones.get(i);
		}
	
	public void addHabitaciones(int cantidadDeHabitaciones) {
		for(int i=0; i<cantidadDeHabitaciones; i++) {
			
				
				Habitacion habitacion = new Habitacion(this);//OJO mismo nombre de objeto??
				habitaciones.add(habitacion);
				habitacion.setNombre("habitacion"+(i+1));
				
		}
	}
	
	public void mostrarListaDeHabitaciones() {
		for(int i=0; i<habitaciones.size(); i++) {
			System.out.println(habitaciones.get(i).getNombre() + " " + habitaciones.get(i).dimeSiEstaVaciaEnString() + " " + habitaciones.get(i).getTipo());
			
		}
	}
	
	public void reservarHabitacion(int nroHabitacion) {
		int i = nroHabitacion-1;
		habitaciones.get(i).reservar();
	}
	public void liberarHabitacion(int nroHabitacion) {
		int i= nroHabitacion-1;
		habitaciones.get(i).liberar();
	}
	
	public int getCantidadHabitacionesDisponibles() {
		int cont=0;
		
		for(int i=0; i<habitaciones.size(); i++) {
			if(habitaciones.get(i).getEstaVacia()) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public int getCantidadHabitacionesReservadas() {
		int cont=0;
		for(int i =0; i< habitaciones.size();i++) {
			if( !(habitaciones.get(i).getEstaVacia())   ) {
				cont++;
			}
		}
		return cont;
	}
	
	public void reservarVarias(int cantidad) {
		if(cantidad<getCantidadHabitacionesDisponibles()) {
			int m=0;			
			for(int i=0; m<cantidad ;i++) {
				
				if(habitaciones.get(i).getEstaVacia()) {
					
					habitaciones.get(i).reservar();
					System.out.println("reservando ..." + habitaciones.get(i).getNombre());
					m++;
					}
			}
		
		
		}//fin de if
		else {System.out.println("no hay suficientes disponibles");}
	}
	
	
	public void liberarVarias(int cantidad) {
		if(cantidad<=getCantidadHabitacionesReservadas()) {
			int m=0;			
			for(int i=0; m<cantidad;i++) {
				
				if(!(habitaciones.get(i).getEstaVacia())) {
					habitaciones.get(i).liberar();
					System.out.println("liberando ..." + habitaciones.get(i).getNombre());
					m++;
					}
			}
		
		
		}//fin de if
		else {System.out.println("no se puede liberar esa cantidad");}
	}
	
	public void asignarTipoDeHabitacio(int nroHabitacion, String tipo) {
		
		habitaciones.get(nroHabitacion).setTipo(tipo);
		
	}
	
}
