package DuenioVariosPerros;


public class Principal {

	public static void main(String[] args) {
		
		//instancio las clases creandolas
		Duenio duenio = new Duenio("Juan");
		Perro perro = new Perro("","Marr�n");
		Perro perro2 = new Perro ("bobby", "azul");
		
		//asigno perro y due�o mutuamente
		duenio.setPerro(perro);
		perro.setDuenio(duenio);
		
		//adopto perro y perro2 reconoce due�o
		duenio.adoptarPerro(perro2);
		duenio.asignarNombreAPerroAdoptado("Bobbyyyy", perro2);
		perro2.setDuenio(duenio);
		
		//el duenio asigan nombre al perro
		duenio.asignarNombrePerro("bobby");
		
		//duenio pone collar a perro, usar "blanco" para que mueva cola
		duenio.ponerCollar("blanco");
		
		duenio.getPerrosAdoptados();

	}

}
