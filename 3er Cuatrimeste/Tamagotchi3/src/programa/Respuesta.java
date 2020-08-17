package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Respuesta implements IRespuesta{
	
	FELIZ("Feliz"), 
	VOMITA("Vomita"),
	MEPUTEA("Me Putea"),
	SE_CAGA("Se Caga"),
	MUERDE("Muerde"), 
	SOS_BOLUDO("Sos Boludo"),
	BIPBIPBIP("Bip Bip Bip"), 
	SE_MEA("Se Mea");

	private String valor;

	private Respuesta(String valor) {
		this.valor = valor;
	}
	
	
	public static ArrayList<IRespuesta> getArrayRespuestas() {
		ArrayList<IRespuesta> array = new ArrayList<IRespuesta>();
		List<Respuesta> list = Arrays.asList(Respuesta.values());
		for(Respuesta r : list) {
			array.add(r);
		}
		return array;
	}

	@Override
	public String getValor() {
	    return valor;
	}
}
