package perroMueveCola;

public class Principal {

	public static void main(String[] args) {
		
		//instancio las clases creandolas
		Duenio duenio = new Duenio("Juan");
		Perro perro = new Perro("","Marr�n");
		
		//asigno perro y due�o mutuamente
		duenio.setPerro(perro);
		perro.setDuenio(duenio);
		
		//el duenio asigan nombre al perro
		duenio.asignarNombrePerro("bobby");
		
		//duenio pone collar a perro, usar "blanco" para que mueva cola
		duenio.ponerCollar("blanco");
		
		

	}

}
