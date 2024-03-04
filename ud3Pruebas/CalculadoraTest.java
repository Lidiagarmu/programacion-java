package ud3Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.validator.PublicClassValidator;

class CalculadoraTest {
	
	//necesito ponerle la etiqueta @test sino JUNIT no lo va a entender

	@Test 
	
	public void testSuma() {
		
		int resultado = Calculadora.sumar(10, 5); /*como sumar es static para poder llamarlo desde el test tengo que 
		decirle el nombre de la clase "Calculadora" y el nombre de la funcion. Despues le paso 2 numeros enteros */
		int resultado_esperado = 15;
		
		assertEquals(resultado_esperado, resultado);
		
		
	}
	
	@Test
	
	public void testResta() {
		
		//puedo nombrar a las variables igual puesto que las creo en ''familias'' diferentes
		
		int resultado = Calculadora.restar(20, 10);
		
		int resultado_esperado = 10;
		
		assertEquals(resultado_esperado, resultado);
	}
	
	@Test
	public void testDividir() {
		
	
		
		int resultado = Calculadora.dividir(20, 10);
		int resultado_esperado = 2;
		assertEquals(resultado_esperado, resultado);
	}


}
