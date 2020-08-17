package programa;

import java.util.ArrayList;

public class EstadoGenerator {
	
	private ArrayList<Estado> estados;
	
	public EstadoGenerator() {
		this.estados = Estado.getArrayEstados();
	}
	
	public Estado solicitar() {
		int x = (int)(Math.random() * (this.estados.size() - 0) + 0);
		return this.estados.get(x);
	}
	

}
