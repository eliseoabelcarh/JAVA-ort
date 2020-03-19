package fundamentosTp2;

import java.util.Scanner;




public class Ejer13MateriaMasRequerida {

	public static Scanner lector = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int i=1;
		int cantAlumnos;
		int mayorSuma=0;
		String ganador="";
		int totalTaller=0;
		int totalFundamentos=0;
		int totalMatematica=0;
		String materia;
		char curso;
		
		cantAlumnos=ingNumPositivo("ingresda cantidad alumnos");
		while(i<=cantAlumnos) {
			curso= ingCurso("ingres el curso a/b/c o d");
			materia=ingMateria("ingrese materia");
			switch(materia) {
			case "taller":
				
				totalTaller++;
				if(totalTaller>mayorSuma) {ganador="tallerr";}
				
				break;
			case "fundamentos":
				
				totalFundamentos++;
				if(totalFundamentos>mayorSuma) {ganador="fundamentoss";}
				
				break;
			case "matematica":
				
				totalMatematica++;
				if(totalMatematica>mayorSuma) {ganador="matematicaa";}
				
				break;
			default: System.out.println("materia no existe");
				break;
			
			}//fin de switch
			
			i++;
			
		}//fin de while
		System.out.println("materia mas requerida es " + ganador);
		
		
	}//fin de main
	
	
	
	//INICIO DE FUNCIONES
	
	public static int ingNum(String texto) {
		int num;
		System.out.println(texto);
		num=lector.nextInt();
		return num;
	}
	
	public static int ingNumPositivo(String texto) {
		int nro;
		nro=ingNum(texto);
		while(nro<=0) {nro=ingNum("ingrese nro mayor a cero");}
		return nro;
	}

	public static char ingOpcionChar(String texto) {
		char opc;
		System.out.println(texto);
		opc=lector.next().charAt(0);
		return opc;
	}
	
	public static char ingCurso(String texto) {
		char i;
		i=ingOpcionChar(texto);
		while(!(i=='a'||i=='b'||i=='c'||i =='d')) {
			i=ingOpcionChar("ingresa a/b/c/d");
		}
		return i;
	}
	
	public static String ingMateria(String texto) {
		String materia;
		System.out.println(texto);
		materia=lector.next().toLowerCase();
		return materia;
	}
	
	
}//fin de class
