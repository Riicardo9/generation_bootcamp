-- ACTUALIZAR

-- Agregar columna
-- ccomo se especifica que no deben tener nulos, los agrega con espacio vacio a los registros anteriores
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- Agregar columna en posicion especifica
-- como no se especifica not null, agrega NULL a loa registros anteriores
ALTER TABLE mascota ADD COLUMN cumpleanios DATE AFTER edad;

-- Modificar las caracteristicas de una columna
-- si ya es null, o se puede poner notnull (por los registros que ya tiene)
ALTER TABLE mascota MODIFY cumpleanios int;
ALTER TABLE mascota MODIFY edad INT;

-- NO se puede cambiar el nonbre de una columna con modifi, se usa change (casi no se hacen cambios)
ALTER TABLE mascota CHANGE COLUMN edad edadP int NOT NULL;

-- Renombrar la tabla
ALTER TABLE mascota RENAME mascotita;


-- Actualizar datos de una fila
-- si le pasamos algun nombre columna da error 1175 por estar en modo seguro, que solicita id para continuar, se puede desactivar pero en principio no recomendado
-- Edit >> preferences >> SQL Editor >> Safe updates >> descativar
UPDATE mascotita SET especie = 'Gato' WHERE nombre='Atom';

-- Forma correcta
UPDATE mascotita SET especie  = 'Gato' WHERE mascota_id = 1;
UPDATE mascotita SET especie = 'Perro' , edadP = 10 WHERE mascota_id = 2;

SELECT * FROM mascotita;
select * from persona;


-- Cambiar un id (sin mucha utilidad)
UPDATE persona SET persona_id = 5 WHERE persona_id = 4;


