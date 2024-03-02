package Ud2Bucles;

import java.util.Scanner;

public class ud2_While {

	public static void main(String[] args) {
	
		
		//BUCLE WHILE------------------------
		
		/*  Este estructura repite el bloque de sentencias mientras la condicion del while es verdadera
		 * la condicion se escribe entre parentesis y se comprueba justo al principio
		 * si el resultado es falso, no se ejecuta el bloque de sentencias y finaliza el while
		 * 
		 * 
		 * Se puede ejecutar el bloque de sentencias de 0 (ninguna) a n (muchas) veces
		 * 
		 * En cada iteracion, cuando finaliza la ejecucion del bloque de sentencias, vuelve a evaluar la condicion, si esta 
		 * es verdadera, ejecuta el bloque de sentencias, sino lo finaliza y asi sucesivamente

		 * */
		
		
		//EJEMPLO : Pide un numero al usuario para que se muestre en pantalla la tabla de multiplicar de dicho numero hasta el 10
		
		Scanner sc = new Scanner(System.in);
		int numero, contador, resultado;
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		
		contador = 1;
			while (contador<=10) {
				resultado=contador*numero;
				System.out.println(numero + "*" + contador + "=" + resultado );
		contador = contador + 1;
			}
			sc.close();
				
	}

}
