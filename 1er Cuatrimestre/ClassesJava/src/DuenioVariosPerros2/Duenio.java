package DuenioVariosPerros2;


import java.util.ArrayList;

public class Duenio {

	private String nombre;
	private ArrayList<Perro> perros = new ArrayList<Perro>();
	
	 
	//constructor
	public Duenio(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void asignarNombreAPerro(Perro perro, String nombrePerro) {
		if(this == perro.duenio) {
			perro.setNombre(nombrePerro);
		}else {System.out.println("no es dueño del perro");}
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	} 	
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void addPerros(Perro perro) {
		this.perros.add(perro);
	}
	
	

	public ArrayList<Perro> getPerrosArrayList() {
		return perros;
	}
	
	//mostramos los nombres (en String) de los perros que pertenecen al duenio
	public void MostrarPerros() {
		
		for (int i=0; i< perros.size();i++) {
			System.out.println((i+1)+". "+ perros.get(i).getNombre());
		}
		
	}

	public void ponerCollarAPerro(Perro perro) {

		perro.recibirCollar(this);
			
	}
	
	
	
	
	
	
	
}