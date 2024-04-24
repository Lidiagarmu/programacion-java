package ud7_caso1;

public class Main {

	public static void main(String[] args) {
	
		
	//creamos instancias de cada tipo de coche 
	//recordar que, de esta manera, no podremos crear instancias de la clase 'Coche' al ser esta clase abstracta 
		
	CocheSegundaMano segundaMano1 = new CocheSegundaMano("1111-A", "rojo", "opel astra", 8000, 130000, "Pepe Villuelas");
	CocheSegundaMano segundaMano2 = new CocheSegundaMano("2222-B", "blanco", "renault clio", 6000, 189000, "Rosa Maria Martin");
		
	CocheNuevo nuevo1 = new CocheNuevo("1234-M", "rojo", "bmw serie A", 40000, 0, 60);
	CocheNuevo nuevo2 = new CocheNuevo("1122-M", "gris", "kia ceed", 25000, 0, 48);
	
	CocheKm0 km0_1 = new CocheKm0("3333-H", "rojo", "renault megan", 8000, 25000);
	CocheKm0 km0_2 = new CocheKm0("4444-K", "rojo", "opel corsa", 3500, 40000);
	
	
	
	//jugamos con los métodos a los que pueden acceder las instancias para ver su comportamiento
	
	
	segundaMano1.vender();
	System.out.println("\n");
	System.out.println(segundaMano2.toString());
	System.out.println("\n");
	
	
	nuevo1.vender();
	System.out.println("\n");
	System.out.println(nuevo2.toString());
	System.out.println("\n");
	
	
	km0_1.alquilar();
	System.out.println("\n");
	km0_2.vender();
	System.out.println("\n");
	System.out.println(km0_2.toString()); //este método toString() es heredado de la clase padre Coche, ya que no creamos toString para la clase 'Cochekm0'
	System.out.println("\n");
	
	
	
	
	//comprobamos que el STOCK DE COCHES en el concesionario es correcto. Debería imprimir 6, que son el numero de instancias creadas
	//para poder acceder al método de la clase padre 'Coche' desde el Main: Coche.getNumCochesStock()
		
	System.out.println("NÚMERO DE COCHES EN STOCK: " + Coche.getNumCochesStock());
	System.out.println("\n");
	
	
	//------EXTRA CASO PRÁCTICO--------------
	
	System.out.println("--------------------------EXTRA------------------------------");
	
	km0_1.asignarCitaCliente("13-03-2024");
	System.out.println("\n");
	
	km0_2.reservarCoche();
	System.out.println("\n");
	
	nuevo1.reservarCoche();
	System.out.println("\n");
	
	segundaMano1.reservarCoche();
		
	
 
	}

}
