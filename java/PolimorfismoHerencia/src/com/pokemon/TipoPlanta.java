package com.pokemon;

public class TipoPlanta extends Pokemon{
	
	private int numeroHojas;
	
	//el constructor hijo debe coincidir con la clase padre
	public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas) {
		
		//se le pasan los atributos de la clase padre (no funcionaria)
		super(id, edad, nivel, nombre, evolucion);
		this.numeroHojas = numeroHojas;
		
	}
	
	public void paralizar() {
		//getNombre obtiene la propiedad que es privada, llama a getter (clase hija)
		System.out.println(getNombre() + " Esta paralizando");
	}
	
	public void envenenar() {
		System.out.println(getNombre()  + " Esta envenenando");
	}

	public int getNumeroHojas() {
		return numeroHojas;
	}

	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}
}
