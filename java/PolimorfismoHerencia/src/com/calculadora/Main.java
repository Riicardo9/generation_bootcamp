package com.calculadora;

public class Main {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora(6,9);
		cal.sumar(5,8);
		
		//Polimorfismo en tiempo de compilación
		//Sobre carga de metodos, dependiendo de la cantidad de parametros se le mande, se ejecuta el metodo que se ocupe
		Calculadora cal2 = new Calculadora(3,6,9);
		cal2.sumar(5,4,2);
		cal2.sumar(0, 0);
		
		Calculadora cal3 = new Calculadora(3,6,9,"Ricardo");
		
		
		
		

	}
	
	

}
