

package biblioteca;
import java.util.ArrayList;

import ejemplar.Ejemplar;
import estado.Estado;
import lector.Lector;
import libro.Libro;
import mueble.Mueble;
import resultado.Resultado;
import prestamo.Prestamo;


public class Biblioteca {
	
	ArrayList<Lector> lectores;
	Mueble mueble;
	
	public Biblioteca(Mueble mueble) {
		this.mueble=mueble;
		this.lectores= new ArrayList <Lector> ();
	}

	public ArrayList<Lector> getLectores() {
		return lectores;
	}

	public void setLectores(ArrayList<Lector> lectores) {
		this.lectores = lectores;
	}

	public Mueble getMueble() {
		return mueble;
	}

	public void setMueble(Mueble mueble) {
		this.mueble = mueble;
	}

	@Override
	public String toString() {
		return "Biblioteca [lectores=" + lectores + ", mueble=" + mueble + "]";
	}
	
	//fin de toString
	
	public Lector buscarLector(String dni) {
		Lector lectorBuscado=null;
		boolean encontrado=false;
		int i=0;
		
		while( i < this.lectores.size()  && !encontrado ) {
			Lector lector;
			lector=lectores.get(i);
			if( lector.getDni().equals(dni) ) {
				lectorBuscado=lector;
				encontrado=true;
				i++;
			}
		}
		
		return lectorBuscado;
		
	}
	
	public boolean registrarLector(String dni, String nombre, String direccion, String telefono) {
		boolean result=false;
		if(buscarLector(dni)==null) {
			this.lectores.add(new Lector(dni, nombre, direccion, telefono));
			result=true;
		}
		return result;
	}
	
	public boolean ingresarEjemplar(int identificador, String fechaPrestamo, Estado estado, Libro libro) {
		//boolean result=false;
		
		//TODO  agregar if si ya existe con ese identificador no se podra agregar ejemplar
		libro.getEjemplares().add(new Ejemplar(identificador, fechaPrestamo, estado));
		this.mueble.getLibros().add(libro);
		
		
		return true;
	}
	
	public Libro buscarLibro(String nombreLibro) {
		Libro libroBuscado= null;
		boolean encontrado=false;
		int i=0;
		
		
		while(  i<this.mueble.getLibros().size()  &&  !encontrado) {
		Libro libro;
		libro=this.mueble.getLibros().get(i);
		if(libro.getTitulo().equals(nombreLibro)) {
						
			libroBuscado=libro;
			encontrado=true;
		}
		i++;
		}
		return libroBuscado;
	}
	
	public Resultado prestar(Libro libro, Lector lector) {
		Resultado resultado=null;
		
		
		if(libro==null) {resultado=Resultado.NO_EXISTE_LIBRO;}else {
			
			//recorrer ejemplares de libro y ver si hay ENBLIBLIOTECA
			boolean hayDisponible=false;
			Ejemplar ejemplarDisponible=null;
			int i=0;
			
			while(  i < libro.getEjemplares().size() && !hayDisponible) {
				
				if (libro.getEjemplares().get(i).getEstado() == Estado.EN_BIBLIOTECA) {
					hayDisponible = true;
					ejemplarDisponible=libro.getEjemplares().get(i);
					
				}
				i++;
			}
			//System.out.println("hay disponible: " + hayDisponible);
			
			
			
			//ver si lector puede prestarse
			
			boolean puedePrestarseTope;
			puedePrestarseTope= lector.puedePrestarseTope();
			
			//System.out.println("puede prestarse: " + puedePrestarseTope);
		
			
			
			
			
			//recorrer prestamos de lector y ver si hay multa
			
			boolean tieneMulta;
			tieneMulta=lector.tieneMulta();
			
			//System.out.println("tiene multa: " + tieneMulta);
			
			
			
			
			
			//prestar marcar el Ejemplar como prestado, entregándoselo al lector , y procesar y registrar el Prestamo
			
			
			
			
			
			//juntando OTRAS OPCIONES
			if(hayDisponible==false) {resultado=Resultado.NO_HAY_EJEMPLARES;}
			if(puedePrestarseTope==false) {resultado=Resultado.TOPE_PRESTAMOS_ALCANZADO;}
			if(tieneMulta== true) {resultado= Resultado.MULTA_VIGENTE;}

			
			if (hayDisponible && puedePrestarseTope && !tieneMulta) {
				prestarAhora(libro, lector,ejemplarDisponible);
				resultado= Resultado.PRESTAMO_EXITOSO;
				
				}
			
		}
		
		return resultado;
	}
	
	
	
	
	public void prestarAhora(Libro libro, Lector lector, Ejemplar ejemplar) {
		//usar solo cuando hay disponible al menos 1 ejemplar y el lector este habilitado
		//TODO fecha de hoy generar automaticamente
		Prestamo prestamo= new Prestamo("FECHA_HOY",ejemplar);
		ejemplar.setEstado(Estado.PRESTADO);
		lector.getPrestamos().add(prestamo);
		
		
	}
	
	
}
