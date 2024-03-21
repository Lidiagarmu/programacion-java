package ud6_teoria_y_ejercicios;

import java.util.LinkedList;

public class EjemploLinkedList {

	public static void main(String[] args) {
		
		/* Crea una LinkedList que almacene cadenas.
		• Añade elementos al inicio y al final utilizando los métodos addFirst() y addLast().
		• Recorre la lista y muestra los elementos antes y después de las inserciones y eliminaciones.*/

		
		LinkedList<String> nombres = new LinkedList<>();		
		
		nombres.add("Rocio");
		nombres.add("Juan");
		nombres.add("Daniel");
		
		//agregar al principio
		nombres.addFirst("Sandra");
		
		//agregar al final
		nombres.addLast("Javi");
		
		
		
		System.out.println("Elementos LinkedList: ");
		
		
		//acceder y mostrar elementos 
		for (String nombre : nombres) {
			System.out.println(nombre);
			
		}
		
		//eliminar el primer y último elemento
		
		nombres.removeFirst();
		
		nombres.removeLast();
		
		
		//mostrar lista actualizada
		
		System.out.println("Elementos despues de eliminar:\\n ");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
	}

}
