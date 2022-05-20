package com.test;

import com.model.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Pelusa", "French", "chico", 3, "negro");		
		System.out.println(perro1); //imprime solo la referencia, para evitar, se crea metodo en clase Perro (return)
		perro1.Comer();
		perro1.setHumano("Santiago");
		

		Perro perro2 = new Perro("Atom", "mestizo", "mediano", 6, "Blanco");
		System.out.println(perro2);
		perro2.setHumano("Erika");
		
		System.out.println(perro1);
		System.out.println(perro2);
		
		System.out.println(Perro.buscarHumano(1)); //se usa getter modificado, pasandole el id
		System.out.println(Perro.buscarHumano(2));
		
		
		
		

	}

}
