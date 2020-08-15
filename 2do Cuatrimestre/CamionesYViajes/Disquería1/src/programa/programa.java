package programa;
import catalogo.Catalogo;
import cd.Cd;
import autor.Autor;
import disqueria.Disqueria;


public class programa {

	public static void main(String[] args) {
		
		
		Disqueria disqueria = new Disqueria();
		Autor Autor0 = disqueria.getCatalogo().addAutor(0,"autorr0");
		Autor Autor1 = disqueria.getCatalogo().addAutor(1,"autorr1");
		Autor Autor2 = disqueria.getCatalogo().addAutor(2,"autorr2");
		Autor Autor3 = disqueria.getCatalogo().addAutor(3,"autorr3");
		Autor Autor4 = disqueria.getCatalogo().addAutor(4,"autorr4");
		Autor Autor5 = disqueria.getCatalogo().addAutor(5,"autorr5");
		Autor Autor6 = disqueria.getCatalogo().addAutor(6,"autorr6");
		
		disqueria.getCatalogo().addCd(0, 1, "interprete1", Autor2);
		disqueria.getCatalogo().addCd(1, 1, "interprete1", Autor2);
		disqueria.getCatalogo().addCd(2, 1, "interprete1", Autor2);
		disqueria.getCatalogo().addCd(3, 1, "interprete1", Autor1);
		disqueria.getCatalogo().addCd(4, 2, "interprete1", Autor5);
		disqueria.getCatalogo().addCd(5, 2, "interprete1", Autor5);
		disqueria.getCatalogo().addCd(6, 2, "interprete1", Autor5);
		disqueria.getCatalogo().addCd(7, 2, "interprete1", Autor3);
		disqueria.getCatalogo().addCd(8, 3, "interprete1", Autor1);
		disqueria.getCatalogo().addCd(9, 3, "interprete1", Autor3);
		disqueria.getCatalogo().addCd(10, 3, "interprete1", Autor3);
		disqueria.getCatalogo().addCd(11, 3, "interprete1", Autor3);
		disqueria.getCatalogo().addCd(12, 3, "interprete1", Autor3);
		disqueria.getCatalogo().addCd(13, 3, "interprete1", Autor1);
		
		//disqueria.autorMax();
		disqueria.sellosXCd();

	}

}
