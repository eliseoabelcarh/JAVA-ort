package parciales;

import java.util.Scanner;
public class ParcialRuletaCasino {
	
	public static Scanner  lector = new Scanner(System.in);

	public static void main(String[] args) {

	String opcion;
	final String OPC_SI = "si";
	final String OPC_NO = "no";

	int importeApuesta;
	int nroDeApuesta;
	int nroRuleta;
	int montoResultado=0;
	int saldo=0;
	int contPartidas =0;
	int APUESTA_MIN =10;
	int APUESTA_MAX=100;
	int NRO_MIN = 0;
	int NRO_MAX =36;

	System.out.println("Bienvenidao");
	opcion=ingresarOpcion("desea jugar?", OPC_SI, OPC_NO);

	while(opcion.equals(OPC_SI)){

	importeApuesta =ingresarRango("ingrese monto de apuesta",APUESTA_MIN,APUESTA_MAX);
	nroDeApuesta = ingresarRango("ingresa nro de apuesta ", NRO_MIN, NRO_MAX);
	nroRuleta=obtenerNroRuleta();
	montoResultado=obtenerResultado(importeApuesta,nroDeApuesta,nroRuleta);
	//System.out.println("funcion obtenerResultado devuelve " +montoResultado);
	
	
	if(nroRuleta==nroDeApuesta) {saldo= montoResultado;}else {saldo= importeApuesta + montoResultado;}
	
	
	
	
	
	contPartidas++;

	opcion=ingresarOpcion("desea jugar?", OPC_SI, OPC_NO);



	}


	if(contPartidas>0){
	System.out.println("su saldo es " + saldo) ;//ojo
	System.out.println("cantidad de partidas jugadas es " + contPartidas);
	}else{System.out.println("no apostó nada");}



	}//fin de main

	//aca empiezan funciones

	public static int obtenerNroRuleta(){
	int nroAzar;
	final int AZAR_MIN=0;
	final int AZAR_MAX =36;
	nroAzar=nroRandom(AZAR_MIN, AZAR_MAX);
	return nroAzar;//forzar para probar
	}


	public static String ingresarString (String texto){
	String str;
	System.out.println(texto);
	str=lector.next();
	return str;
	}

	public static int ingresarNumero(String texto){
	int num;
	System.out.println(texto);
	num=lector.nextInt();
	return num;
	}
	
	public static String ingresarOpcion(String texto, String a, String b){
	String opc;
	do{opc=ingresarString(texto);}while(!(opc.equals(a) || opc.equals(b) ));
	return opc;
	}
	
	public static int ingresarRango(String texto, int min, int tope){
	int num;
	do{num=ingresarNumero(texto);}while(!(num>=min && num<=tope));
	return num;
	}
	
	public static int nroRandom (int base, int tope){
	int result;
	result=(int)((Math.random())*(tope+1-base))+base;

	return result;
	}
	
	
	public static int obtenerResultado(int importeApuesta, int nroApuesta, int nroRuleta){

	
	boolean mismaDocena;
	boolean imparPar;
	int sumarODescontar=0;


	if(nroRuleta !=nroApuesta ){

	mismaDocena=enMismaDocena(nroApuesta,nroRuleta);
	imparPar= sonParesOImpares(nroApuesta,nroRuleta);

	System.out.println("mismadocena"+mismaDocena + "imparPar"+imparPar);

	if(mismaDocena && imparPar){sumarODescontar=0;}
	else{

	if(mismaDocena){sumarODescontar=-(int)(importeApuesta*0.3);}
	if(imparPar){sumarODescontar=-(int)(importeApuesta*0.7);}
	}


	}//fin de if
	else{sumarODescontar=importeApuesta*36;}
	return sumarODescontar;
	}

	
	public static boolean enMismaDocena (int num1,int num2){
	boolean result;
	if(num2 !=0){
	result = (((num1-1)/12) == ((num2-1)/12));
	}else {result = false;}
	
	return result;
	}
	
	
	public static boolean sonParesOImpares(int num1, int num2){
	boolean result;
	boolean a;
	boolean b;
	if(num2!=0){
	a= ((num1%2 ==0)&&(num2%2==0));
	b= ((num1%2 !=0)&&(num2%2!=0));
	result=(a||b);

	}else{result = false;}
	return result;
	}

	

}
