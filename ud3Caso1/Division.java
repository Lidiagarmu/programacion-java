package ud3Caso1;

public class Division {
	
	
public static void main(String[] args) {
	
	

	 // creo dos variables enteras num1 y num2 y una variable res_division que almacenará el resultado de la operación
	
		int num1=0, num2=0;
		int  res_division;

		res_division = dividir(num1, num2);
	}

	// método CONSTRUCTOR para crear el objeto


		public Division (int num1, int num2) {
	}


	//método para realizar la operación dividir

		public static int dividir (int num1, int num2) {
			return num1/num2;

	}
}
