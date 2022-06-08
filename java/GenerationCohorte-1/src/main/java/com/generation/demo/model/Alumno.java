package com.generation.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_alumno;
	
	@Column(nullable = false)
	private String nombre_alumno;
	
	@Column(nullable = false)
	private Integer edad;
	
	@Column(nullable = false, unique = true)
	private String correo;
	
	//Llave foranea
	//se le da la referencia de la tabla origen
	//se debe especificar el tipo de relacion Many se refiera a la clase en la que se aloja, y One a la clase de origen
	//se espcifica que es una columna de union ... se define nombre para que no se defina automaticamente (ya que pone nobre raro)
	// es necesario generar llave foranea en tabla origen
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "cohorte_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Cohorte cohorte;

	public Integer getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Integer id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Cohorte getCohorte() {
		return cohorte;
	}

	public void setCohorte(Cohorte cohorte) {
		this.cohorte = cohorte;
	}
	
	

}
