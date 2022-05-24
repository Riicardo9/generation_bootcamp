package com.pokemon;

public class TipoPlanta extends Pokemon{
	
	private int numeroHojas;
	
	//el constructor hijo debe coincidir con la clase padre
	// en metodo abstracto da error sobre tipo planta cursor sobre>> add unimplemented method o hacer a mano (se agrego hasta abajo)
	public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas) {
		
		//se le pasan los atributos de la clase padre Pokemon (no funcionaria)
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
	
	//Polimorfsmo en tiempo de ejecucuion,sobreescribe metodo de padre (anulacion de metodos)
	//se declara el metodo con el mismo nobre, se define diferente comportamiento del metodo
	public void atacar() {
		System.out.println(getNombre() + " Esta atacando al estilo planta");
	}

	public int getNumeroHojas() {
		return numeroHojas;
	}

	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}

	//para hacer uso del metodo abstracto (vacio) se usa el polimorfirmo 
	//@override ayuda a comprobar que es metodo del padre
	@Override
	public void saludar(String mensaje) {
		System.out.println(mensaje);
	}
}
