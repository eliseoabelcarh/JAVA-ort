package libro;
import editorial.Editorial;
import autor.Autor;

public class Libro {
	
	String id;
	String titulo;
	String genero;
	String estado;
	int anio;
	Editorial editorial;
	Autor autor;
	
	public Libro(String id, String titulo, String genero, int anio, Editorial editorial, Autor autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.anio = anio;
		this.editorial = editorial;
		this.autor = autor;
		this.estado="en biblioteca";
		}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", estado=" + estado + ", anio=" + anio
				+ ", editorial=" + editorial + ", autor=" + autor + "]";
	}

	public String getId() {
		return id;
	}
	
	
	
}
