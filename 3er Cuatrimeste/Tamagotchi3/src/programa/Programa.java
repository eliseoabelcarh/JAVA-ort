package programa;

import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		
		
		//se crea servicio que proveerá un Display por default o alguno que se elija
		ServiceDisplay serviceDisplay = ServiceDisplay.getInstancia();
		
		//Se clasifica los enums según su tipo, respuestas, acciones o estados.
		ArrayList<IRespuesta> irespuestas = Respuesta.getArrayRespuestas();
		ArrayList<IAction> iactions = Action.getArrayActions();
		ArrayList<IEstado> iestados = Estado.getArrayEstados();
		
		//la clase ServiceHandleActionAndEstado tiene la lógica de como responder ante ciertos actions propios de tamagotchi
		IHandleActionsAndEstados iHandleActionsAndEstados = new ServiceHandleActionAndEstado(irespuestas, iactions, iestados);
		
		//El juego recibe como params la lógica del juego y un servicio Display que mostrará mensajes
		IJuego tamagot  = new Tamagotchi(iHandleActionsAndEstados, serviceDisplay);
	
		// la iaction la genera el usuario desde un botón o joystick por ejemplo
		IAction iaction = iHandleActionsAndEstados.getRandomAction(); 
		
		tamagot.execute(iaction);
		

	}

}
