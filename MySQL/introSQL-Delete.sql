-- Borrar

SELECT * FROM mascotita;

-- Borrar una fila
DELETE FROM mascotita WHERE mascota_id =4; 

-- Borrar una culumna
ALTER TABLE mascotita DROP COLUMN cumpleanios;
ALTER TABLE mascotita DROP COLUMN especie;

-- Borrar tabla 
DROP TABLE mascotita;

-- Borrar Base
DROP DATABASE familia;