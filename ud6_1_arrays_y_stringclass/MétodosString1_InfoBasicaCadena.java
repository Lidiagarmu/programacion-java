package ud6_1_arrays_y_stringclass;

public class MétodosString1_InfoBasicaCadena {

	public static void main(String[] args) {
		
		/*Crea una cadena y que se muestre en pantalla su longitud, el primer caracter y el ultimo de la misma.
		 * Ten en cuenta que los espacios dentro de una cadena cuantan como un carácter más*/
		
		
		String frase = "Hola, mundo!";
		
		//Obtener la longitud de la cadena
		
		int longitud = frase.length();
		System.out.println("La longitud de la cadena es: " + longitud);
		
		//Acceder a caracteres individuales usando charAt()
		
		char primerCaracter = frase.charAt(0);
		char ultimoCaracter = frase.charAt(longitud-1);
		
		System.out.println("El primer carácter es: " + primerCaracter);
		System.out.println("El último carácter es: " + ultimoCaracter);
		
		
		

	}

}
