package com.duenio;


import java.util.ArrayList;
import com.perro.Perro;
import com.perchero.Perchero;
import com.collar.Collar;

public class Duenio {
	
	private String nombre;
	private ArrayList <Perro> perros;
	private Perchero perchero;
	
	
	public Duenio(String nombre){
		this.nombre=nombre;
		perros=new ArrayList<Perro>();
		perchero = new Perchero();
	}
	
	
	
	public Perchero getPerchero() {
		return perchero;
	}



	public void agregarPerro(Perro perro) {
		perros.add(perro);
	}
	
	public void prepararPaseo(String nombrePerro) {
		Perro perro;
		Collar collar;
		
		perro=buscarPerro(nombrePerro);
		System.out.println(perro);
		collar=perchero.buscarCollar(nombrePerro);
		System.out.println(collar);
		System.out.println("perro y collar listos");
		
		if (perro != null && collar !=null) {
			perro.setCollar(collar);
		} else {System.out.println("no existe perro o collar");}
		
	}
	
	private Perro buscarPerro(String nombrePerro) {
		Perro perroBuscado=null;
		
		for(int i=0; i< perros.size();i++) {
			if(nombrePerro.equals(perros.get(i).getNombre())) {
				perroBuscado= perros.get(i);
			}
		}
		if (perroBuscado==null) {System.out.println("no existe perro");}
		return perroBuscado;
	}
	
	
	
	
	public void finalizarPaseo(String nombrePerro) {
		Perro perro;
		Collar collar;
		
		perro=buscarPerro(nombrePerro);
		collar =perro.entregarCollar();
		if(perro !=null && collar != null) {
		this.perchero.agregarCollar(collar);
		System.out.println("collar agregado a perchero");
		}else {System.out.println("no hay perro o collar .... perro:" + perro +" collar: "+ collar);}
	}

}
