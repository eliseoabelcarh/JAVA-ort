package viaje;

public class Viaje {
	
	private int camionId;
	private String choferId;
	private float kmsPorViaje;
	
	public Viaje(int camionId, String choferId, float kmsPorViaje) {
		this.camionId = camionId;
		this.choferId = choferId;
		this.kmsPorViaje = kmsPorViaje;
	}

	public int getCamionId() {
		return camionId;
	}

	public String getChoferId() {
		return choferId;
	}

	public float getKmsPorViaje() {
		return kmsPorViaje;
	}
	
	

}
