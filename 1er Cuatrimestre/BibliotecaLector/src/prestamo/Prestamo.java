package prestamo;
import libro.Libro;


public class Prestamo {
	
	Libro libro;
	int diasMulta;
	final int diasPrestamoMax=7;
	String fechaRetiro;
	
	
	
	
	public Prestamo(Libro libro) {
		
		this.libro = libro;
		this.diasMulta = 0;
		
	}
	
	
	

	public Prestamo(Libro libro, String fechaRetiro) {
		super();
		this.libro = libro;
		this.fechaRetiro = fechaRetiro;
	}




	public boolean tieneMulta() {
		return (diasMulta!=0);
	}

	public void setDiasMulta(int diasMulta) {
		this.diasMulta = diasMulta;
	}

	@Override
	public String toString() {
		return "Prestamo [libro=" + libro + ", diasMulta=" + diasMulta + ", diasPrestamoMax=" + diasPrestamoMax
				+ ", fechaRetiro=" + fechaRetiro + "]";
	}

	
	
	
	

}
