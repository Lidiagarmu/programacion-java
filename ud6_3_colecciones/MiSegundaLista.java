package ud6_3_colecciones;

import java.util.Arrays;
import java.util.List;

public class MiSegundaLista {

	public static void main(String[] args) {
		
		
		List<Integer> lista = Arrays.asList(3,2,3,4,1,10,23,44,1);
		
		//Buscas el primer 1 de la lista
		
		System.out.println("El primer 1 de la lista esta en la posición: " + lista.indexOf(1)); //4
		System.out.println("El último 1 de la lista esta en la posición: " + lista.lastIndexOf(1)); //8
		 
		System.out.println("Está el 44 en la lista? " + lista.contains(44)); //true
		
		//hacer sublista posicion de la 3 a la 5
		
		List<Integer> sublista = lista.subList(3, 6); //si quiero coger de la 3 a la 5 debo decirle 6 porque coge la que le digas -1
		System.out.println("La sublista es: " + sublista);
		
		
		

	}

}
