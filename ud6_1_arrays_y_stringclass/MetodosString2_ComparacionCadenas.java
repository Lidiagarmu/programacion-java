package ud6_1_arrays_y_stringclass;

import ud5streams.EscribirFichero;

public class MetodosString2_ComparacionCadenas {

	public static void main(String[] args) {
		
		// En el siguiente ejemplo se comparan tres cadenas usando metodo equals()
		// este metodo distingue entre mayus y minus por tanto Hola no será igual a hola
		
		
		String cadena1= "Hola";
		String cadena2= "hola";
		String cadena3= "Hola";
		
		//comparacion de cadenas usando equals()
		
		boolean primeraComparacion = cadena1.equals(cadena2); //false
		System.out.println("¿Es cadena1 igual a cadena2? "+ primeraComparacion);
		
		boolean segundaComparacion = cadena1.equals(cadena3); //true
		System.out.println("¿Es cadeba1 igual a cadena3? "+segundaComparacion);
		
		
		//METODO boolean equalsIgnoreCase() --> ignora las mayus y minus
		
		//METODO int compareTo() --> este si tiene en cuenta mayus y minus para no tenerlas en cuenta int compareToIgnoreCase()
		
		/* Para describirlo se verá con un pequeño ejemplo en Java:

    
			Se comparan las dos cadenas. Los tres primeros caracteres son iguales "Cue". Cuando el método llega al carácter de 
			índice 3 (4º carácter) tiene que comparar entre la r minúscula y la n minúscula. Si utiliza el código Unicode llegará 
			a la siguiente conclusión.
			
			r(114) > n(110)
			
			Y devolverá la resta de sus valores. En este caso un 4.

		 * 
		 * 
		 * */
		
		String s1 = "CueRvo";
		String s2 = "Cuervo";
		
		
		//comparamos s1 y s2
		
		int comparacion = s1.compareTo(s2);
		
			if (comparacion == 0) {
				System.out.println("Las cadenas s1 y s2 son iguales");
			}else if(comparacion < 0) {
				System.out.println("La cadena1 viene antes en el orden lexicográfico");
			} else {
				System.out.println("La cadena1 viene después en el orden lexicográfico");
			}
	}

}
