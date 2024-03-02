package Ud2Bucles;


import java.util.Scanner;


public class ud2_DoWhile {

	public static void main(String[] args) {
	
			//BUCLE DO-WHILE ------------------
		
		/* esta estructura de repetición ejecuta el bloque de sentencias al menos una vez
		 * después comprueba la condición y repite el bloque de sentencias mientras la condición es verdadera
		 * 
		 * 
		 * 
		 * SINTAXIS:
		 
		  inicialización;
		  do{
		  
		  	bloque de sentencias;
		  	actualización;
		  	
		  } while (condición);
		  
		  
	     */
		
		
		//EJEMPLO UD2:
		
		/*  Problema: Pide un numero al usuario para que se muestre en pantalla la tabla de multiplicar de dicho numero hasta el 10.
		 * Combina do-while con while
		 * Se debe validar que el número introducido sea mayor que cero porque sino lo es se le preguntará de nuevo al usuario hasta que introduzca uno correcto
		 */
		
		int numero=0, resultado, contador;
		boolean bandera;
		Scanner sc = new Scanner(System.in);
		
		//se establece la variable bandera a true para que por lo menos entre una vez en el bucle while
		bandera = true;
		
		while (bandera) {
			System.out.print("Introduzca un número: ");
			numero=sc.nextInt();
			if (numero>0) {
				//si numero es mayor que 0 se puede realizar la tabla entonces se establece la variable bandera a false para poder salir del bucle while
				bandera = false;
			}
						
		}
		
		// se inicializa el contador a 1
			contador = 1;
			do {
				resultado = contador * numero;
				System.out.println(numero + " * " + contador + " = " + resultado);
				contador=contador+1;
				
				//cuando contador sea mayor a 10 ya no se cumplirá la condición del do-while y finaliza el bucle
				
			} while (contador<=10);
			
			sc.close();
			
			
			/* IMPRIME EN CONSOLA (AL INTRODUCIR 4 POR TECLADO) 
			  4*1=4
			  4*2=8
			  4*3=12
			  ...
			  4*10=40
			  
			 */
		
			
			
			
			
			//PREGUNTA UD2 APARTADO 5 --> Segun el siguiente codigo podemos decir que el bucle realiza menos de 10 iteraciones? 
			
			for (int y=0; y<10; y++) {
				System.out.println("iterando" + y);
			} 
			
			/*esto imprime:
			 
			 	iterando0
				iterando1
				iterando2
				iterando3
				iterando4
				iterando5
				iterando6
				iterando7
				iterando8
				iterando9
				
				
			Por lo que itera en 10 ocasiones exxactamente, no en menos de 10
			 */
		
	}

}
