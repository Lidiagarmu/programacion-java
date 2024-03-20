package ud6_3_colecciones;

import java.util.Stack;

public class MiPrimeraPila {

	public static void main(String[] args) {
		
		//push: sirve para apilar un nuevo elemento en la pila de tipo Stack, quedando al principio de la estructura
		//si usamos ArrayDeque, se pueden utilizar addFirst o offerFirst
		
		//pop: sirve para extraer un elemento de una pila de tipo Stack, es decir lo devuelve y lo saca de la estructura.
		//si utilizamos ArrayDeque, se pueden utilizar removeFist o pollFirst
		
		//peek: sirve para obtener el primer elemento de una pila tipo Stack (devuelve el elemento de la cima sin retirarlo)
		//si utilizamos ArrayDeque, podemos utilizar getFirst o peekFirst
		
		
			Stack<String> pila = new Stack<>();
			
			pila.push("Primero");
			pila.push("Segundo");
			pila.push("Tercero");
			pila.push("Cuarto");
			
			while (!pila.isEmpty()) {
				System.out.println("operacion()");
			}
		

	}

}
