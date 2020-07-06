package clases;

public class Torneo5 extends Torneo {
	
	private static final int CANT_MAX_JUGADORES_PERMITIDO = 5;
	private static final int PTO_POR_EMPATE = 1;
	private static final int PTOS_POR_GANAR = 2;
	private static final int PTOS_POR_GANAR_CON_MAS_DE_4_GOLES = 1;
	private static final int PTOS_POR_PERDER = 0;
	private static final int PTO_POR_VALLA_INVICTA = 0;
	private static final int PTO_POR_EMPATE_MAS_3_GOLES = 2;

	public Torneo5() {
		super(CANT_MAX_JUGADORES_PERMITIDO,PTO_POR_EMPATE, PTOS_POR_GANAR,PTOS_POR_GANAR_CON_MAS_DE_4_GOLES,PTOS_POR_PERDER,PTO_POR_VALLA_INVICTA,PTO_POR_EMPATE_MAS_3_GOLES);
	}


}
