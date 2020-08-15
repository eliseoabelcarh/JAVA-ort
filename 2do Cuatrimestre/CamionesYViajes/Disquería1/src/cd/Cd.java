package cd;
import autor.Autor;
import tema.Tema;

public class Cd {
	
	private int sello;
	private String interprete;
	private Tema[] temas;
	private Autor autor;
	
	public Cd (int sello, String interprete, Autor autor) {
		this.sello =  sello;
		this.interprete =  interprete;
		this.temas = new Tema[20];
		this.autor = autor;
	}
	
	public int getSello() {
		return this.sello;
	}
	
	
	
	public Autor getAutor() {
		
		return this.autor;
	}
	
	

}
