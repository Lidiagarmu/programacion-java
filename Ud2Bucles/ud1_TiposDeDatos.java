package Ud2Bucles;

public class ud1_TiposDeDatos {

	public static void main(String[] args) {
		
		
		//TIPOS DE DATOS
		
		//enteros
		
		int numero1 = 6; // con int : indico tipo de dato con numero1:declaro la variable con 6 la estoy inicializando
		int numero2 = 18;
		
		int edad = 10;
		
		//suma
		
		int suma = numero1 + numero2;
		
		
		//para mostrar por pantalla 
		
		System.out.println("El resultado de la suma " + numero1 + " y " + numero2 + " es: "  + suma); 
		
		//multiplicamos
		
		int multiplicacion = numero1*numero2;
		System.out.println("El resultado de la multiplicacion " + numero1 + " y " + numero2 + " es: " + multiplicacion);
				
		
	    //string	--> va entre comillas dobles y son conjunto de caracteres
		String nombre = "Lidia";
		System.out.println("Hola " + nombre);

		// char --> pueden tener como valor una letra y siempre va con comillas simples
		
		char letter = 'w';
		
		//incrementos y decrementos
		
		suma++;
		System.out.println("El valor de la suma es: " + suma);
		
		suma--;
		
		System.out.println("El valor de la suma es: " + suma);
			
		
		//CONDICIONALES: 
		
		
		if ( edad == 18) //si...
		{ 
			System.out.println("Eres mayor de edad por los pelos");
		}
		
		else if  (edad > 18)//sino si...
		{ 
		    System.out.println("Eres sobradamente mayor de edad");	
		}

		else // sino... --> los ELSE nunca llevan condicion 
		{ System.out.println("Eres menor de edad");
		}
		
		
		
}
}