package ud5streams_videotutoriales;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaArchivosBinarios {
	
	public static void main(String[] args) {
		
	
	//Aquí estamos leyendo los datos del archivo escrito y leido en la clase: LecturaEscrituraTiposPrimitivos.java
	//nos imprime el archivo en binario
	String nombreArchivo = "ejemplo.dat";
	
	//Leer datos desde el archivo binario
	
	 try {
		 FileInputStream fis = new FileInputStream(nombreArchivo); //creo el objeto para crear el flujo de datos de origen
		 
		 int num; //en esta variable guardaremos los datos que vaya leyendo
		 
		 System.out.println("Datos leidos desde el archivo binario:");
		 /* IMPRIME
		  Datos leidos desde el archivo binario:
		  1 0 3 80 82 71 0 0 0 1 64 31 51 51 51 51 51 51 
		  
		  1 --> BOOLEANO si fuera FALSE seria 0
		  0 3 --> es la lomngitud del siguiente dato "Pep"
		  80 --> P en ASCII
		  82 --> R en ASCII
		  71 --> G en ASCII
		  0 0 0 1 --> 4 bytes que se utilizan para almacenar el entero 1
		  64 31 51 51 51 51 51 51 --> estos 8 bytes se utilizan para almacenar el double 7.8s
		  
		  
		   */
		 
		 while ((num=fis.read()) != -1) System.out.print(num + " ");
		 fis.close();
		 
	 } catch (IOException e) {System.err.println("Error al leer");}
}
} 

