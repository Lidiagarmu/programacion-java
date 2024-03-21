package ud6_tipos_genericos_libreria;

public class Boligrafo {
	
	private String nombre;
	private String tipo;
	
	
	public Boligrafo(String nombre, String tipo) { 
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	@Override
	
	public String toString() {
	return "- Nombre: " + nombre + " - Tipo: " + tipo;
	} 
	

}
