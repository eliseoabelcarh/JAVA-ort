package tp1;

import java.util.Scanner;


public class Ejercicio10IngresaNroMuestraDia {
	
	public static Scanner lector = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int n;
		
		
		System.out.println("Ingrese número de día: ");
		n= lector.nextInt();
		
		
		switch(n) {
		
		case 1 : System.out.println("domingo"); break;
		case 2 : System.out.println("lunes"); break;
		case 3 : System.out.println("martes");break;
		case 4 : System.out.println("miércoles"); break;
		case 5 : System.out.println("jueves"); break;
		case 6 : System.out.println(" viernes");break;
		case 7 : System.out.println("sábado");break;
		default : System.out.println("no es día válido");
		
		
		
		}
		
		
		
		
		
	}

}
