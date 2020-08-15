package programa;

public class Programa {
	
	public static void main (String[] args) {
		
		
		
		int[][] matriz = {{6,4,8,2,12,23},{7,5,3,45,72,31},{2,9,4,5,12,62},{29,21,61,15,36,28},{27,2,38,49,6,38},{11,19,17,9,32,22}};
		System.out.println(devolverSumaDiagonalMatriz(matriz));
		System.out.println(devolverSumaDiagonalInversaMatriz(matriz));
		
		
		int[][] cuadrado = {{6,1,8},{7,5,3},{2,9,4}};
		System.out.println(esCuadradoMagico(cuadrado));
		
	}
	
	
	//--------------------------MÉTODOS UTILIZADOS -------------------------------
	public static int devolverSumaDiagonalMatriz(int[][] matriz) {
		int suma = 0;
		int indexASumar = 0;
		if(matriz != null) {
			for (int i = 0; i < matriz.length; i++) {
				if(matriz[i] != null) {
					suma += matriz[i][indexASumar];
					indexASumar++;
				}
			}
		}
		return suma;
	}
	public static int devolverSumaDiagonalInversaMatriz(int[][] matriz) {
		int suma = 0;
		if(matriz != null) {
			int indexASumar = matriz.length - 1;
			for (int i = 0; i < matriz.length; i++) {
				if(matriz[i] != null) {
					suma += matriz[i][indexASumar];
					indexASumar--;
				}
			}
		}		
		return suma;
	}

	public static int devolverSumaVector(int[] vector) {
		int suma =0;
		if(vector != null) {
			for (int i = 0; i < vector.length; i++) {
				suma +=  vector[i];
			}
		}
		return suma;
	}
	
	public static boolean sumaFilasSiempreIgual(int[][] matriz) {
		boolean esIgual = true;
		if(matriz != null) {
			int sumaPrimeraFila = devolverSumaVector(matriz[0]);
			int i = 1;
			while(esIgual && i < matriz.length) {
				int sumaFilaActual = devolverSumaVector(matriz[i]);
				if(sumaPrimeraFila != sumaFilaActual) {
					esIgual = false;
				}
				i++;
			}
		}
		return esIgual;
	}
	public static int devolverSumaColumna(int nroColumna, int [][] matriz) {
		int suma = 0;
		if(matriz != null) {
			for (int i = 0; i < matriz.length; i++) {
				suma += matriz[nroColumna][i];
			}
		}
		return suma;
	}
	public static boolean sumaColumnasSiempreIgual(int[][] matriz) {
		boolean esIgual = true;
		if(matriz != null && matriz[0] != null) {
			int nroColumnas = matriz[0].length;
			int sumaPrimeraColumna = devolverSumaColumna( 0, matriz);
			int i = 1;
			while(esIgual && i < nroColumnas){
				if(sumaPrimeraColumna != devolverSumaColumna(i, matriz)) {
					esIgual = false;
				}
				i++;
			}

		}
		return esIgual;
	}
	
	
	public static boolean esCuadradoMagico( int[][] matriz) {
		boolean esCuadfradoMg = false;
		if(matriz != null) {
			if(sumaColumnasSiempreIgual(matriz) == true 
					&& sumaFilasSiempreIgual(matriz) == true) {
				esCuadfradoMg = true;
			}
		}
		return esCuadfradoMg;
		}
	}
