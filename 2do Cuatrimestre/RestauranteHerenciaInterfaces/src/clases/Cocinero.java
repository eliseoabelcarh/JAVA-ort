package clases;

public class Cocinero extends EmpleadoCocina{

	public Cocinero(String nombre, int nroLegajo) {
		super(nombre, nroLegajo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cocinero [getNombre()=" + super.getNombre() + ", getNroLegajo()=" + super.getNroLegajo() + ", toString()="
				+ super.toString() + "]";
	}



}
