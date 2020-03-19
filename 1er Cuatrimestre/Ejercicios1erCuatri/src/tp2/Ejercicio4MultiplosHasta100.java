package tp2;

import java.util.Scanner;

public class Ejercicio4MultiplosHasta100 {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {

			//Declaro variables
			final int TOPE = 100;
			int num;
			int i;
			int mult;
			int A;
			int multMax;
			int j;
			
			
			//pido datos a usuario			
			System.out.println("ingresa número entre 2 y 9 inclusive");
			num=lector.nextInt();
			//valido los datos
			while((num<2)||(num>9)) {System.out.println("ingresa número entre 2 y 9 inclusive"); num= lector.nextInt();}
			
			
			
			//genero y muestro múltiplos del número hasta el tope
				
			i=0;//inicializo contador
			
			for(mult=i;mult<=TOPE; i++){
				System.out.println(mult);
				mult=mult+num;
				
				}
			
			//muestro múltiplos de mayor a menor 1RA FORMA
			
			A=(TOPE/num); //me da una cantidad entera de múltiplos
			multMax = (num*A); //múltiplo máximo menor a TOPE
					
			for(j=multMax;multMax >=0; j--) {
				System.out.println(multMax);
				multMax = multMax-num;
			}
			
			
			
			//muestro múltiplos de mayor a menor 2DA FORMA
			
			System.out.println(multMax);
			//el valor cambió en el for, debo reiniciar valores
			A=(TOPE/num); //me da una cantidad entera de múltiplos
			multMax = (num*A); //múltiplo máximo menor a TOPE
			while(multMax>=0) {System.out.println(multMax); multMax = multMax-num;}
			
			
			//para mi
		//System.out.println(num);//num no cambia de valor fuera del for
			//System.out.println(multMax);multMax cambió de valor
			
	
	}

}
