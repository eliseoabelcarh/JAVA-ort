
public interface Estacionamiento {

	 public abstract boolean estacionar(Vehiculo vehiculo);
	 public abstract Vehiculo retirar(String patente);
	 public abstract boolean hayLugar();
}
