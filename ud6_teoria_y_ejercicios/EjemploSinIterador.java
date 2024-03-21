package ud6_teoria_y_ejercicios;

import java.util.ArrayList;

import java.util.List;

public class EjemploSinIterador {

	public static void main(String[] args) {
		
		/*Se crea una nueva lista llamada ‘lista’ que almacena elementos de tipo String mediante la implementación de 
		 un ArrayList.
		 
		 Se agregan 3 elementos a la lista.
		 
		 Se recorre la lista usando un sencillo bucle for.*/
		
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		

	}

}
