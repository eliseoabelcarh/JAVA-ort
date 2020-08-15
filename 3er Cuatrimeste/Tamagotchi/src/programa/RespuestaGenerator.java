package programa;

import java.util.ArrayList;

public class RespuestaGenerator {
	
	private ArrayList<Respuesta> respuestas;
	
	public RespuestaGenerator() {
		this.respuestas = Respuesta.getArrayRespuestas();
	}
	
	public Respuesta solicitar() {
		int x = (int)(Math.random() * (this.respuestas.size() - 0) + 0);
		return this.respuestas.get(x);
	}
	public Respuesta solicitar(Accion accion, Estado estado) {
		//en base a la accion y el estado debe devolver cierta respuesta
		//por ahora devuelvo cualquier cosa
		
		int x = (int)(Math.random() * (this.respuestas.size() - 0) + 0);
		return this.respuestas.get(x);
	}

}
