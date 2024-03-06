package Ud4HabitacionAgregacion;



public class Main {

	public static void main(String[] args) {
		
		
		/* Necesitas una clase que contenga un método main para ejecutar la aplicación. Por tanto, te dispones a crear cada una 
		 de las habitaciones que pueden formar parte de los hoteles del cliente.
		 Cada hotel dispone de una serie de habitaciones que tienen una numeración, un tamaño y son de un tipo. Cuando amplíes 
		 la aplicación, en un futuro, puedes incluir otra clase Cliente para contemplar aquellos clientes que se registran en
		 un hotel y en una habitacion determinada.
		 De momento solo creas tres objetos correspondientes a las habitaciones que se encuentran en el ala sur (El cliente
		 nos ha comentado que clasifica las habitaciones de los hoteles según la orientación hacia el norte, sur, etc).
		 A continuación se crean otros tres objetos para tres hoteles diferentes (el cliente gestiona una cadena de hoteles). 
		 A cada objeto de tipo Hotel se le pasarán como parámetros dentro del constructor los datos del hotel y de la 
		 habitación (que es un objeto).
		 Recuerda que de momento vamos a partir de la idea de que cada hotel solo tiene una habitación (porque todavía no
		  se ha tratado el uso de arrays). */

		
		// Crear una instancia de Habitacion
		
		Habitacion habitacionSur1 = new Habitacion (1, 6, "Individual");
		Habitacion habitacionSur2 = new Habitacion (2, 12, "Doble");
		Habitacion habitacionSur3 = new Habitacion (3, 25, "Suite");
		
		
		Hotel hotelNh = new Hotel("NH Collection", "Avenida Diego Martinez, 8", "Francisco Vidal",habitacionSur1);
		Hotel hotelAlhambra = new Hotel("Alhambra Palace", "Plaza Arquitecto García, 1","Marta Fernández",habitacionSur2);
		Hotel hotelMarbella=new Hotel("Marbella Club", "Avenida. Bulevar Principe, s/n", "Rocío Gómez",habitacionSur3);
	
	
	
		//visualizar en pantalla datos almacenados 
		
		
		//---------------HOTE LNH-----------------
		
		    System.out.println("HOTEL:" );
		    System.out.println("----------------------------" );
		    System.out.println("Nombre del hotel: "+ hotelNh.getNombre() );
		    System.out.println("Dirección: "+ hotelNh.getDireccion() );
		    System.out.println("Gerente: "+ hotelNh.getNombreGerente());
		    
		    System.out.println("\nDatos Habitación:");
		    System.out.println("-----------------" );
		    System.out.println("Número habitación: "+ hotelNh.getHabitacion().getNumero());
		    System.out.println("Metros cuadrados: "+ hotelNh.getHabitacion().getArea());
		    System.out.println("Tipo: "+ hotelNh.getHabitacion().getTipo()+ "\n\n");
		
		  
		//---------------HOTEL ALHAMBRA---------------
		    
		    System.out.println("HOTEL:" );
		    System.out.println("----------------------------" );
		    System.out.println("Nombre del hotel: "+ hotelAlhambra.getNombre());
		    System.out.println("Dirección: "+ hotelAlhambra.getDireccion());
		    System.out.println("Gerente: "+ hotelAlhambra.getNombreGerente());
		    
		    
		    System.out.println("\nDatos Habitación:");
		    System.out.println("-----------------" );
		    System.out.println("Número habitación: "+ hotelAlhambra.getHabitacion().getNumero());
		    System.out.println("Metros cuadrados: "+ hotelAlhambra.getHabitacion().getArea());
		    System.out.println("Tipo: "+ hotelNh.getHabitacion().getTipo()	+ "\n\n");
		    
		
		  //---------------HOTEL MARBELLA----------------- 
		  
		    System.out.println("HOTEL:" );
		    System.out.println("----------------------------" );
		    System.out.println("Nombre del hotel: "+ hotelMarbella.getNombre());
		    System.out.println("Dirección: "+ hotelMarbella.getDireccion());
		    System.out.println("Gerente: "+ hotelMarbella.getNombreGerente());
		    
		    
		    System.out.println("\nDatos Habitación:");
		    System.out.println("-----------------" );
		    System.out.println("Número habitación: "+ hotelMarbella.getHabitacion().getNumero());
		    System.out.println("Metros cuadrados: "+ hotelMarbella.getHabitacion().getArea());
		    System.out.println("Tipo: "+ hotelMarbella.getHabitacion().getTipo() + "\n\n");
		}

}
