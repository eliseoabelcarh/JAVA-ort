package programa;

import java.util.Arrays;

import testVec.TestVec;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vec = {4,8,6,3,2,5,4,5,6,2};
		
		TestVec vector = new TestVec();
		vector.addNros(vec);
		
		
		//vector.mostrarEnterosEntre1YNroAlmacenados();
		
		int[] vectorCambiado = vector.rotacionNPosicionesDeVector(2);
		System.out.println(Arrays.toString(vectorCambiado));
		
		
		
		
		
		
	}

}
