package clases;

public class Equipo {
	
	private String nombre;
	private int cantJugadores;
	
	public Equipo(String nombre, int cantJugadores) {
		setNombre(nombre);
		setCantJugadores(cantJugadores);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;		
	}

	private void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantJugadores() {
		return cantJugadores;
	}
	
	
	

}
