package Ud2Bucles;


import java.util.Scanner; // lo usamos en el EJEMPLO 4 con if else



public class If_and_IfElse {

	public static void main(String[] args) {
		
		
		
		//------------------------------BUCLES: IF simple & IF ELSE --------------------------------------------------
		
		
		// estructura IF simple_______________________________________
		
		
		//EJEMPLO 1
		
		int edad;
		boolean mayorEdad;
		
		edad = 30;
	
		
		if (edad>=18) {
			System.out.println("Es mayor de edad");
					mayorEdad = true;
		}
		
		//EJEMPLO 2
		
		int numero = 10;
		
		if (numero > 0) {
			System.out.println("El numero es positivo");
			System.out.println("El numero multiplicado por 2 es: " + (numero * 2));
			System.out.println("El numero al cuadrado es: "  + (numero * numero));
			
		}
		
		//EJEMPLO 3
		
		boolean interruptor = false;
		
		if (interruptor)
			//codigo a ejecutar si interruptor es verdadero
			System.out.println("El interruptor ha sido activado");
		
		// estructura IF ELSE_____________________________________es de seleccion doble entre 2 bloques de sentencias mutuamente excluyentes
		
		//EJEMPLO 4
		
		//declaracion de variables
		
		int age;
		boolean ageOld;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Introduce la edad: ");
			
			age = sc.nextInt();
				if (age >= 18) {
					System.out.println("Es mayor de edad");
					ageOld=true;
				} else {
					System.out.println("Es menor de edad");
					ageOld=false;
				}
				//sc.close(); --> lo comento para que me permita leer el siguiente scanner
				
				
		//EJEMPLO 5 
				
			//ACTIVAR/DESCACTIVAR un INTERRUPTOR
				
				//declaracion de variables
				
				boolean interruptorrr;
				
				Scanner scc = new Scanner(System.in);
				
				
				
				System.out.print("Para activar interruptor escribe true, para desactivar false: ");
				interruptorrr= scc.nextBoolean();
				
					if (interruptorrr) {
						// codigo a ejecutar si interruptor es verdadero
						
						System.out.println("El interruptor ha sido activado");
					} else {
						// codigo a ejecutar si interruptor es falso
						
						System.out.println("El interruptor ha sido desactivado");
					}
					scc.close();

	}

}



