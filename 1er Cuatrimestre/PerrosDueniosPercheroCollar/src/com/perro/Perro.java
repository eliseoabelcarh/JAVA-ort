package com.perro;

import java.util.ArrayList;
import com.duenio.Duenio;
import com.collar.Collar;


public class Perro {
	
	private String nombre;
	private ArrayList<Duenio>duenios;
	private Collar collar;
	
	
	public Perro(String nombre) {
		this.nombre=nombre;
		duenios= new ArrayList<Duenio>();
	}
	public void agregarDuenio(Duenio duenio) {
		duenios.add(duenio);
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setCollar(Collar collar) {
		this.collar = collar;
		 if(collar !=null ) {
			 moverCola();
		 } 
	}
	private void moverCola() {
		System.out.println("perro mueve cola");
	}
	public Collar getCollar() {
		return collar;
	}
	
	public Collar entregarCollar() {
		Collar collarEntregado=null;
		if(this.collar !=null) {
		collarEntregado=this.collar;
		this.collar=null;
		System.out.println("perro entrego su collar y se quedo sin collar");
		}else {System.out.println("perro no tenia ningún collar");}
		return collarEntregado;
	}
	
	
	
}
