package programa;

public class Programa {
	
	public static void main(String[] args) {
		
		ServiceDisplay serviceDisplay = ServiceDisplay.getInstancia();
		
		//la clase ServiceHandleActionAndEstado tiene la l�gica de como responder ante ciertos actions propios de tamagotchi
		IHandleActionsAndEstados iHandleActionsAndEstados = new ServiceHandleActionAndEstado();
		
		Tamagotchi t  = new Tamagotchi(iHandleActionsAndEstados, serviceDisplay);
	
		IAction iaction = Mimo.getInstancia(); // la iaction la genera el usuario desde un bot�n o joystick ejemplo
		
		t.interactuar(iaction);
		
		
	}

}
