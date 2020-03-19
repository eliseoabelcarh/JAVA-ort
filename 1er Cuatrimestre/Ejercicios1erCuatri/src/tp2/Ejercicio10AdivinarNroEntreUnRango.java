package tp2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10AdivinarNroEntreUnRango {
	
	public static Random aleatorio = new Random();
	
	public static Scanner lector = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		
		int r1;
		int r2;
		int nroAleatorio;
		int num;
		int i;
		
		//
		i=1;
		
		System.out.println("Ingrese nro 1 para definir rango: ");
		r1= lector.nextInt();
		System.out.println("Ingrese nro 2 para definir rango: ");
		r2= lector.nextInt();
		//valido r2
		while(r2<r1) {System.out.println("nro2 debe ser menor a nro1, ingrese nro:");r2=lector.nextInt();}
		nroAleatorio=aleatorio.nextInt(r2-r1+1)+r1;
		//genero nro aleatorio
		System.out.println(nroAleatorio);
		
		System.out.println("adivine nro entre "+ r1 + " y " + r2 + "escriba nro:");
		num=lector.nextInt();
		
		while(num!=nroAleatorio) {
			
			if(num>nroAleatorio) {System.out.println(num + " es muy grande ");}
			else {System.out.println(num + "es muy chico");}
			System.out.println("ingrese numero entre" + r1 + " y " + r2 );
			num=lector.nextInt();
			i++;
		}
		
		if(num==nroAleatorio) {System.out.println("felicitaciones adivinó! \nnro de itentos: "+ i);}
		

	}

}
