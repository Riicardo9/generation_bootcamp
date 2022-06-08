package com.generation.demo.repository;

import org.springframework.stereotype.Repository;

import com.generation.demo.model.Cohorte;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


// Se le indica que es repositorio
// se vincula conextends JpaRepository (importar), darle argumentos<modelo(relaciona la tabla), Integer(el tipo de dato del id clase cohorte)> 
//Repository por defecto ya viene con enlace a bd (esquema img)
@Repository
public interface CohorteRepository extends JpaRepository<Cohorte, Integer> {

	//Metodos personalizados para consultas personalizadas especificas
	List<Cohorte> findByCiudad(String ciudad);
	
	//list porque voy a recibir varios
	//como se obtiene multitabla usamos map para concatenar string con objetos
	@Query(value = "SELECT id_instructor, nombre_instructor, nombre_alumno FROM instructor inner join alumno on instructor.cohorte_id = alumno.cohorte_id;", nativeQuery = true)
	List<Map<String,Object>> obtenerInstructorAlumno();

	
}
