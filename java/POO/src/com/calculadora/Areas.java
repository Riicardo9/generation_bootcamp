package com.calculadora;

public class Areas {
	
	public void mensaje() {
		System.out.println("Voy a calcular un area");
	}
	
	public int areaCuadrado(int l) {
		return l * l;
	}
	
	public double areaTriangulo (int b, int a) {
		return (b * a) / 2;
	}
	
	public double areaCirculo (int r) {
		return 3.1416 * (r*r);
	}

}
