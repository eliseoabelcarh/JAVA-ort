package tp2;

import java.util.Scanner;


public class Ejercicio5PromedioMenorA20MostrarContador {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int num;
		int cont;
		final int TOPE = 20;
		int total;
		int prom;
		
		cont=1;
		total=0;
		/*
		//1ERA FORMA
		for (prom=cont; prom<=TOPE; cont++) {
			System.out.println("ingrese número");
			num= lector.nextInt();
			total = total+num;
			prom=(total)/cont;
			
		}
		
		System.out.println((cont-1) + " veces");
		System.out.println(prom);
		*/
		
		//2DA FORMA
		prom=0;
		while(prom<=TOPE) {
			
			System.out.println("ingrese numero");
			num=lector.nextInt();
			total +=num;
			prom= total/cont;
			cont++;
			}
		System.out.println("contador: " + (cont-1));
		System.out.println("promedio: " + prom);

	}

}
