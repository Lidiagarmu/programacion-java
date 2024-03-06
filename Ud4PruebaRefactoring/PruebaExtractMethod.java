package Ud4PruebaRefactoring;

import java.util.Random;

public class PruebaExtractMethod {

	public static void main(String[] args) {
		
		
		aleatorio();

	}

	private static void aleatorio() {
		Random random = new Random();
		int valorDado = random.nextInt(10)+1; //valores aleatorios entre 1 y 10
		System.out.println(valorDado);
	}

}
