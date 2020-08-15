package autor;

public class Autor {
	
	private Integer anioNacimiento;
	private Integer anioFallecimiento;
	private String nacionalidad;
	private String nombre;
	
	public Autor(String nombre){
		this.nombre = nombre;
		this.anioFallecimiento = 2019;
		this.anioNacimiento = 1990;
		this.nacionalidad = "";
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Autor [anioNacimiento=" + anioNacimiento + ", anioFallecimiento=" + anioFallecimiento
				+ ", nacionalidad=" + nacionalidad + ", nombre=" + nombre + "]";
	}
	
	
}
