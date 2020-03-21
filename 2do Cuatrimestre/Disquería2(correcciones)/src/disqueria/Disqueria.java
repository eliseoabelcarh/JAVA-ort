package disqueria;
import autor.Autor;
import catalogo.Catalogo;
import cd.Cd;

public class Disqueria {
	
	private Catalogo catalogo;
	
	public Disqueria() {
		this.catalogo = new Catalogo();

	}
	
	public void mostrarSellosXCD() {
		this.catalogo.sellosXCD();
	}

	public void mostrarAutorMax() {
		this.catalogo.autorMax();
	}
	public Cd addCdACatalogo(int sello, Autor autor) {
			Cd cdNuevo = this.catalogo.addCd(sello, autor);
			return cdNuevo;
	}
	
	
}
