package tp2;
import java.util.Scanner;

public class Ejercicio7MostrarMenorCon0Stop {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {

		int num;
		int min;
		
		
		System.out.println("ingrese numero");
		num=lector.nextInt();
		
		if(num==0) {
			System.out.println("no ingresó números");			
		}else {
			min=num;
			while(num!=0) {
				if(num<min) {min=num;}
				System.out.println("ingrese numero");
				num=lector.nextInt();
			}
		System.out.println("el número mínimo es " + min);	
		}
		

	}

}
