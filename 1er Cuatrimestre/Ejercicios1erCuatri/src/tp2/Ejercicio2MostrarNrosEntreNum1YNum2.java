package tp2;

import java.util.Scanner;

public class Ejercicio2MostrarNrosEntreNum1YNum2 {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//declaro variables a usar
		int num1;
		int num2;
		int i;
		
		//solicito datos a usuario
		System.out.println("ingrese primer n�mero");
		num1= lector.nextInt();
		
		System.out.println("ingrese segundo n�mero");
		num2= lector.nextInt();
		
		//valido datos ingresados
		while (num2<num1) {
			System.out.println("ingrese segundo n�mero menor al segundo");
			num2=lector.nextInt();
			}
		//muestra secuencia entre los n�meros incluy�ndolos
		for( i=num1;i<=num2;i++ ) {System.out.println(i);}
		//muestra secuencia entre los n�meros exluy�ndolos
		for(i=(num1+1);i<num2;i++) {System.out.println(i);}
		
		
		
	}
	
}
