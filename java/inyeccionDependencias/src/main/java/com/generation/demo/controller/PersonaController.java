package com.generation.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.generation.demo.service.PersonaServiceImpl;


//Recibe peticiones del front, las va a procesar etc
@RestController

//para 
@RequestMapping("/api")
public class PersonaController {
	
	
	//instaciamos la clase para usar sus metodos
	private PersonaServiceImpl personaServiceImpl;
	
	
	//se define el constructor
	@Autowired
	public PersonaController(PersonaServiceImpl personaServiceImpl) {
		this.personaServiceImpl = personaServiceImpl;
	}
	
	
	@GetMapping("/saludo") // http://localhost/api/saludo  
	public String saludo () {
		return "Hola";
	} 
	
	
	@GetMapping("/registro")
	public String registro(@RequestParam(value="nombre", defaultValue="Desconocido")String nombre) {
		personaServiceImpl = new PersonaServiceImpl();
		return personaServiceImpl.registro(nombre);
	}
	
	
	@GetMapping("/calcular")
	public int Calcular(@RequestParam(value= "num1", defaultValue="0") int a, @RequestParam(value= "num2", defaultValue="0") int b) {
		return personaServiceImpl.calcular(a, b);
	}

}
