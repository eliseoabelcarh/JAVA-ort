package miniRedSocial;
import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private ArrayList<Post> posts = new ArrayList<Post>();
	
	public Usuario(String nombre) {
		this.nombre=nombre;
	}
	
	public void crearPost(String tituloPost) {
		Post post = new Post(tituloPost);
		post.setUsuario(this);
		posts.add(post);
	}
	public void comentarPost(Usuario usuario, int nroPost, String descripcion) {
		
		usuario.posts.get(nroPost).addComentario(descripcion, this);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public Post getIndexPost(int i) {
		return posts.get(i);
	}
	 public void mostrarDescripcionesDePost(Usuario usuario,int nroPost) {
		 usuario.getIndexPost(nroPost).getDescripciones();
	 }
	public void mostrarPostCompleto(Usuario usuario, int nroPost) {
		System.out.println("Título del Post: "+usuario.posts.get(nroPost).getTitulo());
		System.out.println("Dueño del Post: "+ usuario.posts.get(nroPost).getUsuario().getNombre());
		mostrarDescripcionesDePost(usuario,nroPost);
	}
}
