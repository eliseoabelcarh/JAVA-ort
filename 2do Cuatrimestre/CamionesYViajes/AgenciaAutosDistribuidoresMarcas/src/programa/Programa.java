package programa;

import agencia.Agencia;
import distribuidor.Distribuidor;
import marca.Marca;

public class Programa {

	public static void main(String[] args) {


				//1, "Ford"
				//2, "Peugeot"
				//3, "Toyota"
				//4, "Fiat"
		
		Agencia agencia = new Agencia();
		
		Distribuidor[] distribuidores = agencia.getDistribuidores();
		distribuidores[0].crearPedido(51, 3, "J50");//toyota
		distribuidores[0].crearPedido(52, 3, "E50");//toyota
		distribuidores[0].crearPedido(53, 3, "I50");//toyota
		distribuidores[2].crearPedido(54, 3, "F50");//toyota
		distribuidores[2].crearPedido(55, 3, "F50");//toyota
		distribuidores[4].crearPedido(56, 4, "F50");//fiat
		distribuidores[4].crearPedido(57, 3, "H50");//toyota
		distribuidores[4].crearPedido(58, 1, "H50");//ford
		
		
		
		
		
		//agencia.informarPedidosXDisMax();
		agencia.informarDisMaxMar();
		// agencia.informarValorPedido(56);
		

	}

}
