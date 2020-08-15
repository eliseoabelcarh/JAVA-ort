package clases;

public class Delfin extends Animal {
	
	private static final Alimento ALIMENTO_DE_DELFINES = Alimento.PULPOS; 

	public Delfin(String nombre, float peso, float tamanio) {
		super(nombre, peso, tamanio, ALIMENTO_DE_DELFINES);
	}
	
	@Override
	public String toString() {
		return "Delfín " + super.getNombre();
	}
}
