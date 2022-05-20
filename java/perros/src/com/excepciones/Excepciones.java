package com.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = null;
		
		float div;
		
		//try-catch
		
		try {
			//codigo que se va a probar
			div = num1 / num2;
			
		} catch(ArithmeticException ex) { //la excepcion a observar
			//lo que va a hacer cueando se detecte una excepcion
			div = 0.0f;
			System.out.println("Error: " + ex.getMessage());// 
			
		} catch(NullPointerException ex){
			div = 0.0f;
			System.out.println("Error: " +ex.getMessage());
			
		} finally { //siempre se ejecuta al final, casi no se usa
			System.out.println("Finalizo el Try Catch");
		}

	}

}
