package ud6_hashset_equals_ejemplo;

import java.util.HashSet;
import java.util.Set;

public class Main {
				public static void main(String[] args) {
		
				
				
		Set<Alumno> dam = new HashSet<>();
		Alumno a1 = new Alumno("Pep", "222A", 25);
		Alumno a2 = new Alumno("Sam", "666A", 18);
		Alumno a3 = new Alumno("Sam", "666A", 18);
		Alumno a4 = new Alumno("Kal", "666A", 20);
		
		dam.add(a1);
		dam.add(a2);
		dam.add(a3);
		dam.add(a4);
		
		dam.add(a1);
		dam.add(new Alumno("Sam", "666A", 18));
		
		
		for (Alumno a : dam) {
			System.out.println(a);
			
			/*Gracias al hasHSet y al equals no permite añadir a3 ni a4 a la coleccion al tener el mismo dni
			 * 
			Alumno [nombre=Sam, nia=666A, edad=18]
			Alumno [nombre=Pep, nia=222A, edad=25]
			 * 
			 * */
			
		}
	
	}
}
