package test;

import autor.Autor;
import editorial.Editorial;
import genero.Genero;
import biblioteca.Biblioteca;
import mueble.Mueble;
import libro.Libro;
import resultado.Resultado;
import lector.Lector;
import estado.Estado;
import ejemplar.Ejemplar;


public class Test {

	public static void main(String[] args) {
	
		Lector lector;		
		Resultado resultado;
	//	Ejemplar ejemplar;
		
		
		Mueble mueble = new Mueble();
		Biblioteca biblioteca= new Biblioteca(mueble);
		Editorial editorial = new Editorial("santillana", "argentina");
		Autor autor = new Autor("marquez", "colombiano", "15/15/1950");
		Libro libro = new Libro("100 años soledad", 1880, Genero.NOVELA, editorial, autor);
		
	
		boolean registrado;
		registrado= biblioteca.registrarLector("1111","santiago","calle x 452","15-458-599");
		System.out.println(registrado);
		
		boolean ingresado;
		ingresado=biblioteca.ingresarEjemplar(202020, "15/15/2020", Estado.EN_BIBLIOTECA, libro);
		System.out.println(ingresado);
		
		
		lector=    biblioteca.buscarLector("1111");
		libro = biblioteca.buscarLibro("100 años soledad");
		System.out.println(lector + " ------ " + libro);
		
		resultado= biblioteca.prestar( libro , lector);
				
	    System.out.println(resultado);
		
		System.out.println(lector);
	}

}
