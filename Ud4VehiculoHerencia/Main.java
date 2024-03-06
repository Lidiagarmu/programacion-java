package Ud4VehiculoHerencia;



public class Main {

	public static void main(String[] args) {
		
		
		//Instancia: creacion del objeto miVehiculo de tipo Vehiculo
		
			
		System.out.println("-------------------<< Clase Padre Vehiculo >>-----------------------");
		 Vehiculo miVehiculo = new Vehiculo();
		 miVehiculo.nombreVehiculo="El Gran Transportador";
		 System.out.println("usando miVehiculo, nombreVehiculo : "+miVehiculo.nombreVehiculo);
		 System.out.println("usando miVehiculo llama a: "+miVehiculo.transportar());
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println();
		 
		 System.out.println("----------<< SubClase hija Acuatico Extiende de Vehiculo >>---------");
		 Acuatico miAcuatico= new Acuatico();
		 miAcuatico.nombreVehiculo="El Navegante";
		 System.out.println("usando miAcuatico, nombreVehiculo : "+miAcuatico.nombreVehiculo);
		 System.out.println("usando miAcuatico llama a : "+miAcuatico.transportar());
		 System.out.println("usando miAcuatico llama a : "+miAcuatico.navegar());
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println();
		 
		 System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Acuatico>-----");
		 Barco miBarco=new Barco();
		 miBarco.nombreVehiculo="Titanic";
		 System.out.println("usando miBarco, nombreVehiculo : "+miBarco.nombreVehiculo);
		 System.out.println("usando miBarco llama a : "+miBarco.transportar());
		 System.out.println("usando miBarco llama a : "+miBarco.navegar());
		 System.out.println("usando miBarco llama a : "+miBarco.prenderMotor());
		 System.out.println();
		 
		 Velero miVelero=new Velero();
		 miVelero.nombreVehiculo="Tormenta";
		 System.out.println("usando miVelero, nombreVehiculo : "+miVelero.nombreVehiculo);
		 System.out.println("usando miVelero llama a : "+miVelero.transportar());
		 System.out.println("usando miVelero llama a : "+miVelero.navegar());
		 System.out.println("usando miVelero llama a : "+miVelero.izarVelas());
		 System.out.println("---------------------------------------------------------------------");
		 
		 System.out.println("----------<< SubClase hija Aereo Extiende de Vehiculo >>---------");
		 Aereo miAereo= new Aereo();
		 miAereo.nombreVehiculo="El Volador";
		 System.out.println("usando miAereo, nombreVehiculo : "+miAereo.nombreVehiculo);
		 System.out.println("usando miAereo llama a : "+miAereo.transportar());
		 System.out.println("usando miAereo llama a : "+miAereo.volar());
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println();
		 
		 System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Aereo >-----");
		 Avion miAvion=new Avion();
		 miAvion.nombreVehiculo="El Condor";
		 System.out.println("usando miAvion, nombreVehiculo : "+miAvion.nombreVehiculo);
		 System.out.println("usando miAvion llama a : "+miAvion.transportar());
		 System.out.println("usando miAvion llama a : "+miAvion.volar());
		 System.out.println("usando miAvion llama a : "+miAvion.bajarTrenDeAterrizaje());
		 System.out.println();
		 
		 Helicoptero miHelicoptero=new Helicoptero();
		 miHelicoptero.nombreVehiculo="El lobo del Aire";
		 System.out.println("usando miHelicoptero, nombreVehiculo : "+miHelicoptero.nombreVehiculo);
		 System.out.println("usando miHelicoptero llama a : "+miHelicoptero.transportar());
		 System.out.println("usando miHelicoptero llama a : "+miHelicoptero.volar());
		 System.out.println("usando miHelicoptero llama a : "+miHelicoptero.encenderHelices());
		 System.out.println("---------------------------------------------------------------------");
		 System.out.println();
		 
		 System.out.println("--<< Propiedad de la clase Vehiculo usada por todas las clases Hijas >--");
		 System.out.println("nombre Vehiculo :"+miVehiculo.nombreVehiculo);
		 System.out.println("nombre Acuatico :"+miAcuatico.nombreVehiculo);
		 System.out.println("nombre Aereo :"+miAereo.nombreVehiculo);
		 System.out.println("nombre Barco :"+miBarco.nombreVehiculo);
		 System.out.println("nombre Velero :"+miVelero.nombreVehiculo);
		 System.out.println("nombre Avion :"+miAvion.nombreVehiculo);
		 System.out.println("nombre Helicoptero :"+miHelicoptero.nombreVehiculo);
		 System.out.println("---------------------------------------------------------------------");
		 
		 }
		

		
		
	}


