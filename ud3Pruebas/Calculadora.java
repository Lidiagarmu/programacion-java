package ud3Pruebas;

import javax.swing.LayoutFocusTraversalPolicy;

public class Calculadora {

	public static void main(String[] args) {
		
		int a=10, b=5;
		int res_suma, res_resta;
		
		res_suma = sumar(a,b);
		res_resta = restar(a, b);

	}
	
	public static int sumar (int n1, int n2) {
		return n1+n2;
		
	}

		public static int restar (int n1, int n2) {
			return n1-n2;
		}
		
		public static int dividir (int a,int b) {
			return a/b;
		}
}

