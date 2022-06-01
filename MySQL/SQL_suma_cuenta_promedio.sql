USE Sakila;

SHOW TABLES FROM Sakila;

SELECT * FROM payment;

-- COUNT() COntar los registros de una tabla
-- AS permite darle un alias temporal a una columna
SELECT COUNT(*) AS cantidad_filas FROM payment;
SELECT COUNT(*) AS cantidad_filas FROM payment WHERE staff_id=2;

SELECT COUNT(DISTINCT customer_id) FROM payment;

-- Se puede consultar datos de otra BD, siempre y cuando se especifique, NO RECOMENDABLE
SELECT COUNT(*) FROM world.country;

-- SUM() Realiza una suma de los valores de una columna
SELECT SUM(amount) AS total FROM payment WHERE staff_id = 2;

-- Saber cual es el cliente que gasto mas en rentas
SELECT customer_id, sum(amount) from payment group by customer_id order by SUM(amount);

-- AVG() permite obtener un promedio de cantidades en una columna
SELECT AVG(amount) as promedio FROM payment WHERE costumer_id = 1; 


SELECT * FROM address;
SELECT * FROM city;
SELECT * FROM country;

SELECT 
country.country_id as ClavePais,
country.country as Pais,
city.city_id as ClaveCiudad,
city.city as Ciudad,
address.address as Direccion
FROM country 
INNER JOIN city ON country.country_id = city.country_id
INNER JOIN address ON address.city_id = city.city_id
ORDER BY ClaveCiudad;








