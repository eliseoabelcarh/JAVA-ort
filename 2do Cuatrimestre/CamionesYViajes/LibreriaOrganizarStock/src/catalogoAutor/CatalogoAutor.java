package catalogoAutor;
import libro.Libro;
import autor.Autor;

public class CatalogoAutor {
	
		private Libro[] libros;
		private Autor autor;
	
	public CatalogoAutor(Autor autor, Libro[] libros) {
		this.autor = autor;
		this.libros = libros;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public Autor getAutor() {
		return autor;
	}

}
