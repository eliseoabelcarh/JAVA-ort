package ar.edu.ort.a2019.c2.tp1.p2.clases;

public abstract class Producto implements Mostrable{


	private static final String MSG_LA_DESCRIPCIÓN_NO_PUEDE_SER_NULO = "La descripción no puede ser nulo";
	private static final String MSG_EL_CODIGO_NO_PUEDE_SER_NULO = "El código no puede ser nulo";
	private static final String MSG_EL_NOMBRE_NO_PUEDE_SER_NULO = "El nombre no puede ser nulo";

	//ESTABA TODO VACIO
	
	private String codigo;
	private String nombre;
	private String descripcion;
	protected String etiqueta;
	private TipoProducto tipo;
	
	
	
	public Producto(String codigo, String nombre, String descripcion) throws IllegalArgumentException{
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
	}


	/**
	 * A medida que se ingresan los productos 
	 * en el depósito se los debe etiquetar
	 * Cada tipo de producto
	 * posee la responsabilidad de que etiqueta colocar
	 */
	public abstract void etiquetar();



	protected TipoProducto getTipo() {
		return tipo;
	}


	protected void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}


	public String getCodigo() {
		return codigo;
	}



	private void setCodigo(String codigo) throws IllegalArgumentException {
		if(codigo == null) {
			throw new IllegalArgumentException(MSG_EL_CODIGO_NO_PUEDE_SER_NULO);
		}
		else {
			this.codigo = codigo;
		}
	}



	protected String getNombre() {
		return nombre;
	}



	private void setNombre(String nombre) throws IllegalArgumentException{
		if(nombre == null) {
			throw new IllegalArgumentException(MSG_EL_NOMBRE_NO_PUEDE_SER_NULO);
		}
		else {
			this.nombre = nombre;
		}
		
	}



	protected String getDescripcion() {
		return descripcion;
	}



	private void setDescripcion(String descripcion) {
		if(descripcion == null) {
			throw new IllegalArgumentException(MSG_LA_DESCRIPCIÓN_NO_PUEDE_SER_NULO);
		}else {
			this.descripcion = descripcion;
		}
	}



	protected String getEtiqueta() {
		return etiqueta;
	}



	protected void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	public void mostrar() {
		System.out.println(toString());
	}

	
	
}
