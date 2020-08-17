package programa;

public class BotonMimo implements IBoton{

	@Override
	public Accion devuelveAccion() {
		return Accion.Mimo;
	}

}
