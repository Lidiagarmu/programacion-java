package ud6_3_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ejerciciopropuesto2 {

	public static void main(String[] args) {
		
		/* 	Crea un programa que solicite por pantalla dos números para generar un rango de valores:
		  		- Utilizar nextInt de Scanner para leer cada número
		  
		 	A continuación, debe solicitar otro número, para buscar sus múltiplos dentro del rango anterior.
		  
		  	El programa debe generar nu ArrayList con todo el rango de números:
		  		-Utiliza un for para recorrer todo el rango y el método add para añadirlos a la lista
		  
		  	El programa debe cambiar los números que no sean múltiplos por `0`:
		  		-Utiliza un for para recorrer la colección y set para cambiarlos
		  
		 * */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		//solicitamos los numeros 1 y 2 para obtener el rango
		
		System.out.println("Introduzca el primer número para generar rango de valores");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número para generar rango de valores");
		int numero2 = sc.nextInt();
		
		
		//guardo los numeros generados en un ArrayList a través de un bucle for. 
		//este for gracias a los metodos min y max de la clase Math obtendra el numero pequeño y el grande para hacer el rango y 
		//en cada iteración irá guardando los números del rango en la lista gracias al método .add
		
		
		ArrayList<Integer> rango = new ArrayList<Integer>();
		
		for (int i=Math.min(numero1, numero2); i <= Math.max(numero1, numero2); i++) {
			rango.add(i);	
		}
		
		System.out.println("Lista inicial: " + rango);
		
		
		//solicitamos el tercer numero para buscar sus multiplos en ese rango
		
		System.out.println("Introduczca el tercer número para buscar sus múltiplos dentro del rango anterior");
		int numero3 = sc.nextInt();
		
		
		//cambiamos con un bucle for los numeros que no son multiplos por ceros
		
		for (int i = 0; i<rango.size(); i++) {
			if (rango.get(i) % numero3 !=0) {
				rango.set(i, 0);
				
			}
		}
		
		//imprimimos el Arraylist con los cambios
		
		
		System.out.println("Rango con múltiplos de " + numero3 + ": ");
			for (int numeros : rango) {
				System.out.println(numeros);
			}
		
	
		
		
	
	}

}
