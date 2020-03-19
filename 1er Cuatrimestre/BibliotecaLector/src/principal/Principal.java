package principal;

import autor.Autor;
import editorial.Editorial;
import lector.Lector;
import libro.Libro;
import prestamo.Prestamo;
import autor.Autor;
import biblioteca.Biblioteca;


public class Principal {
	
	public static void main(String [] args) {
		
		
		Editorial editorial = new Editorial("Editorial nueva");
		Autor autor = new Autor("autor nuevo");
		Biblioteca biblioteca= new Biblioteca();
		
		biblioteca.adquirirLibro("0000", "ciencias", "genenro", 2008, editorial, autor);
		biblioteca.adquirirLibro("1111", "biologia", "genenro", 2019, editorial, autor);
		biblioteca.adquirirLibro("2222", "administa", "genenro", 2019, editorial, autor);
		biblioteca.adquirirLibro("3333", "fisica", "genenro", 2019, editorial, autor);
		biblioteca.registrarLector("9445454","carloss","calle s x54","44554454");
		
		System.out.println(biblioteca.toString());
		
		Lector lector;
		lector=biblioteca.buscarLectorPorDni("9445454");
		
		
		Libro libro;
		libro= biblioteca.buscarLibroPorId("0000");
		Libro libro1;
		libro1=biblioteca.buscarLibroPorId("1111");
		Libro libro2;
		libro2=biblioteca.buscarLibroPorId("2222");
		Libro libro3;
		libro3=biblioteca.buscarLibroPorId("3333");
		
		
		String resultado="";
		resultado=biblioteca.prestar(libro, lector, "15-15-51");
		System.out.println(resultado);
		
		String resultado1="";
		resultado1=biblioteca.prestar(libro1, lector, "15-15-51");
		System.out.println(resultado1);
		
		String resultado2="";
		resultado2=biblioteca.prestar(libro2, lector, "15-15-51");
		System.out.println(resultado2);
		
		String resultado3="";
		resultado3=biblioteca.prestar(libro3, lector, "15-15-51");
		System.out.println(resultado3);
		
		
		
		System.out.println(biblioteca.toString());
		
		
		
		
	}

}
