package ud7_composicion_biblioteca;

public class Biblioteca {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("La chica del tren");
		Libro libro2 = new Libro("El poder del anillo");
		Libro libro3 = new Libro("Harry Potter y la piedra filosofal");
		Libro libro4 = new Libro("Caperucita roja");
		
		Usuario usuario1 = new Usuario("Ana");
		Usuario usuario2 = new Usuario("Carlos");

		 usuario1.asignarLibro(libro1); // El libro 'La chica del tren' se ha prestado a Ana
	         
	     usuario1.asignarLibro(libro3); // El libro 'Harry Potter y la piedra filosofal' se ha prestado a Ana
	     
	     
	     System.out.println("\n\n--Libros prestados actualmente--" );
	     
	     usuario1.listarLibrosUsuario();
	     
	     /*Ana
		   --- 
		Título: La chica del tren
			 
		Título: Harry Potter y la piedra filosofal*/
	     
	     
	     usuario2.listarLibrosUsuario();
	     
	     /*Carlos
		   ------
		No tiene libros prestados*/
	     
	     System.out.println("\n" );
	     
	     
	     usuario2.asignarLibro(libro1); // El libro 'La chica del tren' no está disponible
	     usuario1.devolverLibro(libro2); // El libro 'El poder del anillo' no ha sido prestado 
	     usuario2.asignarLibro(libro2); // El libro 'El poder del anillo' se ha prestado a Carlos
	     usuario1.devolverLibro(libro2); // Ana no puede devolver el libro 'El poder del anillo'
	     usuario1.devolverLibro(libro1); // El libro 'La chica del tren' ha sido devuelto por Ana
	     usuario2.asignarLibro(libro1); // El libro 'La chica del tren' se ha prestado a Carlos
	     
	     
	     System.out.println("\n\n--Libros prestados actualmente--" );
	        usuario1.listarLibrosUsuario();
	        usuario2.listarLibrosUsuario();
	        
	        /*--Libros prestados actualmente--

				Ana
				--- 
				Título: Harry Potter y la piedra filosofal
				
				Carlos
				------ 
				Título: El poder del anillo
				 
				Título: La chica del tren
				
				*/
	}

}
