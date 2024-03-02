package ud2CasoPractico;

import java.util.Scanner; //importamos la clase Scanner lo que nos permitirá obtener la entrada de datos primitivos (int, double, string...)

public class calculadoraPrestamo {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); /*de este modo creamos un objeto Scanner. Introducimos el parámetro Ssystem.in para indicar
		de dónde procederán la fuente de los datos, refiriéndose a una entrada estándar  o  al propio teclado */
		
		
		System.out.println("Ingrese la cantidad solicitada en concepto de préstamo: "); //esta sentencia hará que nos imprima la frase entre comillada en pantalla
		
		double cantidadSolicitada = sc.nextDouble(); /* aquí declaramos la variable cantidadSolicitada como tipo double . 
		Además con el métido sc.nextDoube() escanearemos el siguiente dato de entrada de tipo double
		
		*/
		
		double cantidadDevuelta = 0; // además declaramos la variable cantidadDevuelta de tipo double inicializándola en 0. Posteriormente usaremos esta nueva variable
		
		
		
		while (cantidadDevuelta < cantidadSolicitada)  /* en este punto lo que haremos será crear un bucle el cual nos permite ejecutar la sentencia de la fila 26 
		mientras se cumpla la condición que lleva dentro de los () . Es decir si la condición se cumple, imprimirá en pantalla la frase entre comillada.
		 */
		{
			System.out.println("Ingrese la cantidad aportada para devolver el préstamo: ");
			double aportacion = sc.nextDouble(); /* declaramos una nueva variable de tipo double llamada aportación. Este dato será escaneado por el método 
			sc.nextDouble()*/
			
			
			
			//Ahora vamos al EXTRA del ejercicio:
			
			while (cantidadDevuelta + aportacion > cantidadSolicitada) /* Anidamos otro bucle while para que, mientras que la cantidad total devuelta sea mayor a la
			cantidad solicitada, el programa advierta al usuario y le pida una nueva aportación*/
			{
				System.out.println("¡Espera! Estás pagando de más");
				System.out.println("Ingrese la cantidad aportada para devolver el préstamo sin pasarse del importe solitado: ");
				 aportacion = sc.nextDouble();
				}
			
			cantidadDevuelta += aportacion; //con esta sentencia lograremos que las aportaciones del usuario se vayan sumando a la cantidad ya devuelta por el mismo
			
			
			
			if (cantidadDevuelta<cantidadSolicitada) {
				System.out.println("Importe pendiente: " + (cantidadSolicitada - cantidadDevuelta)); /*con esta condición if lo que queremos es que después de cada 
				aportación se imprima en pantalla un mensaje con el importe pendiente de pago. Esto se hace restando la cantidadSolicitada a la cantidadDevuelta
				 */
			}
			
		} 
			
		
		/* por último, saldremos del bucle o el programa dejará de iterar el bucle cuando NO se cumpla la condición del while "padre" de la línea 36, 
		 es decir, cuando la cantidadDevuelta sea estrictamente igual a la cantidadSolicitada */
		
		System.out.println("¡Préstamo completamente devuelto!");  //por lo que nos imprimirá el siguiente mensaje en pantalla
		
		sc.close(); //cerramos Scanner
	}

}
