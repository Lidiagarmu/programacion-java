package ud6_3_colecciones;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MiPrimeraLista {

	public static void main(String[] args) {
	
		
		List<String> lista = Arrays.asList("Lunes", "Martes","Miercoles", "Jueves","Viernes", "Sabado", "Domingo");
		
		System.out.printf("El primer elemente es %s y el tamaño de la lista es %d ", lista.get(0), lista.size()); // El primer elemente es Lunes y el tamaño de la lista es 7 
		 
		System.out.println("\nLa lista es: " + lista); //La lista es: [Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo]

		
		//recorremos la lista
		
		System.out.println("--------------------------------------------------------");
		System.out.println("RECORRIDO CON UN FOR NORMAL");
		
		for (int i=0; i< lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.println("RECORRIDO CON UN FOR EACH");
		
		for (String elemento : lista) {
			System.out.println(elemento);
			
		}
		
		// usando un iterador (clase ITERATOR)
		
		Iterator<String> it = lista.iterator(); // con esto creo una especie de puntero que apunta al primer elemento de lista. se situa justo delante de la posicion 0
		
		System.out.println("--------------------------------------------------------");
		System.out.println("RECORRIDO CON UN ITERADOR");
		while (it.hasNext())
			System.out.println(it.next() + " ");
	
	
	
		//para recorrer la lista al reves con  un iterador
	
		ListIterator<String> li = lista.listIterator(lista.size());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("RECORRIDO INVERSO CON UN ITERADOR");
	    
		while(li.hasPrevious()) {
		System.out.println (li.previous() + " ");
		}
		
	}
}
