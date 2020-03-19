package libro;
import editorial.Editorial;
import autor.Autor;


public class Libro {
	
	private String codigo;
	private String titulo;
	private String genero;
	private Integer precio;
	private Integer anio;
	private Integer cantidadStock;
	private Editorial editorial;
	private Autor autor;
	
	public Libro(String titulo, Editorial editorial, Autor autor) {
		this.codigo = "";
		this.titulo = titulo;
		this.genero = "";
		this.precio = new Integer (10);
		this.anio =  new Integer(1990);
		this.cantidadStock = new Integer(10);
		this.editorial = editorial;
		this.autor = autor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", titulo=" + titulo + ", genero=" + genero + ", precio=" + precio
				+ ", anio=" + anio + ", cantidadStock=" + cantidadStock + ", editorial=" + editorial + ", autor="
				+ autor + "]";
	}
	
	
	
}
