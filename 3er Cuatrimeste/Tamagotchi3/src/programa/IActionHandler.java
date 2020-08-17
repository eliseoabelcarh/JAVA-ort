package programa;

public interface IActionHandler {
	
	public IRespuesta handleAction(IEstado iestado, IAction iaction);
	public IAction getRandomAction();

}
