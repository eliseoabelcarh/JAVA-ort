package catalogo;
import cd.Cd;
import autor.Autor;

public class Catalogo {
	
	private Cd[] cds;
	private Autor[] autores; 


	public Catalogo(){
		this.cds = new Cd[100];
		this.autores = new Autor[30];
	}

	public Cd[] getCds() {
		return this.cds;
	}
	
	public void addCd(int index, int sello, String interprete, Autor autor) {
		this.cds[index] = new Cd(sello, interprete, autor);
	}
	
	public Autor addAutor(int index , String name) {
		this.autores[index] = new Autor(name);
		return this.autores[index];
	}
	
	
	public int getIndexAutor(Autor autor) {
		int index = -1;
		int i = 0;
		boolean autorEncontrado = false;
		while(!autorEncontrado && i < this.autores.length) {
			
			if(this.autores[i] != null) {
				if(this.autores[i] == autor ) {
					autorEncontrado = true;
					index = i;
				}
				
			}
			
			
			i++;
		}
		
		return index;
	}
	
	public Autor getAutorByIndex(int index) {
		
		return this.autores[index];
	
	}
	
}
