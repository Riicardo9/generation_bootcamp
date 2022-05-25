package testGradle3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Calculadora {
	 
	@Test
	@DisplayName("Metodo para comprobar suma")
	public int suma(int a, int b) {
		 return a + b;
	 }
	 
	 public double multiplicacion (double a, double b) {
		 return a * b;
	 }
}
