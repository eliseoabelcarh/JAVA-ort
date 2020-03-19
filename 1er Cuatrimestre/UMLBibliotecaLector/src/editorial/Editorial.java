package editorial;

public class Editorial {

	String nombre;
	String pais;
	
	public Editorial(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", pais=" + pais + "]";
	}
	
	
}
