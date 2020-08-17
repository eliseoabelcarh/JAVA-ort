package programa;


public class Mimo implements IAction{

	public static Mimo instancia;
		

	public Mimo() {
	}

	public static IAction getInstancia() {
			if(instancia == null) {
				instancia = new Mimo();
			}
			return instancia;
	}
	
	
}
