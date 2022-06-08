package com.generation.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.model.Cohorte;
import com.generation.demo.repository.CohorteRepository;

//se añade implements y se añaden los metodos necesarios foco, como es una implementacion de c.service lo obliga a agregarlos
@Service
public class CohorteServiceImpl implements CohorteService {
	
	
	//Creamos relacion al repositorio Servicio-Repositorio, 
	//no podemos crear un objeto a partir de una interface, pero se crea el cascaron, el espacio para que pueda ingresar
	//TipoDato variable
	CohorteRepository cohorteRepository;
	
	
	//Se podria instanciar de esta forma ejemplo
	//CohorteService cohorteService = new CohorteServiceImpl();
	
	//Hacer un constructor, se le indica que delegamos a Spring la creacion y que me lo envie con autowired
	public CohorteServiceImpl(@Autowired CohorteRepository cohorteRepository) {
		this.cohorteRepository = cohorteRepository;
	}
	
	
	@Override
	public Cohorte getCohorte(Integer id) {
		//Para que no se rompa codigo al buscar id incorrecto
		Optional<Cohorte> cohorte = cohorteRepository.findById(id); //OPtional (en caso de que venga correcto el id)- importar java.util. Metodo Findby id soporta el optional
		return cohorte.orElse(null); //cuando hay algo lo trae si no regresa vacio
	}

	@Override
	public List<Cohorte> conseguirCohortes() {
		return cohorteRepository.findAll();
	}

	@Override
	public Cohorte saveCohorte(Cohorte cohorte) {
		// TODO Auto-generated method stub
		return cohorteRepository.save(cohorte);
	}


	@Override
	public List<Cohorte> getCohortesByCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return cohorteRepository.findByCiudad(ciudad);
	}


	@Override
	public List<Map<String, Object>> getInstructorAlumno() {
		// TODO Auto-generated method stub
		return cohorteRepository.obtenerInstructorAlumno();
;
	}
	
	

}
