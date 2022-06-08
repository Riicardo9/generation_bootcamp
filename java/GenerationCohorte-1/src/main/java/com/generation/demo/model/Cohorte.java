package com.generation.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;


@Entity //representacion de la info (tabla) que necesitamos - que es una entidad
@Table(name= "Cohorte") // Se indique que es tabla y se pasa el nombre con el que se va a guardar en mysql
public class Cohorte {
	
	@Id //se le indica que es llave primaria, debe estar arriba de la linea
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrementable
	private Integer id_cohorte;
	
	@Column(nullable = false) // NOT NULL, se se loe agrega name, ese solo va a reflejarse en mysql
	private Integer numeroCohorte;
	
	@Column(nullable = false, length = 50) // se le indica tamaño
	private String ciudad;
	
	// Relacionar llave foranea
	// con list se le indica que son muchos alumnos (importar import java.util.List;)
	// se cambia de alumno a alumnos
	@OneToMany // complemtaria (alrevezque en tabla alumno)
	private List<Alumno> alumnos;
	
	@OneToOne // complemtaria (alrevezque en tabla alumno)
	private Instructor instructor;
	
	
	// GETTERS Y SETTERS
	// Click derecho >> source >> generate getters y setters >> selec all >> finish
	public Integer getId_cohorte() {
		return id_cohorte;
	}

	public void setId_cohorte(Integer id_cohorte) {
		this.id_cohorte = id_cohorte;
	}

	public Integer getNumeroCohorte() {
		return numeroCohorte;
	}

	public void setNumeroCohorte(Integer numeroCohorte) {
		this.numeroCohorte = numeroCohorte;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
	
	

}
