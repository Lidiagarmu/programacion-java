package ud5streams;

public class Main {

	public static void main(String[] args) {
		
		//objeto para leer el fichero creado en LeerFichero
		
		LeerFichero lf = new LeerFichero(); //creo un objeto de tipo LeerFichero
		lf.leer(); //este objeto lf tendrá un método que cree que se llama leer()
		
		
		//objeto para poder escribir la frase creada en EscribirFichero
		
		EscribirFichero ef = new EscribirFichero();
		ef.escribir();
		
		
		//primero lee, despues escribe y ahora con esta sentencia volvera a leer el archivo para que lo lea todo
		lf.leer();
	}

}
