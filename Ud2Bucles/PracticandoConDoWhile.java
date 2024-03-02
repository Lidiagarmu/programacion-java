package Ud2Bucles;

import java.util.Scanner;

public class PracticandoConDoWhile {

	public static void main(String[] args) {
		// mismo ejercicio que en class PracticandoWhile
		
		
		/* ¿por que le doy valor a aleatorio y a numero_usuario sy luego voy a leerlo por consola? porque necesito
				  entrar en el bucle y para ello tengo que darles un valor. Es decir, le doy un valor que se que no va
				   a cumplirse para que  entre la primera vez
				 */
		
		Scanner sc = new Scanner(System.in);
		
		int aleatorio = (int) (Math.random()*100);
		int numero_usuario ; 	// Aqui en DO-WHILE ya no hace falta inicializar el número_usuario por que en do-while ya entra
		// en el bucle no hace falta forzarlo para entrar
 
		
		 do {
			System.out.println("Introduce un numero entre 0 y 100");
			numero_usuario = sc.nextInt();
			
			// si el numero es mayor....
			if (aleatorio>numero_usuario)
				System.out.println("El numero es mayor");
			
			else if(aleatorio<numero_usuario)
				System.out.println("Es menor");
			
			else 
				System.out.println("Has acertado!!!!!");
			
		} while (aleatorio != numero_usuario); 
	
	}
}		 
		 		/*-----------EXPLICACION----------------
		 		 Lo que hace DO-WHILE es PC elije num aleatorio, despues pregunta al usuario por un numero 
		 		 En las sentencias dependiendo de cual se cumpla imprimira un mensaje u otro en pantalla
		 		 entonces cuando llega a while en cada iteracion mientras se sigue cumpliendo que
		 		 aleatorio y numero_usuario son distintos seguirá iterando en el bucle sino, saldrá
		 		 
		 		 Este es un claro ejemplo de usar DO-WHILE
		 		 
		 		 * */
		 		 
	


