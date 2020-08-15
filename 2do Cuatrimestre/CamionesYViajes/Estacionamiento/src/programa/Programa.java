package programa;

import estacionamiento.Estacionamiento;

public class Programa {

	public static void main(String[] args) {
		//0.Inicializar un estacionamiento de 10 pasillos
		//con 30 espacios cada uno.
		Estacionamiento e = new Estacionamiento(10,30);
		
		//1.Solicitar cuantos espacios disponibles 
		//hay (debe haber 300).
		System.out.println(e.cantidadDisponible());
		//2.Ocupar el espacio 1, 12, la consola debe
		//verificar que fue exitoso
		e.ocuparEspacio(1, 12);
		//4.Solicitar cuantos espacios disponibles
		//hay (debe haber 299).
		System.out.println(e.cantidadDisponible());
		//5.Ocupar el espacio 1, 12, la consola debe mostrar un error
		e.ocuparEspacio(1, 12);
		//6.	Ocupar los siguientes espacios
		e.ocuparEspacio(1, 24);
		e.ocuparEspacio(1, 16);
		e.ocuparEspacio(3, 9);
		e.ocuparEspacio(4, 14);
		e.ocuparEspacio(5, 25);
		e.ocuparEspacio(6,1);
		e.ocuparEspacio(6, 6);
		e.ocuparEspacio(6, 11);
		e.ocuparEspacio(8, 12);
		e.ocuparEspacio(9, 14);
		e.ocuparEspacio(9, 19);
		e.ocuparEspacio(9, 7);//10 no existe
		//7.Solicitar cuantos espacios disponibles 
	    //hay (debe haber 287).
		System.out.println(e.cantidadDisponible());

		
	}	
}
