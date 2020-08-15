package programa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import clases.Aserradero;
import clases.Pedido;
import clases.Tablon;

public class Programa {

	public static void main(String[] args) {
	
		Queue<Pedido> colaDePedidos = crearColaPedidos(5);
		
		Stack<Tablon> pilaCedro = crearPilaDeTablones(10);
		Stack<Tablon> pilaPino = crearPilaDeTablones(10);
		
		Aserradero a = new Aserradero(colaDePedidos,pilaCedro,pilaPino);
		a.procesarPedidos();

		System.out.println(colaDePedidos.toString());
	}
	
	public static Stack<Tablon> crearPilaDeTablones(int cantidad) {
		Stack<Tablon> pila = new Stack<Tablon>();
		int i = 0;
		
		while(i < cantidad) {
			pila.push(new Tablon());
			i++;
		}
		return pila;
	}
	
	public static Queue<Pedido> crearColaPedidos(int cant){
		Queue<Pedido> pedidos = new LinkedList<Pedido>();
		
		int i = 0;
		while(i < cant) {
			int random7 = (int) (Math.random()*8);
			int random9 = (int) (Math.random()*9);
			Pedido pedido = new Pedido(i+1,random7,random9 );
			System.out.println(pedido.toString());
			pedidos.add(pedido);
			i++;
		}
		return pedidos;
	}
	
	
}
