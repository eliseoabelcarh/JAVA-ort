package catalogo;

import autor.Autor;
import cd.Cd;

	public class Catalogo {
		
		private Autor[] autores;
		private Cd[] cds;
		private static final int  CANTIDAD_MAXIMA_DE_SELLOS = 10;
		private static final int CANTIDAD_MAXIMA_DE_AUTORES = 30;
		private static final int CANTIDAD_MAXIMA_DE_CDS = 100;
		
		public Catalogo() {
			this.autores = new Autor[CANTIDAD_MAXIMA_DE_AUTORES];
			this.cds = new Cd[CANTIDAD_MAXIMA_DE_CDS];
		}

		public Autor[] getAutores() {
			return autores;
		}

		public Cd[] getCds() {
			return cds;
		}
		
		public Cd addCd(int sello, Autor autor) {
			Cd cdNuevo = null;
			if(sello != - 1 && sello <= CANTIDAD_MAXIMA_DE_SELLOS && autor != null) {
				registrarAutor(autor);
				cdNuevo  = new Cd(sello, autor);
				int index = buscarEspacioNullEnArrayCds();
				if(index != -1){
					this.cds[index] = cdNuevo;
				}else {System.out.println("no hay espacio libre para agregar");}
			}			
			return cdNuevo;
		}
		
		public void registrarAutor(Autor autor) {
			int indexVacio = buscarEspacioNullEnArrayAutores();
			if(indexVacio != -1) {
				this.autores[indexVacio] = autor;
			}else{System.out.println("no se pudo registrar autor");}
		}
		

		public int buscarEspacioNullEnArrayCds() {
			int index = -1;
			boolean encontrado = false;
			int i = 0;
			while ( !encontrado && i < this.cds.length) {
				if(this.cds[i] == null) {
					index = i;
					encontrado = true;
				}
				i++;
			}
			return index;
		}
		
		public int buscarEspacioNullEnArrayAutores() {
			int index = -1;
			boolean encontrado = false;
			int i = 0;
			while ( !encontrado && i < this.autores.length) {
				if(this.autores[i] == null) {
					index = i;
					encontrado = true;
				}
				i++;
			}
			return index;
		}
		public void sellosXCD() {
			String mensaje= "no hay datos";
			int[]vector = new int[CANTIDAD_MAXIMA_DE_SELLOS];
			
			if(this.cds != null) {
				for (int i = 0; i < this.cds.length; i++) {
					if(this.cds[i] != null){
						Cd cd = cds[i];
						int sello = cd.getSello();
						int indexSello = devolverIndexSello(sello);
						if(indexSello != -1){
								vector[indexSello]++;
							}
					}
				}
				for (int i = 0; i < vector.length; i++) {
					int sello = devolverSello(i);
					if(sello != -1) {
						int cantidadDeCds = vector[i];
						mensaje = "el sello "+ sello + " tiene " + cantidadDeCds + " cds";
						System.out.println(mensaje);
					}
				}
			}
		}

		public int devolverIndexSello(int sello) {
			int index = -1;
			if(sello != -1 && sello <= CANTIDAD_MAXIMA_DE_SELLOS) {
				index = sello-1;
			}
			return index;
		}
		public int devolverIndexAutor(Autor autor) {
			int index = -1;
			if(autor != null) {
				int i = 0;
				boolean encontrado = false;
				while(!encontrado && i < this.autores.length) {
					if(this.autores[i] == autor) {
						index = i;
						encontrado = true;
					}
					i++;
				}
			}
			return index;
		}
		
		
		public int devolverSello(int index) {
			int sello = -1;
			if(index != - 1 && index < CANTIDAD_MAXIMA_DE_SELLOS) {
				sello = index + 1;
			}
			return sello;
		}
		
		public Autor devolverAutor(int index) {
			Autor autor = null;
			if(this.autores != null && index != -1 && index < CANTIDAD_MAXIMA_DE_AUTORES) {
					autor = this.autores[index];
			}
			return autor;
		}
		
		public void autorMax () {
			int [][] vector = new int[CANTIDAD_MAXIMA_DE_SELLOS][CANTIDAD_MAXIMA_DE_AUTORES];
			if(this.cds != null) {
				for (int i = 0; i < this.cds.length; i++) {
					if(this.cds[i] != null) {
						int sello = cds[i].getSello();
						Autor autor = cds[i].getAutor();
						if(sello != -1 && sello <= CANTIDAD_MAXIMA_DE_SELLOS && autor != null) {
							int indexSello = devolverIndexSello(sello);
							int indexAutor = devolverIndexAutor(autor);
							if(indexSello != -1 && indexAutor != -1) {
								vector[indexSello][indexAutor]++;
							}
						}
					}
				}
				
				for (int i = 0; i < vector.length; i++) {
					if(vector[i] != null) {
						int maxValue = 0;
						int indexAutorMax = -1 ;
						for (int j = 0; j < vector[i].length; j++) {	
							if(vector[i][j] > maxValue) {
								maxValue = vector[i][j];
								indexAutorMax = j;
							}
						}
						int sello = devolverSello(i);
						Autor autorMax = devolverAutor(indexAutorMax);
						if(sello != -1 && autorMax != null) {
							System.out.println("para sello " + sello + ":");
							System.out.println("autorMax es " + autorMax.getNombre() + " con " + maxValue + " cds.");
						}
					}
				}
			}
		}
		

 }