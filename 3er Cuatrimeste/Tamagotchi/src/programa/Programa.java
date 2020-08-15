package programa;

import java.util.ArrayList;
import java.util.Arrays;

public class Programa {

	public static void main(String[] args) {
		
		IBoton botonMimo = new BotonMimo();
		IBoton botonTomar = new BotonTomar();
		IBoton botonComer = new BotonComer();
		
		ArrayList<IBoton> botones = new ArrayList<IBoton>();
	    botones.add(botonMimo);
	    botones.add(botonTomar);
	    botones.add(botonComer);
		
		IJuego itamagotchi = new Tamagotchi();
		
		IDisplay idisplay = new DisplayPorConsola();	
		
		Joystick joystick = new Joystick(botones);
		Accion accion = joystick.clickBoton(0);// el cero corresponde a mimo
		
		Consola consola = new Consola();
		consola.play(idisplay, accion, itamagotchi);
		
		

	}

}
