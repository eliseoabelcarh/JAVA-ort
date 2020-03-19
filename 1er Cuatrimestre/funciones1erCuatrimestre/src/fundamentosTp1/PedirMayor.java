package fundamentosTp1;

import java.util.Scanner;//importo utilitario Scanner

public class PedirMayor {
	public static Scanner lector=new Scanner(System.in);//creo instancia a Scanner
	
	public static void main(String[] args) {

		//EJERCICIO: pedir numeros dentro de un rango, validarlos y mostrar el mayor hasta que escriban cero
		int nro;
		int rango1=0;
		int rango2=100;
		int max=0;//asigno valor inicial al mayor
		
		
		nro=ingreseNroEnRango("ingrese nro entre 0 y 100, 0 para finalizar",rango1,rango2);//valido el nro que pido
		while(nro !=0) {
		
			max=dameMax(nro,max);//capturo siempre el mayor
			nro=ingreseNroEnRango("ingrese otro nro entre 0 y 100, 0 para finalizar",rango1,rango2);
			
			
		}
		
		System.out.println("el nro mayor es " + max);
		
		
		
	}//fin de método main

	//INICIO DE FUNCIONES
	
	public static int ingreseNum(String texto){
		int num;
		System.out.println(texto);
		num=lector.nextInt();
		return num;
	}
	public static int dameMax(int n1, int n2) {
		int max;
		if(n1>=n2) {max=n1;}else {max=n2;}
		return max;
	}
	 
	public static int ingreseNroEnRango(String mensaje, int r1, int r2) {
		int num;
		do {num=ingreseNum(mensaje);} while(num<r1 || num>r2);
		return num;
		
	}
	
	
	
}//fin de clase


