package ud7_composicion_biblioteca;

		/*Desarrolla el código necesario, utilizando clases en Java para que diferentes usuarios puedan tener en préstamo uno o 
		 varios libros de una biblioteca.
		
		• Si el libro ya está prestado entonces no se puede asignar o prestar a otro usuario, solo se pueden prestar libros que no 
		están prestados.
		• Hay que tener en cuenta que si un usuario quiere devolver un libro que no tiene prestado no podrá hacerlo, solo puede 
		devolver libros que le han sido prestados.
		
		Utiliza la composición de clases de forma que tengas:
		
		• Una clase Usuario con dos atributos; un nombre y una lista de libros que se prestan al usuario.
		• Una clase Libro con dos atributos; un título y un indicador de si está prestado o no.
		
		Ambas clases deben tener constructor, getters y setters implementados, así como otros métodos necesarios que ayuden a 
		resolver el problema.
		
		La clase controladora será la clase Biblioteca que contendrá un método main() donde se realizarán las instanciaciones de 
		objetos tanto de tipo Libro como de tipo Usuario y se llamarán a los métodos necesarios para asignar y devolver libros a cada
		 usuario.
		
		En todo momento será necesaria la emisión de mensajes por consola para informar al usuario de lo que está ocurriendo.
		
		*/

public class Libro {
	
	private String titulo;
	private boolean prestado;
	
	//constructor
	
	public Libro(String titulo) {
		this.titulo = titulo;
		prestado= false;
	}

		//getter and setter

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	//metodos propios prestar y devolver libro
	
	
	public void prestarLibro () {
		if (!prestado) prestado = true;
	}
	
	public void devolverLibro() {
		if (prestado) prestado = false;
	}
	
	

}
