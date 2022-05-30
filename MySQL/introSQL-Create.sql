-- CREAR

-- Crear base de datos ambas sentencias son exactamente lo mismo
CREATE DATABASE familia;
CREATE SCHEMA familia;

USE familia;

-- Se crea tabla persona, es necesario agregar minimo una columna
-- cuando a un campo se le pone not null no es necesario agregar autoincrementable 
-- por defecto el valor asignado es NULL (DEFAULT NULL, no es necesario poner)
-- Se debe especificar la llave primaria
-- Campo con valores unicos usar UNIQUE, p ej. correo, Otra forma agregar restriccion (CONSTRAINT), se puedenusar varios campos (UNIQUE(correo, nombre))
CREATE TABLE persona(	
	persona_id int AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    edad int NOT NULL,
    estado VARCHAR(255) DEFAULT "Desconocido",
    cumpleanios DATE NOT NULL,
    PRIMARY KEY(persona_id),
    CONSTRAINT correo_unico UNIQUE(correo) 
    );
