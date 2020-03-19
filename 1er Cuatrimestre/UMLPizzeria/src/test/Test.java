package test;

import pizza.GustoPizza;
import pizza.Pizza;
import pizza.TipoPizza;
import empanada.Empanada;
import empanada.GustoEmp;
import empanada.TipoEmp;
import pedido.Pedido;
import pedido.PedidoEmpanada;
import pedido.PedidoPizza;
import comida.Comida;
import pizzeria.Pizzeria;

public class Test {

	public static void main (String [] args ) {
		
		
		
		Pedido pedido;
		PedidoEmpanada pedidoEmpanada1;
		PedidoEmpanada pedidoEmpanada2;
		PedidoPizza pedidoPizza1;
		PedidoPizza pedidoPizza2;
		Comida comida;
		
		Pizzeria pizzeria= new Pizzeria();
		pizzeria.crearCliente("54554");
		pedido=pizzeria.crearPedido();
		
		pedidoEmpanada1=pizzeria.crearPedidoEmpanada(2, TipoEmp.HORNO, GustoEmp.VERDURA);
		pedido.agregarPedidoEmpanada(pedidoEmpanada1);
		pedidoEmpanada2=pizzeria.crearPedidoEmpanada(2, TipoEmp.FRITA, GustoEmp.POLLO);
		pedido.agregarPedidoEmpanada(pedidoEmpanada2);
		pedidoPizza1=pizzeria.crearPedidoPizza(3, TipoPizza.A_lA_PIEDRA,  GustoPizza.NAPOLITANA);
		pedido.agregarPedidoPizza(pedidoPizza1);
		pedidoPizza2=pizzeria.crearPedidoPizza(2, TipoPizza.HORNO,  GustoPizza.JAMON_Y_MORRON);
		pedido.agregarPedidoPizza(pedidoPizza2);

		System.out.println(pedido);
		
		comida= pizzeria.mandarAPreparar( pedido );
		
		//pizzeria.entregarPedido(dniCliente, comida);
		System.out.println(comida);
		System.out.println(pedido);
		
		
	}
	

}
