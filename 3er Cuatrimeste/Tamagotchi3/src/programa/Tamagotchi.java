package programa;

public class Tamagotchi {
	
	public IHandleActionsAndEstados iHandleActionsAndEstados;
	public IEstado iestadoActual;
	public ServiceDisplay serviceDisplay;

	
	public Tamagotchi( IHandleActionsAndEstados iHandleActionsAndEstados, ServiceDisplay serviceDisplay) {
		
		this.iHandleActionsAndEstados = iHandleActionsAndEstados;
		this.iestadoActual = iHandleActionsAndEstados.getRandomEstado();
		this.serviceDisplay = serviceDisplay;
		
	}
		
	public void interactuar(IAction iaction) {
		IRespuesta irespuesta = this.iHandleActionsAndEstados.handleAction(this.iestadoActual, iaction);
		this.serviceDisplay.mostrar(irespuesta.getValor());
	}

	
}
