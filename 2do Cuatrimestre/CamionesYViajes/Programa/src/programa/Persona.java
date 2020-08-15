package programa;

public class Persona {
	private String nombre;
	
	public Persona(String nombre) {
		if(nombre == "hola") {
			throw new PersonalException("nombre no válido porq es hola");
		}else {
			this.nombre = nombre;
		}
	
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

}
