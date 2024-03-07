package ud5casopractico;

import java.awt.geom.Area;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		
		
		//creo el objeto File para el archivo 'dos.java' y le pasola ruta por argumento
		
		File archivoDos = new File("/Users/lidiagarciamunoz/EjerciciosStreams/dos.java");
		
		
		//creo un objeto Scanner para leer desde teclado
		
		Scanner sc = new Scanner(System.in);
		
		//pregunto al usuario la base y altura del triángulo
		
		System.out.println("Introduce la base del triángulo: ");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura del triánguolo: ");
		double altura = sc.nextDouble();
		
		
		//cálculo área del triángulo
		
		double area = (base * altura)/2;
		System.out.println("El área del troángulo es: " + area);
		
		// escribo el área del triángulo en el archivo dos.java
		// envuelvo el objeto fw en el objeto bw
		
		
		try (FileWriter fw = new FileWriter(archivoDos);
				BufferedWriter bw = new BufferedWriter(fw)) {
			
			// escribo en el archivo la línea con el resultado del área
			bw.write("El área del triángulo de base: " + base + " y altura: " + altura + " es: " + area);
			//imprimo en consolo un mensaje de confirmación de escritura en archivo
			System.out.println("Área del triángulo calculada y escrita correctamenete en el archivo 'dos.java'.");
			
			//cerramos los objetos.¡IMPORTANTE EL ORDEN!
			bw.close();
			fw.close();
			
		} catch (IOException e) {
		System.out.println("Error al escribir en el archivo 'dos.java'. ") ;
		e.printStackTrace();
		} finally {
			
			//con finally se ejecute o no la escritura, cerramos el Scanner al finalizar
			sc.close();
		}
		
		

	}

}
