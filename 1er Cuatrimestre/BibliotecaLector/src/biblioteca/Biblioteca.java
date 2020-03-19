package biblioteca;
import java.util.ArrayList;


import autor.Autor;
import editorial.Editorial;
import lector.Lector;
import libro.Libro;
import prestamo.Prestamo;

public class Biblioteca {
	
	ArrayList<Lector> lectores;
	ArrayList<Libro> libros;
	
	public Biblioteca() {
		super();
		this.lectores = new ArrayList<Lector>();
		this.libros = new ArrayList<Libro>();
	}
	
	public void registrarLector(String dni, String nombre, String direccion, String telefono) {
		this.lectores.add(new Lector(dni,nombre,direccion,telefono));
	}
	public void adquirirLibro(String id, String titulo, String genero, int anio, Editorial editorial, Autor autor) {
		this.libros.add(new Libro(id,titulo,genero,anio,editorial,autor));
	}
	public boolean existeLibro(Libro libro) {
		boolean result= false;
		for(int i=0; i<libros.size();i++) {
			if(libro==libros.get(i)) {
				result=true;
			}
		}
		
		return result;
	}
	public String prestar(Libro libro, Lector lector, String fechaRetiro) {
		
		String syso="sin datos";
		
		if(this.existeLibro(libro)==false) {syso="no hay ejemplares";}
		if(lector.alcanzoTopePrestamos()) {syso="alcanzo tope prestamo";}
		if(lector.tieneMulta()) {syso="tiene multa";}
				
		if(this.existeLibro(libro)==true && (lector.alcanzoTopePrestamos()==false) && (lector.tieneMulta()==false) ) {
		
			libro.setEstado("prestado");
					
			Prestamo prestamo=new Prestamo(libro,fechaRetiro);
			lector.getPrestamos().add(prestamo);
			
			syso="LIBRO PRESTADO EXITOSAMENTE";
			
			for(int i=0; i<libros.size();i++) {
				if(libro==libros.get(i)) {libros.remove(i);}	
				}
			}
		
		return syso;
	}

	@Override
	public String toString() {
		return "Biblioteca [lectores=" + lectores + ", libros=" + libros + "]";
	}

	public ArrayList<Lector> getLectores() {
		return lectores;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	
	public Lector buscarLectorPorDni(String dni) {
		Lector lectorBuscado=null;
		for(int i= 0; i< lectores.size();i++) {
			if(dni.equals(lectores.get(i).getDni())) {
				lectorBuscado=lectores.get(i);
			}
		}
		return lectorBuscado;
	}
	
	public Libro buscarLibroPorId(String id) {
		Libro libroBuscado= null;
		for(int i= 0; i< libros.size();i++) {
			if(id.equals(libros.get(i).getId())) {libroBuscado=libros.get(i);}
		}
		return libroBuscado;
	
	}
	
	
	
	
	
	
	
}


