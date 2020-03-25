package testEj2;

import vehiculo.Vehiculo;

public class TestEj2 {
	
	private final int CANTIDAD_MAX_DE_VEHICULOS = 20;
	private Vehiculo[] vehiculos;
	
	public TestEj2() {
			vehiculos = new Vehiculo[CANTIDAD_MAX_DE_VEHICULOS];
	}
	
	public void agregarVehiculo(String patente, int tipo, float precio) {
		if(esTipoValido(tipo) ) {
			Vehiculo vehiculo = new Vehiculo(patente,tipo,precio);
			boolean agregadoExitosamente = addVehiculoAVector(vehiculo, this.vehiculos);
			if(agregadoExitosamente) {
				System.out.println("vehiculo agregado exitosamente");
			}else {System.out.println("vehiculo no aregado");}
		}else {System.out.println("no es tipo válido");}
	}
	private boolean esTipoValido(int tipo) {
		boolean  esValido = false;
		final int[] VECTOR_DE_TIPOS_VALIDOS = {1,2,3};
		if(existeElementoEnVector(tipo, VECTOR_DE_TIPOS_VALIDOS)) {
			esValido = true;
		}
		return esValido;
	}
	private boolean existeElementoEnVector(int nro , int[] vector) {
		boolean existe =  false;
		int i = 0;
		if(vector != null) {
			while(!existe && i < vector.length) {
				if(vector[i] == nro) {
					existe = true;
				}
				i++;
			}	
		}
		return existe;
	}
	public Vehiculo buscarVehiculoPorPatente(String patente) {
		Vehiculo vehiculoBuscado = null;
		Vehiculo[] vector = this.vehiculos;
		if(vehiculos != null) {
			int i = 0;
			boolean encontrado = false;
			while(!encontrado && i < vector.length){
				if(vector[i].getPatente() == patente) {
					vehiculoBuscado = vector[i];
					encontrado = true;
				}
				i++;
			}
		}
		return vehiculoBuscado;
	}
	private int buscarEspacioVacioEnArrayVehiculos(Vehiculo[] vector) {
		int indexVacio = -1;
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < vector.length){
			if(vector[i] == null) {
				indexVacio = i;
				encontrado = true;
			}
			i++;
		}
		return  indexVacio;
	}
	private boolean addVehiculoAVector(Vehiculo vehiculo, Vehiculo[] vector) {
		boolean resultado = false;
		if(vehiculo != null && vector != null) {
			int indexVacio = buscarEspacioVacioEnArrayVehiculos(vector);
			if(indexVacio != -1) {
				vector[indexVacio] = vehiculo;
				resultado = true;
			}
		}
		return resultado;
	}
	
	private float devolverIVA(float precio) {
		float IVA = 0.16f;
		final float PRECIO_CONTROL = 100000;
		if(precio > PRECIO_CONTROL) {
			IVA = 0.2f;
		}
		return IVA;
	}
	private boolean aplicaDscto50Porciento(int tipo, float precio){
		boolean aplica = false;
		final int TIPO_A_QUIEN_APLICA_DSCTO = 1;
		final float VALOR_PARA_DSCTO = 50000;
		if(tipo == TIPO_A_QUIEN_APLICA_DSCTO && precio < VALOR_PARA_DSCTO) {
			aplica = true;
		}
		return aplica;
	}
	private boolean aplicaSobreCosto(int tipo, float precio) {
		boolean aplica = false;
		final int[] TIPOS_PARA_QUIENES_APLICA_SOBRECOSTO = {2,3};
		final int PRECIO_APLICA_SOBRECOSTO = 80000;
		if(existeElementoEnVector(tipo, TIPOS_PARA_QUIENES_APLICA_SOBRECOSTO)) {
			if(precio > PRECIO_APLICA_SOBRECOSTO) {
				aplica = true;
			}
		}
		return aplica;
	} 
	private boolean aplicaDsctoAdicional(float precioFinal) {
		boolean aplica= false;
		final float PRECIO_APLICA_DSCTO = 80000;
		if(precioFinal < PRECIO_APLICA_DSCTO) {
			aplica = true;
		}
		return aplica;
	}
	private float calcularImpuesto1(int tipo, float precio) {
		float impuestos = 0;
		float IVA = devolverIVA(precio);
		System.out.println("IVA q corresponde: "+ IVA);
		boolean aplicaDscto50Porciento = aplicaDscto50Porciento(tipo, precio);
		System.out.println("aplicaDscto50%: "+aplicaDscto50Porciento);
		boolean aplicaSobreCosto = aplicaSobreCosto(tipo, precio);
		System.out.println("aplica sobreCosto: "+aplicaSobreCosto);
		if(aplicaDscto50Porciento) {
			impuestos+= (-(IVA*0.5));
		}
		if(aplicaSobreCosto){
			impuestos += (precio*0.05);
		}
		return impuestos;
	}
	private float calcularPrecioFinal(int tipo, float precio) {
		float precioFinal = precio;
		precioFinal += calcularImpuesto1(tipo, precioFinal);
		System.out.println("aplica dsctoAdicional: "+aplicaDsctoAdicional(precioFinal));
		if(aplicaDsctoAdicional(precioFinal)) {
			precioFinal += (- (precio*0.05));
		}
		return precioFinal;
	}
	public void informarPrecioConImpuestos(String patente) {
		Vehiculo vehiculo = buscarVehiculoPorPatente(patente);
		if(vehiculo != null) {
			int tipo = vehiculo.getTipo();
			float precio = vehiculo.getPrecio();
			float precioFinal = calcularPrecioFinal(tipo, precio);
			System.out.println("para vehiculo con patente " + patente + " el precio con impuestos es "+ precioFinal);
		}
	}
	
	
}

