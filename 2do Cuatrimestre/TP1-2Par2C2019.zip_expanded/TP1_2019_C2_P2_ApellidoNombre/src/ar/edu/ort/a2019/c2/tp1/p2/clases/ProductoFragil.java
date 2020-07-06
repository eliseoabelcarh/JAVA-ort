package ar.edu.ort.a2019.c2.tp1.p2.clases;

public class ProductoFragil extends Producto{
	
	private static final String ETIQUETA = "Producto Frágil trátese con cuidado";

	
	public ProductoFragil(String codigo, String nombre, String descripcion) {
		super(codigo, nombre, descripcion);
		etiquetar();
	}

	
	
	@Override
	public void etiquetar() {
		setEtiqueta(ETIQUETA);
		setTipo(TipoProducto.FRAGIL);
	}
	
	@Override
	public String toString() {
		return "ProductoFrágil [Código=" + getCodigo() + ", Nombre=" + getNombre() + ", Descripcion()="
				+ getDescripcion() + ", Etiqueta()=" + getEtiqueta() + "]";
	}

	
	
}
