package Ud2Bucles;

import java.util.Scanner; /*Scanner no hace parte por defecto de Java por lo que debemos de imortarlo, 
es decir, decirle a Java de donde procede esta definicion*/

public class ud2_Scanner {
	public static void main (String[] args) {
		
		
		// CLASE SCANNER _______________________________________________________________
		
		
		Scanner sc = new Scanner(System.in); // System.in -- es un objeto que representa la entrada estandar, generalmente el teclado (tambien se puede indicar otro tipo de entrada)
		
		// Scanner --> es la clase, y es la que nos va a permitir leer por teclado y que proviene de: java.until.Scanner (que esto es un paquete)
		// la estamos instanciando como un objeto de su propio tipo Scanner (el segundo Scanner que aparece)
		//System.in --> podemos leer datos de entrada de tipo String, enteros, booleanos....

		
		
		
		
			//EJEMPLO 1
		
		System.out.print("¿Como te llamas? ");
		String name = sc.nextLine();
		
		System.out.print("¿Cuantos años tienes? ");
		int age = sc.nextInt();
		
		System.out.print( name + " en 10 años tendrá " + (age + 10) + " años. ");
		
		
		
		//en este ejemplo si pidiera primero nectInt() y despues nextLine() no deja introducir String o caracter de texto. Como que se lo salta.
		// para evitar el error anterior debemos de meter despues del nextInt(); el metodo sc.nextLine(); a secas y continuar con el codigo
			
		sc.nextLine();
		
			//EJEMPLO 2
		
	    // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido -----> Scanner sc = new Scanner(System.in);

        

        // entrada de una cadena
        
		System.out.println("Introduce nombre ");
        String name2 = sc.nextLine();

        // entrada de un carácter
        
        System.out.println("Introduce tu género ");
        char gender = sc.next().charAt(0); // con el metodo .charAt(0) me coge solamente el caracter de la posicion 0. Al meter fem me imprinme solo la f

        // Entrada de datos numéricos
        // byte, short y float
        
        System.out.println("Introduce edad2");
        int age2 = sc.nextInt();
        
        sc.nextLine();
        

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+ name2);
        System.out.println("Género: "+gender);
        System.out.println("Edad: "+age2);
        
						
			//EJEMPLOS UD2			
						
		System.out.print("El texto introducido es: ");
		
		String texto = sc.nextLine(); // nextLine() es uno de muchos metodos que existen. Solo lee datos de tipo String
		
		
		
		System.out.print("Introduce un numero entero: ");
		int num = sc.nextInt(); //netxInt() metodo que lee datos numericos enteros
		
		System.out.print("Introduce un valor booleano: ");
		boolean b = sc.nextBoolean();
		
		System.out.print("Introduce un valor con decimales (tipo dato con precisión simple: ");
		float f = sc.nextFloat();
		
		System.out.print("Introduce un valor con decimales (tipo dato con precisión doble): ");
		double d = sc.nextDouble();
		sc.nextLine();
		
		sc.close();
		
		// TIPOS DE DATOS PRIMITIVOS (son 8) --> no son objetos, son valores que se almacenan directamente en la memoria
		
		/* 
		 boolean ocupa 1 byte   ------------> esencialmente se usa para tomar decisiones basadas en condiciones logicas
		 byte ocupa 1 byte    ------------>
		 short ocupa 2 bytes    ------------>
		 char ocupa 2 bytes   ------------>
		 int ocupa 4 bytes   ------------>
		 float ocupa 4 bytes   ------------>
		 long ocupa 8 bytes   ------------>
		 double ocupa 8 bytes   ------------>
		 
		 Si a estos datos primitivos le pomnemos la primera letra en mayouscula nos estaremos refiriendo a una clase envoltoria o wrapper class
		 
		 wrapper = Integer, Double, Float, Character, Short....
		 
		 */
		
		
	}
	
}


