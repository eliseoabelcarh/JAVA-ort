package principal;

import com.duenio.Duenio;
import com.collar.Collar;
import com.perro.Perro;
import com.perchero.Perchero;

public class Principal {

	public static void main(String[] args) {
		
		Duenio duenio = new Duenio("Carlos");
		Perro perro = new Perro ("Bobby");
		Collar collar = new Collar ("Bobby","Blanco");
		
		duenio.getPerchero().agregarCollar(collar);
		
		
		duenio.agregarPerro(perro);
		perro.agregarDuenio(duenio);
		
		duenio.prepararPaseo("Bobby");
		
		duenio.finalizarPaseo("Bobby");
		
		
	}

	public static void asignarPertenencia(Duenio duenio, Perro perro) {
		duenio.agregarPerro(perro);
		perro.agregarDuenio(duenio);
	}
	
}

