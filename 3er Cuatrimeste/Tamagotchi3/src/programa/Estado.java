package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Estado implements IEstado {
	
	 	FELIZ("Feliz"),
	    TRISTE("Triste"),
	    HAMBRIENTO("Hambriento"),
	    SEDIENTO("Sediento");

	private String valor;
	
	private Estado(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String getValor() {
	    return valor;
	}
	
	public static ArrayList<IEstado> getArrayEstados() {
		ArrayList<IEstado> array = new ArrayList<IEstado>();
		List<Estado> list = Arrays.asList(Estado.values());
		for(Estado r : list) {
			array.add(r);
		}
		return array;
	}
	
}
