package ud5casopractico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tres {
	
	//llamo a la función leerArchivo para la lectura por terminal del archivo 'listadotelefonico.txt'

	public static void main(String[] args) {
		
		leerArchivo();
		
	}
	
	
	
	
	public static void leerArchivo() {
		
		
		try {
			
			
			// creo un objeto de lectura con la ruta de origen del archivo .txt  que he creado manualmente
			FileReader fr  = new FileReader("/Users/lidiagarciamunoz/Desktop/textos/datos.txt");
			
			//almaceno el objet fw en un objeto BufferedReader 
			BufferedReader br = new BufferedReader(fr);
			
			
			//creo la variable de tipo String linea y mediante un bucle while mientras dicha variable sea diferente de NULL irá imprimiendo en pantalla línea a línea del archivo
			//cuando no quedan más líneas por leer, devuelve NULL y sale del bucle
			
			String linea ="";
			
			while ((linea=br.readLine()) != null) {
				
				if(linea!=null)
					System.out.println(linea);
			}
		
			//por último cierro el buffered y el filereader en este mismo orden
			
			 br.close();
			 fr.close(); 
			 
			
		} catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
	}	
}
