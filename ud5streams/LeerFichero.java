package ud5streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	//videoconferencia 2 Febrero (19-02-24) Programacion
	
	/* Vamos a ver:
	 * 
	 * 1-Streams
	 *    -Flujo de bytes
	 *    -Flujo de caracteres
	 * 
	 * 
	 * 2-Leyendo Ficheros - clase READER
	 * 
	 * 3-Escribiendo Ficheros - clase WRITER
	 * 
	 * 4-BUFFERS
	 *   -Leyendo con Buffers
	 *   -Escribiendo con Buffers
	 * */
	
	  
	// voy a hacer un programa que lea el archivo que hemos creado "ejemplo.txt"
	
	
	//en este metodo que creo tengo que hacer referencia al fichero que voy a leer
	public void leer() {
		try {
			FileReader fr  = new FileReader("/Users/lidiagarciamunoz/Desktop/textos/ejemplo.txt");
			
			/* esto para leer caracter a caracter . El FileReader de arriba sirve tanto para esto como para leer linea a linea (Buffered)
			 * 
			 * 
			 * 
			 * 
			 * int texto;	//al poner el texto=fr.read() dentro en la condicion no haria falta esto --> int texto=-10; //le doy valor -10 para que entre en el bucle y como los ASCII nunca son negativos pues entrará seguro 
			
			 while((texto=fr.read()) != -1) {
				//texto = fr.read();
				Character letra = (char) texto; //hago casting para que transforme el entero que devuelve en letras
				System.out.print(letra); 
			
				
			}*/
			
			String linea ="";
			BufferedReader br = new BufferedReader(fr);
			
			while ((linea=br.readLine()) != null) {
				//linea = br.readLine();
				
				if(linea!=null)
					System.out.println(linea);
			}
		
			//primero se cierra el buffered y luego el filereader
			
			 br.close();
			 fr.close(); 
			 
			
		} catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }	
	}

}
