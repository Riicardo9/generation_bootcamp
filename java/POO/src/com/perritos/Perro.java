package com.perritos;

public class Perro {
	
	//Atributos o propiedades
	String nombre = "Anonimo"; //se le asigna valor por defecto, por si no se asigna aparezca eso (no es la mejor forma)
	int edad;
	String raza;
	String tamanio;
	
	//Constructor, inicializa objeto, en java se tiene que llamar igual que la clase, this hace referencia a un atributo de la clase
	// Los parametros que se definan en el constructor hacen que sean obligatorios al instanciar objeto (new)
	public Perro (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	//Metodos
	public void ladrar() {
		System.out.println("El perro " + nombre + " Ladrido guauf");
	}
	
	public int edadPerruno() {
		return edad * 7;
	}
	
	
	//Metodo estatico. permite ser usado sin necesidad de instanciar un objeto
	public static void mensaje() {
		System.out.println("Esta es una clase estatica perro");
	}

}
