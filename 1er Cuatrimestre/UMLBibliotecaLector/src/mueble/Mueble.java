package mueble;

import java.util.ArrayList;
import libro.Libro;

public class Mueble {
	
	ArrayList<Libro> libros;
	
	public Mueble() {
		this.libros= new ArrayList<Libro>();
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Mueble [libros=" + libros + "]";
	}
	
	
}
