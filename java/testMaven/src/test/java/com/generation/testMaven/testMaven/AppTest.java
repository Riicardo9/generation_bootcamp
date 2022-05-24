package com.generation.testMaven.testMaven;

//se importan las herramientas de junit
import org.junit.jupiter.api.*;

public class AppTest 
{
	
	@Test	
	public void saludoTest() {
		
		//para probar metodos o clases se requiere instanciarlos
		App saludoo =  new App();
		
		//el texto a comparar tiene que ser estrictamente igual al de la clase de App
		//se indica el valor que deberia ser la respesta, y se llama al metodo
		Assertions.assertEquals("Hola mundo!", saludoo.saludo());
	}
	
	@Test
	public void saludoStaticTest() {
		Assertions.assertEquals("Hola mundo!", App.saludoStatic());
	}

}	