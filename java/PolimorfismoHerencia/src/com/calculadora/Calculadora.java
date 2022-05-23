package com.calculadora;

public class Calculadora {
	
	private int a;
	private int b;
	private int c;
	private int resultado;
	private String nombre;
	
	//Polimirfirmo en tiempo de compilacion
	//Se pueden crear varios constructores dependiendo de lo que va a utilizar
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//Se hace otro constructor, con diferentes parametros
	public Calculadora (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Calculadora (int a, int b, int c, String nombre) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.nombre = nombre;
	}
	
	
	public void sumar(int a, int b) {
		resultado = this.a + this.b;
		System.out.println("El resultado de la suma es: " + resultado);
	}
	
	public void sumar(int a, int b, int c) {
		resultado = this.a + this.b + this.c;
		System.out.println("Segundo metodo");
	}
	
	public void sumar(int a, int b, int c, int d) {
		resultado = this.a + this.b + this.c;
		System.out.println("Segundo metodo");
	}
	
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	



	
	
}
