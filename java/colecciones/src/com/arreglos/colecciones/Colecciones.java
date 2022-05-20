package com.arreglos.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		//List - ArrayList
		//arreglo que viene de la subclase list
		// se crea la variable con picoparentesis
		System.out.println("\t List String");
		
		List<String> miArr = new ArrayList<String>();
		miArr.add("Ricardo");
		miArr.add("Ortega");
		miArr.add("Eusebio");
		miArr.add(3, "Ricardoo"); //se le puede pasar la posición que se requiere modificar
		
		String elemento = miArr.remove(1);
		
		System.out.println(miArr);
		System.out.println(miArr.size());
		System.out.println(elemento);
		
		
		//Se manda a llamar el metodo y se le pasa el parametro (miArr)
		//la forma correcta se coloca la clase y luego el metodo, pero como el metodo lo tenemos dentro de la clase, no es del todo necesario
		//Colecciones.Imprimir(miArr); - USO FUERA DE LA CLASE
		Imprimir(miArr);
		
		

		/*Coleccion de numeros
		no se puede crear arreglo con valores primitivos se usan las clases wrappers, cada primitivo tiene su clase y se pueden usar sus metodos
		
		 * clases Wrappers
		 * long ==> Long
		 * double ==> Double
		 * int ==> Integer
		 * boolean ==> Boolean*/
		
		System.out.println("\t List Integer");
		
		int num1 = 10;
		Integer num2 =10;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num2 instanceof Integer); //regresa un boleano si num2 es una instancia de Integer
		System.out.println(num2.getClass().getSimpleName()); //obtiene el nombre de la clase wrapper (INTEGER)
		
	
		List<Integer> miArr2 = new ArrayList<Integer>();
		miArr2.add(3);
		miArr2.add(6);
		miArr2.add(9);
		
		Imprimir(miArr2);
		
		
		/*Coleccion Hashset
		 * no acepta valores duplicados
		 * no lo guarda en un orden espcifico (no tiene indice)
		 * coleccion mas rapida*/
		
		System.out.println("\t Set --- HashSet");
		
		Set<String> miSet = new HashSet<String>();
		miSet.add("Ricardo");
		miSet.add("Ricardoo");
		miSet.add("Ricardooo");
		
		miSet.remove("");
		
		System.out.println(miSet);
		Imprimir(miSet);
		System.out.println(miSet.contains("Ricardo")); //busca que contenga algo la colección y devuelve boolean
		
		
		
		/*Map -- HashMap -- Indice
		 * Key, value*/
		System.out.println("\t Set --- HashMap");
		
		Map<String, Integer> miMap = new HashMap<String, Integer>();
		
		miMap.put("Valor 1", 33);
		miMap.put("Valor 1", 66);
		miMap.put("Valor 3", 99);
		miMap.put("Valor 4", 133);
		miMap.put("Valor 5", 266);
		miMap.put("Valor 6", 399);
	
		//no funcionaria la clase imprimir, se debe usar diferentes metodos
		System.out.println(miMap);
		System.out.println(miMap.values()); //Imprime values
		System.out.println(miMap.keySet()); //Imprime keys
		
		//forma de foreach para imprimir
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}
		
		
		//buscar valores
		System.out.println(miMap.get("Valor 1"));
		
		
		
		
		
		
	}
	
	public static void Imprimir(Collection coleccion) {
		
		for(Object elemento : coleccion) {
			System.out.println("Elemento es: " + elemento);
		}
	}

}

