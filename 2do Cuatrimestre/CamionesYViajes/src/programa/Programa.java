package programa;
import empresa.Empresa;
import chofer.Chofer;
import vehiculo.Vehiculo;
import viaje.Viaje;

public class Programa {
	
	public static void main(String[] args) {
		
		
		
		
		Empresa empresa = new Empresa();
		
		Chofer chofer1 = empresa.registrarChofer("chofID001","nombchof1", 100.1f);
		Chofer chofer2 = empresa.registrarChofer("chofID002","nombchof2", 100.2f);
		Chofer chofer3 = empresa.registrarChofer("chofID003","nombchof3", 100.3f);
		Chofer chofer4 = empresa.registrarChofer("chofID004","nombchof4", 100.4f);
		
		
		Vehiculo camion1 = empresa.registrarVehiculo(0, 100.1f);
		Vehiculo camion2 = empresa.registrarVehiculo(1, 100.2f);
		Vehiculo camion3 = empresa.registrarVehiculo(2, 100.3f);
		Vehiculo camion4 = empresa.registrarVehiculo(3, 100.4f);
		Vehiculo camion5 = empresa.registrarVehiculo(4, 100.5f);
		Vehiculo camion6 = empresa.registrarVehiculo(5, 100.6f);

		Viaje viaje1 = empresa.registrarViaje(0, "chofID005", 200f);//no existe 5-no aparece
		Viaje viaje2 = empresa.registrarViaje(0, "chofID002", 320f);
		Viaje viaje3 = empresa.registrarViaje(0, "chofID003", 400f);
		Viaje viaje4 = empresa.registrarViaje(2, "chofID002", 500f);
		Viaje viaje5= empresa.registrarViaje(2, "chofID003", 600f);
		Viaje viaje6 = empresa.registrarViaje(3, "chofID003", 340f);
		Viaje viaje7 = empresa.registrarViaje(3, "chofID002", 210f);
		Viaje viaje8 = empresa.registrarViaje(4, "chofID004", 120f);
		
		//empresa.informarCostoViaje();
		empresa.informarViajesXChoferCamion();

		
		
	}

}
