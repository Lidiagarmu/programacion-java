package ud6_teoria_y_ejercicios;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		
		//Crear un ArrayList que almacene enteros
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//Agregar elementos al Arraylist con add
		
		numeros.add(5);
		numeros.add(4);
		numeros.add(3);
		
		//Accede a los elementos con get y mostrarlos
		
		System.out.println("Elementos del ArrayList:" );
		
		
		//Recorrer ArrayList 
		
		for (int i=0; i <numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		
		//Eliminar un elemento
		
		numeros.remove(1); // 1 es la posición. Borrará el 4
		
		//Mostrar elementos actualizados
		
		System.out.println("ArrayaList de numeros actualizado: " + numeros);
	}

}
