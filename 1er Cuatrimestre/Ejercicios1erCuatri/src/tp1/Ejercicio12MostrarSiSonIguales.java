package tp1;

import java.util.Scanner;

public class Ejercicio12MostrarSiSonIguales {
	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		boolean sonIguales;
		
		System.out.println("ingrese primer n�mero");
		num1 = lector.nextInt();
		
		System.out.println("ingrese segunod n�mero");
		num2= lector.nextInt();
		
		if(num1 != num2){sonIguales=false;System.out.println("los n�meros no son iguales"); }
		else {sonIguales = true; System.out.println("los n�meros son iguales");}
		
		System.out.println("�son iguales? " + sonIguales);//es necesario usar sonIguales de alguna manera
		
		}
		

}
