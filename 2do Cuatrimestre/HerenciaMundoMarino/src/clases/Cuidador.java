package clases;

import java.util.ArrayList;

public class Cuidador extends Empleado{
	
	private final int CANT_MAX_ANIMALES_QUE_DEBE_TENER_A_CARGO = 2;
	
	private int cantMaxAnimalesACargo;
	private ArrayList<Animal> animalesACargo;
	private Show show;

	public Cuidador(String nombre, Show show) {
		super(nombre);
		setCantMaxAnimalesACargo(CANT_MAX_ANIMALES_QUE_DEBE_TENER_A_CARGO);
		this.animalesACargo = new ArrayList<Animal>();
		this.show = show;
	}
	
	public void ordenarHacerTrucosASusAnimales() {
		ArrayList<Habilidad> trucos;
		for (Animal animal : animalesACargo) {
				trucos = animal.getListaTrucos(); 
				for (Habilidad truco : trucos) {
					Alimento alimentoQueCome = loQueCome(animal);
					float stockActualDeAlimento = this.show.obtenerStockActualDeAlimento(alimentoQueCome);
					float cantAlimentoNecesario = truco.getCantKilosNecesarios();
					if(cantAlimentoNecesario <= stockActualDeAlimento) {
						boolean hizoTruco =  animal.realizarTruco(truco, stockActualDeAlimento);
						if(hizoTruco) {
							System.out.println(animal.toString()+", realizó " + truco.getNombre() + ", recibió "+ truco.getCantKilosNecesarios() +" kg de "+ animal.getAlimento().getNombre() );
							this.show.restarDeStockCorrespondiente(alimentoQueCome, cantAlimentoNecesario);
						}
					}else {
						System.out.println(animal.toString()+" se le ordenó realizar "+ truco.getNombre() + ", pero no tiene suficiente alimento");
					}
				}
		}		
	}
	
	public Alimento loQueCome(Animal animal) {
		Alimento alimento = null;
		if(animal instanceof Orca) {
			alimento = Alimento.CALAMARES;
		}else if(animal instanceof Delfin) {
			alimento = Alimento.PULPOS;
		}
		else if(animal instanceof LoboMarino) {
			alimento = Alimento.CANGREJOS;
		}
		return alimento;
	}
	
	public void agregarAnimalACargo(Animal animal) {
		this.animalesACargo.add(animal);
	}
	private int getCantActualAnimalesACargo() {
		return this.animalesACargo.size();
	}
	private int getCantMaxAnimalesACargo() {
		return cantMaxAnimalesACargo;
	}

	private void setCantMaxAnimalesACargo(int cantMaxAnimalesACargo) {
		this.cantMaxAnimalesACargo = cantMaxAnimalesACargo;
	}
	
	public boolean estaDisponible() {
		boolean resultado = false;
		if(getCantActualAnimalesACargo() < getCantMaxAnimalesACargo()) {
			resultado = true;
		}
		return resultado;
	}


	@Override
	public String toString() {
		return super.toString() + ", puesto Cuidador, animales A Cargo: " + animalesACargo + " ";
	}

	
	
}
