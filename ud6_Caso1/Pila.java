package ud6_Caso1;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		
		
		
		//creamos una pila que viene de la clase Stack
		
		Stack<String> mensajesBuzon = new Stack<>();
		
		// 1. Insertar un dato en la pila
		
		mensajesBuzon.push("Mensaje 20 Marzo 9 am");
		mensajesBuzon.push("Mensaje 20 Marzo 6 pm");
		mensajesBuzon.push("Mensaje 21 Marzo 10 am");
		mensajesBuzon.push("Mensaje 22 Marzo 3 pm");
		
		System.out.println("EJERCICIO 1");
		System.out.println("Pila de mensaje en buzón: "+ mensajesBuzon); 
		System.out.println("----------------------------------------------------------");
		
		
		// 2. Recuperar un dato en la pila
		
		
		// 2.1 ----------FORMA 1------------
		//convertimos Stack a ArrayDeque
		ArrayDeque<String> ad = new ArrayDeque<>(mensajesBuzon);
		
		//ahora si, recuperamos el primer dato en la pila usando peekFirst
		String primerMensaje = ad.peekFirst();
		
		
		System.out.println("EJERCICIO 2.1");
		System.out.println("Primer mensaje en el buzón: "+ primerMensaje); //devuelve: Primer mensaje en el buzón: Mensaje 20 Marzo 9 am
		System.out.println("----------------------------------------------------------");
		
		
		// 2.2 ----------FORMA 2--------------
		/*Si quisieramos obtener el segundo mensaje de la lista por ejemplo, lo haríamos utilizando un ITERADOR*/
		Iterator<String> i = mensajesBuzon.iterator(); //ya tengo el iterador apuntando a mi pila
		
		int mensaje = 0;
		String datoBuscado = null;
		
		while (i.hasNext()) {
			datoBuscado = i.next();
			mensaje++;
			if (mensaje == 2) {
				break; //terminamos el bucle cuando lleguemos al segundo mensaje que está en la posicion 1
			}
		}
		
		System.out.println("EJERCICIO 2.2");
		System.out.println("El segundo mensaje que esta en la posicion 1 es: " + datoBuscado); // devuelve: El segundo mensaje que esta en la posicion 1 es: Mensaje 20 Marzo 6 pm
		System.out.println("----------------------------------------------------------");
		
		// 3. Obtén el dato de la cima de la pila 
		
		//para ello emplearemos el método  peek()
		String ultimoMensaje = mensajesBuzon.peek();
		
		System.out.println("EJERCICIO 3");
		System.out.println("Último mensaje en el buzón: " + ultimoMensaje); //devuelve: Último mensaje en el buzón: Mensaje 22 Marzo 3 pm
		System.out.println("----------------------------------------------------------");
		
		// 4. Devolver el dato de la cima de la pila
		
		//devolvemos el dato y lo eliminamos de la cima
		String borrarMensajeCima = mensajesBuzon.pop();
		
		System.out.println("EJERCICIO 4");
		System.out.println("Devolver y eliminar mensaje de la cima: " + borrarMensajeCima); //devuelve: Devolver y eliminar mensaje de la cima: Mensaje 22 Marzo 3 pm
		System.out.println("----------------------------------------------------------");
		
		System.out.println("COMPROBANDO QUE SE HA ELIMINADO EL MENSAJE DE LA CIMA: " + mensajesBuzon);
		// devuelve: COMPROBANDO QUE SE HA ELIMINADO EL MENSAJE DE LA CIMA: [Mensaje 20 Marzo 9 am, Mensaje 20 Marzo 6 pm, Mensaje 21 Marzo 10 am]
		
		
		

	}

}
