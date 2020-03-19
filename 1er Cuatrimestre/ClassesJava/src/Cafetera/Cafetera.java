package Cafetera;

public class Cafetera {

	private int capacidadMaxima;
	private int capacidadActual;
	
	public Cafetera() {
		this.capacidadActual=0;
		this.capacidadMaxima=1000;
	}
	
	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima=capacidadMaxima;
		this.capacidadActual=this.capacidadMaxima;
	}
	
	public Cafetera(int capacidadMaxima, int capacidadActual) {
		if(capacidadActual>capacidadMaxima) {
			this.capacidadMaxima=capacidadMaxima;
			this.capacidadActual=this.capacidadMaxima;
		}else {
			this.capacidadActual=capacidadActual;
			this.capacidadMaxima=capacidadMaxima;
		}
	}
	
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima=capacidadMaxima;
	}
	public int getCapacidadMaxima(){
		return this.capacidadMaxima;
	}
	
	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual=capacidadActual;
	}
	public int getCapacidadActual() {
		return this.capacidadActual;
	}
	
	public void llenarCafetera(){
		this.capacidadActual=this.capacidadMaxima;
	}
	public void servirTaza(int cantidadTaza) {
		if(cantidadTaza>this.capacidadActual) {
			this.capacidadActual=this.capacidadMaxima;
		}else {this.capacidadActual-=cantidadTaza;}
	}
	public void vaciarCafetera() {
		this.capacidadActual=0;
	}
	public void agregarCafe(int cantidadAgregada) {
		if(cantidadAgregada>=(this.capacidadMaxima-this.capacidadActual)) {
			this.capacidadActual=this.capacidadMaxima;
		}else {
		this.capacidadActual+=cantidadAgregada;}
	}
}






