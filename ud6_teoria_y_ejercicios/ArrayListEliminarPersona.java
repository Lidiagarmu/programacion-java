package ud6_teoria_y_ejercicios;

import  java.lang.Math;

import java.util.ArrayList;

public class ArrayListEliminarPersona {

	public static void main(String[] args) {
		
		
		/*Te proponemos un sencillo juego, en el que se elimine a una persona de un grupo al azar. Imagina una audición 
		 * de actores o cantantes en la que se debe informar de que alguien no ha sido seleccionado para continuar.
		Para ello se pide crear un ArrayList que almacene los nombres de las personas y utilizando la clase Math y el método 
		random() escojas un nombre aleatorio de la lista, lo elimines, informes por pantalla de los sucedidos y a continuación 
		muestres todos los nombres de las personas que quedan en el grupo.*/
		
		ArrayList<String> audicionACiegas = new ArrayList<>();
		
		audicionACiegas.add("Ana");
		audicionACiegas.add("Gregorio");
		audicionACiegas.add("Fran");
		audicionACiegas.add("Elena");
		
		int indiceDelEliminado = (int) (Math.random()) * audicionACiegas.size();
		
		String eliminado = audicionACiegas.remove(indiceDelEliminado);
		
		System.out.println("Lo siento, " + eliminado + ". No has sido seleccionad@");
		
		System.out.println("Personas que permanecen en la audición: " + audicionACiegas);
	}

}
