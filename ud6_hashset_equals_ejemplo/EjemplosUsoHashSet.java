package ud6_hashset_equals_ejemplo;

import java.util.HashSet;
import java.util.Set;

public class EjemplosUsoHashSet {

	public static void main(String[] args) {
		
		
		//recordemos que HashSet no mantiene orden al mostrar en pantalla
		//no puede borrar datos con remove pasandole como parámetro la posición puesto que no hay posiciones son aleatorias
		//no tiene metodo get puesto que no le podemos pasar posiciones por parametros
		
		Set<String> nombres = new HashSet<>();
		
		nombres.add("Pep");
		nombres.add("Lau");
		nombres.add("Jon");
		nombres.add("Pep");
		nombres.add("Jon");
		nombres.add("Vicen");
		
		System.out.println(nombres); // [Lau, Vicen, Jon, Pep]
		
		nombres.remove(2); // no borra ningún nombre porque no existen las posciones
		
		nombres.remove("Pep"); //borra Pep
		System.out.println(nombres); //[Lau, Vicen, Jon]

		// nombres.get(2); // ERROR, no existe metodo get porque no existen posiciones



	}

}
