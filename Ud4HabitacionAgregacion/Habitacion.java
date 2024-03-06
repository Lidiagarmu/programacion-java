package Ud4HabitacionAgregacion;

public class Habitacion {
	
	/*
	  Tu nuevo cliente que es dueño de una cadena de hoteles te ha encargado una aplicación que gestione las habitaciones de que
	  dispone cada hotel. Primero comienzas por crear una clase Habitación con los atributos número, área y tipo, donde tipo, se 
	  refiere por ejemplo a si es de tipo suite, individual, doble, etc. Para todos los atributos creas sus correspondientes 
	  métodos getters y setters, así como un constructor con parámetros.
	 
	  */
		
	
		//Atributos
	
	
		private int numero;
	    private double area;
	    private String tipo;
	    
	    
	    //Constructor con parametros
	    
	    
	    public Habitacion(int numero, double area, String tipo) {
	        this.numero = numero;
	        this.area = area;
	        this.tipo = tipo;
	    }
	    
	    
	    
	    //Metodos getter and setter
	    
	    public int getNumero() {
	        return numero;
	    }
	    public void setNumero(int numero) {
	        this.numero = numero;
	    }
	    public double getArea() {
	        return area;
	    }
	    public void setArea(double area) {
	        this.area = area;
	    }
	    public String getTipo() {
	        return tipo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }   
	

}
