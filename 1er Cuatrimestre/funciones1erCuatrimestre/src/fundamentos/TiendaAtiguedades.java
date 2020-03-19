package fundamentos;

import java.util.Scanner;

public class TiendaAtiguedades {

	public static Scanner lector = new Scanner (System.in);
	
	public static void main(String[] args) {


		final char COD_PART = 'P';
		final char COD_EMP = 'E';
		int codPieza;
		double precioBase;
		double precioPagado;
		char codComprador;
		boolean condicion;
		boolean condicion2;
		int contPag3VecBase= 0;
		String cadenaNoSupero3Veces = "";
		double precioMayor =0;
		int i=0;
		
		
		while(i <3) {
		codPieza=ingresarNro("ingresa cod pieza");
		precioBase= ingresarNroDouble(" ingresa  precio base");
		precioPagado= ingresarNroDouble(" ingresa  precio pagado");

		codComprador= ingresarOpcion("ingresa opcion P o E", COD_PART,COD_EMP);
		
		
		condicion=(precioPagado/precioBase>=3);
		
		contPag3VecBase += devolver1SiCumpleCond(condicion);
		
		cadenaNoSupero3Veces = actualizarString( ! condicion, cadenaNoSupero3Veces, codPieza);
		
		
		condicion2 = ( codComprador == COD_EMP);
		precioMayor = actualizarMayor ( condicion2, precioMayor,precioPagado);
		
		
		System.out.println(" contador pago 3 veces precio base: " + contPag3VecBase );
		System.out.println(" cadena string no super 3 vecs: " + cadenaNoSupero3Veces );
		System.out.println(" el mayor de los de EMpresa   " + precioMayor );
		
		i++;
		}

	}//fin de main

	
	public static char ingresarOpcion(String texto, char a , char b) {
		char opc;
		do{
			System.out.println(texto);
			opc=lector.next().charAt(0);}
		while(!(opc == a || opc ==b));		
		return opc;
	}
	public static int ingresarNro(String texto) {
		int nro;
		System.out.println(texto);
		nro=lector.nextInt();
		return nro;
	}
	
	public static double ingresarNroDouble(String texto) {
		int nro;
		System.out.println(texto);
		nro=lector.nextInt();
		return nro;
	}
	
	public static int devolver1SiCumpleCond(boolean condicion) {
		int num;
		if(condicion) {num=1;}else {num=0;}
		return num;
	}
	
	public static double actualizarMayor(boolean condicion, double mayorActual, double n) {
		if(condicion) {
			
			if(n>mayorActual) {mayorActual=n;}
		}//fin de 1er if
		return mayorActual;
	}
	
	public static String actualizarString (boolean condicion, String a, int nro) {
		if(condicion) {a= (a + " " + nro + ", ");}
		return a;
	}
	
	
	
}//finn de class

