package ud6_1_arrays_y_stringclass;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		int arrayBi [][] = new int [3][2];
		
		arrayBi [0][0] = 15;
		arrayBi [0][1] = 234;

		arrayBi [1][0] = 34;
		arrayBi [1][1] = -34;
		
		arrayBi [2][0] = 123;
		arrayBi [2][1] = -5;
		
		//un indice para recorrer las filas
		for(int i=0; i<arrayBi.length; i++) {
				//por cada fila, recorro sus columnas (otro indice)
				for(int j=0; j<arrayBi[i].length; j++) {
					System.out.println(arrayBi[i][j]);
				}
		}
			

	}

}
