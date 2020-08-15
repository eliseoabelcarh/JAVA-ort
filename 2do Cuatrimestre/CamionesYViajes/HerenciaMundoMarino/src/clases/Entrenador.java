package clases;

public class Entrenador extends Empleado{

	private int aniosExperiencia;
	
	
	public Entrenador(String nombre, int aniosExperiencia) {
		super(nombre);
		setAniosExperiencia(aniosExperiencia);
	}
	
	private int getAniosExperiencia() {
		return aniosExperiencia;
	}
	private void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Entrenador [aniosExperiencia=" + getAniosExperiencia() + "]";
	}
	
	

}
