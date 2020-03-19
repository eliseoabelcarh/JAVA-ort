package fundamentos;
import java.util.Scanner;

public class ProbandoOpcionCodFinMinTope {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		final int COD_FIN= -1;
		//int nro;
		int codSol;
		
		
		codSol=ingresarOpcion("iii", ingresarMinTope("ingresacod sol",1,9999) ,COD_FIN);
		
		System.out.println(codSol);
		

	}//fin de main

	
	//acá funciones
	
	
	public static int ingresarOpcion(String texto, int a, int b) {
		int opc;
		do {	opc=ingresarNumero(texto); } while (!(opc ==a || opc==b));
		return opc;
		
	}
	
	public static int ingresarMinTope(String texto, int min, int tope) {
		int num;
		do{num=ingresarNumero(texto);}
		while(!(num>=min && num<=tope)) ;
		return num;
		
	}
	
	public static int ingresarNumero(String texto) {
		int nro;
		System.out.println(texto);
		nro=lector.nextInt();
		return nro;
	}
	
	
}//fin de class
