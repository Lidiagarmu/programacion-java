package Ud2Bucles;

import java.util.Scanner;


public class ud2_bucle_switch {

	public static void main(String[] args) {
		
		// BUCLE SWITYCH --> estructura de selección múltiple que permite seleccionar un bloque de sentencias entre varios casos
		
		/* Es parecido al if else anidados, solo que la selección del bloque de sentencias depende de la evaluación de una expresión que se compara
		 con igualdad con cada uno de los casos
		 
		 
		 La estructura switch consta de una expresión y una serie de etiquetas case y una sola opción default. La sentencia break indica el 
		 final de la ejecución del switch
		 
		 
		* Es importante colocar una instrucción break al final de cada case que desees termine la ejecución una vez se cumpla la condición. De 
		 esta forma solo se ejecutará el código case correspondiente y no se continuará con los siguientes case.
		 En default (por defecto) no es necesario poner el break puesto que suele ser el último caso que se ejecutará cuando no se cumpla nonguna de las 
		 especificadas en los casos anteriores, por tanto, llega a su fin y no hay mas casos que evaluar
		 
		*/
		
		
		//EJEMPLO 1 con ELSE IF:
		
		int lado1= 0;
		int lado2= 0;
		int lado3= 0;
		int lado4= 0;
		int lado5= 0;
		int lado6= 0;
		
		for(int i=1; i<=1000; i++) {
			int dado=1+(int)(Math.random()*6); // declaro la variable dado inicializandola en 1 multiplicado por 6 que son las opciones que tiene un dado
			
			if (dado==1)  {
				lado1++; // esto quiere decir que si dado es 1 incremenamos el lado 1
			} else if (dado==2) {
				lado2++;
				
				} else if (dado==3) {
					lado3++;
					
					} else if (dado==4) {
						lado4++;
					
						} else if (dado==5) {
							lado5++;
							} else if (dado==6) {
								lado6++;
							}
			
		}
		
		System.out.println("Cantidad de veces que salió el 1:"+lado1);
		System.out.println("Cantidad de veces que salió el 2:"+lado2);
		System.out.println("Cantidad de veces que salió el 3:"+lado3);
		System.out.println("Cantidad de veces que salió el 4:"+lado4);
		System.out.println("Cantidad de veces que salió el 5:"+lado5);
		System.out.println("Cantidad de veces que salió el 6:"+lado6);
		
		

		
		
		//EJEMPLO 1 con SWITCH:
		
		
		int cara1=0;
		int cara2=0;
		int cara3=0;
		int cara4=0;
		int cara5=0;
		int cara6=0;
		
		for(int i=0; i<=1000;i++) {
			int dadoo=1+(int)(Math.random()*6);
				
		
		
			switch (dadoo) {
			case 1: cara1++;
					break;
			case 2: cara2++;
					break;
			case 3: cara3++;
					break;
			case 4: cara4++;
					break;
			case 5: cara5++;
					break;
			case 6: cara6++;
					break;
					
			
			}	
					
	}
		
		System.out.println("Número de veces que salió el 1:"+cara1);
		System.out.println("Número de veces que salió el 1:"+cara2);
		System.out.println("Número de veces que salió el 1:"+cara3);
		System.out.println("Número de veces que salió el 1:"+cara4);
		System.out.println("Número de veces que salió el 1:"+cara5);
		System.out.println("Número de veces que salió el 1:"+cara6);

		
		
		//EJEMPLO 2 con SWITCH:
		
		
		int veces1=0;
		int veces5=0;
		int veces10=0;
		int otros=0;
		
		for (int i=0; i<=100; i++) {
			int valor = 1 +(int)(Math.random()*10);
			
			switch (valor) {
			
			case 1: veces1++;
			break;
			
			case 5: veces5++;
			break;
			
			case 10: veces10++;
			break;
			
			default:
				otros++;
				
			}
		}
		
		System.out.println("Cantidad de veces que salieron 1: " + veces1);
		System.out.println("Cantidad de veces que salieron 5: " + veces5);
		System.out.println("Cantidad de veces que salieron 10: " + veces10);
		System.out.println("Cantidad de veces que salieron otros números: " + otros);
		
		
		//CASOS EN LOS QUE NO ES NECESARIO PONER BREAK:
		
		//EJEMPLO --> El problema: simular la tirada de un dado 1000 veces. Mostrar cantidad de veces que salieron pares e impares
		
		
		int pares=0;
		int impares=0;
		
		for (int i=0; i<1000; i++) {
			int daadoo = 1 + (int)(Math.random()*6);
			
			switch (daadoo) {
			
			case 1:
			case 3:
			case 5:
				impares++;
				break;
			case 2:
			case 4:
			case 6:
				pares++;
				break;
				
			}
		}
		
		System.out.println("Numero de veces que salieron pares: " + pares);
		System.out.println("Numero de veces que salieron impares: " + impares);
		
		
		// Ademas en la estructura SWITCH podemos almacenar una variable de tipo STRING-----------------------
		
		
		/*EJEMPLO --> Problema: Almacenar en un vector los nombres de dias que trabaja un empleado. Contar la cantidad de dias que 
		 pertenecen a dias laborales y fin de semana.
		 */
		
		String[] trabajo = {"lunes", "miércoles", "sábado", "domingo"}; /*vector al que hemos llamado trabajo, de tipo String y 
		lo inicializamos con los dias de trabajo del empleado */
		
		int laborales =0;
		int finsemana =0;
		
		for (int i=0; i< trabajo.length; i++) // con el for recorreremos el vector trabajo. Le metemos el atributo .length para saber la longitud del vector
			switch (trabajo [i]) { /* la primera [i] vale 0 por lo que lee la posición 0 "lunes", incrementa despues en 1 por lo que lee "miércoles"y asi
			 hasta 3 "domingo" (esto es gracias a trabajo.length) */
			
			case "lunes":
			case "martes":
			case "miércoles":
			case "jueves":
			case "viernes":
				laborales++;
				break;      // si se dan cualquiera de estos 5 casos incrementará en uno laborables. corta en break. Sin este primer break incrementaría siempre finsemana
			case "sábado":
			case "domingo":
				finsemana++;
				break;     // si se dan cualquiera de estos 2 casos incrementará en uno finsemana. corta en break
				
		}
		System.out.println("Cantidad de días que trabaja en días hábiles: " + laborales);
		System.out.println("Cantidad de días que trabaja en fin de semana: " + finsemana);
		
		
		
		// ejemplo básico SWITCH ud2:
		
		/* Problema:
		 * 
		 * Segun una variable llamada numero cuyo valor es 1 se almacene en otra variable de nombre cadena un texto que 
		 * indique si es cero, uno, dos o distinto de todos ellos.
		 * Al final se mostrará el valor de la variable cadena
		 * Reflexiona sobre cómo hacer para que aparezcan distintos mensajes
		 * 
		 * Si no inicializaramos numero con el  1, podriamos hacer que el usuario introdujera el valor utilizando la clase Scanner
		 */
		 
		
		int numero = 1;
		String cadena;
		switch (numero) {
		
		case 0: cadena = "Es cero";
			break;
		case 1: cadena = "Es uno";
			break;
		case 2: cadena = "Es dos";
		
		default: cadena= "Es distinto de 0, 1 ó 2";
		
		}
		System.out.println(cadena); //La salida de pantalla es: "Es uno"
		
				
		
		
		
		
		}
}
