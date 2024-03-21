package ud6_teoria_y_ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploIterador {

	public static void main(String[] args) {
		
		/*En el siguiente ejemplo en vez de recorrer la lista con una estructura for como de costumbre, se hace
		uso de un while y  un iterador, después de añadir los elementos a la lista.
		Borraremos aquel que esté repetido*/
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 2");

		
		System.out.println("Lista inicial: " + lista);
		
		//creamos el iterador
		
		Iterator<String> it = lista.iterator();
		
		//recorremos la lista 
		
		while (it.hasNext()) {
			String elemento = it.next();
			if(elemento.equals("Elemento 2")) {
				//elimina el elemento "Elemento 2"
				it.remove();
			}
		}
			
		//mostramos la lista despues de eliminar elemento repetido
			
		System.out.println("Lista sin repetidos: " + lista);
			
			
		
			
		
		
	}

}
