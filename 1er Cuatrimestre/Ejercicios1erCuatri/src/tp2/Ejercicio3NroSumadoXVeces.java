package tp2;

import java.util.Scanner;

public class Ejercicio3NroSumadoXVeces {

	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {

		int A;
		int B;
		int i;
		int res;
		
		System.out.println("ingrese número A");
		A= lector.nextInt();
		while(A<0) {System.out.println("ingrese nro positivo"); A=lector.nextInt();}
		
		System.out.println("ingrese número B");
		B= lector.nextInt();
		while(B<0) {System.out.println("ingrese nro positivo"); B=lector.nextInt();}
		
		i=0;//agrego un contador
		for(res=i; i<B; i++) {System.out.println(res=res+A);}
		
		
		
	}

}
