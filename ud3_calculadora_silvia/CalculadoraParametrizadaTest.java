package ud3_calculadora_silvia;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class CalculadoraParametrizadaTest {

static calculator calc;
	
	@BeforeAll
	private static void accionesIniciales() {
		System.out.println("Método before all");
		calc = new calculator();
	}
	
	//método para porporcionar los datos para la prueba
	static Stream<Arguments> datosParaSumar(){
		return Stream.of(
				Arguments.of(2, 3, 5),
				Arguments.of(-5,7,2),
				Arguments.of(4,23,27),
				Arguments.of(0,0,0),
				Arguments.of(2,-3,-1),
				Arguments.of(-10,-20,-30)
		);
	}
	
	//hacemos el test parametrizado con los argumentos dados
	@ParameterizedTest
	@MethodSource("datosParaSumar")
	void testSumarParametrizado(int a, int b, int resultado_esperado) {
		//verifcamos que las sumas son correctas
		int resultado = calc.sumar(a, b);
		assertEquals(resultado_esperado, resultado);
	}

}