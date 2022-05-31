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

-- Insertar datos en una tabla
-- Se le tiene que indicar el orden correcto
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values
('Ricardo', 'j@k.l', 27, 'feliz', '1994-08-27'),
('Ricardo', 'd@e.f', 27, 'feliz', '1994-08-27'),
('Ricardo', 'g@h.i', 27, 'feliz', '1994-08-27');

-- Error dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values
('Ricardo', 'a@b.c', 27, 'feliz', '1994-08-27');

-- Error 1364 dato NOT NULL que se envia vacio
INSERT INTO persona(correo, edad, estado, cumpleanios) values
('x@y.z', 27, 'feliz', '1994-08-27');

-- Error ingresar datos que no son necesarios (no se envia cumpleanios)
INSERT INTO persona(nombre, correo, edad, estado) values
('Ricardo', 'g@p.a', 27, 'feliz');

-- Ingresar dato con valor por defecto (sin estado)
INSERT INTO persona(nombre, correo, edad, cumpleanios) values
('Ricardo', 'a@b.z', 27, '1994-08-27');


-- RESTRICCIONES PARA FOREGN KEY EN CAPTURAS (POR DEFECTO ES NO ACTION, NO PERMITIR BORRAR SI HAY DEPENDENCIA)
CREATE TABLE mascota(
mascota_id INT auto_increment,
nombre VARCHAR(255) NOT NULL,
edad int NOT NULL,
fk1_persona int NOT NULL,
PRIMARY KEY(mascota_id),
FOREIGN KEY(fk1_persona) REFERENCES persona(persona_id)
ON DELETE CASCADE
ON UPDATE CASCADE
);

SELECT * FROM persona;
SELECT * FROM mascota;

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Atom', 3, 1);

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Toby', 9, 1);

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Toby', 9, 2);

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Beni', 12, 3),
('Patitas', 3, 4);







-- APUNTES JOHN

-- Insertar datos en una tabla
-- Tienen que ser en el orden indicado
-- No se necesita colocar el id porque es auto incrementable 
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
("Jonathan",'jonathan@gmail.com',23,'Feliz','1998-12-14'),
('Yair','yair@gmail.com',24,'Triste','1998-05-31');

/*
-- Error 1062: Dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
('Pepe', 'yair@gmail.com', 34, 'Alegre', '1980-01-01');

-- Error 1364: No llenar un dato NOT NULL
INSERT INTO persona(correo, edad, estado, cumpleanios) values
('pepe@gmail.com',34,'Alegre','1980-01-01');

*/

-- Ingresar datos que no son necesarios (No tiene el cumpleanios)
INSERT INTO persona(nombre, correo, edad, estado) values 
('Pepe', 'pepe@gmail.com', 34, 'Alegre');

-- Ingresar dato con valor por defecto (No tiene el estado)
INSERT INTO persona(nombre, correo, edad, cumpleanios) values
('Toño', 'ton@gmail.com', 40, '1970-10-10' );


