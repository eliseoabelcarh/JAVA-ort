package programa;

public class FelizRspta implements IRespuesta {

	private static FelizRspta instancia;
	private String valor;
	
	public FelizRspta() {
		this.valor = "Me pongo Feliz";
	}
	
	public static IRespuesta getInstancia() {
		if(instancia == null) {
			instancia = new FelizRspta();
		}
		return instancia;
	}
	
	@Override
	public String getValor() {
		return this.valor;
	}

}
