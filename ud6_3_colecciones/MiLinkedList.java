package ud6_3_colecciones;

import java.util.Iterator;
import java.util.LinkedList;

public class MiLinkedList {

	public static void main(String[] args) {
		
		//creo mi linkedlist vacio
		
		LinkedList <String> ll = new LinkedList<String>();
		
		//añadimos elementos
		
		ll.add("Ana");
		ll.add("Silvia");
		ll.add("Mario");
		ll.add("Juan");
		ll.add("Jose");
		ll.add("Sara");
		
		
		//los LINKEDLIST son mas eficiente que los arraylist para borrar elementos (arraylist para buscar elementos)
		
		//vamos a borrar todos los elementos de la lista que empiezan por s
		
		
		System.out.println("LISTA ORIGINAL" + ll);
		Iterator<String> it = ll.iterator(); //ya tengo un iterador que está señalando a mi lista
		String elemento;
		
		//ahora tengo que recorrer uno a uno de la lista
		//mientras haya un siguiente (me lo da hasnext()) , me los va a guardar en la variable creada elemento y eso me lo da next()
		//si el caracter de la posicion 0 del elemento empieza por S borramelo gracias a chartAt y remove
		
		while (it.hasNext())  {
			elemento= it.next();
			
			if(elemento.charAt(0) == 'S')
				it.remove();
		}
		
		
		System.out.println("LISTA SIN 'S': " + ll);
		
		

	}

}
