package programa;

import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) {
		
		
		//se crea servicio que proveer� un Display por default o alguno que se elija
		ServiceDisplay serviceDisplay = ServiceDisplay.getInstancia();
		
		//Se clasifica los enums seg�n su tipo, respuestas, acciones o estados.
		ArrayList<IRespuesta> irespuestas = Respuesta.getArrayRespuestas();
		ArrayList<IAction> iactions = Action.getArrayActions();
		ArrayList<IEstado> iestados = Estado.getArrayEstados();
		
		//la clase ServiceHandleActionAndEstado tiene la l�gica de como responder ante ciertos actions propios de tamagotchi
		IHandleActionsAndEstados iHandleActionsAndEstados = new ServiceHandleActionAndEstado(irespuestas, iactions, iestados);
		
		//El juego recibe como params la l�gica del juego y un servicio Display que mostrar� mensajes
		IJuego tamagot  = new Tamagotchi(iHandleActionsAndEstados, serviceDisplay);
	
		// la iaction la genera el usuario desde un bot�n o joystick por ejemplo
		IAction iaction = iHandleActionsAndEstados.getRandomAction(); 
		
		tamagot.execute(iaction);
		

	}

}
