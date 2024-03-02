package Ud2Bucles;

import java.util.Scanner;

public class PracticandoWhile {

	public static void main(String[] args) {
		// crea un programa que escoja al azar entre 0 y 100. Tenemos que adivinar el numero elegido
		// el programa nos ira dando pistas en funcion de nuestras respuestas
		
		
		Scanner sc = new Scanner(System.in);
		
		
		/* ¿por que le doy valor a aleatorio y a numero_usuario sy luego voy a leerlo por consola? porque necesito
		  entrar en el bucle y para ello tengo que darles un valor. Es decir, le doy un valor que se que no va a cumplirse para que 
		  entre la primera vez
		 */
		int aleatorio = (int) (Math.random()*100);
		int numero_usuario = -1; 
		
		//mientras el numero del ususario sea distinto al del escogido por el PC....
		
		while (aleatorio!=numero_usuario) {
			System.out.println("Introduce un numero entre 0 y 100");
			numero_usuario = sc.nextInt();
			
			// si el numero es mayor....
			if (aleatorio>numero_usuario)
				System.err.println("El numero es mayor");
			else if(aleatorio<numero_usuario)
				System.out.println("Es menor");
			
			else 
				System.out.println("Has acertado!!!!!");
		}
		
		/* -----------EXPLICACION--------------------------------------
		 * El PC escogerá un numero aleatorio con el metodo random. 
		 * Despues mientras aleatorio sea distinto de numero_usuario entrará en bucle a iterar 
		 * Ahora pedira al usuario que introducca un numero
		 * ya dentro del bucle si aleatorio es MAYOR imprimira "es mayor" al aleatorio
		 * si es MENOR imprimirá "es menor" al aleatorio
		 * cuando los 2 numeros coincidan (es decir cuando se haya adivinido) saldrá del bucle e imprimira "Has acertado!!!!"
		 
		  */
		
	}

}
