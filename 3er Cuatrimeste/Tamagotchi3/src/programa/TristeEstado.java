package programa;

public class TristeEstado implements IEstado{
	
	public static TristeEstado instancia;
	
	

	public TristeEstado() {
	}
	
	
	public static IEstado getInstancia() {
		if(instancia == null) {
			instancia = new TristeEstado();
		}
		return instancia;
	}


}
