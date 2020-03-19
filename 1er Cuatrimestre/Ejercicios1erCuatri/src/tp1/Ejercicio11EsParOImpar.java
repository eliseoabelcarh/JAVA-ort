package tp1;

import java.util.Scanner;


public class Ejercicio11EsParOImpar {
	
	
	public static Scanner lector = new Scanner(System.in); 
	
	public static void main(String[] args){
		
		int num1;
		int modulo;
		
		System.out.println("ingrese número:");
		num1=lector.nextInt();
		
		modulo = num1%2;
		
		while(num1==0) {System.out.println("Ingrese númeero");num1=lector.nextInt();modulo = num1%2;System.out.println(modulo);}
		
		if(modulo!=0) {System.out.println(modulo);System.out.println(num1 + " es impar");}else {System.out.println(num1 + " es par");}
		
		
		
	}

}
