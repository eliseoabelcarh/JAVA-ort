package Cafetera;

public class Principal {

	public static void main(String[] args) {

		//CONSTRUCTORES:
		
		//Constructor predeterminado
		//capacidadActual=0;
		//capacidadMaxima=1000;
		Cafetera cafetera1 = new Cafetera ();
		
		//capacidadMaxima= 1000;
		Cafetera cafetera2 = new Cafetera (1000);
		
		
		//capacidadActual=0;
		//capacidadMaxima=1000;
		Cafetera cafetera3 = new Cafetera (1000,0);
		
		cafetera1.llenarCafetera();
		System.out.println("capacidad actual de cafetera1: " + cafetera1.getCapacidadActual());
		
		cafetera2.servirTaza(200);
		System.out.println("capacidad actual de cafetera2: " + cafetera2.getCapacidadActual());
		
		cafetera3.vaciarCafetera();
		System.out.println("capacidad actual de cafetera3: " + cafetera3.getCapacidadActual());
		
		cafetera2.agregarCafe(100);
		System.out.println("capacidad actual de cafetera2: " + cafetera2.getCapacidadActual());

	}

}
