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
	
	
	//instaciamos la clase para usar su metodo
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

}
