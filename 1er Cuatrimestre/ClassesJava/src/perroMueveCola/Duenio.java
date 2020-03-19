package perroMueveCola;

public class Duenio {
	String nombre;
	Perro perro;
	
	//constructor
	public Duenio(String nombre) {
		this.nombre=nombre;
		
	}
	
	
	public void setPerro(Perro perro) {
		this.perro=perro;
	}

	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void asignarNombrePerro(String nombrePerro) {
		perro.setNombre(nombrePerro);
	}
	
	public void ponerCollar(String colorCollar) {
		if (colorCollar == "blanco") {
			perro.contento=true;
			perro.moverCola();
		}else {perro.ladra=true; perro.perroLadra();}
	}
	
	
}
