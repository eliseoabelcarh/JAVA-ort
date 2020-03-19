package articulo;
import tipoArticulo.TipoArticulo;

public class Articulo {
	
	private TipoArticulo tipoArticulo;
	
	public Articulo(TipoArticulo tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	
	public TipoArticulo getTipoArticulo() {
		return this.tipoArticulo;
	}

	@Override
	public String toString() {
		return "Articulo [tipoArticulo=" + tipoArticulo + "]";
	}

}
