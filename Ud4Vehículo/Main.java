package Ud4Vehículo;



public class Main {

	public static void main(String[] args) {
		
		
		//Instanciacion de un objeto utilizando un constructor sin parametros para el bus1
		
		Autobus bus1 = new Autobus();
		
		//Inicializacion de atributos objetos con setter
		
		bus1.setMatricula("1212DSC");
		bus1.setModelo("Opel");
		bus1.setNumeroPlazas(65);
		bus1.setPotenciaCV(90);
		
		//visualizacion de datos por pantalla
		
		System.out.println("Primer bus");
		System.out.println("-----------");
		System.out.println("Matricula: " + bus1.getMatricula());
		System.out.println("Modelo: " + bus1.getModelo());
		System.out.println("Potencia: " + bus1.getPotenciaCV());
		
		
		
		
		//Instanciacion de un objeto utilizando un contructor con parametros para el bus2
		
		Autobus bus2 = new Autobus("4123HSD", "Seat", 190, 50);
		
		//visualizacion de datos en pantalla
		
		System.out.println("\nSegundo bus");
		System.out.println("-------------");
		System.out.println("Matricula: " + bus2.getMatricula());
		System.out.println("Modelo: " + bus2.getModelo());
		System.out.println("Potencia: " + bus2.getPotenciaCV());
		
		
		//modificacion de datos despues de la creacion del objeto
		
		bus1.setModelo("Volkswagen");
		
		//visualizacion de datos en pantalla
		
		System.out.println("\n**Modelo modificado del Primer bus**\\n");
		System.out.println("Modelo: " + bus1.getModelo());
		
		
		/* Se puede observar que instanciar e inicializar un objeta a la vez en la misma linea utilizando el constructor con 
		  parametros ahorras lineas de codigo
		  Si en algun momento se desea modificar algun dato solo es necesario llamar al metodo setter correspondiente (ya no se
		  podria usar el constructor nuevamente para inicializar el objeto porque el objeto ya esta creado*/
		

	}

}
