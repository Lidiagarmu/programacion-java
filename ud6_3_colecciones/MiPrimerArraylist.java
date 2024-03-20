package ud6_3_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiPrimerArraylist {

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Lunes", "Martes","Miercoles", "Jueves","Viernes");
		
		ArrayList<String> lista1 = new ArrayList(lista);
		System.out.println(lista1); //[Lunes, Martes, Miercoles, Jueves, Viernes]
		
		//añadir elementos
		
		lista1.add("Sabado");
		lista1.add("Domingo");
		System.out.println(lista1);
		
		
		List<Integer> numeros = Arrays.asList(3,2,3,4,1,10,23,44,1);
		ArrayList<Integer> numeros1 = new ArrayList(numeros); 
		numeros1.addAll(Arrays.asList(7,8,99,129,300));
		System.out.println(numeros1);
		
		

	}

}
