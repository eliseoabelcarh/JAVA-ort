package prestamo;
import ejemplar.Ejemplar;

public class Prestamo {
	
	String fechaRetiro;
	Ejemplar ejemplar;
	final int EXPIRACION= 7;
	int diasDeRetraso;
	int diasDeMulta;
	
	public Prestamo(String fechaRetiro, Ejemplar ejemplar) {
		super();
		this.fechaRetiro = fechaRetiro;
		this.ejemplar = ejemplar;
		this.diasDeRetraso = 0;
		this.diasDeMulta = 0;
	}

	public String getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(String fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public Ejemplar getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}

	public int getDiasDeRetraso() {
		return diasDeRetraso;
	}

	public void setDiasDeRetraso(int diasDeRetraso) {
		this.diasDeRetraso = diasDeRetraso;
	}

	public int getDiasDeMulta() {
		return diasDeMulta;
	}

	public void setDiasDeMulta(int diasDeMulta) {
		this.diasDeMulta = diasDeMulta;
	}

	public int getEXPIRACION() {
		return EXPIRACION;
	}

	@Override
	public String toString() {
		return "Prestamo [fechaRetiro=" + fechaRetiro + ", ejemplar=" + ejemplar + ", EXPIRACION=" + EXPIRACION
				+ ", diasDeRetraso=" + diasDeRetraso + ", diasDeMulta=" + diasDeMulta + "]";
	}
	
	
	
}
