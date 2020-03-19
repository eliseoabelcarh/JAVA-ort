package fundamentosTp1;

import java.util.Scanner;

public class EjerciciosTp2 {


	public static Scanner lector= new Scanner(System.in);
	
	
	public static void main(String[] args) {

	
			/*
			//MOSTRAR SECUENCIA INCLUYENDO Y EXCLUYENDO NROS PEDIDOS
			 
			int n1;
			int	n2;
			int opc;
			int i;
				 
			n1=ingreseNro("ingrese 1er nro");
			n2=ingreseNro("ingrese 2do nro");
			opc=elegirOpcion1o2("1. para incluir 2. para excluir de secuencia");
			 System.out.println("elegiste opc " + opc);
			
			if(opc==1) {
				while(!cumpleSecInclu(n1,n2)) {
					System.out.println("ingresa nros diferentes");
					n1=ingreseNro("ingresa 1r nro");
					n2=ingreseNro("ingrsa 2o nro");
				}
				}
				
				else {
				
				while(!cumpleSecExclu(n1,n2)) {
					System.out.println("ingresa nros válidoss");
					n1=ingreseNro("1er nro");
					n2=ingreseNro("2do nro");
										
					}
				
				n1=n1+1;
				n2=n2-1;
					
				}
					
			if(n1>n2) {n1=outMenor(n1,n2);System.out.println(n1 + ""+n2); n2=outMayor(n1,n2);}
			for(i=n1; i<=n2; i++) {System.out.println(i); }
			
			
			
			
			//pedir nro y mostrar multiplos hasta limite positivos
			int nro;
			int hasta =100;
			//rango
			int min =2;
			int max=9;
				
			nro=ingNum("ingresa num");
			nro=validarRango(nro,min,max);
			mostrarMultiplos(nro,hasta);	
			
			
			
			//PEDIR EDAD Y ALTURA, VERIFICAR CONDICIONES MINIMAS Y MOSTRAR SI CUMPLE 
			int edad, condEdadMinima;
			double altura, condAlturaMinima;
			boolean puede;
			
			condEdadMinima=7;
			condAlturaMinima=1.41;
			
			edad=ingPositivo("ingresa edad");
			altura=(double)ingAlturaValida("ingresa altura");
			puede= cumpleEdadYAlt(condEdadMinima,condAlturaMinima,edad,altura);
			if(puede) {System.out.println("si puede");}else {System.out.println("no puede");}
			
			
		
			
		
			//PEDIR NUM Y VERIFICAR SI ES IMPAR Y TIENE 1 DIGITO
			int num;
			boolean estaEnA, estaEnB, estaEnAmbos, noEstaEnNinguno;
				
			num=ingNum("ingrese num");
			estaEnA=tiene1Digito(num);
			estaEnB= ! (esPar(num));
			estaEnAmbos= estaEnA && estaEnB;
			noEstaEnNinguno= (estaEnA ==false)&&(estaEnB==false);
			System.out.println("tiene 1 digito: " + estaEnA); 
			System.out.println("es impar: " + estaEnB);
			System.out.println("esta en ambos: " + estaEnAmbos);
			System.out.println("no esta en ninguno: " + noEstaEnNinguno);
		
			*/
		
		
			
		
			
		
		
		
		
		
		
		
			

	}
	
	
	
	
	
	 
		// FUNCIONES UTILIZADAS NRO 2
			
				public static boolean cumpleSecExclu(int n1, int n2) {
					boolean cumple;
					cumple= !((n1-n2 >=-1)&&(n1-n2<=1));
					return cumple;
				}
			
				public static boolean cumpleSecInclu(int n1, int n2) {
					boolean cumple;
					cumple= (n1-n2) != 0;
					return cumple;
					
				}
				
				public static int ingreseNro(String texto) {
					int num;
					System.out.println(texto);
					num=lector.nextInt();
					return num;
					
				}
			
				public static int elegirOpcion1o2(String texto) {
					int opc;
					do {
					System.out.println(texto);
					opc=lector.nextInt();
					}while((opc != 1) && (opc !=2));
					return opc;
				}
			
				public static int outMayor(int n1,int n2) {
					int may;
					if(n1>=n2) {may=n1;}else {may=n2;}
					return may;
					
				}
				
				public static int outMenor(int n1, int n2) {
					
					int men;
					if(n1<=n2) {men=n1;}else{men=n2;}
					return men;
				}
	
	
				
				public static int ingNum(String texto) {
					int num;
					System.out.println(texto);
					num=lector.nextInt();
					return num;
					
				}
				
				public static int validarRango(int nro, int min, int max) {
					while(!(nro>=min && nro<=max)) {nro=ingNum("ingresa nro entre "+min+" y "+max);}
					return nro;
						
				}
				
				
				public static void mostrarMultiplos(int num, int hasta) {
					int mult=0;
					int i=1;
					do{
						System.out.println(mult);
						mult=num*i;
						i++;
					
					}while( mult<=hasta && mult!=0 );
					
				}
				
				
	
				public static int ingPositivo(String texto) {
					 int nro;
					 nro= ingNum(texto);
					 while(nro<0) {nro=ingNum("ingrese nro positivo");}
					 return nro;
				 }


				public static double ingAlturaValida(String texto) {
					double alt;
					System.out.println(texto);
					alt=lector.nextDouble();
					while(alt<=0) {System.out.println("ingrese altura válida"); alt=lector.nextDouble(); }
					return alt;
				}
				
				public static boolean cumpleEdadYAlt(int cond1, double cond2, int valor1, double valor2) {
					boolean cumple;
					cumple= (cond1<=valor1)&&(cond2<=valor2);
					return cumple;
					
					
				}
				
				public static boolean tiene1Digito(int nro) {
					
					boolean res;
					res= (nro>=-9) && (nro<=9);
					return res;
					
				}
				
				
				public static boolean esPar(int nro) {
					
					boolean esNumPar;
					esNumPar= (nro%2 == 0);
					return esNumPar;
				}
				
				

}
