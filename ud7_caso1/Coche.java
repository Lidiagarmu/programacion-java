package ud7_caso1;

public abstract class Coche {
	
	//atributos 
	
	private String matricula;
	private String color;
	private String modelo;
	private int precio;
	private int kmRecorridos;
	
	//atributo de clase o estático para poder después contabilizar los objetos instanciados de tipo Coche
	
	public static int numCochesStock;
	
	 //constructor
	
	 //incrementará su valor en uno con cada llamada al método constructor. Por defecto se inicializa en 0
	
	public Coche(String matricula, String color, String modelo, int precio, int kmRecorridos) {
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
		this.kmRecorridos = kmRecorridos;
		numCochesStock++; //incrementará su valor en uno con cada llamada al método constructor. Por defecto se inicializa en 0
	}
	
	//toString de la superclase
	
	@Override //no es necesario ponerlo pero si recomendable. Está sobreescribiendo por completo al toString de la clase Object
	public String toString() {
		return "Coche con matricula '" + matricula + "', caraterísticas:\n    color: " + color + "\n    modelo: " + modelo + "\n    precio: " + precio + " €"
				+ "\n    distancia recorrida: " + kmRecorridos + " kms";
	}
	
	
	//Getters  y setters 
	
	public static int getNumCochesStock() {
		return numCochesStock;
	}


	public static void setNumCochesStock(int numCochesStock) {
		Coche.numCochesStock = numCochesStock;
	}
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	
	/*-------------EXTRA CASO PRACTICO
	 
	 Para ver la diferencia de uso de los métodos que podemos crear en una clase abstracta me he tomado la libertad de crear 
	  dos métodos más:
	  
	  - reservarCoche() --> este será abstracto por lo que será necesario implementarlo en todas sus clases hijas. Estos al igual 
	  que en las interfaces, no llevan llaves {}
	  
	  - aisgnarCitaCliente()--> este será un método no abstracto, el cual podrá ser implementado por cualquiera de sus claes hijas de 
	  manera opcional gracias a la herencia, al igual que los demás métodos de la clase (getters, setters, toString...)*/
	
	public abstract void reservarCoche();
	
	
	
	public  String asignarCitaCliente(String cita) {
		return cita;
		
	}
	
	
	
	

}
