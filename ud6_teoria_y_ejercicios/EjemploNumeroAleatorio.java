package ud6_teoria_y_ejercicios;

public class EjemploNumeroAleatorio {

	public static void main(String[] args) {
	
		
		//rango de valores 0.0 <= numero < 10.0
		
		int numero1 = (int) (Math.random() * 10 +1 ); 
		
		//al multiplicarlo por 10+1, el rango de valores será 0.0 <= numero <= 10.0(se incluye también el 10

	
	System.out.println("Número aleatorio: " + numero1);


	
	}


}
