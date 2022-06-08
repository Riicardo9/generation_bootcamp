package com.generation.demo.service;
import org.springframework.stereotype.Service;

//cuando le agregamos implements PersonaService lo abligamos a agregar sus metodos (marca error sobre nombre clase, click >> add)
// Se añade anotacion para que 
@Service
public class PersonaServiceImpl implements PersonaService{

	
	// Esta clase se va a encargar de enviar al controlador (es accesible a travez de una url)
	@Override
	public String registro(String nombre) {
		// TODO Auto-generated method stub
		return "El usuario " + nombre + " Ha sido registrado";
		
	}

	@Override
	public int calcular(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
}
