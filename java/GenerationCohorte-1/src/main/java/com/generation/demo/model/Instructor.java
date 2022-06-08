package com.generation.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_instructor;
	
	@Column(nullable = false)
	private String nombre_instructor;
	
	@Column(nullable = false)
	private String supervisor;
	
	@Column(nullable = false)
	private String puesto;
	
	@OneToOne
	@JoinColumn(nullable = false, name = "cohorte_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Cohorte cohorte;

	public Integer getId_instructor() {
		return id_instructor;
	}

	public void setId_instructor(Integer id_instructor) {
		this.id_instructor = id_instructor;
	}

	public String getNombre_instructor() {
		return nombre_instructor;
	}

	public void setNombre_instructor(String nombre_instructor) {
		this.nombre_instructor = nombre_instructor;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Cohorte getCohorte() {
		return cohorte;
	}

	public void setCohorte(Cohorte cohorte) {
		this.cohorte = cohorte;
	}

	
	
}
