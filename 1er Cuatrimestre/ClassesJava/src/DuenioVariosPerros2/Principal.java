package DuenioVariosPerros2;


public class Principal {

	public static void main(String[] args) {
		
		// INSTANCIO DUENIO PRINCIPAL
		Duenio duenio = new Duenio("Carlos");
		
		//INSTANCIO PRIMERO PERRO
		Perro perro1 = new Perro ();
		
		
		//asignamos pertenencia mutuamente
		perro1.setDuenio(duenio);
		duenio.addPerros(perro1);
		
		
		//para asignar nombre necesita ser duenio de perro
		duenio.asignarNombreAPerro(perro1, "bobby");
		
		
		//muestro datos		
		System.out.println("Dueño de perros: " +perro1.getNombreDuenioTipostring());
		
		
		//muestro nombre de todos los perros que pertenecen al duenio instanciado
		duenio.MostrarPerros();
		
		
		System.out.println("\nAGREGAMOS UN PERRO MÁS\n");
		
		
		//INSTANCIO SEGUNDO PERRO
		
		Perro perro2 = new Perro ();
		
		
		//asigno pertenencia mutuamente(necesario)
		perro2.setDuenio(duenio); //Comentar linea para ver qué pasa cuando el perro no reconoce al duenio
		duenio.addPerros(perro2);
		
		//duenio asigna nombre a perro2
		duenio.asignarNombreAPerro(perro2, "pichichus");
		
		//muestro nombre de ttodos los perros que pertenecen al dueño instanciado
		duenio.MostrarPerros();
				
		System.out.println("\nPonemos collar a perro2\n");
		
		duenio.ponerCollarAPerro(perro2);
	}

}
