USE tienda;
SELECT * FROM tienda.producto;

-- JOINS nos permite combinar datos de distintas tablas 

-- INNER JOIN
SELECT 
producto.idProducto as id_Producto,
producto.nombre as Producto,
producto.idCategoria as id_Categoria,
categoria.nombre as Categoria
FROM producto 
INNER JOIN categoria 
ON producto.idProducto = categoria.idCategoria
ORDER BY id_Producto;


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



-- LEFT JOIN
SELECT 
cliente.nombre as nombre,
factura.idFactura
FROM cliente
LEFT JOIN factura ON cliente.idCliente = factura.idCliente
ORDER BY nombre;

SELECT 
cliente.nombre as nombre,
factura.idFactura
FROM cliente
right JOIN factura ON cliente.idCliente = factura.idCliente
ORDER BY nombre;




