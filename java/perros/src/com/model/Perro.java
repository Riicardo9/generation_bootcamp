package com.model;

import java.util.HashMap;
import java.util.Map;

public class Perro {

	//Atributos
	private String nombre;
	private String raza;
	private String tamanio;
	private int edad;
	private String color;
	
	private int id;
	private static int contador = 0; //al ser static la variable se inicia con la clase y no con el objeto, si quitamos el estatic se reiniciaria cada que se instancia de nuevo
	
	private static Map<Integer, String> humano = new HashMap<Integer, String>();
	
	//Constructor inicializa los objetos
	public Perro(String nombre, String raza, String tamanio, int edad, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;		
		this.id = ++Perro.contador;
	}
			
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Perro.contador = contador;
	}
	
	public void setHumano(String value) {
		Perro.humano.put(this.id, value);
	}

	//Si no se pone modificador de acceso el programa le agrega defaul, uq etiene cierto nivel de privacidad que no permite hacer uso del metodo
	
	//El getter se modifica y se pasa a metodos, se le pone estatico
	public static String buscarHumano(Integer key) {
		return "El nombre del dueño es" + humano.get(key);
	}
	
	public void Comer() {
		System.out.println(this.nombre + " Comiendo");
	}
	
	public void Dormir() {
		System.out.println(this.nombre + " Durmiendo");
	}
	
	public void Sentar() {
		System.out.println(this.nombre + " Sentado");
	}
	
	public void Correr() {
		System.out.println(this.nombre + " Correr");
	}
	
	public void Ladrar () {
		System.out.println(this.nombre + " Ladrando");
	}

	

	//Metodo toString dentro de clase Perro >> clic derecho >> source >> Generate toString()... >> no activar ultima casilla
	// sobreescritura de metodos
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + ", color="
				+ color + ", id=" + id + "]";
	}
	
	
}
