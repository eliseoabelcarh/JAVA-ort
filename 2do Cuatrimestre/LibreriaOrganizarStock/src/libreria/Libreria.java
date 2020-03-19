package libreria;
import libro.Libro;
import autor.Autor;
import editorial.Editorial;
import catalogoAutor.CatalogoAutor;
import catalogoEditorial.CatalogoEditorial;


public class Libreria {
	
	private Libro[] libros;
	private Editorial[] editoriales;
	private Autor[] autores;
	private CatalogoAutor[] arrayDeCatalogosAutor;
	private CatalogoEditorial[] arrayDeCatalogosEditorial;
	
	
	public Libreria() {
		
		this.libros = new Libro[10];
		this.editoriales = new Editorial[5];
		this.autores = new Autor[5];
		this.arrayDeCatalogosAutor = new CatalogoAutor[10];
		this.arrayDeCatalogosEditorial = new CatalogoEditorial[10];
	}
	
	public Libro registrarLibro(String titulo, Editorial editorial, Autor autor) {
		Libro libro = null;
		int i = this.buscarEspacioNullLibro(this.libros);
		if(i != -1) {
			libro = new Libro(titulo, editorial, autor);
			this.libros[i] = libro;
		}
		return libro;
	}
	
	public Editorial registrarEditorial(String razonSocial) {
		Editorial editorial = null;
		int i = this.buscarEspacioNullEdit(this.editoriales);
		if(i != -1) {
			editorial = new Editorial(razonSocial);
			this.editoriales[i] = editorial;
		}
		return editorial;
	}
	
	
	public Autor registrarAutor(String nombre) {
		Autor autorNuevo = null;
		int i  = this.buscarEspacioNullAutor(this.autores);
		if(i != -1) {
			autorNuevo = new Autor(nombre);
			this.autores[i] = autorNuevo;
		}
		
		return autorNuevo;
	}
	
	public Autor devolverAutor(int index) {		
		return this.autores[index];
	}
	
	public Editorial devolverEditorial(int index) {		
		return this.editoriales[index];
	}

	public int convertirAutorEnIndex(Autor autor) {
		int index = -1;
		if(autor != null) {
			int i = 0;
			boolean encontrado = false;
			while(!encontrado && i < this.autores.length ) {
				if(this.autores[i] == autor) {
					index = i;
					encontrado =  true;
				}
			i++;	
			}
		}
		
		return index;
	}
	

	public int convertirEditorialEnIndex(Editorial editorial) {
		int index = -1;
		if(editorial != null) {
			int i = 0;
			boolean encontrado = false;
			while(!encontrado && i < this.editoriales.length ) {
				if(this.editoriales[i] == editorial) {
					index = i;
					encontrado =  true;
				}
			i++;	
			}
		}
		
		return index;
	}
	
	public int buscarEspacioNullLibro(Libro[] vector) {
		int index = -1;
		
		if(vector != null) {
			boolean nullEncontrado = false;
			int i =0;
			while(!nullEncontrado && i < vector.length) {
				if(vector[i] == null) {
					index = i;
					nullEncontrado = true;
				}
				i++;
			}
		}
		
		return index;
	}
	
	
	public int buscarEspacioNullAutor(Autor[] vector) {
		int index = -1;
		
		if(vector != null) {
			boolean nullEncontrado = false;
			int i =0;
			while(!nullEncontrado && i < vector.length) {
				if(vector[i] == null) {
					index = i;
					nullEncontrado = true;
				}
				i++;
			}
		}
		
		return index;
	}
	
