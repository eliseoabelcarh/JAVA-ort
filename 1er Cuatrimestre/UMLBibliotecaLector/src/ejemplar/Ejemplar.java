package ejemplar;
import estado.Estado;
import libro.Libro;

public class Ejemplar {
	
	int identificador;
	String fechaPrestamo;
	Estado estado;
	
	
	public Ejemplar(int identificador, String fechaPrestamo, Estado estado ) {
		super();
		this.identificador = identificador;
		this.fechaPrestamo = fechaPrestamo;
		this.estado = estado;
		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Ejemplar [identificador=" + identificador + ", fechaPrestamo=" + fechaPrestamo + ", estado=" + estado
				+ "]";
	}



	
	
	
}
