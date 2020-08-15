package programa;



public class Consola {

	public void play(IDisplay idisplay, Accion accion , IJuego iJuego) {

		idisplay.mostrarDatos(iJuego);
		iJuego.ejecutar(accion);
		
	}

}
