-- LEER

-- Muestra las bases de datos que tenemos
SHOW DATABASES;

-- Selecciona la base de datos a usar
USE sakila;

-- Leer los datos de una tabla
SELECT * FROM actor;
SELECT * FROM city;

-- Leer partes de la tabla

SELECT city_id, city FROM city;