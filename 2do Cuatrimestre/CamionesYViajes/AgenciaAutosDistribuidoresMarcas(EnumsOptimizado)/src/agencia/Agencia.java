package agencia;

import java.util.ArrayList;

import auto.Auto;
import distribuidor.Distribuidor;

import marca.Marca;

public class Agencia {

	private Marca[] marcas;
	private ArrayList<Auto> autos;
	private Distribuidor[] distribuidores;
	
	public Agencia() {
		this.marcas = new Marca[5];
		this.autos = new ArrayList<Auto>();
		this.distribuidores = new Distribuidor[20];
		
		this.marcas = Marca.values();
		
		
		this.autos.add(new Auto(Marca.AUDI.getId(), 	Marca.AUDI.getModelo(1),	 15000));
		this.autos.add(new Auto(Marca.AUDI.getId(), 	Marca.AUDI.getModelo(2),	 25000));
		this.autos.add(new Auto(Marca.FORD.getId(), 	Marca.FORD.getModelo(1), 	 95000));
		this.autos.add(new Auto(Marca.FORD.getId(), 	Marca.FORD.getModelo(2),	 55000));
		this.autos.add(new Auto(Marca.PEUGEOT.getId(),	Marca.PEUGEOT.getModelo(1),  65000));
		this.autos.add(new Auto(Marca.PEUGEOT.getId(), 	Marca.PEUGEOT.getModelo(2),  27000));
		this.autos.add(new Auto(Marca.CHEVROLET.getId(),Marca.CHEVROLET.getModelo(1),85000));
		this.autos.add(new Auto(Marca.CHEVROLET.getId(),Marca.CHEVROLET.getModelo(2),35000));
		this.autos.add(new Auto(Marca.JEEP.getId(),		Marca.JEEP.getModelo(1), 	 85000));
		this.autos.add(new Auto(Marca.JEEP.getId(),		Marca.JEEP.getModelo(2),	 35800));
		
		
		distribuidores[0] = new Distribuidor("distrib1", this);
		distribuidores[1] = new Distribuidor("distrib2", this);
		distribuidores[2] = new Distribuidor("distrib3", this);
		distribuidores[3] = new Distribuidor("distrib4", this);
		distribuidores[4] = new Distribuidor("distrib5", this);
		distribuidores[5] = new Distribuidor("distrib6", this);
		distribuidores[6] = new Distribuidor("distrib7", this);
		distribuidores[7] = new Distribuidor("distrib8", this);
		distribuidores[8] = new Distribuidor("distrib9", this);
		
		
		
		
		
	}
	
	
	 public Marca[] getMarcas() {
		return marcas;
	}


	public ArrayList<Auto> getAutos() {
		return autos;
	}


	public Distribuidor[] getDistribuidores() {
		return distribuidores;
	}


	public double getPrecioAuto(String modeloAuto) {
		 double precio = 0;
		 Auto auto = devolverAuto(modeloAuto);
		 if(auto != null) {
			 precio = auto.getPrecio(); 
		 }
		 return precio;
	 } 
	 
	 private Auto devolverAuto(String modeloAuto) {
		 Auto auto = null;
		 int i = 0;
		 boolean encontrado = false;
		 while(!encontrado && i < this.autos.size()) {
			 if(this.autos.get(i).getModelo().equals(modeloAuto)) {
				 auto = this.autos.get(i);
				 encontrado = true;
			 }
			 i++;
		 }
		 return auto;
	 }
	 
	 public void informarValorPedido(int nroPedido) {
		 double precioPedido = -1;
		 int i =0;
		 boolean encontrado = false;
		 while(!encontrado && i < this.distribuidores.length) {
			 if(this.distribuidores[i] != null) {
				 precioPedido = distribuidores[i].devolverValorPedido(nroPedido);
				 if(precioPedido != -1) {
					 encontrado = true;
				 }
			 }
			 i++;
		 }
		 if(precioPedido != -1) {
			 System.out.println("El precio del pedido nro" + nroPedido+  " es $" + precioPedido);
		 }else {System.out.println("no existe pedido");}
	 }
	 
	 private int[][] getCantidadPedidosDistribuidoresXMarca(){
		 int [][] matriz = new int[20][5];
		 for (int i = 0; i < this.distribuidores.length; i++) {
			if(this.distribuidores[i] != null) {
				int[] vector = this.distribuidores[i].getCantidadPedidosPorMarca();
				matriz[i]  = vector;
			}
		}
		 return matriz;
	 }
	 
	 public void informarPedidosXDisMax() {
		 int[][] matriz  = getCantidadPedidosDistribuidoresXMarca();
		 for (int i = 0; i < matriz.length; i++) {
			if(matriz[i] != null) {
				String nombreDist  = devolverNombreDistribuidor(i);
				if(nombreDist != "") {
					System.out.println("para el distribuidor " + nombreDist);
					for (int x = 0; x < matriz[i].length; x++) {
						String nombreMarca = devolverNombreMarca(x);
						if(nombreMarca != "") {
							System.out.println("se vendió " + matriz[i][x] + " unids de marca " + nombreMarca);

						}
					}
				}
				
			}
		}
	 }
	 private String devolverNombreDistribuidor(int indexDistribuidor) {
		 String nombreDist =  "";
		 Distribuidor dist = this.distribuidores[indexDistribuidor];
		 if(dist != null) {
			 nombreDist = dist.getNombre();
		 }
		 return nombreDist;
	 }
	 private String devolverNombreMarca(int indexMarca) {
		 String nombreMarca =  "";
		 Marca marca = this.marcas[indexMarca];
		 if(marca != null) {
			 nombreMarca = marca.getNombre();
		 }
		 return nombreMarca;
	 }
	 private int[][] devolverMaxValueNroColumnaDist(int [][] matriz, int nroColumna) {
		 int [][] matrizNueva = new int[1][2];
		 int indexDistribuidorMax = -1;
		 int maxValue = 0;
		 for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][nroColumna] > maxValue) {
				maxValue  = matriz[i][nroColumna];
				indexDistribuidorMax = i;
				matrizNueva[0][0] = i;
				matrizNueva[0][1] = maxValue;
			}
		}
		 return matrizNueva;
	 }
	 public void informarDisMaxMar() {
		 int[][] matriz = getCantidadPedidosDistribuidoresXMarca();
		 for (int i = 0; i < 5; i++) {
			String nombreMarca =  devolverNombreMarca(i);
			if(nombreMarca != "") {
				int[][] max = devolverMaxValueNroColumnaDist(matriz, i);
				String nombreDistribuidor = devolverNombreDistribuidor(max[0][0]);
				if(max[0][1] != 0) {
					System.out.println("para marca " + nombreMarca + " el distribuidor " + nombreDistribuidor + " vendió "+ max[0][1] + " unids");
				}
				
			}
			
		}
	 }
}
