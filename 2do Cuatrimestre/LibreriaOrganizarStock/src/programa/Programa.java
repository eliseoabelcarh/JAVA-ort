package programa;
import libreria.Libreria;
import editorial.Editorial;
import autor.Autor;


public class Programa {

	public static void main(String[] args) {

		
		Libreria libreria =  new Libreria();
		
		Editorial editorial1 = libreria.registrarEditorial("razonSocial1");
		Editorial editorial2 = libreria.registrarEditorial("razonSocial2");
		Editorial editorial3 = libreria.registrarEditorial("razonSocial3");
		Editorial editorial4 = libreria.registrarEditorial("razonSocial4");
		
				
		Autor autor1 = libreria.registrarAutor("autor1");
		Autor autor2 = libreria.registrarAutor("autor2");
		Autor autor3 = libreria.registrarAutor("autor3");
		Autor autor4 = libreria.registrarAutor("autor4");
		
		
		libreria.registrarLibro("tituloLibro1", editorial1, autor1);
		libreria.registrarLibro("tituloLibro2", editorial1, autor1);
		libreria.registrarLibro("tituloLibro3", editorial2, autor1);
		libreria.registrarLibro("tituloLibro4", editorial3, autor2);
		libreria.registrarLibro("tituloLibro5", editorial3, autor2);
		libreria.registrarLibro("tituloLibro6", editorial3, autor3);
		libreria.registrarLibro("tituloLibro7", editorial4, autor4);
		
		System.out.println("CATÁLOGO POR AUTOR");
		libreria.generarCatalogoPorAutor();
		libreria.mostrarCatalogosPorAutor();
		
		System.out.println("");
		
		System.out.println("CATÁLOGO POR EDITORIAL");
		libreria.generarCatalogoPorEditorial();
		libreria.mostrarCatalogoPorEditorial();
		
		
		
		
		
		
		
		
	}

}
