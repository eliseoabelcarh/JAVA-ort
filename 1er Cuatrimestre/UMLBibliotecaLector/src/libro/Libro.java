package libro;
import genero.Genero;
import editorial.Editorial;
import autor.Autor;
import java.util.ArrayList;
import ejemplar.Ejemplar;

public class Libro {
	
	String titulo;
	int anio;
	Genero genero;
	Editorial editorial;
	Autor autor;
	ArrayList<Ejemplar> ejemplares;
	
	public Libro(String titulo, int anio, Genero genero, Editorial editorial, Autor autor) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.genero = genero;
		this.editorial = editorial;
		this.autor = autor;
		this.ejemplares= new ArrayList<Ejemplar>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public ArrayList<Ejemplar> getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", anio=" + anio + ", genero=" + genero + ", editorial=" + editorial
				+ ", autor=" + autor + ", ejemplares=" + ejemplares + "]";
	}
	
	

}
