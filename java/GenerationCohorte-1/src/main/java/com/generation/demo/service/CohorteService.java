package com.generation.demo.service;

import java.util.List;
import java.util.Map;

import com.generation.demo.model.Cohorte;

public interface CohorteService {

	//Las interfaces:
	//Tiene metodos vacios 
	//Las clases que lo implementen deben cumplir con los metodos vacios declarados
	
	//LEER
	Cohorte getCohorte(Integer id); // Trae una corte segun el id que se le indique
	List<Cohorte> conseguirCohortes(); //Trae todas las cohortes (importar java util)
	List<Cohorte> getCohortesByCiudad(String ciudad); // para la consulta personalizada
	List<Map<String, Object>> getInstructorAlumno();

	
	//ESCRIBIR
	Cohorte saveCohorte (Cohorte cohorte); //Gaurda cohorte enviada
	
	//Actualizar
	
	//Borrar
	//void deleteCohorte(Integer id)
}
