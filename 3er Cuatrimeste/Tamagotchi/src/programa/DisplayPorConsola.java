package programa;

public class DisplayPorConsola implements IDisplay{
	
	public void mostrarDatos(IJuego ijuego) {
		
		ijuego.mostrarMiEstado();
	}

}
