package clases;

public class LoboMarino extends Animal {

	private static final Alimento ALIMENTO_DE_LOBOS_MARINOS = Alimento.CANGREJOS;
	
	public LoboMarino(String nombre, float peso, float tamanio) {
		super(nombre, peso, tamanio, ALIMENTO_DE_LOBOS_MARINOS);
	}
	
	@Override
	public String toString() {
		return "Lobo Marino " + super.getNombre();
	}
}
