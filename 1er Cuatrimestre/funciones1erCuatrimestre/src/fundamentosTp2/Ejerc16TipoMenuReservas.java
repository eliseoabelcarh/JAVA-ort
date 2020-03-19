package fundamentosTp2;

import java.util.Scanner;

public class Ejerc16TipoMenuReservas {
	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		
		String opc;
		int totalInvitados;
		String tipoMenu;
		int reserva;
		int contA =0;
		int contB =0;
		int contC =0;
		int contD =0;
		int sumaReservas =0;
		final String A= "clasico";
		final String B= "celiaco";
		final String C= "kosher";
		final String D= "light";
		final String E= "fin";
		
		final double PRECIO_CLASICO = 300;
		final double PRECIO_CELIACO = 310;
		final double PRECIO_KOSHER = 430;
		final double PRECIO_LIGHT = 290;
		final double PRECIO_BEBIDA= 30;
		boolean quedaEspacio;
		
		
		opc=elegirOpcion("Desea caluclar precio para categirng?","s","n");
		while(opc.equals("n")) {System.out.println("ingreso incorrecto"); opc=elegirOpcion("bienvneido, Desea calcular precio para caterringg?","s","n");}
		totalInvitados=ingresarPositivo("ingrese cant total de invitados");
		tipoMenu=elegirMenu("ingrese el tipo de menu", A,B,C,D,E);
		System.out.println("UD- ELIGIO "+tipoMenu);
		while(!(tipoMenu.equals(E))) {
			
			reserva=ingresarNroConTope("Ingrese la cantidad de invitados que eligieron ese menu", (totalInvitados-sumaReservas),"Error.Ha ingresado mas cantidad de plastos que de invitados");
			System.out.println("UD- DICE "+reserva);
			
			quedaEspacio=quedaEspacio(totalInvitados,sumaReservas);
			System.out.println("quedaEspacio?" + quedaEspacio);
			
			if(quedaEspacio) {
				
				switch(tipoMenu) {
				case A: contA+=reserva;
					break;
				case B: contB+=reserva;
					break;
				case C: contC+=reserva;
					break;
				case D: contD+=reserva;
					break;
				}
				
				System.out.println("contA vale " + contA);
				System.out.println("contB vale " + contB);
				System.out.println("contC vale " + contC);
				System.out.println("contD vale " + contD);
				System.out.println("reserva vale " + reserva);
				
			 sumaReservas =suma(contA, contB, contC,contD);	
			 System.out.println("VAN RESERVADOS : " + sumaReservas);
			}else{System.out.println("errorm, ha ingresado mas platos que inivtados");}//fin de if
			
			tipoMenu=elegirMenu("ingrese tipo de menu", A,B,C,D,E);
		}//fin de while
		
		System.out.println("cantidad invitados" + totalInvitados);
		System.out.println("nro reservas " + sumaReservas);
		
		System.out.println("costo de comidas " + 
				
				 ( (contA*PRECIO_CLASICO)+(contB*PRECIO_CELIACO)+(contC*PRECIO_KOSHER)+(contA*PRECIO_LIGHT)  )
				
				);
		System.out.println("COSTO DE BEBDIDA " + sumaReservas*PRECIO_BEBIDA);
		
		
	}//finde main

	//	FUNCIONES
	
	public static String ingresarString( String texto) {
		String str;
		System.out.println(texto);
		str=lector.next();
		return str;
	}
	
	
	public static String elegirOpcion(String texto,String a, String b) {
		String opc;
		do {opc=ingresarString(texto);}
		while(!(opc.equals(a)|| opc.equals(b)));
		return opc;
	}
	
	public static int ingresarNum(String texto) {
		int num;
		System.out.println(texto);
		num=lector.nextInt();
		return num;
	}
	
	public static	int ingresarPositivo(String texto) {
		int pos;
		pos=ingresarNum(texto);
		while(pos<=0) {
			System.out.println("ingrese positivo");
			pos=ingresarNum(texto);
		}
		return pos;
	}
	
	
	public static	int ingresarNroConTope(String texto, int tope, String msjeError) {
		int num;
		num=ingresarPositivo(texto);
		while(num>tope) {
			System.out.println(msjeError);
			num=ingresarPositivo(texto);
		}//fin while
		return num;
		
	}
	
	public static String elegirMenu(String texto, String a, String b, String c, String d, String e) {
		String opc;
		opc=ingresarString(texto);
		while(
		!( opc.equals(a) || opc.equals(b) || opc.equals(c) || opc.equals(d) || opc.equals(e)  )) {
			
			System.out.println("error");
			opc=ingresarString(texto);
		}//fin de while
		return opc;
	}
	
	public static int suma(int a, int b, int c, int d) {
		return( a+b+c+d);
		
				
	}
	
	public static boolean quedaEspacio(int total, int reservas) {
		return(reservas<=total);
	}
	
	
	
}//fin de class
