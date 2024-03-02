package ud3_calculadora_silvia;




import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.function.Executable;
import java.time.Duration; // Importar la clase Duration

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest {

	static calculator calc;
	
	@BeforeAll
	private static void accionesIniciales() {
		System.out.println("Método before all");
		calc = new calculator();
	}
	
	
	@AfterAll
	private static void accionesFinales() {
		System.out.println("Fin del test");
		calc.clear();
	}
	
	
	@AfterEach
	public void after() {
		System.out.println("Después de cada método");
		calc.clear();
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Antes de testear cada método");
		
	}
	
	@Test
	@Order(1)
	void testSuma() {
		System.out.println("Estoy en el test suma");
		int resultado = calc.sumar(10,5);
		int esperado = 15;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	@Order(4)
	void testResta() {
		System.out.println("Estoy en el test resta");
		int resultado = calc.restar(10,5);
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}
	
	
	@Test
	@Order(3)
	void testDividir() {
		int a = 10;
		int b = 5;
		System.out.println("Estoy en el test dividir");
		int resultado = calc.dividir(a, b);
		int esperado = 2;
		assertEquals(resultado, esperado);
	}
	
	
	@Test
	@Order(2)
	void testDividirConExcepcion() {
		int a = 10;
		int b = 0;
		System.out.println("Estoy en el test dividir con excepcion");
		
		//verificar que la excepcion cuando se divide entre 0 se tiene en cuenta
		assertThrows(ArithmeticException.class, new Executable(){

			@Override
			public void execute() throws Throwable {
				calc.dividir(a, b);
				
			}			
		});
		
		
	
	}
	
	@Test
	@Order(5)
	void testOperacionOptima() {
		System.out.println("Estoy en el test operacion optima");
		//verificar que el metodo no dure más de 100ms
		assertTimeout(Duration.ofMillis(100), new Executable() {

			@Override
			public void execute() throws Throwable {
				calc.OperacionOptima();
				
			}
			
		});
	

}
}