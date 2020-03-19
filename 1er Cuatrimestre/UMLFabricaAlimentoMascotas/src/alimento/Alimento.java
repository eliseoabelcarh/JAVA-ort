package alimento;
import tipoAlimento.TipoAlimento;
import receta.Receta;

public class Alimento {
	
	private int codigo;
	private String nombre;
	private TipoAlimento tipoAlimento;
	private Receta receta;
	
	
	public TipoAlimento getTipoAlimento() {
		return tipoAlimento;
	}
	public Receta getReceta() {
		return receta;
	}
	
	
	
	
}
