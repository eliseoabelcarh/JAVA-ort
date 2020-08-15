package programa;

import gastoAnual.GastoAnual;
import mes.Mes;

public class Programa {

	public static void main(String[] args) {

		GastoAnual gastoanual = new GastoAnual();
		
		gastoanual.agregarGasto(Mes.FEBRERO, "comida", 300);
		gastoanual.agregarGasto(Mes.FEBRERO, "ropa", 200);
		gastoanual.agregarGasto(Mes.ENERO, "ropa", 400);
		gastoanual.agregarGasto(Mes.DICIEMBRE, "comida", 50);
		gastoanual.agregarGasto(Mes.OCTUBRE, "comida", 700);
		gastoanual.agregarGasto(Mes.ENERO, "comida", 10);
		
		//gastoanual.informarConsumosPorMes();
		//gastoanual.informarMesMayorConsumo();
		//System.out.println(gastoanual.gastoAcumulado("ropa"));
		gastoanual.informarPromedioMensualPorRubro();
	}

}
