package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Estado {
	Feliz("Feliz"), Triste("Triste"), Hambriento("Hambriento"), Sediento("Sediento");
	
private String valor;
	
	private Estado(String valor) {
		this.valor = valor;
	}
	
	public String getValue() {
	    return valor;
	}
	
	public static ArrayList<Estado> getArrayEstados() {
		ArrayList<Estado> array = new ArrayList<Estado>();
		List<Estado> list = Arrays.asList(Estado.values());
		for(Estado r : list) {
			array.add(r);
		}
		return array;
	}
	public static List<Estado> getArray() {
		
		return Arrays.asList(Estado.values());

	
	}
}
