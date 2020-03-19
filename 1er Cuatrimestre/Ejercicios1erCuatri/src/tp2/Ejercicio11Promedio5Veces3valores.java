package tp2;

import java.util.Scanner;
public class Ejercicio11Promedio5Veces3valores {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int num;
		int suma;
		int prom;
		int i;
		int j;
		final int CINCO=5;
		final int TRES=3;
		
		i=0;
		j=1;
		suma=0;
		
		while(j<=CINCO) {
			
			while(i<TRES) {
				System.out.println("ingrese nro:");
				num=lector.nextInt();
				suma+=num;
				i++;
				
			}
			prom=suma/i;
			System.out.println("promedio " + j + " es " + prom);
			i=0;
			j++;
			suma=0;
			prom=0;
		}
		System.out.println("se terminó de ejecutar");
		
		
		
		
		
	}

}
