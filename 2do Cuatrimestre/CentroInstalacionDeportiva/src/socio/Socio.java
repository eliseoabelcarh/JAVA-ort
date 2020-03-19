package socio;
import estado.Estado;

public class Socio {
	
	private String direccion;
	private String ciudad;
	private String provincia;	
	private String telefono;
	private String nombre;
	private Estado estado;
	
	
	public Socio(String nombre) {
		this.direccion = "";
		this.ciudad = "";
		this.provincia = "";
		this.telefono = "";
		this.nombre = nombre;
		this.estado = Estado.AL_DIA;
	}

	public Estado getEstado() {
		return this.estado;
	}

	@Override
	public String toString() {
		return "Socio [direccion=" + direccion + ", ciudad=" + ciudad + ", provincia=" + provincia + ", telefono="
				+ telefono + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
	
	
}
