package Ud2Bucles;

public class PracticandoFor {

	public static void main(String[] args) {
		
		// crear un programa que muestre los numero del 1 al 100
		
		for (int i=1; i<=100; i++) {
		//System.out.print(i + " ");
		}
		
		// SOLO MOSTRAR PARES
		
		for (int i=0; i<=100; i = i+2) {
		//System.out.print( i + " ");
		}
		
		
		// CUENTA ATRÁS DEL 100 AL 0
		
		for (int i=101; i>0; i--) {
		//System.out.println(i + "");
		}
		
		// IMPRIMIR EN PANTALLA MULTIPLO DE 5 ENTRE 0 Y 200 solo pudiendose i incrementar de uno en uno
		
		for (int i=1; i<=200; i++) {
			
			//if para comprobar si es divisible entre 5
			if (i%5==0)
			System.out.print(i + " " ); // el " " es para que entre numeros ponga un espacio
		}
		
		}
	}


