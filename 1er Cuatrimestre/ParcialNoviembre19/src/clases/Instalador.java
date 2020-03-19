package clases;
//AGREGADOS PARA TEMA FECHA
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;	

import java.util.ArrayList;


public class Instalador {


	private Dispositivo dispositivo;
	
	public Instalador(int memoriaDispositivo){
		this.dispositivo= new Dispositivo(memoriaDispositivo);
		
	}


	 public void instalar(String nombre, int tamanioEnMb, String fecha){
		 
		 App app;
		 app= this.dispositivo.buscarApp(nombre);
		 if(app != null){
			 String fechaApp;
			 fechaApp = app.getFecha();
			 boolean esFechaMayor;
			 esFechaMayor=this.esFechaMayor(fecha, fechaApp);
			 boolean hayEspacioEnDispositivo;
			 hayEspacioEnDispositivo=this.dispositivo.hayEspacioEnDispositivo(tamanioEnMb);
			 if(esFechaMayor && hayEspacioEnDispositivo){
				 this.dispositivo.actualizarApp(app,tamanioEnMb, fecha);
				 System.out.println("se actualizó la app " + app.getNombre());
			 }else{System.out.println("la app no se instalará");}
			 
		 }else{
			 boolean hayEspacioEnDispositivo;
			 hayEspacioEnDispositivo=this.dispositivo.hayEspacioEnDispositivo(tamanioEnMb);
			 if( hayEspacioEnDispositivo){
			 app = new App(nombre, tamanioEnMb, fecha);
			 this.dispositivo.agregarApp(app);
			 System.out.println("se instaló la nueva aplicación " + app.getNombre());
			 }else{System.out.println("es nueva app pero no hay espacio en dispositivo");}
		 }
		 
		 
	 }




	@Override
	public String toString() {
		return "Instalador [dispositivo=" + dispositivo + "]";
	}


	//NO TOCAR
	public boolean esFechaMayor(String d1,String d2)
	{	
		boolean resul=false;
	try{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = sdf.parse(d1);
		Date date2 = sdf.parse(d2);

		if(date1.after(date2)){
			resul=true;
		}

	}
	catch(ParseException ex){
		ex.printStackTrace();
	}
	return resul;
	}

}
