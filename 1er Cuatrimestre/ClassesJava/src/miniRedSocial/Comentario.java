package miniRedSocial;
public class Comentario {
	
	private Post post;
	private String descripcion;
	private Usuario autor;
	
	public void setDescripcion(String descripcion) {
		this.descripcion= descripcion;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	

}
