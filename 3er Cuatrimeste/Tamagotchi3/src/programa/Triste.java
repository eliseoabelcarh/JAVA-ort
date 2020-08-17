package programa;

import java.util.ArrayList;

public class Triste implements IEstado{
	
	public static Triste instancia;
	public ArrayList<IRespuesta> irespuestas;
	

	public Triste() {
		this.irespuestas = new ArrayList<IRespuesta>();
		this.irespuestas.add(SosBoludo.getInstancia());
		this.irespuestas.add(FelizRspta.getInstancia());
	}
	
	
	public static IEstado getInstancia() {
		if(instancia == null) {
			instancia = new Triste();
		}
		return instancia;
}
	
	
	@Override
	public IRespuesta responder(IAccion iaccion) {
		// Depende de la acción debe responder de algún modo
		IRespuesta irespuesta;
		if(iaccion == Mimo.getInstancia()) {
			irespuesta = this.irespuestas.get(1);
		}else {
			irespuesta = this.irespuestas.get(0);
		}
		return irespuesta;
	}

}
