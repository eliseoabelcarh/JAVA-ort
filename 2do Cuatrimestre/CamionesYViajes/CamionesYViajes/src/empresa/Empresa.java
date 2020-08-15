package empresa;
import chofer.Chofer;
import vehiculo.Vehiculo;
import viaje.Viaje;

public class Empresa {
	
	private Chofer[] choferes;
	private Vehiculo [] vehiculos;
	private Viaje[] viajes;
	private final int NRO_MAXIMO_VEHICULOS = 10;
	private final int NRO_MAXIMO_CHOFERES = 20;
	
	public Empresa() {
		this.choferes = new Chofer[NRO_MAXIMO_CHOFERES];
		this.vehiculos = new Vehiculo[NRO_MAXIMO_VEHICULOS];
		this.viajes = new Viaje[15];// a modo de ejercicio se utiliza vector, deberpia ser arrayList
	}
	
		
	public Chofer[] getChoferes() {
		return choferes;
	}
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	public Viaje[] getViajes() {
		return viajes;
	}
	
	public Chofer registrarChofer(String choferId, String nombre, float honorariosXViaje) {
		Chofer chofer = null;
		int indexVacio = buscarEspacioNullChoferes(this.choferes);
		if(indexVacio != -1) {
			chofer = new Chofer(choferId, nombre, honorariosXViaje);
			this.choferes[indexVacio] = chofer;
		}
		return chofer;
	}
	public Vehiculo registrarVehiculo(int camionId, float gastoPorKm) {
		Vehiculo vehiculo = null;
		int indexVacio = buscarEspacioNullVehiculos(this.vehiculos);
		if(indexVacio != -1) {
			if(camionId < NRO_MAXIMO_VEHICULOS) {
				vehiculo = new Vehiculo(camionId, gastoPorKm);
				this.vehiculos[indexVacio] = vehiculo;
			}else {
				System.out.println("el id del vehículo debe ser menor a " + NRO_MAXIMO_VEHICULOS);
			}
			
			
		}
		return vehiculo;
	}
	
	public Viaje registrarViaje(int camionId, String choferId, float kmsPorViaje) {
		Viaje viaje = null;
		int indexVacio = buscarEspacioNullViajes(this.viajes);
		if(indexVacio != -1) {
			viaje = new Viaje(camionId, choferId, kmsPorViaje);
			this.viajes[indexVacio] = viaje;
		}
		return viaje;
	}
	
	public int buscarEspacioNullChoferes(Chofer[] vector) {
		int indexVacio = -1;
		boolean espacioEncontrado = false;
		int i = 0;
		while(!espacioEncontrado && i < vector.length ) {
			if(vector[i] == null) {
				indexVacio = i;
				espacioEncontrado = true;
			}
			i++;
		}
		return indexVacio;
	}

	public int buscarEspacioNullVehiculos(Vehiculo[] vector) {
		int indexVacio = -1;
		boolean espacioEncontrado = false;
		int i = 0;
		while(!espacioEncontrado && i < vector.length ) {
			if(vector[i] == null) {
				indexVacio = i;
				espacioEncontrado = true;
			}
			i++;
		}
		return indexVacio;
	}
	
	public int buscarEspacioNullViajes(Viaje[] vector) {
		int indexVacio = -1;
		boolean espacioEncontrado = false;
		int i = 0;
		while(!espacioEncontrado && i < vector.length ) {
			if(vector[i] == null) {
				indexVacio = i;
				espacioEncontrado = true;
			}
			i++;
		}
		return indexVacio;
	}
	
	//este método tiene version2 con mejoras
	public void informarCostoViaje() {
		Viaje[] viajes;
		float kmViaje = -1;
		float gastoPorKm = 0;
		int indexVehiculo = -1;
		int indexChofer = -1;
		float honorariosXViaje = 0;
		float consumoCamion = 0;
		int[] indexes = new int[2];
		
		viajes = getViajes();
		for (int i = 0; i < viajes.length; i++) {
			indexes = devolverIndexChoferYCamion(viajes[i]);
			indexChofer = indexes[0];
			indexVehiculo = indexes[1];
			if(viajes[i] != null) {
				kmViaje = viajes[i].getKmsPorViaje();
				if(indexChofer != -1 && indexVehiculo != -1 ) {
					gastoPorKm = this.vehiculos[indexVehiculo].getGastoPorKm();
					honorariosXViaje = this.choferes[indexChofer].getHonorariosXViaje();
					consumoCamion = gastoPorKm*kmViaje;
					System.out.println("para el viaje " + (i+1) + " se gastó " + honorariosXViaje + " en chofer y " + consumoCamion  + " en consumo del camión");
					//System.out.println("para el viaje " + (i+1) + " se gastó " + honorariosXViaje + " en chofer - gastoPorKm: " + gastoPorKm  + " y viaje tuvo:" + kmViaje + "kms ");

				}else {System.out.println("no existe vehiculo o chofer");}
			}
			
		}
	}
	
