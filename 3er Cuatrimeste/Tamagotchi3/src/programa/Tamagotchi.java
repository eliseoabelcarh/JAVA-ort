package programa;

public class Tamagotchi implements IJuego {
	
	public IHandleActionsAndEstados iHandleActionsAndEstados;
	public IEstado iestadoActual;
	public ServiceDisplay serviceDisplay;

	
	public Tamagotchi( IHandleActionsAndEstados iHandleActionsAndEstados, ServiceDisplay serviceDisplay) {
		
		this.iHandleActionsAndEstados = iHandleActionsAndEstados;
		this.iestadoActual = iHandleActionsAndEstados.getRandomEstado();
		this.serviceDisplay = serviceDisplay;
		
	}
		
	@Override
	public void execute(IAction iaction) {
		
		IRespuesta irespuesta = this.iHandleActionsAndEstados.handleAction(this.iestadoActual, iaction);
		this.serviceDisplay.mostrar("Estado Random: " + this.iestadoActual.getValor());
		this.serviceDisplay.mostrar("Acción Random: " + iaction.getValor());
		this.serviceDisplay.mostrar("Respuesta ante acción: " + irespuesta.getValor());
	}

	
}
