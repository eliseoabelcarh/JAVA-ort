package ar.edu.ort.tp1.segundoparcial;

import java.util.LinkedList;
import java.util.Queue;

public class Cola<T> {
	Queue<T> queue;	
	public Cola() {
		queue = new LinkedList<T>();
	}
	public void add(T e) {
		queue.add(e);
	}
	/**
	 * Devuelve el primer elemento encolado, extrayendolo
	 * @return el elemento
	 */
	public T pool() {		
		return queue.poll();
	}
	public boolean isEmpty() {		
		return queue.isEmpty();
	}
	/**
	 * Devuelve el primer elemento encolado, sin extraerlo
	 * @return el elemento
	 */
	public T peek() {
		return queue.peek();
	}
}