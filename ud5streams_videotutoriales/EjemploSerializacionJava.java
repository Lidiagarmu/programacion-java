package ud5streams_videotutoriales;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploSerializacionJava {

	public static void main(String[] args) {
		
		
		try {
			Grupo daw = new Grupo("1DAW");
			daw.agregarAlumno(new Alumno("Pep", "111A", 17));
			daw.agregarAlumno(new Alumno("Tom", "222A", 15));
			
			FileOutputStream fos = new FileOutputStream("archivo.dat");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(daw); // este objeto es el  primero que hemos escrito
			
			out.writeInt(25); // hemos escrito un entero al archivo
			
			out.writeObject(new Alumno("Lau", "123A", 30)); // hemos creado otro objeto alumno 
			
			out.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
