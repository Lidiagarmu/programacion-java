package ud3Caso1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class PruebasCalculadora {
	
	// importante la etiqueta @Test para que JUNIT realice las pruebas que queremos. 
	
	
	
	// PRUEBAS PARA LA CLASE Resta
	
	
	@Test
	
	public void testResta() {
		
		//puedo nombrar a las variables igual puesto que las creo en ''familias'' diferentes
		
				int resultado = Resta.restar(20, 10);
				
				int resultado_esperado = 10;
				
				assertEquals(resultado_esperado, resultado);
	}
	
	
	
	// PRUEBAS PARA LA CLASE Multiplicacion
	
	
	@Test
	
	public void testMultiplicacion() {
		
		//puedo nombrar a las variables igual puesto que las creo en ''familias'' diferentes
		
				int resultado = Multiplicacion.multiplicar(15, 2);
				
				int resultado_esperado = 30;
				
				assertEquals(resultado_esperado, resultado);
	}
	
	
	// PRUEBAS PARA LA CLASE Division
	
	
	
	@Test
	
	public void testDivision() {
		
		//puedo nombrar a las variables igual puesto que las creo en ''familias'' diferentes
		
				int resultado = Division.dividir(20, 10);
				
				int resultado_esperado = 2;
				
				assertEquals(resultado_esperado, resultado);
	}
	
}