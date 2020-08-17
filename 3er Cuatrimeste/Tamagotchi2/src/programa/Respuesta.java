package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Respuesta {
	Feliz("Feliz"), 
	Vomita("Vomita"),
	MePutea("MePutea"),
	SeCaga("SeCaga"),
	Muerde("Muerde"), 
	SosBoludo("SosBoludo"),
	BipBipBip("BipBipBip"), 
	SeMea("SeMea");

	private String valor;
	
	private Respuesta(String valor) {
		this.valor = valor;
	}
	
	public String getValue() {
	    return valor;
	}
	
	public static ArrayList<String> getArray() {
		ArrayList<String> array = new ArrayList<String>();
		List<Respuesta> list = Arrays.asList(Respuesta.values());
		for(Respuesta r : list) {
			array.add(r.getValue());
		}
		return array;
	}
	
	public static ArrayList<Respuesta> getArrayRespuestas() {
		ArrayList<Respuesta> array = new ArrayList<Respuesta>();
		List<Respuesta> list = Arrays.asList(Respuesta.values());
		for(Respuesta r : list) {
			array.add(r);
		}
		return array;
	}
}
