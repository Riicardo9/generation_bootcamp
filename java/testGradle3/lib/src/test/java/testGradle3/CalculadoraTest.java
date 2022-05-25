package testGradle3;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


//anotacion no lleva punto y coma
@DisplayName("Metodo para comprobar suma")
public class CalculadoraTest {
	
	@Test
	@DisplayName("Metodo para comprobar suma")
	public void sumaTest() {
		Calculadora sumaCalc = new Calculadora ();
		assertEquals(2, sumaCalc.suma(1,1));
	}

	@Test
	@DisplayName("Metodo para comprobar Assertions")
	public void asserionTest() {
		
		
		assertAll(
				"Encabezado",
				() -> assertEquals(2, 1+3, "Deberian ser 2"),
				() -> assertTrue(false, "Deberia ser true")
				);
	}
}
