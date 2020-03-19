package miniRedSocial;
public class Principal {

	public static void main(String[] args) {
		
		
		
		Usuario usuario1 = new Usuario("jose");
		Usuario usuario2 = new Usuario("carlos");
		Usuario usuario3 = new Usuario("elena");

		usuario1.crearPost("titulopost1");
		
		usuario1.comentarPost(usuario1, 0, "comentario111111");
		usuario2.comentarPost(usuario1, 0, "comentario222222");
		usuario3.comentarPost(usuario1, 0, "comentario333333");
		
		
		usuario2.crearPost("titulopost2");
		
		usuario3.comentarPost(usuario2, 0, "comentarioxxx1");
		usuario2.comentarPost(usuario2, 0, "comentarioxxx2");
		usuario1.comentarPost(usuario2, 0, "comentarioxxx3");
		
		usuario2.mostrarPostCompleto(usuario1, 0);
		System.out.println(" ");
		usuario1.mostrarPostCompleto(usuario2, 0);
		
		

	}

	
	
	
	
}
