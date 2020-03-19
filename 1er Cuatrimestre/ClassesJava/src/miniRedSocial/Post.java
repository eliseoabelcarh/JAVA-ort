package miniRedSocial;
import java.util.ArrayList;

public class Post {
	private Usuario usuario;
	private String titulo;
	private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Post(String titulo) {
		this.titulo=titulo;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	}
	public void addComentario(String descripcion, Usuario autor) {
		Comentario comentario= new Comentario();
		comentario.setDescripcion(descripcion);
		comentario.setPost(this);
		comentario.setAutor(autor);
		comentarios.add(comentario);
		
	}
	
	public void getDescripciones() {
		for(int i=0; i<comentarios.size();i++) {
			System.out.println(comentarios.get(i).getDescripcion() +" - autor: "+ comentarios.get(i).getAutor().getNombre());
		}
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Usuario getUsuario() {
		return usuario;
	}


	
}
