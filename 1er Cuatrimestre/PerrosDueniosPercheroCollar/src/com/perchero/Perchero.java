package com.perchero;

import java.util.ArrayList;
import com.collar.Collar;

public class Perchero {
	
	ArrayList<Collar> collares;
	
	
	public Perchero() {
		collares= new ArrayList<Collar>();
	}
	
	public void agregarCollar(Collar collar) {
		collares.add(collar);
	}
	public Collar buscarCollar(String nombrePerro) {
		
		Collar collar=null;
		
		for(int i=0; i< collares.size(); i++) {
			
			if(  nombrePerro.equals( collares.get(i).getNombrePerro())) {
				collar= collares.get(i);
				collares.remove(i);
				System.out.println("se eliminó collar de perchero");
				
			}
		}
		return collar;
	}
	
	
	

}
