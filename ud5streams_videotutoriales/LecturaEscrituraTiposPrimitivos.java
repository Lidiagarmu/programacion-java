package ud5streams_videotutoriales;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LecturaEscrituraTiposPrimitivos {

	public static void main(String[] args) {
		
		
		//Lectura y Escritura de tipos primiticos 
		
		//creamos 4 variables de tipos distintos
		
		boolean aprobado = true;
		String nombre = "PRG";
		int conv = 1;
		double nota = 7.8;
		
		try {
			
			//1-creamos un objeto FileOPutputStream que escribirá datos sobre el fichero ejemplo.data y lo envolvemos en 
			//2-un DataOutputStream para poder utilizar los métodos que escriban directamente los datos de tipo primitivo
			//3-writeBoolean()...
			//4- cerramos el DataOutputStream  --> out.close()
			DataOutputStream out = new DataOutputStream(new FileOutputStream("ejemplo.dat"));
			out.writeBoolean(aprobado);
			out.writeUTF(nombre);
			out.writeInt(conv);
			out.writeDouble(nota);
			out.close();
			
			//5- sobre el fichero binario que acabamos de escribir , leemos esos datos
			// ¡IMPORTANTE! Es importante que se lean en el mismo orden en el que han sido escritos
			
			DataInputStream in = new DataInputStream(new FileInputStream("ejemplo.dat"));
			System.out.println("Valor leído de aprobado: " + in.readBoolean());
			System.out.println("Valor leído de nombre: " + in.readUTF());
			System.out.println("Valor leído de convocatoria: " + in.readInt());
			System.out.println("Valor leídp de nota: " + in.readDouble());
			in.close();
			
		}catch (FileNotFoundException e) { System.err.println("No encontrado");
			
		}catch(IOException e) { System.err.println("Problemas al escribir");
	
		}

	}

}
