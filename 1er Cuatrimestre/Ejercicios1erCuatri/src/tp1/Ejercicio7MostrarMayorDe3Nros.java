package tp1;


import java.util.Scanner;


public class Ejercicio7MostrarMayorDe3Nros {
	
	
	public static Scanner lector = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int max;
		
		System.out.println("ingrese primer número: ");
		num1 = lector.nextInt();
		System.out.println("Ingrese segundo número: ");
		num2 = lector.nextInt();
		System.out.println("Ingrese tercer número: ");
		num3= lector.nextInt();
		
		if(num1 > num2) {max=num1;}else {max=num2;}
		
		if(num3>max) {
			
			max=num3;
			System.out.println("El mayor es " + max);
			
		}else {
			
			if((num1==num2)&&(num2==num3)) {System.out.println("son iguales");}else {System.out.println("el mayor es " + max);}
			
			}
	
		
		
		
		
		
	}
	
	

}
