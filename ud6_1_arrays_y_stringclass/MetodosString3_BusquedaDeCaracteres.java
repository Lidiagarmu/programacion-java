package ud6_1_arrays_y_stringclass;

public class MetodosString3_BusquedaDeCaracteres {

	public static void main(String[] args) {
		
		
		/*  indexOf(int ch)
		 * 
		 * Devuelve la posición de la primera ocurrencia de un carácter dentro de la cadena de texto. 
		 * En el caso de que el carácter buscado no exista devolverá -1. Si lo encuentra devuelve un número entero con la 
		 * posición que ocupa en la cadena.
		 * 
		 * 
		 * 
		 * indexOf(int ch, int fromIndex)
		 * 
		Realiza la misma operación que el anterior método, pero en vez de hacerlo a lo largo de toda la cadena lo hace desde el 
		índice (fromIndex) que se le indique.
		 *
		 * 
		 * 
		 *  lastIndexOf(int ch)
		 *  
		Indica cuál es la última posición que ocupa un carácter dentro de una cadena. Si el carácter no está en la cadena devuelve -1.
		
		
		*   lastIndexOf(int ch, int fromIndex)
		
		Lo mismo que el anterior, pero a partir de una posición indicada como argumento.
		
		*/
				
		/*EJERCICIO
		 * 
		 * Realiza un programa que muestre
		 * - la longitud de una cadena
		 * - la posición de cada una de sus letras 
		 * - busque la primera ocurrencia de un determinado carácter a partir de una posición. 
		 * - que muestre la última ocurrencia de un  carácter dentro de la cadena.*/
		
		
		String frase = "Hola, cómo estás? Estoy bien, gracias";
		
		System.out.println("La longitud de la cadena es: " + frase.length() + "\n");
		
		//mostrar el indice de cada letra dentro de la cadena
		
		for(int i=0; i<frase.length();i++) {
			char caracter = frase.charAt(i);
			System.out.println("Caracter #" + (i+1) + ": " + caracter);
		}
		
		
		// Buscar la primera ocurrencia de la letra 'o' después del índice 10
		
		int primeraOcurrenciaO = frase.indexOf('o', 10);
		System.out.println("\nPrimera ocurrencia de 'o' despues del indice 10: " + primeraOcurrenciaO); //21
		
		//Buscar ña última ocurrendia de la letra 'e'
		
		int ultimaOcurrenciaE = frase.lastIndexOf('e');
		System.out.println("\nÚltima ocurrencia de 'e' es: " + ultimaOcurrenciaE); //26
	}

}
