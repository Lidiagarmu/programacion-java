package ud6_teoria_y_ejercicios;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
		
		
	/*  Crea un HashSet que almacene cadenas de texto.
		 
		Agrega varios elementos e intenta añadir uno que ya hayas agregado. 
		
		Recorre el HashSet y muestra el contenido. 
		
		Verifica si existen algunos nombres dentro del conjunto.
		
		A continuación, elimina alguno de los existentes y vuelve a mostrar los elementos actualizados.
 */
		
		
		//crea un HashSet de cadenas
		
		HashSet<String> nombres = new HashSet<>();
		
		//agrega elementos al HashSet
		
		nombres.add("Nuria");
		nombres.add("Daniel");
		nombres.add("Rocio");
		
		//intento de agregar un duplicado
		
		nombres.add("Rocio");
		
		//mostrar elementos
		
		System.out.println("Elementos del HashSet:\n ");
		for (String nombre : nombres) {
			System.out.println(nombre); //NO IMPRIME EL REPETIDO ya que el HashSet no lo permite
			
		}
		
		//verificar si un elemento existe en el HashSet
		
		boolean existeAlicia = nombres.contains("Alicia");
		boolean existeDaniel= nombres.contains("Daniel");
		
		System.out.println("\n¿Existe Nuria? " + existeAlicia);  //false
		System.out.println("\n¿Existe David? " + existeDaniel); //true
		
		//eliminar un elemento del HashSet
		
		nombres.remove("Daniel");
		
		//mostrar lista actualizada
		
		System.out.println("HashSet actualizado: " + nombres);
		
		
	}

}
