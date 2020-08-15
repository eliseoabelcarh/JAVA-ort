package disqueria;
import catalogo.Catalogo;
import cd.Cd;
import autor.Autor;

public class Disqueria {
	
	private Catalogo catalogo;
	
	public Disqueria(){
		this.catalogo = new Catalogo();
	}

	public Catalogo getCatalogo(){
		return this.catalogo;
	}
	
	
	public void sellosXCd() {
		Cd[] vecCds;
		int pos = -1;
		int[] vecCont = new int[10];
		
		vecCds = this.getCatalogo().getCds();
		
		for(int i = 0; i < vecCds.length ; i++) {
			
			if(vecCds[i] != null) {
				pos = vecCds[i].getSello();
				vecCont[pos-1]++;
			}
			
		}
		for(int j = 0; j < vecCont.length ; j++) {
			System.out.println("sello nro " + (j+1) + " hay " + vecCont[j] + " cds");
		}
		
		
	}
	
	public void autorMax() {
		
		Cd[] vecCds;
		int nroSello = -1;
		int indexAutor = -1;
		
		int[][] vector = new int[10][30];
		
		
		vecCds = this.getCatalogo().getCds();
		
		for(int i = 0; i < vecCds.length ; i++) {
			
			if(vecCds[i] !=null) {
				
				nroSello = vecCds[i].getSello();
				indexAutor = this.getCatalogo().getIndexAutor(vecCds[i].getAutor());
				
				if(indexAutor != -1) {
					vector[(nroSello - 1)][indexAutor]++;
				}
			}
			
		}
		
				
		for(int i = 0; i< vector.length; i++) {
			
			int maxValue = 0;
			Autor maxAutor = new Autor("");
			
			for(int j = 0; j < vector[i].length; j++) {
				
						
				if( vector[i][j] > maxValue ) {
					maxValue = vector[i][j];
					maxAutor = this.catalogo.getAutorByIndex(j);
				}
				
			
	
			}
			
			System.out.println("para sello " + (i+1) + " el autor con más cds es " + maxAutor.getName() + " con " + maxValue + " cds");
		}
	}
	
	
	
	
	
}