	//este método tiene version2 con mejoras
	public void informarViajesXChoferCamion() {
		int[][]vector = new int [20][10];
		int[] indexes = new int[2];
		Chofer chofer;
		Vehiculo vehiculo;
		int nroViajes = 0;
		
		
		
		for (int i = 0; i < this.viajes.length; i++) {
			indexes = devolverIndexChoferYCamion(viajes[i]);
			int indexChofer = indexes[0];
			int indexCamion = indexes[1];
			if(indexChofer != -1 && indexCamion != -1) {
				vector[indexChofer][indexCamion]++;
			}
		}
		for (int i = 0; i < vector.length; i++) {
			chofer = devolverChofer(i);
			if(chofer != null) {
				for (int x = 0; x < vector[i].length; x++) {
					vehiculo = devolverVehiculo(x);
					if(vehiculo != null) {
						nroViajes = vector[i][x];
						System.out.println(" para chofer " + chofer.getNombre() + " con vehiculo" + x + " tuvo " + nroViajes + " viajes" );
					}
				}
			}
		}
		
	}

	public Chofer devolverChofer( int index) {
		Chofer chofer = null;
		if(index != -1) {
			chofer = this.choferes[index];
		}
		return chofer;
	}
	public Chofer devolverChofer( String choferId) {
		Chofer chofer = null;
		int indexChofer = devolverIndexChofer(choferId);
		if(indexChofer != -1) {
			chofer = devolverChofer(indexChofer);
		}
		return chofer;
	}

	public Vehiculo devolverVehiculo( int index) {
		Vehiculo vehiculo = null;
		if(index != -1) {
			vehiculo = this.vehiculos[index];
		}
		return vehiculo;
	}

	public int[] devolverIndexChoferYCamion(Viaje viaje) {
		int[] resultado =  {-1,-1};//inicializo en -1 ambos
		int camionId = -1;
		String choferId = null;
		int indexVehiculo = -1;
		int indexChofer = -1;
		
		if(viaje != null) {
			camionId = viaje.getCamionId();
			choferId = viaje.getChoferId();
			if(camionId != -1 && choferId != null) {
				indexVehiculo = devolverIndexVehiculo(camionId);
				indexChofer = devolverIndexChofer(choferId);
				if(indexVehiculo != -1 && indexChofer != -1) {
					resultado[0] = indexChofer;
					resultado[1] = indexVehiculo;
				}
			}
		}
		return resultado;
	}
	
	public int devolverIndexVehiculo(int id) {
		int index = -1;
		int i = 0;
		boolean vehiculoEncontrado = false;
		while(! vehiculoEncontrado && i < this.vehiculos.length) {
			if(this.vehiculos[i].getCamionId() == id) {
				index = i;
				vehiculoEncontrado =true;
			}
			i++;
		}
		return index;
	}
	
	public int devolverIndexChofer(String id) {
		int index = -1;
		int i = 0;
		boolean choferEncontrado = false;
		while(!choferEncontrado && i < this.choferes.length) {
			if(this.choferes[i] != null) {
				if(this.choferes[i].getChoferId() == id) {
					index = i;
					choferEncontrado =true;
				}
			}
			
			i++;
		}
		return index;
	}
	
	//****************************** MÉTODOS MÁS PROLIJOS QUE REMPLAZAN ARRIBA *************************
	
	public void informarCostoViaje2() {
		Chofer chofer;
		Vehiculo camion;
		for (int i = 0; i < this.viajes.length; i++) {
			if(viajes[i] != null) {		
				chofer = devolverChofer(viajes[i].getChoferId());
				camion = devolverVehiculo(viajes[i].getCamionId());
				if(chofer != null && camion  != null) {
					System.out.println("viaje costó " + ((chofer.getHonorariosXViaje()) + (camion.getGastoPorKm()*viajes[i].getKmsPorViaje())));
				}
			}
		}
	}
	
	private int[][] contarViajesXChoferCamion(){
		int[][]matriz = new int[NRO_MAXIMO_CHOFERES][NRO_MAXIMO_VEHICULOS];
		for (int i = 0; i < this.viajes.length; i++) {
			if(viajes[i] != null) {
				int indexChofer =  devolverIndexChofer(viajes[i].getChoferId());
				int indexCamion = devolverIndexVehiculo(viajes[i].getCamionId());
				if(indexChofer != -1 && indexCamion != -1) {
					matriz[indexChofer][indexCamion]++;
				}
				
			}
		}
		return matriz;	
	}
	public void informarViajesXChoferCamion2() {
		int[][] matriz = contarViajesXChoferCamion();
		for (int i = 0; i < matriz.length; i++) {
			Chofer chofer = devolverChofer(i);
					if(chofer != null) {
						String choferId = chofer.getChoferId();
						for (int x = 0; x < matriz[i].length; x++) {
							Vehiculo camion = devolverVehiculo(x);
							if(camion != null) {
								int camionId  = camion.getCamionId();
								System.out.println("para chofer " + choferId + " con el camion "+ camionId +" se realizaron " + matriz[i][x] + " viajes");

							}
					}
					
			
						
			}
		}
	}

}
