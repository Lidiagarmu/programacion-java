package ud5streams_videotutoriales;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EjemploDeserializacion {
	
	public static void main(String[] args) {
		
		try {
			
			Grupo daw = null;
			
			FileInputStream fis = new FileInputStream("archivo.dat");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			daw = (Grupo) in.readObject();
			daw.mostrarAlumnos(); //mostramos alumnos
			
			
			
			
			System.out.println(daw.getNombre()); //mostramos nombre Grupo
			
			
			System.out.println("El entero es: " + (int)in.readInt()); //leemos el entero 25
			
			System.out.println((Alumno)in.readObject()); // nos devolvera el nuevo alumno creado 
			
			//¡¡¡¡¡¡¡Para poder leer estos dos ultimos sysout debo ejecutar primero el archivo donde los serialicé!!!!!!!
			
			in.close();
	

			
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
