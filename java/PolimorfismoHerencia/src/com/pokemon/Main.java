package com.pokemon;

public class Main {

	public static void main(String[] args) {

		Pokemon chikorita = new Pokemon(152, 1, 20, "Chikorita", false);
		System.out.println();
		
		chikorita.comer();
		chikorita.dormir();
		chikorita.atacar();
		
		System.out.println("------------------------");
		
		TipoPlanta chikorita2 = new TipoPlanta(152, 1, 20, "Chikorita2", false, 9);
		chikorita2.comer();
		chikorita2.envenenar();
	}
}
