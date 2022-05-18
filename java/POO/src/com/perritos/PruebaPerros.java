package com.perritos;

public class PruebaPerros {

	public static void main(String[] args) {
		
		//Instanciación
		Perro perro1 = new Perro("Atom", 3);
		
		//Cambiar atributos
		perro1.nombre = "Atom";
		perro1.edad = 3;
		perro1.raza = "freshpul";
		perro1.tamanio = "chico";
		
		//Metodo
		perro1.ladrar();
		
		//como se va a ejecutar metodo que retorna algo, se guarda en variable y se imprime
		int edadP1 = perro1.edadPerruno();
		System.out.println(edadP1);
		
		//metodo estatico, manda alarma por que no se requiere estar instanciado y pero1 ya esta intanciado
		perro1.mensaje();
		Perro.mensaje(); // forma correcta de llamar una clase estatica
		
		
		
		Perro perro2 = new Perro("Patitas", 6);
		perro2.nombre = "Patitas";
		perro2.edad = 6;
		perro2.raza = "chihuahua";
		perro2.raza = "chico";
		
		perro2.ladrar();
		System.out.println(perro2.edadPerruno());
		

	}

}
