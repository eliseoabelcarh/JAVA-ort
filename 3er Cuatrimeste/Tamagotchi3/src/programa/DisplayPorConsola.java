package programa;

public class DisplayPorConsola implements IDisplay{

	public static DisplayPorConsola instancia;
	
	
	//tiene q ser privado para no poder instanciarse
	private DisplayPorConsola() {
	}
	
	public static DisplayPorConsola getInstancia() {
		if(instancia == null) {
			instancia = new DisplayPorConsola();
		}
		return instancia;
	}
	
	public void mostrar(String mensaje) {
		System.out.println(mensaje);
	}

}
