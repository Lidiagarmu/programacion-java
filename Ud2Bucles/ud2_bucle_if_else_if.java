package Ud2Bucles;

import java.util.Scanner;

public class ud2_bucle_if_else_if {

	public static void main(String[] args) {
		
		// BUCLE IF ELSE IF------------------------------
		
		/*ejemplo: 
		 
		 * Necesitas conocer la puntuacion de una serie de estudiantes en base a una tabla de baremación de 0 al 10.
		 * El usuario debe introducir la puntuación en forma de número entero o decimal
		 *  y la ejecución mostrará en pantalla un mensaje textual que indica la calificación obtenida que aparece entre comillas en el siguiente listado
		 *  
		 *  Igual o mayor a 9 --> Excelente
		 *  Igual o mayor a 8 y menor que 9 --> Muy bueno
		 *  Igual o mayor a 7 y menor que 8 --> Bueno
		 *  Igual o mayor a 5 y menor que 7 --> Suficiente
		 *  Si menos que 5 --> Insuficiente
		
	
		 */
		
		
		double nota;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce puntuación del estudiante (0-10): ");
		
		nota=sc.nextDouble();
		
		if (nota>=9) {
			System.out.println("Excelente");
			
		} else if (nota>=8) {
			System.out.println("Muy Bueno");
		} else if (nota>=7) {
			System.out.println("Bueno");
		} else if (nota>=5) {
			System.out.println("Suficiente");
		} else {
			System.out.println("Insuficiente");
		}
		
		sc.close();
	}

}
