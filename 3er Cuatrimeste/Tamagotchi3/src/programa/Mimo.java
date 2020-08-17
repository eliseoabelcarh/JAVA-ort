package programa;


public class Mimo implements IAccion{

	public static Mimo instancia;
		

	public Mimo() {
	}

	public static IAccion getInstancia() {
			if(instancia == null) {
				instancia = new Mimo();
			}
			return instancia;
	}
	
	
}
