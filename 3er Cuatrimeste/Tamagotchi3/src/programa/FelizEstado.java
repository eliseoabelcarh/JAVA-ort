package programa;


public class FelizEstado implements IEstado {
	
	public static FelizEstado instancia;
	

	public FelizEstado() {
	}

	public static IEstado getInstancia() {
			if(instancia == null) {
				instancia = new FelizEstado();
			}
			return instancia;
	}
	
	
}
