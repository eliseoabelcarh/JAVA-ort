package programa;

import autor.Autor;
import disqueria.Disqueria;

public class Programa {

	public static void main(String[] args) {

		Disqueria disqueria =  new Disqueria();
		
		Autor autor1 = new Autor("autor1");
		Autor autor2 = new Autor("autor2");
		Autor autor3 = new Autor("autor3");
		Autor autor4 = new Autor("autor4");
		
		disqueria.addCdACatalogo(1, autor1);
		disqueria.addCdACatalogo(2, autor1);
		disqueria.addCdACatalogo(3, autor2);
		disqueria.addCdACatalogo(3, autor2);
		disqueria.addCdACatalogo(3, autor2);
		disqueria.addCdACatalogo(3, autor4);
		
		disqueria.mostrarSellosXCD();
		disqueria.mostrarAutorMax();
		
	}

}
