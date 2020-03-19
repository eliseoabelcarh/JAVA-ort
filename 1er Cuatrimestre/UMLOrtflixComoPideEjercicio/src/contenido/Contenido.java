package contenido;
import serie.Serie;
import pelicula.Pelicula;
import java.util.ArrayList;

public class Contenido {
	
	ArrayList<Pelicula> peliculas;
	ArrayList<Serie> series;
	
	
	public Pelicula buscarPelicula(String nombrePelicula){

		Pelicula pelicula= null;
		
		boolean encontrado=false;
		int i=0;
		
		while(i < peliculas.size() && !encontrado) {
			if(peliculas.get(i).getNombre().equals(nombrePelicula)) {
				encontrado=true;
				pelicula=peliculas.get(i);
			}
		}
		
		return pelicula;
	}
	
}
