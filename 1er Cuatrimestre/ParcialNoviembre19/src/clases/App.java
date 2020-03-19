package clases;

public class App {
	private String nombre;
	private int tamanioEnMb;
	private String fecha;
	
	
	public App(String nombre, int tamanioEnMb, String fecha) {
		super();
		this.nombre = nombre;
		this.tamanioEnMb = tamanioEnMb;
		this.fecha = fecha;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getNombre() {
		return nombre;
	}


	

	public int getTamanioEnMb() {
		return tamanioEnMb;
	}


	public void setTamanioEnMb(int tamanioEnMb) {
		this.tamanioEnMb = tamanioEnMb;
	}


	@Override
	public String toString() {
		return "App [nombre=" + nombre + ", tamanioEnMb=" + tamanioEnMb + ", fecha=" + fecha + "]";
	}


}
