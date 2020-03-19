package tp1;


import java.util.Scanner;


public class Ejercicio14EdadAlturaSubeJuego {

	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		boolean puede;
		int edad;
		double altura;
		
		//debo inicializar con algun valor
		puede=false;
		
		System.out.println("ingrese edad");
		edad= lector.nextInt();
		
		System.out.println("ingrese altura ");
		altura = lector.nextDouble();
		
		
		if((edad>=7)&&(altura >1.4)) {
			puede=true;
		}else {puede = false;}
		
		System.out.println(" ¿ Puede subir al juego: ? " + puede);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
