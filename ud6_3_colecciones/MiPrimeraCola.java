package ud6_3_colecciones;

import java.util.ArrayDeque;
import java.util.Queue;

public class MiPrimeraCola {

	public static void main(String[] args) {
		
		//creamos una cola, vienen de la clase Queue
		
		Queue<String> meses =  new ArrayDeque();
		
		//añadimos elementos de dos maneras diferentes
		
		meses.add("Enero");
		meses.add("Febrero");
		meses.offer("Marzo");
		meses.offer("Abril");
		
		//como sacamos elementos de esa cola? sabemos que el primero que entra es el primero que sale FIFO
		
		
		//vamos a verlos por pantalla y los vamos a ir eliminando
		//es decir, vamos a hacer como en un supermercado el primero paga y se va , paga y se va...
		
	
		System.out.println("Lista original: " + meses); 
		
		/*Lista original: [Enero, Febrero, Marzo, Abril]
			Enero
			Febrero
			Marzo
			Abril
		*/
		
		
		// mientras la lista o la cola siga teniendo elementos, no esté vacía, ve quitando 
		
		while(!meses.isEmpty()) {
			System.out.println(meses.remove());
		}
		
		System.out.println("Lista final: " + meses); //Lista final: []

	}

}
