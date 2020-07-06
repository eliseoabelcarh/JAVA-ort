package duenioMascota;

import java.util.ArrayList;

import mascota.Mascota;
import persona.Persona;

public class DuenioMascota extends Persona {
	
	private ArrayList<Mascota> mascotas;

	public DuenioMascota(String nombre, String apellido) {
		super(nombre, apellido);
		this.mascotas = new ArrayList<Mascota>();
	}
	
	public void adoptar(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	public void cambiarNombreAMascota(Mascota mascota,String nombre ) {
		mascota.setNombre(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " [mascotas=" + mascotas + "]";
	}
	
	
	
}
