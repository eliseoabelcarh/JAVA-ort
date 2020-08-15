package clases;

import java.util.ArrayList;
import clases.Alimento;


public class Show {
	
	private final float STOCK_INICIAL_KILOS_CALAMARES= 50;
	private final float STOCK_INICIAL_KILOS_PULPOS= 30;
	private final float STOCK_INICIAL_KILOS_CANGREJOS= 25;
	
	private ArrayList<Animal> animales;
	private Alimento calamares;
	private Alimento pulpos;
	private Alimento cangrejos;
	private ArrayList<Empleado> empleados;
	
	public Show() {
		this.animales = new ArrayList<Animal>();
		this.empleados = new ArrayList<Empleado>();
		this.calamares = Alimento.CALAMARES.setCant(STOCK_INICIAL_KILOS_CALAMARES);
		this.pulpos = Alimento.PULPOS.setCant(STOCK_INICIAL_KILOS_PULPOS);
		this.cangrejos= Alimento.CANGREJOS.setCant(STOCK_INICIAL_KILOS_CANGREJOS);
		
	}
	
	public void empezarPresentacionDeCuidadoresYSusAnimales() {
		for (Empleado empleado : this.empleados) {
			if(empleado instanceof Cuidador) {
				((Cuidador) empleado).ordenarHacerTrucosASusAnimales();
			}
		}
	}
	

	public void agregarAnimalAShow(Animal animal) {
		
		Cuidador cuidador = devolverCuidadorDisponible();
		if(cuidador != null) {
			cuidador.agregarAnimalACargo(animal);
		}else {
			cuidador = contratarCuidadorParaShow("Novato");
			cuidador.agregarAnimalACargo(animal);
		}
		this.animales.add(animal);
	}
	
	private Cuidador devolverCuidadorDisponible() {
		Cuidador cuidadorDisp = null;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < this.empleados.size()) {
			if(this.empleados.get(i) instanceof Cuidador) {
				Cuidador cuidadorAux = (Cuidador)this.empleados.get(i);
				if(cuidadorAux.estaDisponible() ) {
					encontrado = true;
					cuidadorDisp = cuidadorAux;
				}
			}		
			i++;
		}
		return cuidadorDisp;
	}

	public Cuidador contratarCuidadorParaShow(String nombre) {
		Cuidador cuidadorNuevo =new Cuidador(nombre, this);
		this.empleados.add(cuidadorNuevo);
		return cuidadorNuevo;
	}
	public float getStockCalamares() {
		return this.calamares.getCant();
	}
	private void setStockCalamares(float cant) {
		this.calamares.setCant(cant);
	}
	public void restarDeStockCalamares(float cant) {
		float stockInicial = getStockCalamares();
		setStockCalamares(stockInicial - cant);
	}
	public float getStockPulpos() {
		return this.pulpos.getCant();
	}
	private void setStockPulpos(float cant) {
		this.pulpos.setCant(cant);
	}
	public void restarDeStockPulpos(float cant) {
		float stockInicial = getStockPulpos();
		setStockPulpos(stockInicial - cant);
	}
	public float getStockCangrejos() {
		return this.cangrejos.getCant();
	}
	private void setStockCangrejos(float cant) {
		this.cangrejos.setCant(cant);
	}
	public void restarDeStockCangrejos(float cant) {
		float stockInicial = getStockCangrejos();
		setStockCangrejos(stockInicial - cant);
	}
	
	
	public void mostrarStockAlimentos() {
		System.out.println("Calamares: " + getStockCalamares()+" kg");
		System.out.println("Pulpos: " + getStockPulpos()+" kg");
		System.out.println("Cangrejos: " + getStockCangrejos()+" kg");
	}

	public float obtenerStockActualDeAlimento(Alimento alimentoQueCome) {
		float stock = 0;
		if(Alimento.CALAMARES.equals(alimentoQueCome)) {
			stock = getStockCalamares();
		}
		if(Alimento.PULPOS.equals(alimentoQueCome)) {
			stock = getStockPulpos();
		}
		if(Alimento.CANGREJOS.equals(alimentoQueCome)) {
			stock = getStockCangrejos();
		}
		
		return stock;
	}

	public void restarDeStockCorrespondiente(Alimento alimentoConsumido, float cantConsumida) {
		if(Alimento.CALAMARES.equals(alimentoConsumido)) {
			restarDeStockCalamares(cantConsumida);
		}
		if(Alimento.PULPOS.equals(alimentoConsumido)) {
			restarDeStockPulpos(cantConsumida);
		}
		if(Alimento.CANGREJOS.equals(alimentoConsumido)) {
			restarDeStockCangrejos(cantConsumida);
		}		
	}
	
	public void mostrarCuidadoresConSusAnimales() {
		for (Empleado empleado : empleados) {
			if(empleado instanceof Cuidador) {
				System.out.println(((Cuidador)empleado).toString());
			}
		}
	}

}
