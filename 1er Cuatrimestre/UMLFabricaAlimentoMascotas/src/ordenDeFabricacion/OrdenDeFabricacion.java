package ordenDeFabricacion;
import java.util.Date;
import alimento.Alimento;


public class OrdenDeFabricacion {


	
	private Date fecha;
	private Alimento alimento;
	private int kilosAProducir;
	
	public OrdenDeFabricacion( Alimento alimento,  int kilosAProducir) {
		
		super();
		this.alimento = alimento;
		this.kilosAProducir = kilosAProducir;
		Date date =  new Date();
		this.fecha= date;
	}



	
	
	
	
	
}
