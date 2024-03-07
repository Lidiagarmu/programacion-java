package ud5streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class EscribirFichero {
	
	public void escribir() {
		
		String frase = "\nVamos a escribir una segunda frase sin machacar la anterior";
		
		try {
			FileWriter fw = new FileWriter("/Users/lidiagarciamunoz/Desktop/textos/ejemplo.txt", true);
			
			
			BufferedWriter bw = new BufferedWriter(fw); //esta linea solo para buffered
			
			
		/*	Esto seria para escribir letra a letra 
		 * 
		 * 
		 * 
		 * 
		 * for (int i=0; i<frase.length(); i++) {
				fw.write(frase.charAt(i));
			}
		
			*/
			
			
		
			bw.write("Esto es una prueba utilizando el buffered writer");
			bw.newLine(); //SALTO DE LINEA
			bw.write("Seguimos escribiendo con el buffer");
			
			bw.close(); //se cierra antes siempre que el fw 
			// fw.write("\n"); //salto de linea
		
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
