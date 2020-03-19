package VariosDueniosVariosPerros;


public class Principal {

	public static void main(String[] args) {
		
		//instanciamos perros y duenios
		
		Duenio duenio1= new Duenio("Carlos");
		Duenio duenio2 = new Duenio("Alexa");
		Duenio duenio3 = new Duenio ("Sara");
		
		Perro perro1 = new Perro ();
		Perro perro2 = new Perro ();
		Perro perro3 = new Perro ();
		
		//asignamos mutuamente  perro1 a sus 3 duenios
		
		perro1.setDuenio(duenio1);
		perro1.setDuenio(duenio2);
		perro1.setDuenio(duenio3);
		duenio1.addPerros(perro1);
		duenio2.addPerros(perro1);
		duenio3.addPerros(perro1);
		
		//uno de los dueños asigna nombre al perro1
		duenio1.asignarNombre(perro1, "bobby");
		System.out.println(perro1.getNombre());
		
		// asignamos mutuamente perro 2 a su dueño2
		perro2.setDuenio(duenio2);
		duenio2.addPerros(perro2);
		
		duenio2.asignarNombre(perro2, "pichichus");
		duenio3.asignarNombre(perro1, "Goliat");//ESTO LE CAMBIA EL NOMBRE A PERRO1
		
		
		System.out.println("dueños de perro1: "); 
		perro1.mostrarDuenios();
		System.out.println("\n");
		System.out.println("perros de duenio2: ");
		duenio2.mostrarPerros();

		System.out.println("\nDueño3 asigna nomre a perro3: ");
		duenio3.asignarNombre(perro3, "Lola");//no puede pues no se asignó como su duenia
		
		
	
	}

}
