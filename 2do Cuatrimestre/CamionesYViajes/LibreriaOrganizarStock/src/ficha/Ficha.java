package ficha;

public class Ficha {
	
	private String razonSocial;
	private String direccion;
	private String telefono;
	
	public Ficha(String razonSocial) {
		this.razonSocial = razonSocial;
		this.direccion = "";
		this.telefono = "";
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	

}
