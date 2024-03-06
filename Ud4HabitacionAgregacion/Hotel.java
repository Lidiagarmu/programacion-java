package Ud4HabitacionAgregacion;

public class Hotel {
	
	/*De momento vamos a partir de la idea de que cada Hotel solo tiene una habitación (sería algo muy raro, normalmente
	 hay más de una), porque todavía no se ha tratado el concepto de arrays que veremos en próximas unidades y será entonces 
	 cuando podremos aplicarlo a las relaciones entre clases.
	 De cada hotel de la cadena se quiere almacenar su nombre, dirección, nombre del gerente o responsable y las características
	  de la habitación. Se declaran estos atributos, el constructor con parámetros y los métodos getters y setters. El atributo 
	  habitacion es un objeto que pertenece a la clase Habitacion que ya hemos creado anteriormente.
	  
	  */
	
	
	//Atributos
	
	
	private String nombre;
	private String direccion;
	private String nombreGerente;
	private Habitacion habitacion;
	
	
	//Constructor con parametros
	
	public Hotel (String nombre, String direccion, String nombreGerente, Habitacion habitacion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nombreGerente = nombreGerente;
		this.habitacion = habitacion;
	}
	
	
	//Metodfos getter and setter
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getDireccion() {
        return direccion;
    }
	
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNombreGerente() {
        return nombreGerente;
    }
    
    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }
    
    public Habitacion getHabitacion() {
        return habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
	
	

}
