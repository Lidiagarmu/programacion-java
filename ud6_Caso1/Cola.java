package ud6_Caso1;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Cola {

	public static void main(String[] args) {
		
		
		//creamos una cola que viene de la clase Queue
		Queue<String> clientesCarrefour = new ArrayDeque();
		
		// 1. Insertar un dato en la cola
		
		//podemos usar tanto offer como add para añadir elementos a la cola
		clientesCarrefour.offer("Cliente Primero alias Pepe");
		clientesCarrefour.offer("Cliente Segundo alias Maria");
		clientesCarrefour.offer("Cliente Tercero alias Lidia");
		clientesCarrefour.offer("Cliente Cuarto alias Manuel");
		clientesCarrefour.add("Cliente Quinto alias Laura");
		clientesCarrefour.add("Cliente Sexto alias Federico");
		
		
		System.out.println("EJERCICIO 1");
		System.out.println("Cola clientes Carrefour: " + clientesCarrefour);
		System.out.println("----------------------------------------------------------");

		
		// 2. Recuperar un dato de la cola
		
		//vamos a recuperar por ejemplo al cliente numero 3 que se encuentra en la posicion 2 de nuestra cola
	
		Iterator<String> i = clientesCarrefour.iterator(); //ya tengo el iterador apuntando a mi cola
		
		
		int clientePosicion = 0;
		String clienteTercero = null;
		
		while (i.hasNext()) {
			clienteTercero = i.next();
			clientePosicion++;
			if (clientePosicion == 3) {
				break; //terminamos el bucle cuando lleguemos al tercer cliente que está en la posicion 2
			}
		}
		
		
		System.out.println("EJERCICIO 2");
		System.out.println("El tercer cliente de la cola de clientes Carrefour es: " + clienteTercero);
		System.out.println("----------------------------------------------------------");

		

		// 3. Obtener el dato de la cima de la cola
		
		//queremos obtener el de la cima de la cola, es decir,siguiente FIFO, el primero en llegar primero en salir
		//entiendo que el apartado se refiere al primero en salir, que es el primero que llegó
		//usamos peek para recuperar el primer elemento de la cola. Tambien se puede utilizar element

		String primerCliente = clientesCarrefour.peek();
		
		System.out.println("EJERCICIO 3");
		System.out.println("Primer cliente en la cola es: " + primerCliente);
		System.out.println("----------------------------------------------------------");
		
		
		// 4. Devolver el dato de la cima de la cola
		
		//devolvemos el cliente primero de la cola y lo eliminamos usando poll
		String clienteEliminado = clientesCarrefour.poll();
		
		System.out.println("EJERCICIO 4");
		System.out.println("Primer cliente de cola en pagar y ser eliminado es: " + clienteEliminado); //devuelve: Primer cliente en la cola en pagar y ser eliminado es: Cliente Primero
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Cola de clientes Carrefour después de eliminar al primer cliente: " + clientesCarrefour);
		//devuelve: Cola de clientes Carrefour después de eliminar al primer cliente: [Cliente Segundo, Cliente Tercero, Cliente Cuarto, Cliente Quinto, Cliente Sexto]

	}

}
