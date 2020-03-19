package materiaPrima;

import ingrediente.Ingrediente;

public class MateriaPrima {
	
	 private String nombre;
	 private int codigo;
	 private int cantidadStock;
	 
	 
	 	 
	public MateriaPrima(String nombre, int codigo, int cantidadStock) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cantidadStock = cantidadStock;
		
	}


	public int getCantidadStock() {
		return cantidadStock;
	}


	public int getCodigo() {
		return codigo;
	}
	 
	 
	
	 
	 
}
