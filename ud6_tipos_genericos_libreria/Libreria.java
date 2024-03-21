package ud6_tipos_genericos_libreria;

import java.util.ArrayList;

public class Libreria <T> {

	
	
		
		// CÓMO FUNCIONA UNA CLASE GENÉRICA
		
		/*Para mostrar cómo funciona realmente una clase genérica en Java, vamos a construir una clase llamada Libreria
		  que nos permitirá almacenar objetos de tipo Libro y Bolígrafo.
		  
		El principio en que se basa toda clase genérica es que puede almacenar un solo tipo de objeto, pero no diferentes 
		a la vez, es decir, se va a adaptar al tipo de dato que sea recibido como argumento y así evitamos tener una clase
		 por cada tipo de dato. Vamos a ver qué quiere decir esto.
		 */
	
	private ArrayList <T> lista = new ArrayList <T>();
	
	public void add(T objeto) {
		lista.add(objeto);
	}
	
	public ArrayList<T> getProducts(){
		return lista;
	}
	
	
	/*El parámetro de tipo T es el que maneja la clase Librería. Cuando queramos utilizar esta clase, debemos instanciarla y en 
	 * ese momento se le pasará el tipo de dato que queremos que se almacene en nuestro ArrayList llamado ‘lista’ que tenemos 
	 * declarado en la clase librería.
	 * 
	 * 
	Como otra clase independiente tenemos la clase Libro y la clase Boligrafo
	
	/*
	*En otra clase que contenga un método main(), se instanciará la clase Librería, pasándole como tipo de dato la clase Libro 
	*y por otro lado, pasándole como tipo de dato la clase Bolígrafo, de esta forma tendremos dos listas, una de libros y otra 
	*de bolígrafos. Como son listas de tipo ArrayList(recuerda que se declaró un atributo llamado ‘lista’ de tipo ArrayList en
	* la clase Librería) usaremos los métodos que provee el ArrayList, para añadir elementos a cada una de las listas
	* */
	

}
