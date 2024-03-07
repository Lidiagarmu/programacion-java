package ud5casopractico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;



public class Cuatro {

	public static void main(String[] args) {
		
		// guardo la ruta del archivo datos.txt en una variable
		String archivoDatosRuta = ("/Users/lidiagarciamunoz/Desktop/textos/datos.txt");
		
		//escribo la ruta del archivo de acceso aleatorio a crear
		String archivoAleatorioRuta = ("/Users/lidiagarciamunoz/Desktop/textos/archivoAleatorio.txt");
		
		
		try {
			
			//creo los objetos FileReader y BufferedReader para leer el archivo de origen datos.txt
			FileReader fr = new FileReader(archivoDatosRuta);
			BufferedReader br = new BufferedReader(fr);
			
			//creo el objeto RandomAccessFile para el archivo de acceso aleatorio
			//pasamos como argumentos el nombre de la variable donde guardamos la ruta del archivo de acceso aleatorio y "rw" que indica que queremos el archivo tanto para lectura como para escritura
			RandomAccessFile raf = new RandomAccessFile(archivoAleatorioRuta, "rw");
				
				
			
			
			//leo el archivo datos.txt linea por linea a través de un bucle while
				String linea="";
				
				while ((linea = br.readLine()) != null) {
					
					//escribo cada línea en el archivo de acceso aleatorio
					raf.writeUTF(linea);
				
				}
				
				// cerramos  en este orden 
				raf.close();
				br.close();
				fr.close();
				System.out.println("Datos escritos  correctamente en el archivo de acceso aleatorio.");
				
				
				
			
				
				
				
				
			
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	
	}


