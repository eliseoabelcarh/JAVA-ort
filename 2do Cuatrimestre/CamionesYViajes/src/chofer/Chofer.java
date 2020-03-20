package chofer;

public class Chofer {
	
	private String choferId;
	private String nombre;
	private float honorariosXViaje;

	public Chofer(String choferId, String nombre, float honorariosXViaje) {
		this.choferId = choferId;
		this.nombre = nombre;
		this.honorariosXViaje = honorariosXViaje;		
	}

	public String getChoferId() {
		return choferId;
	}

	public String getNombre() {
		return nombre;
	}

	public float getHonorariosXViaje() {
		return honorariosXViaje;
	}
	
	
	
	
	
	
}
