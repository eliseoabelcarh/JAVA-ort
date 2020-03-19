package DuenioVariosPerros;


import java.util.ArrayList;

public class Duenio {
	
	//declaro variables SIN PRIVATE PARA PROBAR FUNCIONAMIENTO
	String nombre;
	Perro perro;
	ArrayList<Perro> perrosAdoptados = new ArrayList<Perro>(); 
	
	
	//constructor
	public Duenio(String nombre) {
		this.nombre=nombre;
		
	}
	
	//adoptar perros
	
	public void adoptarPerro(Perro perro) {
		perrosAdoptados.add(perro);
	}
	
	
	public void getPerrosAdoptados() {
		for(int i = 0; i < perrosAdoptados.size();i++) {
			System.out.println("\nlista de perros adoptados:\n " + perrosAdoptados.get(i));//direcc memoria
			System.out.println("\nlista de perros adoptados:\n " + perrosAdoptados.get(i).getNombre());//muestro nombre
		}
		
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
	
	public void asignarNombreAPerroAdoptado(String nombrePerroAdoptado,Perro perroAdoptado) {
		perroAdoptado.setNombre(nombrePerroAdoptado);
	}
	
	public void ponerCollar(String colorCollar) {
		if (colorCollar == "blanco") {
			perro.contento=true;
			perro.moverCola();
		}else {perro.ladra=true; perro.perroLadra();}
	}
	
	
}
