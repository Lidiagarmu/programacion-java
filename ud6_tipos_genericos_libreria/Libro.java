package ud6_tipos_genericos_libreria;

public class Libro {
	
	private String titulo;
	private String autor;
	
	public Libro(String titulo, String autor) { 
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	
	@Override

	public String toString() {
	return "- Título: " + titulo + " - Autor: " + autor ;
	}

}
