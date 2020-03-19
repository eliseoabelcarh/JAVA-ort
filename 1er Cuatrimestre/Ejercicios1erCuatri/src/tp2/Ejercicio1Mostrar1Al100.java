package tp2;




public class Ejercicio1Mostrar1Al100 {

	
	public static void main(String[] args) {
		
		int i;
		int j;
		int num;
		final int VALORINICIAL =1;
		final int VALORFINAL =10;
		
		
		//muestra del 1 al 100 usando for
		for(i=VALORINICIAL; i<=VALORFINAL; i++) {System.out.println(i);}
		
		//muestra del 100 al 1 usando for
		for(j=VALORFINAL; j>=VALORINICIAL; j-- ) {System.out.println(j);}
		
		//muestra del 1 al 100 usando while
		num=VALORINICIAL;
		while(num<=VALORFINAL) {System.out.println(num);num++;}
		
		num=VALORFINAL;
		while(num >= VALORINICIAL){System.out.println(num);num--;}
	
		
		//muestra del 100 al 1 usando do-while
		num=VALORFINAL;
		do {
			System.out.println(num);num--;
		} while(num>=VALORINICIAL);
		
		
		
		
	}
	
}
