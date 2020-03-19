package fundamentosTp1;

import java.util.Scanner;


public class EjerciciosTp1 {
	
	
	public static Scanner lector = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	
		
		
		/*	
		//pedir numero e incrementarlo en x numero
		int num;
		int incremento;
		int nroIncrementado;
		num=ingresarNum("ingrese numero");
		incremento=incrementar("incrementar en?");
		nroIncrementado= sumar(num,incremento);
		mostrar("el resultado es: ",nroIncrementado);
		*/
		
		/*
		//pide nombre y muestra bienvenida
		String nombre;
		nombre=ingresarTexto("ingresa tu nombree");
		mostrarDato("bienvenido ",nombre);
		*/
		
		/*
		//pide nro y lo multiplica por si mismo
		int nro;
		int alCuad;
		nro=ingresarNum("ingresa número");
		alCuad=nAlCuadrado(nro);
		mostrar("el numero multiplicado por sí mismo es ", alCuad);
		*/
		
		/*
		//pide 2 números y los multiplica
		int num1;
		int num2;
		int prod;
		num1=ingresarNum("ingresa primer número");
		num2=ingresarNum("ingresa segundo número");
		prod=multiplicar(num1,num2);
		mostrar("el producto de los números es ", prod);
		*/		

		/*
		//pide 2 nros y devuelve division-verificando !dif a cero
		int n1;
		int n2;
		double result;
		n1=ingresarNum("ingresa 1er num");
		n2=ingresarNum("ingresa 2do num");
		result=dividir(n1,n2);
		mostrarDivision("resultado de división es " , result);
		*/
		
		
		/*
		//pide nro y muestra si es impar o par
		int num;
		num=ingresarNum("ingrese numeroo");
		mostrarSiEsPar(num);
		*/
		
		
		System.out.println("ho");
		
		
		
	}
		

	
	// 	ACÁ EMPIEZAN LAS FUNCIONES UTILIZADAS 
	
	
	
	
	 public static int ingresarNum(String texto) {	
			
			int numero;
			
			System.out.println(texto);
			numero=lector.nextInt();
			return numero;
		
	}
	 
	 
	 public static String ingresarTexto(String mensaje) {
		 
		 String dato;
		 System.out.println(mensaje);
		 dato=lector.next();
		 return dato;
		 
	 }
	 
	 

	 public static void mostrar(String texto, int numero) {
	  
		 System.out.println(texto + numero);
	 }
	 
	 public static void mostrarDivision(String texto, double numero) {
		
		 System.out.println(texto + numero);
	 }
	 
	 public static void mostrarDato(String texto,String dato) {
		 
		 System.out.println(texto+dato);
	 }
	 
	 
	 public static int sumar (int num1, int num2) {
		 
		 int suma;
		 suma=num1+num2;
		 return suma;
	 }
	 
	 public static int nAlCuadrado(int n) {
		 
		 int res;
		 res=n*n;
		 return res;
	 }
	 
	 
	 
	 public static int incrementar(String mensaje) {
		 int inc;
		 inc=ingPositivo(mensaje);
		 return inc;
	 }
	 
	 public static int ingPositivo(String texto) {
		 int nro;
		 nro= ingresarNum(texto);
		 while(nro<0) {nro=ingresarNum("ingrese nro positivo");}
		 return nro;
	 }
	 
	 public static int multiplicar(int n1,int n2) {
		 int producto;
		 producto=n1*n2;
		 return producto;
		 
	 }
	 
	 public static double dividir(int num1, int num2) {
		 double div;
		 while(num2==0) {num2=ingresarNum("debe ser difeente de cero, ingresa número:");}
		 div=(double)num1/num2;//casteo a double decimales
		 div = Math.round(div*100d)/100d;//ajusto a 2 decimales
		 
		 return div;
		 
	 }
	 
	 public static boolean esPar(int num) {
		 boolean nroPar;
		 if((num%2)!=0) {
			 nroPar=false;
		 }else {nroPar=true;}
		 return nroPar;
		 
	 }

	 public static void mostrarSiEsPar(int num1) {
		 if(esPar(num1)) {System.out.println(num1 + " es par");}
		 else {System.out.println(num1+" es impar");}
	 }
	 
	
	
	 
	 
}
