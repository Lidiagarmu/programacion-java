package Ud4AnimalHerencia;

public class Animal {
	
	
		// Traduccion del diagrama UML de la unidad 3 a codigo Java
		  
		 
		 
		//Atributos
	
	    private String nombre;
	    private int edad;
	    private String genero;
	    private String tamanho;
	
	    
	    //Constructor
	    
	    public Animal(String nombre, int edad, String genero, String tamanho) {
	    	
	        this.nombre = nombre;
	        this.edad = edad;
	        this.genero = genero;
	        this.tamanho = tamanho;
	    }
	    
	    
	    //Metodos getter and setter
	    
	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public String getTamanho() {
	        return tamanho;
	    }

	    public void setTamanho(String tamanho) {
	        this.tamanho = tamanho;
	    }       
	
	

}
