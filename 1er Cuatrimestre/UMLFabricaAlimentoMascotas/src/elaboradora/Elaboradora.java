package elaboradora;
import java.util.Date;
import ingrediente.Ingrediente;
import java.util.ArrayList;
import alimento.Alimento;
import materiaPrima.MateriaPrima;
import ordenDeFabricacion.OrdenDeFabricacion;

public class Elaboradora {
	
	private Date fechaDeHoy;
	private ArrayList<MateriaPrima> materiasPrima;
	private final int TOPE_MIN = 100;

	
	
	public Elaboradora(Date fecha) {
		super();
		this.fechaDeHoy = fecha;
		this.materiasPrima= new ArrayList<MateriaPrima>();
	}
	
public boolean hayStock(Ingrediente ingrediente, int kilosAProducir) {
		
		boolean result= false;
		
		int cantNecesitada;
		cantNecesitada=(kilosAProducir*ingrediente.getCantNecesaria())/TOPE_MIN;
		
		int codigoDeMateriaPrima;
		codigoDeMateriaPrima=ingrediente.getCodigoMateriaPrima();
		
		MateriaPrima materiaPrima;
		materiaPrima=buscarPorCodigoMateriaPrima(codigoDeMateriaPrima);
		
		if(materiaPrima != null) {
			int stockDeMateriaPrima;
			stockDeMateriaPrima= materiaPrima.getCantidadStock();
			if(cantNecesitada <= stockDeMateriaPrima) { result=true;}

		}

		return result;
	}
	
	public ArrayList<Ingrediente> verificarIngredientes(Alimento alimento , int kilosAProducir){
		
		ArrayList<Ingrediente> ingredientesFaltantes= null;
		
		ArrayList<Ingrediente> ingredientesNecesarios=null;
		ingredientesNecesarios=alimento.getReceta().getIngredientes();
		
		if(ingredientesNecesarios != null) {
		for(Ingrediente ingrediente: ingredientesNecesarios) {
			if(   ! (hayStock(ingrediente,kilosAProducir))) {
				ingredientesFaltantes.add(ingrediente);//verificar porq apunta  a nullPointer
			}
		}
		}
		return ingredientesFaltantes;
	}
	
	 public OrdenDeFabricacion crearOrdenFabricacion(Alimento alimento, int kilosAProducir) { 
		 	OrdenDeFabricacion ordenDeFabricacion=null;
		 
		 	if (  verificarIngredientes(alimento, kilosAProducir)==null && cumpleElMinimo(kilosAProducir)   ) {
		 		
	 		 ordenDeFabricacion = new OrdenDeFabricacion (alimento, kilosAProducir);
		 	
		 	}
	  		return ordenDeFabricacion;
	 }
	 
	 
	 
	 
	 public boolean cumpleElMinimo(int kilosAProducir) {
			boolean result=false;
			if(kilosAProducir >= TOPE_MIN) {
				result = true;
			}
			return result;
		}
	 
	 
	 
	 public MateriaPrima buscarPorCodigoMateriaPrima(int codigoMateria) {
		 MateriaPrima materiaPrimaBuscada= null;
		 boolean encontre= false;
		 int i =0;
		 
		 while( i < this.materiasPrima.size() && !encontre ) {
			 if(codigoMateria == this.materiasPrima.get(i).getCodigo() ) {
				 encontre=true;
				 materiaPrimaBuscada= this.materiasPrima.get(i);
			 }
		 }
		 
		 return materiaPrimaBuscada;
	 }



	 
	 
}
