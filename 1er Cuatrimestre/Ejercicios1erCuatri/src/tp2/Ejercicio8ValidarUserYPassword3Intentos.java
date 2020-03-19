package tp2;

import java.util.Scanner;


public class Ejercicio8ValidarUserYPassword3Intentos {

	public static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int i;
		final int INTENTOS=3;
		String usuario;
		String password;
		String usuarioIn;
		String passwordIn;
		
		//inicializaciones
		i=1; //contador
		usuario= "admin";
		password="demo";
		
		
		System.out.println("ingrese usuario;");
		usuarioIn = lector.next();
		System.out.println("ingrese contraseña:");
		passwordIn=lector.next();
		
		
		
		while((i<INTENTOS) &&  ! ((usuarioIn.equals(usuario)) && (passwordIn.equals(password)))) {
			
			System.out.println("ingrese usuario:");
			usuarioIn = lector.next();
			System.out.println("ingrese contraseña:");
			passwordIn=lector.next();
			i++;
			
		}
		if((usuarioIn.equals(usuario)) && (passwordIn.equals(password))) {
			System.out.println("ha ingresado correctamente");
		}	else {System.out.println("se ha bloqueado su cuenta");}	
		
		
		
		
		
	}

}
