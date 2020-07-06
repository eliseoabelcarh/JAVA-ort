package clases;


public class Orca extends Animal{
	
	private static final Alimento ALIMENTO_DE_ORCAS = Alimento.CALAMARES; 

	public Orca(String nombre, float peso, float tamanio) {
		super(nombre, peso, tamanio, ALIMENTO_DE_ORCAS);
	}
	
	@Override
	public String toString() {
		return "Orca " + super.getNombre();
	}



	
	
	
	
}
