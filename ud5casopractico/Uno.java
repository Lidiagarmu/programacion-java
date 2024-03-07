package ud5casopractico;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Uno {
	
	public static void main(String[] args) {
		
		
		//guardo la ruta del archivo 'uno.java' en una variable String
		
		String archivoUnoRuta = "/Users/lidiagarciamunoz/EjerciciosStreams/uno.java";
		
		//creo un objeto File para el archivo 'uno.java' pasándole por argumento la variable String 'archivoUnoRuta' donde guardamos la ruta del archivo
		
		File archivoUno = new File(archivoUnoRuta);
		
		//compruebo si el archivo existe con el método exists()
		
		if (!archivoUno.exists()) {
			System.out.println("El archivo uno.java no existe.");
			return;
		}
		
		//escribo los números del 0 al 10 en el archivo
		
		try (FileWriter fw = new FileWriter(archivoUno)) { //Aquí podriamos pasarle por argumento la ruta directamente seguido de ,true --> ("/Users/lidiagarciamunoz/EjerciciosStreams/uno.java", true)
			
			for (int i=0; i<= 10; i++) {
				fw.write(i + "\n"); //escribe el numero entero directamente. Podriamos utilizar w.write(Integer.toString(i)) para convertir los enteros a cadena de caracteres
			}
			
			System.out.println("Los números del 0 al 10 se han escrito correctamente en el archivo uno.java");
			fw.close(); //cerramos el objeto 
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo uno.java: ");	e.printStackTrace();
		}
		
	
		
	
		
	}


}
