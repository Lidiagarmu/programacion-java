package ud6_1_arrays_y_stringclass;

import java.util.Scanner;

public class EjercicioArray {
		
	// HAZ UN PROGRAMA QUE PREGUNTE AL USUARIO SUS NOTAS Y DESPUES LE HAGA SU NOTA MEDIA
	
	public static void main(String[] args) {
		
		double notas[] = new double[5];
		double sumaNotas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//i+1 porque esta feo que la primera nota empiece en nota examen 0
		
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Introduce la nota del examen " + (i+1) + ": ");
			notas[i] += sc.nextDouble();
			
			sumaNotas += notas[i]; // es como decir: sumaNotas = sumaNotas + notas [i];
			
		}
		
		System.out.println("La media de tus notas es: " + sumaNotas/notas.length);
	
		
		

	}

}
