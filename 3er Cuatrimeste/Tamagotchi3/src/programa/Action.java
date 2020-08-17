package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Action implements IAction{
	
	MIMO("Mimo"), 
	COMER("Comer"),
	TOMAR("Tomar");

	public String valor;

	private Action(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String getValor() {
	    return this.valor;
	}
	
	
	public static ArrayList<IAction> getArrayActions() {
		ArrayList<IAction> array = new ArrayList<IAction>();
		List<Action> list = Arrays.asList(Action.values());
		for(Action r : list) {
			array.add(r);
		}
		return array;
	}

}
