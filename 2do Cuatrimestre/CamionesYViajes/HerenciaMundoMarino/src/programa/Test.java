package programa;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Animal;
import clases.Cuidador;
import clases.Delfin;
import clases.Habilidad;
import clases.LoboMarino;
import clases.Orca;
import clases.Show;

public class Test {

	public static void main(String[] args) {
		

//		Show show = new Show();
//		
//		show.contratarCuidadorParaShow("Jos�");
//		show.contratarCuidadorParaShow("Mar�a");
//		
//		System.out.println("Stock inicial de alimento: ");
//		show.mostrarStockAlimentos();
//		System.out.println("");
//		
//		Delfin flipper =  new Delfin("Flipper", 500, 2);
//		flipper.agregarTruco(Habilidad.TRUCO1);
//		flipper.agregarTruco(Habilidad.TRUCO2);
//		show.agregarAnimalAShow(flipper);
//		
//		
//		Orca willy =	new Orca("Willy", 3000, 30);
//		willy.agregarTruco(Habilidad.TRUCO1);
//		show.agregarAnimalAShow(willy);
//		
//		
//		Delfin kuni = new Delfin("Kuni", 400,3);
//		kuni.agregarTruco(Habilidad.TRUCO2);
//		kuni.agregarTruco(Habilidad.TRUCO1);
//		show.agregarAnimalAShow(kuni);
//		
//		
//		LoboMarino rupert = new LoboMarino("Rupert", 400, 1.5f);
//		rupert.agregarTruco(Habilidad.TRUCO3);
//		rupert.agregarTruco(Habilidad.TRUCO3);
//		show.agregarAnimalAShow(rupert);
//		
//		Delfin otroDelfin =  new Delfin("OtroDelfinn", 500, 2);
//		otroDelfin.agregarTruco(Habilidad.TRUCO1);
//		otroDelfin.agregarTruco(Habilidad.TRUCO2);
//		show.agregarAnimalAShow(otroDelfin);
//
//	
//		
//		show.mostrarCuidadoresConSusAnimales();
//		System.out.println("");
//		
//		show.empezarPresentacionDeCuidadoresYSusAnimales();
//		System.out.println("");
//		
//		System.out.println("Stock final de alimento: ");
//		show.mostrarStockAlimentos();
		Scanner scanner = new Scanner(System.in);
		cargoPresupuesto(scanner);
		

	}
	
	
	private static int pedirNumeroEntero(Scanner scanner) {
        int valorNumerico = 0;
        boolean hayError;
        do {
            try {
                System.out.print("Ingresa un numero entero: ");
                valorNumerico = Integer.parseInt(scanner.nextLine());
                hayError = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Hubo un error en la carga del numero.");                
                hayError = true;
            }
        } while (hayError);
        return valorNumerico;
    }
	
	
	private static float cargoPresupuesto(Scanner scanner) {
        boolean ok = false;
        float codigo = -1;
        try {
            System.out.print("Ingrese el monto maximo del presupuesto:");
            codigo = scanner.nextFloat();
            ok = true;
        } catch (InputMismatchException e) {
            System.out.println("error debe ingresar un entero");
            scanner.nextLine();
        }
        return codigo;
}
	
	
	

}
