package programa;

import agencia.Agencia;
import distribuidor.Distribuidor;
import marca.Marca;

public class Programa {
	
	public static void main(String[] args) {
	
		//MARCA AUDI - MODELOS
		int audiId= Marca.AUDI.getId();
		String modelo1Audi = Marca.AUDI.getModelo(1);
		String modelo2Audi = Marca.AUDI.getModelo(2);
		
		//MARCA FORD - MODELOS
		int fordId = Marca.FORD.getId();
		String modelo1Ford = Marca.FORD.getModelo(1);
		String modelo2Ford = Marca.FORD.getModelo(2);
		
		//MARCA PEUGEOT - MODELOS
		int peugeotId = Marca.PEUGEOT.getId();
		String modelo1Peugeot = Marca.PEUGEOT.getModelo(1);
		String modelo2Peugeot = Marca.PEUGEOT.getModelo(2);
		
		//MARCA CHEVROLET - MODELOS
		int chevroletId = Marca.CHEVROLET.getId();
		String modelo1Chevrolet = Marca.CHEVROLET.getModelo(1);
		String modelo2Chevrolet = Marca.CHEVROLET.getModelo(2);
		
		//MARCA JEEP - MODELOS
		int jeepId = Marca.JEEP.getId();
		String modelo1Jeep = Marca.JEEP.getModelo(1);
		String modelo2Jeep = Marca.JEEP.getModelo(2);
		
	
		Agencia agencia = new Agencia();
		
		Distribuidor[] distribuidores = agencia.getDistribuidores();
		
		distribuidores[0].crearPedido(51, audiId,		modelo1Audi		);
		distribuidores[0].crearPedido(52, fordId, 		modelo2Ford		);
		distribuidores[0].crearPedido(53, audiId, 		modelo2Audi		);
		distribuidores[2].crearPedido(54, peugeotId,	modelo1Peugeot 	);
		distribuidores[2].crearPedido(55, fordId,		modelo2Ford		);
		distribuidores[4].crearPedido(56, jeepId,		modelo2Jeep 	);
		distribuidores[4].crearPedido(57, chevroletId,	modelo2Chevrolet);
		distribuidores[4].crearPedido(58, jeepId,		modelo1Jeep 	);
		
		
		
		
		
		//agencia.informarPedidosXDisMax();
		//agencia.informarDisMaxMar();
		agencia.informarValorPedido(58);
		

		
	}

}
