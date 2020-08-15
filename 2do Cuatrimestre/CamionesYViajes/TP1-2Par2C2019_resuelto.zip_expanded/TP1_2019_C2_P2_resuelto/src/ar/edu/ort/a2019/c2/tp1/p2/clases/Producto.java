package ar.edu.ort.a2019.c2.tp1.p2.clases;

public abstract class Producto implements Mostrable {

	private String codigo;
	private String nombre;
	private String descripcion;
	private String etiqueta;

	public Producto(String codigo, String nombre, String descripcion) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
	}

	private void setCodigo(String codigo) {
		if (codigo == null) {
			throw new IllegalArgumentException("El código no puede ser nulo");
		}
		this.codigo = codigo;
	}

	private void setNombre(String nombre) {
		if (nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser nulo");
		}
		this.nombre = nombre;
	}

	private void setDescripcion(String descripcion) {
		if (descripcion == null) {
			throw new IllegalArgumentException("La descripción no puede ser nulo");
		}
		this.descripcion = descripcion;
	}

	protected void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getCodigo() {
		return codigo;
	}

	protected String getNombre() {
		return nombre;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected String getEtiqueta() {
		return etiqueta;
	}

	public abstract void etiquetar();
}
