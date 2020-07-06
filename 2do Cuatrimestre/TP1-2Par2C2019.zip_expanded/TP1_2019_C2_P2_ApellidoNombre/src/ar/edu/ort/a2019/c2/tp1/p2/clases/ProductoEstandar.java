package ar.edu.ort.a2019.c2.tp1.p2.clases;

public class ProductoEstandar extends Producto {

	private static final String ETIQUETA = "Producto Estandar";
	
	
	public ProductoEstandar(String codigo, String nombre, String descripcion) {
		super(codigo, nombre, descripcion);
		etiquetar();
	}

	
	@Override
	public void etiquetar() {
		setEtiqueta(ETIQUETA);
		setTipo(TipoProducto.ESTANDAR);
	}

	@Override
	public String toString() {
		return "ProductoEstandar [Código=" + getCodigo() + ", Nombre=" + getNombre() + ", Descripcion()="
				+ getDescripcion() + ", Etiqueta()=" + getEtiqueta() + "]";
	}




}
