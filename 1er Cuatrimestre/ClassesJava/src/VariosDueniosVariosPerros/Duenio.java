package VariosDueniosVariosPerros;

import java.util.ArrayList;

public class Duenio {
	
	private String nombre;
	private ArrayList<Perro> perros = new ArrayList<Perro>();
	
	
	
	//constructor
	public Duenio(String nombre){
		this.nombre=nombre;
	}
	
	public void addPerros(Perro perro) {
		perros.add(perro);
	}
	public void asignarNombre(Perro perro, String nombre) {
		if(perro.esSuDuenio(this)) {
		perro.setNombre(nombre);
		}else {System.out.println(this.getNombre()+" no es dueño");}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mostrarPerros() {
		for(int i =0; i< perros.size(); i++) {
			System.out.println(perros.get(i).getNombre());
		}
	}
	
	
	
	
}
