package clases;

public abstract class EmpleadoCocina extends Empleado{

	public EmpleadoCocina(String nombre, int nroLegajo) {
		super(nombre, nroLegajo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmpleadoCocina [getNombre()=" + getNombre() + ", getNroLegajo()=" + getNroLegajo() + ", toString()="
				+ super.toString() + "]";
	}

	
}
