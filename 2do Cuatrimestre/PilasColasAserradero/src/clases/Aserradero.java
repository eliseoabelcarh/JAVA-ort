package clases;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Aserradero {

	private Queue<Pedido> colaPedidos;
	private Stack<Tablon> pilaCedro;
	private Stack<Tablon> pilaPino;
	
	public Aserradero() {
		this.colaPedidos = new LinkedList<Pedido>();
		this.pilaCedro = new Stack<Tablon>();
		this.pilaPino = new Stack<Tablon>();
	}

	public Aserradero(Queue<Pedido> colaPedidos, Stack<Tablon> pilaCedro, Stack<Tablon> pilaPino) {
		this.colaPedidos = colaPedidos;
		this.pilaCedro = pilaCedro;
		this.pilaPino = pilaPino;
	}
	
	public Stack<Tablon> crearPilaDeTablones(int cantidad) {
		Stack<Tablon> pila = new Stack<Tablon>();
		int i = 0;
		
		while(i <= cantidad) {
			pila.push(new Tablon());
			i++;
		}
		return pila;
	}
	
	public void procesarPedidos() {
		Pedido centinela = new Pedido(-1);
		Pedido pedido;
		int totalPinoDisponible = 0;
		int totalCedroDisponible = 0;
		
		totalPinoDisponible  = getCantTotalPino();
		totalCedroDisponible = getCantTotalCedro();
		colaPedidos.add(centinela);
		pedido = colaPedidos.remove();
		while(pedido != centinela) {
			if(pedido.getEstado() == Estado.E && (totalPinoDisponible >0 || totalCedroDisponible>0)) {
		
				totalCedroDisponible = pedido.procesarYDevolverSobranteDeCedros(totalCedroDisponible);
				totalPinoDisponible = pedido.procesarYDevolverSobranteDePinos(totalPinoDisponible);
				pedido.infomarEstado();
			}
			//pedido.infomarEstado();
			colaPedidos.add(pedido);
			pedido = colaPedidos.remove();
		}
	}

	private int getCantTotalCedro() {
		Stack<Tablon> pilaAux = new Stack<Tablon>();
		int totalCedros = 0;
		Tablon tablon;
		while(!this.pilaCedro.isEmpty()) {
			tablon = this.pilaCedro.pop();
			pilaAux.push(tablon);
			totalCedros++;
		}
		while(!pilaAux.isEmpty()) {
			tablon = pilaAux.pop();
			this.pilaCedro.push(tablon);
		}
		return totalCedros;
	}

	private int getCantTotalPino() {
		Stack<Tablon> pilaAux = new Stack<Tablon>();
		int totalPinos = 0;
		Tablon tablon;
		while(!this.pilaPino.isEmpty()) {
			tablon = this.pilaPino.pop();
			pilaAux.push(tablon);
			totalPinos++;
		}
		while(!pilaAux.isEmpty()) {
			tablon = pilaAux.pop();
			this.pilaPino.push(tablon);
		}
		return totalPinos;
	}
	
	
}
