package com.pokemon;

public class Main {

	public static void main(String[] args) {

		//Pokemon chikorita = new Pokemon(152, 1, 20, "Chikorita", false);
		//chikorita.comer();
		//chikorita.dormir();
		//chikorita.atacar();
		
		System.out.println("------------------------");
		
		TipoPlanta chikorita2 = new TipoPlanta(152, 1, 20, "Chikorita2", false, 9);
		chikorita2.comer();
		chikorita2.envenenar();
		
		System.out.println("------------------------");
		
		Chikorita chikorita3 = new Chikorita(152, 1, 20, "Chikorita3", false, 9, 6);
		chikorita3.comer();
		chikorita3.dormir();
		chikorita3.atacar();
		
		chikorita3.envenenar();
		chikorita3.paralizar();
		
		chikorita3.latigo();
		chikorita3.comer("pasto");
		
		System.out.println("------------------------ Abstractos");
		
		Charmander charmander1 = new Charmander (4, 3, 50, "Charmander", false);
		charmander1.comer();
		charmander1.dormir();
		charmander1.atacar();
		
		charmander1.lanzaLlamas();
		charmander1.araniar();
		charmander1.volar();
		charmander1.saludar("Hola");
		
		
		
	}
}
