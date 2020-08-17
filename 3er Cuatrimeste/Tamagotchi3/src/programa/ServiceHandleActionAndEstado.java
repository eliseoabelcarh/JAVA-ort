package programa;

import java.util.ArrayList;

public class ServiceHandleActionAndEstado implements IHandleActionsAndEstados {
	
	public ArrayList<IRespuesta> irespuestas;
	public ArrayList<IAction> iactions;
	public ArrayList<IEstado> iestados;
	
	
	public ServiceHandleActionAndEstado(ArrayList<IRespuesta> irespuestas, ArrayList<IAction> iactions,  ArrayList<IEstado> iestados ) {
		this.irespuestas = irespuestas;
		this.iactions = iactions;
		this.iestados = iestados;
	}



	@Override
	public IRespuesta handleAction(IEstado iestado, IAction iaction) {
		//  según el estado --elegir alguna rspta del array
		IRespuesta irespuesta = null;
		
		if(iestado == this.iestados.get(0)) { //si estado es feliz
			irespuesta = this.irespuestas.get(5);
		}
		
		if(iestado == this.iestados.get(1)) { //si estado es triste
			if(iaction == this.iactions.get(0)) { //acción es mimo
				irespuesta = this.irespuestas.get(0);//respuesta es feliz
			}
			if(iaction == this.iactions.get(1)) { //acción es comer
				irespuesta = this.irespuestas.get(1);//respuesta es vomita
			}
			if(iaction == this.iactions.get(2)) { //acción es tomar
				irespuesta = this.irespuestas.get(2);//respuesta es me putea
			}
		}
		
		if(iestado == this.iestados.get(2)) { //si estado es hambriento
			if(iaction == this.iactions.get(0)) { //acción es mimo
				irespuesta = this.irespuestas.get(4);//respuesta es muerde
			}
			if(iaction == this.iactions.get(1)) { //acción es comer
				irespuesta = this.irespuestas.get(0);//respuesta es feliz
			}
			if(iaction == this.iactions.get(2)) { //acción es tomar
				irespuesta = this.irespuestas.get(3);//respuesta es me se caga
			}
		}
		if(iestado == this.iestados.get(3)) { //si estado es sediento
			if(iaction == this.iactions.get(0)) { //acción es mimo
				irespuesta = this.irespuestas.get(7);//respuesta es se mea
			}
			if(iaction == this.iactions.get(1)) { //acción es comer
				irespuesta = this.irespuestas.get(6);//respuesta es bip bip
			}
			if(iaction == this.iactions.get(2)) { //acción es tomar
				irespuesta = this.irespuestas.get(0);//respuesta es feliz
			}
		}
		
		return irespuesta;
	}



	@Override
	public IEstado getRandomEstado() {
		int x = (int)(Math.random() * (this.iestados.size() - 0) + 0);
		return this.iestados.get(x);
	}
	
	@Override
	public IAction getRandomAction() {
		int x = (int)(Math.random() * (this.iactions.size() - 0) + 0);
		return this.iactions.get(x);
	}


}
