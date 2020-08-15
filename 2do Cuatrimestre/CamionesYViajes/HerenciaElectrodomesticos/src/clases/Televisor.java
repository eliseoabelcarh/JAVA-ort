package clases;

public class Televisor extends Producto {
	
	private int dimension;
	private Tipo tipo;

		public Televisor(Nombre nombre, Marca marca, String modelo, String nroSerie, float voltaje, Estado estado,
			float precio, int dimension, Tipo tipo) {
		super(nombre, marca, modelo, nroSerie, voltaje, estado, precio);
		setDimension(dimension);
		setTipo(tipo);
	}

		private int getDimension() {
			return dimension;
		}

		private void setDimension(int dimension) {
			this.dimension = dimension;
		}

		private Tipo getTipo() {
			return tipo;
		}

		private void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return super.toString() + "pulgadas= " + getDimension() + ", tipo= " + getTipo() + " ";
		}

		
		
		
	
}
