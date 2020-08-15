package ar.edu.ort.a2019.c2.tp1.p2.clases;

public class ProductoEstandar extends Producto {

	public ProductoEstandar(String codigo, String nombre, String descripcion) {
		super(codigo, nombre, descripcion);
	}

	@Override
	public void etiquetar() {
		this.setEtiqueta("Producto Estandar");

	}

	@Override
	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Producto Estándar [Codigo:" + getCodigo() + ", Nombre:" + getNombre() + ", Descripcion:"
				+ getDescripcion() + ", Etiqueta:" + getEtiqueta() + "]";
	}

}
