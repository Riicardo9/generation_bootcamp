package com.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		
		
		
		int [] arrNumeros = new int[5];
		System.out.println(Arrays.toString(arrNumeros));
		
		arrNumeros[0] = 333;
		arrNumeros[1] = Integer.parseInt("666");
		arrNumeros[2] = 999;
		arrNumeros[3] = 1333;
		arrNumeros[4] = 166;
		
		System.out.println(Arrays.toString(arrNumeros));
		System.out.println(arrNumeros[0]);
		System.out.println(arrNumeros[1]);
		System.out.println(arrNumeros[2]);
		System.out.println(arrNumeros[3]);
		System.out.println(arrNumeros[4]);
		
		for(int i = 0; i < arrNumeros.length; i++) {
			
			System.out.println(arrNumeros[i]);
		}
		
		
		//For each
		int conteo = 0;
		for(int elemento: arrNumeros) {
			conteo ++;
			System.out.println("Elemento numero: " + conteo + " tiene el valor: " + elemento);
		}
		
		
		Persona person1 = new Persona("Ricardo", 17);
		Persona person2 = new Persona("Merari", 7);
		
		//Forma valida para crear arreglo pero casi no se utiliza object
		Object arrPersonas[] = new Object[3];
		
		//Forma mas comun de crear objetos, usando el nombre de la clase
		Persona arrPersonass[] = new Persona[3];
		
		
		arrPersonass[0] = person1;
		arrPersonass[1] = person2;
		arrPersonass[2] = new Persona("Itamar",27);  //tambien se puede crear directamente 
		
		System.out.println(Arrays.toString(arrPersonass));
		
		for(Persona elemento:arrPersonass ) {
			System.out.println(elemento.nombre + "-" + elemento.edad);
		}
		
		
		//Arreglos literales, no se puede modificar el tamaño despues
		String [] arrString = {"Hola","Este","es"};
		System.out.println(Arrays.toString(arrString));
		
	}

}
