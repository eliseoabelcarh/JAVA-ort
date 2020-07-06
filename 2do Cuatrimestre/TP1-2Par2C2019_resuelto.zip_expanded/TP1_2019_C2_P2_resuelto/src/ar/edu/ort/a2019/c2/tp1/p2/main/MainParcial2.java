package ar.edu.ort.a2019.c2.tp1.p2.main;

import ar.edu.ort.a2019.c2.tp1.p2.clases.ProductoEstandar;
import ar.edu.ort.a2019.c2.tp1.p2.clases.ProductoFragil;
import ar.edu.ort.a2019.c2.tp1.p2.clases.SistemaLogistica;
import ar.edu.ort.a2019.c2.tp1.p2.clases.TipoProducto;

public class MainParcial2 {

	public static void main(String[] args) {

		MainParcial2 test = new MainParcial2();

		SistemaLogistica sl = new SistemaLogistica(4, 3);

		test.ingresarProductosEstandar(sl);

		System.out.println("-------------------------------------------------------------");

		test.ingresarProductosFragil(sl);

		System.out.println("-------------------------------------------------------------");

		test.retirar(sl);

		System.out.println("-------------------------------------------------------------");

		sl.mostrar();

	}

	private void ingresarProductosFragil(SistemaLogistica sl) {

		try {
			sl.ingresarProducto(new ProductoFragil("Fragil1", "Ventana", "Ventana Fragil"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto frágil: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoFragil("Fragil2", "Florero", "Florero hindú"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto frágil: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoFragil(null, "Ventanas", "Ventanas Fragiles"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto frágil: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoFragil("Un codigo", null, "Ventanas Fragiles"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto frágil: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoFragil("Fragil5", "Jarron", "Dinastia Ming"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto frágil: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoFragil("Fragil6", "Espejo", "Espejo mágico"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto frágil: " + e.getMessage());
		}

	}

	private void ingresarProductosEstandar(SistemaLogistica sl) {

		try {
			sl.ingresarProducto(new ProductoEstandar("Estandar1", "Goma", "Goma de auto"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoEstandar("Estandar2", "Silla", "Silla ergonómica"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoEstandar(null, "Bolsa de Arena", "Arenas del desierto"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoEstandar("Un codigo loco", null, "Gran producto en oferta"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoEstandar("Estandar5", "Barra de acero", "Ideal para edificios"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}

		try {
			sl.ingresarProducto(new ProductoEstandar("Estandar6", "Caja carton", "medida única"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}
		
		try {
			sl.ingresarProducto(new ProductoEstandar("Estandar99", "Caja carton", "medida única"));
			System.out.println("Se ingresó correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("No se pudo agregar el producto Estándar: " + e.getMessage());
		}
	}

	private void retirar(SistemaLogistica sl) {

		try {
			sl.retirarProductoSeleccionado("Estandar2", TipoProducto.ESTANDAR);
			System.out.println("Se retiró correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("Hubo un problema sacando un producto: " + e.getMessage());
		}

		try {
			sl.retirarProductoSeleccionado(null, TipoProducto.ESTANDAR);
			System.out.println("Se retiró correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("Hubo un problema sacando un producto: " + e.getMessage());
		}

		try {
			sl.retirarProductoSeleccionado("codigo", null);
			System.out.println("Se retiró correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("Hubo un problema sacando un producto: " + e.getMessage());
		}

		try {
			sl.retirarProductoSeleccionado("Estandar6", TipoProducto.ESTANDAR);
			System.out.println("Se retiró correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("Hubo un problema sacando un producto: " + e.getMessage());
		}

		try {
			sl.retirarProductoSeleccionado("Fragil2", TipoProducto.FRAGIL);
			System.out.println("Se retiró correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("Hubo un problema sacando un producto: " + e.getMessage());
		}

		try {
			sl.retirarProductoSeleccionado("Sin Codigo", TipoProducto.FRAGIL);
			System.out.println("Se retiró correctamente el producto");
		} catch (RuntimeException e) {
			System.out.println("Hubo un problema sacando un producto: " + e.getMessage());
		}
	}

}
