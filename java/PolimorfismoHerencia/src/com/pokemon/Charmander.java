package com.pokemon;

//como no se puede heredar de varias clases, se usa interface, que definen metodos abstractos y aqui se mandan a llamar,
//tambien es hijo de pokemon
//mo se puede instanciar de una clase abstracta, por lo que solo se implementa en clase que no es abstracta
public class Charmander extends Pokemon implements TipoFuego, TipoAgua, TipoVolador{
	
	//pide que se genere un constructor
	public Charmander(int id, int edad, int nivel, String nombre, boolean evolucion) {
		super(id, edad, nivel, nombre, evolucion);
	}

	@Override
	public void lanzaLlamas() {
		System.out.println("lanzallamas");
		
	}

	@Override
	public void araniar() {
		System.out.println("arañar");
	}
	
	@Override
	public void volar(){
		System.out.println("volar");
	}
	
	@Override
	public void saludar(String mensaje){
		System.out.println("saludando");
	}
	
	
	//NO se puede heredar de varias clases, por lo que se solventa con interfaces
	

}
