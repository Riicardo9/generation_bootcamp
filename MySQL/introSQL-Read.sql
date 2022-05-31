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
SELECT * FROM persona;

-- Limitar la cantidad de datos
SELECT * FROM actor LIMIT 10;

-- Ordenar de acuerdo con columna asendente
SELECT * FROM city ORDER BY city ASC;

-- Ordenar de acuerdo con columna asendente
SELECT * FROM city ORDER BY country_id DESC;

/*
Operadores de comparacion, =, !=, >, <, >=, <=
*/

SELECT * FROM city WHERE city = 'cuman';
SELECT * FROM actor WHERE first_name = 'penelope';
SELECT * FROM actor WHERE first_name != 'penelope';
SELECT * FROM actor WHERE actor_id > 50;
SELECT * FROM actor WHERE actor_id < 100;
SELECT * FROM actor WHERE actor_id >= 50;
SELECT * FROM actor WHERE actor_id <= 100;

SELECT * FROM actor WHERE first_name LIKE 'penelope';

-- Selecciona los registros cuyo nombre termine/empiece/contenga AN
SELECT * FROM actor WHERE first_name LIKE '%an';
SELECT * FROM actor WHERE first_name LIKE 'an%';
SELECT * FROM actor WHERE first_name LIKE '%an%';  -- se ocupa mucho

-- Seleccion registros que cumplen con los espacios (cualquier simbolo)
SELECT * FROM actor WHERE first_name LIKE '%a__e%';

-- NOT LIKE
SELECT * FROM actor WHERE first_name NOT LIKE '%a__e%';

-- UNIENDO TODO
SELECT * FROM actor WHERE first_name LIKE '%nn%' ORDER BY last_name ASC LIMIT 5;

SELECT * FROM actor WHERE actor_id > 50 AND first_name LIKE '%nn%'; 

SELECT * FROM actor WHERE first_name LIKE '%n%' OR first_name LIKE '%nn%'; 


