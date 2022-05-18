package com.ejercicio;

import java.util.Scanner;

public class CalculadoraGeometrica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Perimetro calcPerimetro = new Perimetro();
		System.out.println("El perimetro del cuadrado es: " + calcPerimetro.perimetroCuadrado(9));
		System.out.println("El perimetro del triangulo es: " + calcPerimetro.perimetroTriangulo(1));
		System.out.println("El perimetro del circulo es: " + calcPerimetro.perimetroCirculo(3));
		
		
		Areas calcArea = new Areas();
		System.out.println("El area del cuadrado es: " + calcArea.areaCuadrado(9));
		System.out.println("El area del cuadrado es: " + calcArea.areaTriangulo(9,3));
		System.out.println("El area del cuadrado es: " + calcArea.areaCirculo(3));

	}
}
