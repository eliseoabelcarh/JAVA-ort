package tp1;


import java.util.Scanner;

public class Ejercicio15EdadAlturaPuedeJuego {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int edad;
		double altura;
		boolean puede;
		puede=false;
		
		System.out.println("ingrese edad ");
		edad=lector.nextInt();
		
		System.out.println("ingrese altura");
		altura = lector.nextDouble();
	
		
		if((edad <= 7)||(altura <= 1.5)) {
			
			puede=false;
			
			}else {puede=true;}
	
	System.out.println("¿puede? " + puede);
	
	
	
	
	
	
	
	
	
	
}
}