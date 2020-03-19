package tp1;

import java.util.Scanner;

public class Ejercicio16Tiene1DigitoEsImpar {
	
	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		boolean estaEnA;
		boolean estaEnB;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;
		
		estaEnA = false;
		estaEnB = false;
		estaEnAmbos = false;
		noEstaEnNinguno=false;
		
		System.out.println("ingrese número: ");
		num = lector.nextInt();
		
		if((num%2) != 0) {estaEnB = true;}
		if ((num/10) == 0 ) {estaEnA = true;}
		
		if((estaEnA==true)&&(estaEnB ==true)) {estaEnAmbos = true; noEstaEnNinguno = false;} 
			else {estaEnAmbos= false;}
		
		if((estaEnA!=true)&&(estaEnB !=true)) {noEstaEnNinguno=true;}
		
		if(estaEnA==true) {System.out.println("esta en A - tiene 1 dígito");}
		else {System.out.println("tiene más de 1 dígito");}
		
		if(estaEnB == true) {System.out.println(" esta en B - es impar");}
		else {System.out.println(" es número par");}
		
		if(estaEnAmbos==true) {System.out.println("esta en ambos A y B ");}
		
		if(noEstaEnNinguno == true) {System.out.println("no esta en ninguno");}
		
		
		
		
		
	}

}
