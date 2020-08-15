package clases;

import java.util.ArrayList;

public abstract class Animal {
	
	private String nombre;
	private float peso;
	private float tamanio;
	private ArrayList<Habilidad> trucos;
	private Alimento alimento;
	
	public Animal(String nombre, float peso, float tamanio, Alimento alimento) {
		setNombre(nombre);
		setPeso(peso);
		setTamanio(tamanio);
		this.trucos = new ArrayList<Habilidad>();
		setAlimento(alimento);
	}
	
	public boolean realizarTruco(Habilidad truco, float cantAlimento) {
		boolean result = false;
		float cantNecesariaParaTruco = truco.getCantKilosNecesarios();
		if(cantAlimento >= cantNecesariaParaTruco) {
			result = true;
		}
		return result;
	}
	
	protected String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPeso(float peso) {
		this.peso = peso;
	}
	
	private void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}

	public void agregarTruco(Habilidad truco) {
		this.trucos.add(truco);
	}
	public ArrayList<Habilidad> getListaTrucos() {
		return this.trucos;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	private void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", tamanio=" + tamanio + ", trucos=" + trucos
				+ ", alimento=" + alimento + "]";
	}



	
	
	
	
	
	
}
