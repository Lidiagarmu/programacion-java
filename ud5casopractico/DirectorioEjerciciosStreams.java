package ud5casopractico;

import java.io.File;
import java.io.IOException;


public class DirectorioEjerciciosStreams {

	public static void main(String[] args) {
		
		//Creo el directorio
		
		String directorioRuta = "/Users/lidiagarciamunoz/EjerciciosStreams";
		
		//Creo un objeto File para el directoio
		
		File directorio = new File(directorioRuta);
		
		//Compruebo que el directorio ya existe. Si no existe, creo el directorio 
		
		if(!directorio.exists()) {
			
			if(directorio.mkdirs()) {
				System.out.println("Directorio creado correctamente");
			} else {
				System.out.println("No se pudo crear el directorio");
			} return;
			
		}else {
			System.out.println("El directorio ya existe");
		}
		

		//Creo los archivos .java dentro del directorio
		
		//primero creo una array de String con tres elementos, cada uno de ellos representa a uno de los archivos
		
		String[] archivos = {"uno.java", "dos.java", "tres.java"};
		
		//con el bucle for-each  recorro cada elemento del array 'archivos', asignándole la variable 'archivo' a cada elemento en cada iteración
		
		for (String archivo : archivos) {
			
			//creo un objeto File para cada archivo. Le paso dos argumentos, el directorio raiz y el nombre del archivo
			File archivosJava = new File(directorio, archivo);
			
			
			
			try {
				//usamos el método createNewFile de la clase File. Este método verifica la creación del archivo  devolviendo un booleano true en caso afirmativo
				
				if(archivosJava.createNewFile()) {
					System.out.println("Archivo " + archivo + " creado correctamente.");
					
				}else {
					System.out.println("El archivo " + archivo + " ya existe.");
				}
				
			} catch (IOException e) {
				System.out.println("Error al crear el archivo " + archivo + ": " + e.getMessage());
			}
		}
		
		
		
		
		
		
	} 

}
