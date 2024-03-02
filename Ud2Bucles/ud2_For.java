package Ud2Bucles;

import java.util.Scanner;

public class ud2_For {

	public static void main(String[] args) {
		
		
		// BUCLE FOR ----------------------------
		
		/* La estructura de repetición FOR repite el bloque de sentencias mientras la condicion del for es verdadera
		 * FOR es un caso particular de WHILE. Solo se DEBE UTILIZAR cuando se sabe el número de veces que se debe repetir el bloque de sentencias
		 * 
		 SINTAXIS --> for (inicializacion; condicion; actualizacion) { 
		 bloque de sentencias
		 }
		
		 
		 */
		 
		
		//EJEMPLO UD2: Pide un numero al usuario para que se muestre en pantalla la tabla de multiplicar de dicho numero hasta el 10
		
		Scanner sc = new Scanner(System.in);
		int numero, resultado;
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		
	
			for  ( int contador=1; contador<=10; contador++) {
				resultado=contador*numero;
				System.out.println(numero + "*" + contador + "=" + resultado );
		
			}
			sc.close();
		
			
		//EJEMPLO UD2  2:
			
		/* 
		  Se pueden ANIDAR estructuras FOR en Java es muy común cuando se trabaja con arrays bidimensionales.
		  Ejemplo sencillo para imprimir los números en un patrón triangular
		  
		  PROBLEMA: Cada fila tiene una secuencia de números que comienza en 1 y aumenta en uno hasta el número de la fila correspomdiente
		  Esto crea un patrón triangular que se va formando a medida que aumenta el número de filas.
		  El número de filas dependerá de la condición de salida del bucle mas externo, en este caso será cuando i sea mayor a 5 (mientras i
		   sea menor o igual a 5 el bucle seguirá ejecutandose
		 
		 */
			
			for (int i=1; i<= 5; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print(j + " "); //este .print lo ejecuta en la misma línea
				}
				System.out.println(); // este .prinln lo ejecuta en otra linea
			}
	}

}
