package programa;

public class PersonalException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PersonalException() {
		super("Error generico de estacionamiento");
	}

	public PersonalException(String msje) {
		super(msje);
	}
	
	
}
