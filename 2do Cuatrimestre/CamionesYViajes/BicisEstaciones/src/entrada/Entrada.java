package entrada;

public class Entrada {

	private int idEstacion;
	private int nroAnclaje;
	private boolean averiada;
	
	public Entrada(int idEstacion, int nroAnclaje, boolean averiada) {
		this.idEstacion = idEstacion;
		this.nroAnclaje = nroAnclaje;
		this.averiada = averiada;
	}

	@Override
	public String toString() {
		return "Entrada [idEstacion=" + idEstacion + ", nroAnclaje=" + nroAnclaje + ", averiada=" + averiada + "]";
	}

	
	
	
	
}
