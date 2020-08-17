package programa;

import java.util.ArrayList;

public class FelizEstado implements IEstado {
	
	public static FelizEstado instancia;
	public ArrayList<IRespuesta> irespuestas;
	

	public FelizEstado() {
		this.irespuestas = new ArrayList<IRespuesta>();
		this.irespuestas.add(SosBoludo.getInstancia());
	}

	public static IEstado getInstancia() {
			if(instancia == null) {
				instancia = new FelizEstado();
			}
			return instancia;
	}
	
	public IRespuesta responder(IAccion iaccion) {
		//depende de la iaccion rebidida devuelvo una respuesta
		return this.irespuestas.get(0);
	}
	
}
