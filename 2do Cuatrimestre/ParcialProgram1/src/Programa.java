
public class Programa {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo("pat1");
		Vehiculo v2 = new Vehiculo("pat2");
		Vehiculo v3 = new Vehiculo("pat3");
		Vehiculo v4 = new Vehiculo("pat4");
		Vehiculo v5 = new Vehiculo("pat5");
		Vehiculo v6 = new Vehiculo("pat6");
		
		
		Garage g = new Garage();
		
		
		boolean estacionado1 = g.estacionar(v1);
		
		boolean estacionado2 = g.estacionar(v2);
		
		boolean estacionado3 = g.estacionar(v3);
	
		boolean estacionado4 = g.estacionar(v4);
	
		boolean estacionado5 = g.estacionar(v5);
		
		
		g.retirar("pat4");
		
		g.estacionar(v5);
		
		
		
		
		
		
		
		
	}
}
