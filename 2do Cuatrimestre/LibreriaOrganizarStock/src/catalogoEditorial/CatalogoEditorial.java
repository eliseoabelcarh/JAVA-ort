package catalogoEditorial;

import editorial.Editorial;
import libro.Libro;

public class CatalogoEditorial {
	
	private Libro[] libros;
	private Editorial editorial;

	public CatalogoEditorial(Editorial editorial, Libro[] libros) {
		this.editorial = editorial;
		this.libros = libros;
	}

	public Libro[] getLibros() {
		return this.libros;
	}
	
	public Editorial getEditorial() {
		return this.editorial;
	}

}
