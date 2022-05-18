package com.calculadora;

import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
		System.out.println("Vamos a calcular");
		
		int a = 10;
		Scanner sc = new Scanner(System.in);
		
		Calculadora cal = new Calculadora();
		
		//Metodo que no regresa nada
		cal.mensajesumar();
		
		//Metodoq ue regresa un valor, lo imprimimos d euna vez
		System.out.println(cal.mensaje());
		
		
		double pruebaa = cal.pruebaa();
		System.out.println(pruebaa);
		
		int suma = cal.sumar(5, 20);
		System.out.println(suma);
		
		cal.sumarM(3,6);
		
		int resta = cal.restar(9,3);
		System.out.println("El resultado de la resta es: "+ resta);
		
		
		Areas CalcArea = new Areas();
		
		CalcArea.mensaje();
		System.out.println(CalcArea.areaCuadrado(5));
		System.out.println(CalcArea.areaTriangulo(3, 3));
		
		
		
		
		
	}

}
