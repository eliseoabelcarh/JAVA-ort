package dia;

import java.util.ArrayList;
import horario.Horario;



public class Dia {
	
		private int nroDia;
		private ArrayList<Horario> horarios;
	
		public Dia(int nroDia) {
			
			this.nroDia=nroDia;
			this.horarios=new ArrayList<Horario>();
			int i=0;
			while(i<24) {
				horarios.add(new Horario("libre"));
			}
			
		}
		
		public Horario getHorario(int hora) {
			Horario horario=null;

			if(this.horarios.get(hora) != null ) {
				horario= this.horarios.get(hora);
			}
			
			
			return horario;
		}

		public int getNroDia() {
			return nroDia;
		}

	
		
		
		
}
