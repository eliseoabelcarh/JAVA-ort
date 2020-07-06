package programa;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class programa {
	
	public static void main(String [] args){

	/*
		ArrayList<Persona> personas = new ArrayList<Persona>();
			
			personas.add(new Persona("javier"));
			personas.add(new Persona("elena"));
			
			System.out.println(personas.remove(0));
			
			
			Queue<Persona> cola = new LinkedList<Persona>();
			cola.add(new Persona("javier"));
			cola.add(new Persona("elena"));
			System.out.println(cola.isEmpty());
			*/
		
		try {
			Persona p = new Persona("hola");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("sigue la voda");
		}

}
