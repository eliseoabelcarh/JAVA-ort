package AutomovilViaje;

public class Principal {

	public static void main(String[] args) {


		Automovil auto1 = new Automovil("toyota", "yaris","CAPTN-23");
		
		auto1.setCapacidadTotalCombustible(200);//total capacidad
		
		
		auto1.setCantidadCombustible(100);//tengo de combustible
		System.out.println("tengo en combustible " + auto1.getCantidadCombustible() + " litros");
		auto1.setKmPorLitro(10);
		
		double km1=500;
		System.out.println("quiero recorrer "  + km1 + " kms");
		System.out.println("necesito " + auto1.getCombustibleNecesarioParaViajar(km1)+" litros para hacer el viaje");
		System.out.println("se puede viajar: " + auto1.sePuedeViajar(km1));
		
		auto1.viajar(km1);
		System.out.println("viajando....");
		System.out.println("queda en combustible " + auto1.getCantidadCombustible() + " litros");
		
		double carga=30;
		System.out.println("cargamos "+ carga + " litros de combustible");
		System.out.println("se pudo cargar combustible: " + auto1.cargarCombustible(carga));
		System.out.println("queda en combustible " + auto1.getCantidadCombustible() + " litros");
		
	}

}
