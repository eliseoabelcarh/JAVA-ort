package tp2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio9NumeroAleatorioEntreValores {
	
	public static Scanner lector = new Scanner(System.in);
	
	public static Random aleatorio = new Random();
	
	public static void main(String[] args) {
		
		
		
		double a; 
		int b;
		int c;
		int num1;
		int num2;
		int d;
		
				
		
		System.out.println("ingrese num1");
		num1= lector.nextInt();
		System.out.println("ingrese num2");
		num2 = lector.nextInt();
		
		while(num2<num1) {
			System.out.println("ingrese num2 mayor a num1");
			num2= lector.nextInt();
			}
		
		
		a = Math.random()*(num2-num1+1)+num1;// método Math.random devuelve double
		b= (int)a;
		
		
		
		c= aleatorio.nextInt(num2-num1+1)+num1;//con java.util.Random
		d=aleatorio.nextInt(num2-num1+1)+num1;//con java.util.Random
		
		System.out.println("número aleatorio 2 formas:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
