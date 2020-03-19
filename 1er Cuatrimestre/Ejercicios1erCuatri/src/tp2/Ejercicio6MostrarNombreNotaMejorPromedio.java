package tp2;


import java.util.Scanner;

public class Ejercicio6MostrarNombreNotaMejorPromedio {
	
	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i;
		String nombre;
		int nota;
		final int TOPEALUMNOS =3;
		String nombreMax;
		int notaMax;
		
		
		i=0;
		nombreMax=null;
		
		//sirve para notas diferentes solamente
		for(notaMax =i; i<TOPEALUMNOS;i++) {
			System.out.println("ingrese nombre "+(i+1));
			nombre=lector.next();
			System.out.println("ingrese nota " + (i+1));
			nota=lector.nextInt();
			if(notaMax<nota) {notaMax=nota;nombreMax=nombre;}
			
		}
		
		System.out.println("nota mayor : " + notaMax +" - " + nombreMax );
		 
	}

}
