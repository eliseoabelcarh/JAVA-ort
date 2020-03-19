package PajaroYDuenio;

public class Duenio {
	
	String nombre;
	Pajaro pajaro;
	
	
	public Duenio(String _nombre) {
		this.nombre=_nombre;
	}
	
	public void setPajaro(Pajaro pajaro) {
		this.pajaro= pajaro;
	}
	
	public void alimentarPajaro(String comida) {
		pajaro.comer(comida);
	}
	
	public void darDeBeberAPajaro() {
		pajaro.beber();
	}
	
	public String getNombre() {
		return nombre;
	}

	
}
