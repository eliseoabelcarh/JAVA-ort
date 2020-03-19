package fundamentos;

import java.util.Scanner;

public class ModParcial1 {
	
	public static Scanner lector = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		String fecha, hora;
		char tipoCancha;
		final int NROCANCHA5=5;
		final int NROCANCHA8=8;
		final char A='5';
		final char B='8';
		double acumSenia5 =0;
		double acumSenia8=0;
		final char OPC1 = 's';
		final char OPC2 = 'n';
		int ganador = 0;
		double mayorRec=0;
		int nroCancha;
		double senia =0;
		int cont5 =0;
		int cont8 =0;
		int contReservas=0;
		char continuar;


		
		
		
		do {
			
			fecha=ingresarFecha("ingrese fecha");
			hora=ingresarHora("ingrese hora");
			tipoCancha =ingresarOpcion("ingrese cancha 5 - 8 " , A, B);
			nroCancha=obtenerCancha(fecha, hora, tipoCancha);
			if(nroCancha!=(-1)) {
				
				senia=calcularSenia(nroCancha);
				switch (nroCancha) {
				
				case NROCANCHA5:
					acumSenia5 +=senia;
					if(acumSenia5>mayorRec) {
						ganador=NROCANCHA5;
						mayorRec= acumSenia5;
					}//fin de if
					cont5++;
					break;
					
				case NROCANCHA8:
					acumSenia8 +=senia;
					if(acumSenia8>mayorRec) {
						ganador=NROCANCHA8;
						mayorRec= acumSenia8;
					}//fin de if
					cont8++;
					break;	
				
				}//fin de switch
				
				informarCliente(nroCancha,senia);
				confirmarReserva(fecha,hora,tipoCancha,nroCancha);
				
			}// fin de if
			
			else{System.out.println("no hay canchaa disponible");}//fin de else
			
			
			
			
			
			continuar =ingresarOpcion("desea ingresarn nueva reserva? s /n ", OPC1, OPC2);
			
		}//fin de DO 	
		while(continuar == 	OPC1);//fin de while
		
		
		contReservas=cont5+cont8;
		mostrarDatos(NROCANCHA5,acumSenia5, contReservas, 	NROCANCHA5, cont5, mayorRec, ganador);
		mostrarDatos(NROCANCHA8,acumSenia8, contReservas,   NROCANCHA8, cont8, mayorRec, ganador);
		
	}//fin de main

	
	
	//empieza funciones
	
	public static String ingresarString(String texto) {
		String str;
		System.out.println(texto);
		str=lector.next();
		return str;
		
	}
	
	public static String ingresarFecha(String texto) {
		String fecha;
		fecha=ingresarString(texto);
		while(!esFechaValida(fecha)) { fecha=ingresarString("error ing fecha valida");}
		return fecha;
	}	
	
	
	public static boolean esFechaValida(String fecha) {
		//algo que no esta definido aun
		return true;
		
	}
	
	public static boolean esHoraValida(String hora) {
		//algo no definido aun
		return true;
	}
	
	public static char ingresarChar(String texto) {
		char ch;
		System.out.println(texto);
		ch=lector.next().charAt(0);
		return ch;
	}
	public static String ingresarHora(String texto) {
				
		String hora;
		do{hora=ingresarString(texto);} while(!esHoraValida(hora));
		return hora;
	}
	
	public static int obtenerCancha(String fecha, String hora, char tipo) {
		//algo que valida
		return 5;//o 5 o 8
	}
	
	public static char ingresarOpcion(String texto, char a, char b) {
		char x;
		do {x=ingresarChar(texto);}
		while(!(x==a || x ==b));
		return x;
	}
	
	public static double calcularSenia5() {
		final double PRECIO_CANCHA=900;
		final double PORC_SENIA=0.2;
		return(PRECIO_CANCHA*PORC_SENIA);
		
	}public static double calcularSenia8() {
		final double PRECIO_CANCHA=1400;
		final double PORC_SENIA=0.3;
		return(PRECIO_CANCHA*PORC_SENIA);
	}
	
	
	public static double calcularSenia(int nroCancha) {
		double senia=0;
		switch(nroCancha) {
		case 5: senia= calcularSenia5();
			break;
		case 8:senia= calcularSenia8();
			break;
		default: System.out.println("eeror calculando seña");
		}
		return senia;
	}
	
	public static void confirmarReserva(String fecha, String hora, char tipo, int nroCancha) {
		//algo algo
		System.out.println("reserva CONFIRMADA");
	} 
	
	public static void informarCliente(int nro, double senia) {
		System.out.println("nro cancha rervando es " + nro);
		System.out.println("la seña seria .. " + senia);
	}
	
	public static void mostrarDatos(int nroCancha, double acum, int total, int cancha, int cont, double mayorRec, int ganador) {
		System.out.println("la cancha " + nroCancha + " recaudo " + acum );
		System.out.println( "contador de nrocancha"+ cancha +" fue "+   cont );
		System.out.println("total  de contReservas fue " + total );
		System.out.println(" el quer masd recaudo fue con $" + mayorRec);
		System.out.println(" el ganador fue cancha" + ganador);
	}
	
}//fin de class
