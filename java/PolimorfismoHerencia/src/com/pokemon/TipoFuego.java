package com.pokemon;

//las interfaces solo admiten metodos abstractos
public interface TipoFuego {
	//en interface las propiedades son constantes
	int nivelFuego = 9;
	
	//Metodos abstractos
	public abstract void lanzaLlamas();
	//public abstract void araniar();
	
	//en una interface el metodo vacio ya viene con public abstract
	void araniar();
	
	
	
	
}
