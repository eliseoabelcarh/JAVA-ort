package exception;

public class EstacionamientoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EstacionamientoException() {
		super("Error generico de estacionamiento");
	}

	public EstacionamientoException(String msje) {
		super(msje);
	}
	
}
