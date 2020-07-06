package ar.edu.ort.a2019.c2.tp1.p2.clases;

import java.util.ArrayList;

import ar.edu.ort.a2019.c2.tp1.p2.tad.TAD;
import ar.edu.ort.a2019.c2.tp1.p2.tad.implementaciones.arraylist.PilaAL;

public class SistemaLogistica implements Mostrable {

	private static final String MSG_PRODUCTO_NO_ENCONTRADO = "Producto no encontrado";
	private static final String MSG_TIPO_DE_PRODUCTO_INVÁLIDO = "Tipo de producto inválido";
	private static final String MSG_EL_PRODUCTO_NO_PUEDE_SER_NULO = "El producto no puede ser nulo";
	private static final String MSG_TAMANIO_DE_DEPOSITO_FRAGIL_INVALIDO = "Tamaño de depósito frágil inválido";
	private static final String MSG_TAMANIO_DE_DEPOSITO_ESTANDAR_INVALIDO = "Tamaño de depósito estandar inválido";
	private TAD<Producto> productoEstandarStack;
	private TAD<Producto> productoFragilStack;
	private ArrayList<Producto> productosRetirados;
	private int cantFragiles;
	private int cantEstandar;

	public SistemaLogistica(int stockMaximoEstandar, int stockMaximoFragil) throws IllegalArgumentException {

		if (stockMaximoEstandar < 2) {
			throw new IllegalArgumentException(MSG_TAMANIO_DE_DEPOSITO_ESTANDAR_INVALIDO);
		}
		if (stockMaximoFragil < 2) {
			throw new IllegalArgumentException(MSG_TAMANIO_DE_DEPOSITO_FRAGIL_INVALIDO);
		}
		this.cantEstandar = 0;
		this.cantFragiles = 0;
		this.productoEstandarStack = new PilaAL<>(stockMaximoEstandar);
		this.productoFragilStack = new PilaAL<>(stockMaximoFragil);
		this.productosRetirados = new ArrayList<>();
	}

	public void ingresarProducto(Producto p) throws RuntimeException {

		if (p == null) {
			throw new RuntimeException(MSG_EL_PRODUCTO_NO_PUEDE_SER_NULO);
		}
		p.etiquetar();
		if (p instanceof ProductoEstandar) {
			if (productoEstandarStack.isFull()) {
				throw new RuntimeException("El deposito estándar está lleno");
			}
			productoEstandarStack.push(p);
			cantEstandar += 1;
		} else if (p instanceof ProductoFragil) {
			if (productoFragilStack.isFull()) {
				throw new RuntimeException("El deposito frágil está lleno");
			}
			productoFragilStack.push(p);
			cantFragiles += 1;
		} else {
			throw new RuntimeException(MSG_TIPO_DE_PRODUCTO_INVÁLIDO);
		}
	}

	public Producto retirarProductoSeleccionado(String codigo, TipoProducto tipo) throws IllegalArgumentException, RuntimeException {

		Producto seleccionado = null;
		if (codigo == null) {
			throw new IllegalArgumentException("El código no puede ser nulo");
		}
		if (tipo == null) {
			throw new RuntimeException(MSG_TIPO_DE_PRODUCTO_INVÁLIDO);
		}

		switch (tipo) {
		case ESTANDAR:
			seleccionado = this.buscarProducto(codigo, this.productoEstandarStack);
			break;

		case FRAGIL:
			seleccionado = this.buscarProducto(codigo, this.productoFragilStack);
			break;
		}

		if (seleccionado != null) {
			this.productosRetirados.add(seleccionado);
		} else {
			throw new RuntimeException(MSG_PRODUCTO_NO_ENCONTRADO);
		}
		return seleccionado;
	}

	private Producto buscarProducto(String codigo, TAD<Producto> pila) {

		TAD<Producto> pilaAux = new PilaAL<Producto>();
		Producto productoEncontrado = null;
		Producto productoAux;
		while (productoEncontrado == null && !pila.isEmpty()) {

			productoAux = pila.pop();
			if (codigo.equals(productoAux.getCodigo())) {
				productoEncontrado = productoAux;
			} else {
				pilaAux.push(productoAux);
			}
		}
		// Desapilo
		while (!pilaAux.isEmpty()) {

			pila.push(pilaAux.pop());
		}
		return productoEncontrado;
	}

	@Override
	public void mostrar() {
		System.out.println("Se han retirado: " + this.productosRetirados.size() + ".");
		for (Producto producto : productosRetirados) {
			System.out.printf(" * ");
			producto.mostrar();
		}
		
		
		System.out.println("Se ingresaron " + this.cantEstandar
				+ " Productos Estandar y se ingresaron " + this.cantFragiles + " Productos Frágiles");

	}

}
