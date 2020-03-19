package PajaroYDuenio;

public class Pajaro {
	
	
	boolean hambriento = true;;
	boolean sediento = true;
	int edad;
	int peso;
	int longitud;
	int envergadura;
	Duenio duenio;
	
	//NO SE CREAN GETTERS NI SETTERS - porq no se puede cambiar la forma de un pájaro
	
	public Pajaro (int _edad, int _peso, int _long, int _enve) {
		this.edad= _edad;
		this.peso = _peso;
		this.longitud = _long;
		this.envergadura = _enve;
	}
	
	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}
	
	public void comer(String comida) {
		if (comida=="semillas y frutas") {
			hambriento= false;
			
						
		}else {hambriento=true; System.out.println("pájaro no quiere comer eso");}
	}
	
	public void beber() {
		sediento=false;
	}
	
	public void mostrarAtributos() {
		System.out.println("hambriento: " + hambriento);
		System.out.println("sediento: " + sediento);
		System.out.println("edad: " + edad);
		System.out.println("peso: " + peso);
		System.out.println("longitud: " + longitud);
		System.out.println("envergadura: " + envergadura);
		
	}
	
	
	
}
