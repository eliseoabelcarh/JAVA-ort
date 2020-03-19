package hotelYHabitaciones;

public class Habitacion {
	
	private boolean estaVacia;
	private Hotel hotel;
	private String nombre;
	private String tipo;
	
	public Habitacion(Hotel hotel){
		this.hotel=hotel;
		this.estaVacia=true;
		this.tipo="normal";
	} 
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	public String dimeSiEstaVaciaEnString() {
		String result;
		if(estaVacia==false) {
			result="reservada";
		}else {result = "vacia";}
		return result;
	}
	
	public String getNombreDeHotel() {
		return hotel.getNombre();
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void reservar() {
		this.estaVacia= false;
	}
	
	public void liberar() {
		this.estaVacia= true;
	}

	
	public boolean getEstaVacia() {
		return this.estaVacia;
	}
	
	
}
