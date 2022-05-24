package com.pokemon;

public class Chikorita extends TipoPlanta {
	
	private int numeroCuernitos;

	public Chikorita(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas, int numeroCuernitos) {
		
		//Super hace referecnia al constructor de la clase padre, constructor anterior (en este caso tipoplanta)
		super(id, edad, nivel, nombre, evolucion, numeroHojas);
		this.numeroCuernitos = numeroCuernitos;
		
	}
	
	public void latigo () {
		System.out.println(getNombre() + " Uso latigo");
	}
	
	//Polimorfsmo en tiempo de ejecucuion,sobreescribe metodo de padre (anulacion de metodos)
		//se declara el metodo con el mismo nobre, se define diferente comportamiento del metodo
	//se coloca override como buena practica para indicar que sera un metodo que sobrescribira (si llega a haber error lo detecta de lo contrano lo tomaria como metodo distinto )
		@Override
		public void atacar() {
			System.out.println(getNombre() + " Esta atacando al estilo Chikorita");
		}

	
	//getter y setters
	public int getNumeroCuernitos() {
		return numeroCuernitos;
	}

	public void setNumeroCuernitos(int numeroCuernitos) {
		this.numeroCuernitos = numeroCuernitos;
	}

	//overrride le permite saber cuales metodos se estan sobreescribiendo
	@Override
	public String toString() {
		return "Chikorita [numeroCuernitos=" + numeroCuernitos + "]";
	}
	
	
	
	
	
	
	
	

}
