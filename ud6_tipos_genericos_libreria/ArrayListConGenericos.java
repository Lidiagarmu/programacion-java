package ud6_tipos_genericos_libreria;

public class ArrayListConGenericos {

	public static void main(String[] args) {
		
		
		//instanciamos la clase Librería, pasándole como tipo de dato la clase Libro y por otro lado, pasándole como
		//tipo de dato la clase Bolígrafo
		
		
		Libreria<Libro> listaLibros = new Libreria<Libro>();
		Libreria<Boligrafo> listaBoligrafos = new Libreria<Boligrafo>();
		
		listaLibros.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez"));
		listaLibros.add(new Libro("Don Quijote de la Manche", "Miguel de Cervantes"));
		
		listaBoligrafos.add(new Boligrafo("Gel", "Suave"));
		listaBoligrafos.add(new Boligrafo("Bola", "Estándar"));
		
		
		System.out.println("\nArtículos en la librería:"); 
		System.out.println("------------------------");
		
		
		//recorrer y mostrar libros
		
		System.out.println("\nLIBROS:\n");
		
		for (Libro libro : listaLibros.getProducts()) {
			System.out.println(libro);
			
		}
		
		//recorrer y mostrar boligrafos
		
		System.out.println("\nBOLÍGRAFOS:\n");
		
		for (Boligrafo boli : listaBoligrafos.getProducts()) {
			System.out.println(boli);
			
		}
	}

}
