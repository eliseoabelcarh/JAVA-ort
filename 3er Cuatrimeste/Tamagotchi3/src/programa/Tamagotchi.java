package programa;

public class Tamagotchi {
	
	public ServiceDisplay serviceDisplay;
	public IEstado iestadoActual;

	public Tamagotchi(IEstado iestado) {
		this.iestadoActual = iestado;//esto deber�a buscarse en alg�n servicio, cambiar
		this.serviceDisplay = ServiceDisplay.getInstancia();
	}
		
	public void interactuar(IAccion iaccion) {
		IRespuesta irespuesta = this.iestadoActual.responder(iaccion);
		this.serviceDisplay.mostrar(irespuesta.getValor());
	}

}
