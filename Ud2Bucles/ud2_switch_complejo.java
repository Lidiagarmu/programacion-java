package Ud2Bucles;
import java.util.Scanner;

public class ud2_switch_complejo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la figura de la que quieres hallar el área");
		System.out.println("1. Cuadrado");
		System.out.println("2. Rectángulo");
		System.out.println("3. Triángulo");
		System.out.println("4. Círculo");
		System.out.println("Introduce el número de la opción");
		
		int opcion  = sc.nextInt();
		double area=0, base, altura;
		String figura="";
		
		
		switch (opcion) 
		{
		case 1:
			System.out.println("Introduce el lado en cm: ");
			double lado = sc.nextDouble();
			area = Math.pow(lado, 2);
			figura = "cuadrado";
			break;
		
		case 2:
			System.out.println("Introduce la base en cm");
			base=sc.nextDouble();
			System.out.println("Introduce la altura en cm");
			altura=sc.nextDouble();
			area=base*altura;
			figura="rectángulo";
			break;
		
			case 3:
				System.out.println("Introduce la base en cm");
				base=sc.nextDouble();
				System.out.println("Introduce la altura en cm");
				altura=sc.nextDouble();
				area=(base*altura)/2;
				figura="triángulo";
				break;
			
			case 4:
				System.out.println("Introduce el radio en cm");
				double radio = sc.nextDouble();
				area = Math.PI*Math.pow(radio, 2);
				figura = "círculo";
				break;
			
			default:
				System.err.println("Eres cortito");
		}
		System.out.printf("El área del %s es: %.3f %n", figura, area); /* 
		
		printf
		
		%s --> se refiere a figura de despues de las "
		%.3f %n --> se refiere a área
		     el .3 se refiere a que el valor va a tener tres decimales
		     f indica que el numero será de tipo float o double
		     &n indica un salto de línea
		
		
		
		EJEMPLO2: 
		
		Si queremos mostrar el número 12.3698 de tipo double con dos decimales:

System.out.printf("%.2f %n", 12.3698);

- El primer % indica que en esa posición se va a escribir un valor. El valor a escribir se encuentra a continuación de las comillas.
- .2 indica el número de decimales.
- La f indica que el número es de tipo float o double. 
- %n indica un salto de línea. Equivale a \n. Con printf podemos usar ambos para hacer un salto de línea.

La salida por pantalla es:
12,37
		*/
		
		
	}

}
