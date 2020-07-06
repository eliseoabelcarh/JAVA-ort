package ar.edu.ort.a2019.c2.tp1.p2.clases;

import java.util.ArrayList;

import ar.edu.ort.a2019.c2.tp1.p2.tad.Pila;
import ar.edu.ort.a2019.c2.tp1.p2.tad.implementaciones.arraylist.PilaAL;

public class SistemaLogistica implements Mostrable {

	/**
	 * Mensajes de validaci�n
	 */
	private static final String MSG_EL_CODIGO_NO_PUEDE_SER_NULO = "El c�digo no puede ser nulo";
	private static final String MSG_TIPO_DE_PRODUCTO_INV�LIDO = "Tipo de producto inv�lido";
	private static final String MSG_EL_PRODUCTO_NO_PUEDE_SER_NULO = "El producto no puede ser nulo";
	private static final String MSG_TAMANIO_DE_DEPOSITO_FRAGIL_INVALIDO = "Tama�o de dep�sito fr�gil inv�lido";
	private static final String MSG_TAMANIO_DE_DEPOSITO_ESTANDAR_INVALIDO = "Tama�o de dep�sito estandar inv�lido";


	private Pila<Producto> productosEstandar;
	private Pila<Producto> productosFragiles;
	private ArrayList<Producto> productosRetirados;
	private int stockMaximoEstandar;
	private int stockMaximoFragil;
	private int[]contadorIngresos;
	/**
	 * Constructor del sistema de log�stica.
	 * @param stockMaximoEstandar St�ck m�ximo a almacenar para productos est�ndar.
	 * @param stockMaximoFragil St�ck m�ximo a almacenar para productos fr�giles.
	 * @throws IllegalArgumentException en caso de que los par�metros sean inv�lidos
	 */
	public SistemaLogistica(int stockMaximoEstandar, int stockMaximoFragil) throws IllegalArgumentException {
		setStockMaximoEstandar(stockMaximoEstandar);
		setStockMaximoFragil(stockMaximoFragil);
		this.productosEstandar = new PilaAL<Producto>(getStockMaximoEstandar());
		this.productosFragiles = new PilaAL<Producto>(getStockMaximoFragil());
		this.productosRetirados = new ArrayList<Producto>();
		this.contadorIngresos = new int[2];//0 guarda estandar, index 1 de fragiles 
	}

	/**
	 * Ingresa un producto al deposito que corresponda
	 * @param p el producto a ingresar - NO DEBE SER NULO
	 * @throws RuntimeException En caso de que el producto sea nulo, de tipo inv�lido o no pueda ser agregado.
	 */
	public void ingresarProducto(Producto p) throws RuntimeException {
		//contar cuantos ingresaron
		TipoProducto tipo;
		if(p != null) {
			tipo = p.getTipo();
			switch (tipo) {
			case ESTANDAR:
					try {
						productosEstandar.push(p);
						contadorIngresos[0]++;
					} catch (Exception e) {
						throw new RuntimeException("El deposito est�ndar est� lleno");
					}
				break;
			case FRAGIL:
					try {
						productosFragiles.push(p);
						contadorIngresos[1]++;
					} catch (Exception e) {
						throw new RuntimeException("El deposito fr�gil est� lleno");
					}
				break;
			default:
				throw new RuntimeException(MSG_TIPO_DE_PRODUCTO_INV�LIDO);
			}
		}else {
			throw new RuntimeException(MSG_EL_PRODUCTO_NO_PUEDE_SER_NULO);
		}
	}

	

	/**
	 * Retira un producto en base a su tipo y c�digo
	 * @param codigo Del producto a retirar
	 * @param tipo Tipo del producto a retirar
	 * @return el producto retirado
	 * @throws IllegalArgumentException en caso de que el c�digo o el tipo sean nulos
	 * @throws RuntimeException En caso de no encontrar el producto buscado.
	 */
	public Producto retirarProductoSeleccionado(String codigo, TipoProducto tipo) throws IllegalArgumentException, RuntimeException {
	
		Producto productoBuscado = null;
		if(codigo != null) {
			if(tipo != null) {
				switch (tipo) {
				case ESTANDAR:
					productoBuscado = buscarProducto(codigo, this.productosEstandar);
					
					break;
				case FRAGIL:
					productoBuscado = buscarProducto(codigo, this.productosFragiles);
					
					break;

				default:
					throw new IllegalArgumentException(MSG_TIPO_DE_PRODUCTO_INV�LIDO);
				}
				
			}else {
				throw new IllegalArgumentException(MSG_TIPO_DE_PRODUCTO_INV�LIDO);
			}
		}else {
			throw new IllegalArgumentException(MSG_EL_CODIGO_NO_PUEDE_SER_NULO);
		}
		
		if(productoBuscado==null) {
			throw new RuntimeException("Producto no encontrado");
		}else {
			this.productosRetirados.add(productoBuscado);
		}
		return productoBuscado;
	}
		
	private Producto buscarProducto(String codigo, Pila<Producto> pila) {
		Producto productoEncontrado = null;
		Producto producto;
		Pila<Producto> pilaAux = new PilaAL<Producto>();
		boolean encontrado = false;
		while(!encontrado && !pila.isEmpty()) {
			producto = pila.pop();
			if(producto.getCodigo().equals(codigo)) {
				productoEncontrado = producto;
				encontrado = true;
			}else {
				pilaAux.push(producto);
			}
		}
		while(!pilaAux.isEmpty()) {
			producto = pilaAux.pop();
			pila.push(producto);
		}
		return productoEncontrado;
	}

	@Override
	public void mostrar() {
		int cantEst;
		int cantFrag;
		System.out.println("Se han retirado: "+ this.productosRetirados.size());
		for (Producto prod : this.productosRetirados) {
			prod.mostrar();
		}
		cantEst = getIngresosEstandar();
		cantFrag = getIngresosFragiles();
		System.out.println("Se ingresaron "+cantEst +" Productos Estandar y se ingresaron "+cantFrag +" Productos Fr�giles");
	}
	
	private int getIngresosFragiles() {
		return this.contadorIngresos[1];
	}

	private int getIngresosEstandar() {
		return this.contadorIngresos[0];
	}

	private int getStockMaximoEstandar() {
		return stockMaximoEstandar;
	}

	private void setStockMaximoEstandar(int stockMaximoEstandar) throws IllegalArgumentException {
		if(stockMaximoEstandar <= 0 ) {
			throw new IllegalArgumentException(MSG_TAMANIO_DE_DEPOSITO_ESTANDAR_INVALIDO);
		}else {
			this.stockMaximoEstandar = stockMaximoEstandar;
		}
	}

	private int getStockMaximoFragil() {
		return stockMaximoFragil;
	}

	private void setStockMaximoFragil(int stockMaximoFragil) {
		if(stockMaximoFragil <= 0 ) {
			throw new IllegalArgumentException(MSG_TAMANIO_DE_DEPOSITO_FRAGIL_INVALIDO);
		}else {
			this.stockMaximoFragil = stockMaximoFragil;
		}
		
	}

}
