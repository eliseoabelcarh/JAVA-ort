package programa;

import java.util.ArrayList;

public class Joystick {
	
	private ArrayList<IBoton> botones;
	
	
	public Joystick(ArrayList<IBoton> botones) {
		this.botones = botones;
	}


	
	public Accion clickBoton(int x) {
		return this.botones.get(x).devuelveAccion();//cambiar de boton segun pulsacion entre 1 y 3
	}
}
