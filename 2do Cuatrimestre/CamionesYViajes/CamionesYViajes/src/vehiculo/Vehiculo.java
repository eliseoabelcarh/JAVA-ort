package vehiculo;

public class Vehiculo {
	
	private int CamionId;
	private float gastoPorKm;
	
	public Vehiculo(int camionId, float gastoPorKm) {
		this.CamionId = camionId;
		this.gastoPorKm = gastoPorKm;
	}

	public int getCamionId() {
		return CamionId;
	}

	public float getGastoPorKm() {
		return gastoPorKm;
	}

	
}
