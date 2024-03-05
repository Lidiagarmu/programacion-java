package Ud4AnimalHerencia;

public class Mamifero extends Animal {
	
	
	
	//--------------------HERENCIA DE UNA CLASE ----------------------------------------------
	
	
	//Atributos propios de la clase Mamifero
	
	private int gestacion;
    private int cantidadPatas;
    private boolean tienePelo;

    	//constructor con parámetros
    
    public Mamifero(String nombre, int edad, String genero, String tamanho, int gestacion, int cantidadPatas, boolean tienePelo) {

        //llamada a constructor clase padre(Animal)
    	
    super(nombre, edad, genero, tamanho);

        //inicialización atributos propios de clase Mamifero
    
    
        this.gestacion = gestacion;
        this.cantidadPatas = cantidadPatas;
        this.tienePelo = tienePelo;
    }
    
    
    
    //getter y setter
    
    
    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

}
