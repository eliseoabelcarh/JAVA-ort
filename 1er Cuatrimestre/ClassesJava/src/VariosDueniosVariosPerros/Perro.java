package VariosDueniosVariosPerros;

import java.util.ArrayList;

public class Perro {
	
	private String nombre;
	private ArrayList<Duenio> duenios = new ArrayList<Duenio>();
	
	//no requiero constructor para este ejercicio
	
	
	public void setDuenio(Duenio duenio) {
		duenios.add(duenio);
	}
	
	
	
	public boolean esSuDuenio(Duenio duenio) {
		return duenios.contains(duenio);
	}



	public void setNombre(String nombre) {
		if(this.nombre==null) {
		this.nombre = nombre;
		}else {System.out.println( "no se puede cambiar nombre más de 1 vez");}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mostrarDuenios() {
		for(int i =0; i< duenios.size(); i++) {
			System.out.println(duenios.get(i).getNombre());
		}
	}
	
	
}


