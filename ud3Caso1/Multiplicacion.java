package ud3Caso1;

public class Multiplicacion {
	
	
public static void main(String[] args) {
	

	// creo dos variables enteras num1 y num2 y una variable res_multiplicacion que almacenará el resultado de la operación
	
		int num1=0, num2=0;
		int  res_multiplicacion;
	
	
		res_multiplicacion = multiplicar(num1, num2);

	}

	// método CONSTRUCTOR para crear el objeto


		public Multiplicacion(int num1, int num2) {
	
	}
	
	
	//método para realizar la operación multiplicar

		public static int multiplicar (int num1, int num2) {
			return num1*num2;
	
	}
}