	public int buscarEspacioNullEdit(Editorial[] vector) {
		int index = -1;
		
		if(vector != null) {
			boolean nullEncontrado = false;
			int i =0;
			while(!nullEncontrado && i < vector.length) {
				if(vector[i] == null) {
					index = i;
					nullEncontrado = true;
				}
				i++;
			}
		}
		
		return index;
	}
	
	
	public int buscarEspacioNullCat(CatalogoAutor[] vector) {
		int index = -1;
		
		if(vector != null) {
			boolean nullEncontrado = false;
			int i =0;
			while(!nullEncontrado && i < vector.length) {
				if(vector[i] == null) {
					index = i;
					nullEncontrado = true;
				}
				i++;
			}
		}
		
		return index;
	}
	
	
	public int buscarEspacioNullCatEdit(CatalogoEditorial[] vector) {
		int index = -1;
		
		if(vector != null) {
			boolean nullEncontrado = false;
			int i =0;
			while(!nullEncontrado && i < vector.length) {
				if(vector[i] == null) {
					index = i;
					nullEncontrado = true;
				}
				i++;
			}
		}
		
		return index;
	}
	
	
	public void generarCatalogoPorAutor() {
		
		Libro[][] autoresYSusLibros = new Libro[5][5];
		Autor autor;
		int index;
		int j;
		
		for(Libro libro: this.libros) {
			if(libro != null) {
				autor = libro.getAutor();
				index = this.convertirAutorEnIndex(autor);
				j = this.buscarEspacioNullLibro(autoresYSusLibros[index]);
				if(autor != null && index != -1) {
					autoresYSusLibros[index][j] = libro;
				}
			}
		}
		
		for(int i = 0; i < autoresYSusLibros.length ;i++) {
			autor = this.devolverAutor(i);
			Libro[] librosDelAutor = autoresYSusLibros[i];
			CatalogoAutor catalogoNuevo = new CatalogoAutor(autor, librosDelAutor);
			int x;
			x = this.buscarEspacioNullCat(this.arrayDeCatalogosAutor);
			if(x != -1) {
				this.arrayDeCatalogosAutor[x] = catalogoNuevo;
			}
			
			
			
		}
		
		
	}
	
	public void mostrarCatalogosPorAutor() {
				
		CatalogoAutor catalogo;
		Autor autor;
		for(int i = 0; i < this.arrayDeCatalogosAutor.length ; i++) {
			catalogo = this.arrayDeCatalogosAutor[i];
			if(catalogo != null) {
				autor = catalogo.getAutor();
				if(autor != null) {
					System.out.println("para el autor " + autor.getNombre() + " :");
					Libro[] arrayLibros;
					arrayLibros = catalogo.getLibros();
					String libros = "";
					for(Libro libro : arrayLibros) {
						if(libro != null) {
							libros += libro.getTitulo() + " ";
						}
					}
					System.out.println(libros);
				}
			}
		}
	}
	
	
	public void generarCatalogoPorEditorial() {
		Libro[][] editorialYSusLibros = new Libro[5][5];
		for(int i = 0; i < this.libros.length;i++) {
			Libro libro = this.libros[i];
			if(libro != null) {
				Editorial editorial = libro.getEditorial();
				int index = this.convertirEditorialEnIndex(editorial);
				int j = buscarEspacioNullLibro(editorialYSusLibros[index]);
				if(j != -1 && index != -1 && editorial != null) {
					editorialYSusLibros[index][j] = libro;
				}
			}
		}
		for(int i = 0; i < editorialYSusLibros.length; i++)
		{
			Editorial editorial = this.devolverEditorial(i);
			if(editorial != null)
			{
				Libro[] libros = editorialYSusLibros[i];
				if(libros != null)
				{
					CatalogoEditorial catalogoNuevo = new CatalogoEditorial(editorial, libros);
					int x = buscarEspacioNullCatEdit(this.arrayDeCatalogosEditorial);
					if(x != -1)
					{
						this.arrayDeCatalogosEditorial[x] = catalogoNuevo;
					}
					
				}
			}
		}
	}
	
	public void mostrarCatalogoPorEditorial() {
		for(int i = 0; i < this.arrayDeCatalogosEditorial.length ; i++) {
			CatalogoEditorial catalogo = this.arrayDeCatalogosEditorial[i];
			if(catalogo != null) {
				Editorial editorial =  catalogo.getEditorial();
				Libro[] libros = catalogo.getLibros();
				if(editorial != null && libros != null) {
					System.out.println("para editorial " + editorial.getFicha().getRazonSocial() + " : ");
					for(int j = 0;j < libros.length ; j++) {
						Libro libro = libros[j];
						if(libro != null) {
							System.out.println((j+1) + ".- " + libro.getTitulo());
						}
					}
				}
			}
		}
	}
	
	

}
