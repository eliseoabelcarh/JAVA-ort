package programa;

public class SosBoludo implements IRespuesta{
	
	private static SosBoludo instancia;
	private String valor;
	
	public SosBoludo() {
		this.valor = "Sos Boludo?";
	}
	
	public static IRespuesta getInstancia() {
		if(instancia == null) {
			instancia = new SosBoludo();
		}
		return instancia;
	}
	
	@Override
	public String getValor() {
		return this.valor;
	}

}
