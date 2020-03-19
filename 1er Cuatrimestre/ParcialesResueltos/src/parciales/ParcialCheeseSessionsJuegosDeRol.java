package parciales;

import java.util.Scanner;

public class ParcialCheeseSessionsJuegosDeRol {
	
	
public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//declarando variables
		String nombre;
		int edad;
		int horasPerm;
		String clase;
		double costoPartida;
		int acumHorasPermanencia=0;
		int contJugadores=0;
		double acumRecaudacion=0;
		int edadMasAlta =0;
		double promedio;
		final String COD_FIN= "fin";

		//programa
		
		nombre=ingresarString("ingresaa nombre de Jugador");
		while(!(nombre.equals(COD_FIN))) {
			
			edad= ingresarEdad("ingresas edad");
			horasPerm = ingresarHorasPermanencia("ingresa horas de permanencia");
			clase= ingresarClaseJugador("ingresa clase de jugador");
			costoPartida=obtenerCostoPartida(edad,horasPerm, clase);
			acumHorasPermanencia += horasPerm;
			contJugadores++;
			acumRecaudacion += costoPartida;
			edadMasAlta= pedirMayor(edadMasAlta,edad);
			nombre = ingresarString("ingresa nombre de jugador");
			
		}
		
		if(contJugadores>0) {
			promedio=calcularPromedio(acumHorasPermanencia,contJugadores);
			System.out.println("promedio de permanencia en horas e " + promedio );
			System.out.println(" la recaudación total es " + acumRecaudacion );
			System.out.println(" la edad más alta es  " + edadMasAlta );

			
			
		}
		else {System.out.println("no hay datos por mostrar");}
		
		
}
	
	//funciones acá
	
	
	
	
	public static int pedirMayor(int num1, int num2) {
		int mayor;
		if(num1>num2){mayor=num1;}else {mayor=num2;}
		return mayor;
	}
	
	public static  double calcularPromedio (double total, int cant) {
		double prom;
		if(cant<0) {prom= (total/cant);}else {prom = 0;}
		return prom;
	}
	
	
	
	
	public static String ingresarString (String texto) {
		String str;
		System.out.println(texto);
		
		str=lector.next();
		
		return str;
		
	}
	public static int ingresarNum(String texto) {
		int num;
		System.out.println(texto);
		num=lector.nextInt();
		lector.nextLine();
		return num;
	}
	
	public static int ingresarRango(String texto, int min, int tope) {
		int num;
		do {num=ingresarNum(texto);} while(!(num>=min && num<= tope));
		return num;
	}
	
	public static int ingresarEdad(String texto) {
		int edad;
		final int EDAD_MIN =18;
		final int EDAD_MAX=70;
		
		edad=ingresarRango(texto,EDAD_MIN,EDAD_MAX);
		return edad;
	}
	
	public static int ingresarHorasPermanencia(String texto) {
		int horas;
		final int HORAS_MIN =1;
		final int HORAS_MAX =8;
		horas= ingresarRango(texto, HORAS_MIN, HORAS_MAX);
		return horas;
	}
	
	public static String ingresarClaseJugador(String texto) {
		String clase;
		do {clase = ingresarString(texto);} while(!esClaseValida(clase));
		return clase;
	}
	
	public static boolean esClaseValida(String clase) {
		final String G = "G";
		final String C = "G";
		final String M = "M";
		final String L = "L";		
		
		return (clase.equals(G) || clase.equals(C) || clase.equals(M) || clase.equals(L) ) ;
	}
	
	
	public static double obtenerCostoPartida(int edad, int horas, String clase) {
		double costo=0;
		final String GUERRERO = "G";
		final String CABALLERO = "C";
		final String MAGO = "M";
		final String LADRON = "L";
		
		switch(clase) {
		
		case GUERRERO : costo=calcularGuerrero(horas);
			break;
		case CABALLERO : costo=calcularCaballero(horas);
			break;
		case MAGO : costo=calcularMago(horas);
			break;
		case LADRON : costo=calcularLadron(horas,edad);
			break;
			
		
		}
		return costo;
		
	}
	
	public static double calcularGuerrero(int horas) {
		double costo;
		final double PRECIO_HORA=50;
		costo= horas*PRECIO_HORA;
		return costo;
	}
	
	public static double calcularMago(int horas) {
		double costo;
		final double PRECIO_HORA=50;
		final double DSCTO_MAGO=0.1;
		costo= (horas*PRECIO_HORA)- ((horas*PRECIO_HORA)*DSCTO_MAGO);
		return costo;
	}
	
	
	
	public static double calcularCaballero(int horas) {
		double costo;
		final int HORA_FAVORITA = 4;
		final double PRECIO_HORA = 50;
		final double PRECIO_EXT= 10 ;
		
		if (horas>=HORA_FAVORITA) { costo = (HORA_FAVORITA*PRECIO_HORA)+((horas-HORA_FAVORITA)*PRECIO_EXT);}else {costo= horas*PRECIO_HORA;}
		return costo;
		
	}
	
	
	public static double calcularLadron(int horas, int edad) {
		double costo;
		final int EDAD_DSCTO =224;
		final double PRECIO_HORA = 50;
		final double DSCTO_LAD= 0.15;
			if(edad< EDAD_DSCTO){costo = (horas*PRECIO_HORA)- ((horas*PRECIO_HORA)*DSCTO_LAD);}else{costo=(horas*PRECIO_HORA);}//fin de if
		return costo;
	}
	
	
}
