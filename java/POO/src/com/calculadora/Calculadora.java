package com.calculadora;

public class Calculadora {

	//Metodo que no regresa nada (VOID)
	public void mensajesumar(){
		System.out.println("Voy a sumar");
	}
	
	
	//Metodo que retorna datos, se especifica que va a regresar (MENSAJE)
	public String mensaje() {
		String mensaje = "Voy a realizar una operación";
		return mensaje;
	}
	
	public int prueba() {
		return 2;
	}
	
	public double pruebaa() {
		return 2.5;
	}
	
	//Operaciones
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public void sumarM (int a, int b) {
		System.out.println("El resultado de la suma es:" + (a+b));
	}
	
	public int restar(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public double dividir(double a, double b) {
		
		if(b != 0) {
			return a / b;
		}
		else {
			return -1;
		}
		
	}
	
	
}
