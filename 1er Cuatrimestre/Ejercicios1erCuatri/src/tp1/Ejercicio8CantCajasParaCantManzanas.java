package tp1;

import java.util.Scanner;

public class Ejercicio8CantCajasParaCantManzanas {
	
	
	public static Scanner lector = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int cantM;
		int cantCajas;
		cantCajas = 0;
		
		
		System.out.println("ingrese cantidad de manzanas: ");
		cantM = lector.nextInt();
		
		if(cantM > 8) {
			
			if( (cantM % 8) != 0 ) {cantCajas = (cantM/8)+1;}else {cantCajas=(cantM/8);}
		
		}else { 
			if ((cantM>0)&&(cantM<=8)) {cantCajas=1;}else {System.out.println("cantidad no válida");}
			}
		
		
		System.out.println("La cantidad de cajas necesarias para " + cantM + " manzanas es " + cantCajas + " caja(s)");
		
		
		
		
		
		
		
		
	}

}
