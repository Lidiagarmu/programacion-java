package ud3Pruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraParametrizadaTest {
	@ParameterizedTest
	@CsvSource({"5, 10, 50", "-2, 2, -4", "-4, -3, 12"})
	void testMultiplication_parametrized(int a, int b, int c) {
	int res = Calculadora.sumar(a, b);
	Assertions.assertEquals(c, res);
	}

}
