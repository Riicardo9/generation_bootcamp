USE world;
SELECT 5+5;
SELECT * FROM country;

SELECT `Name`, Population FROM country ORDER BY Population;
SELECT * FROM country WHERE  `Name` = 'Mexico';
SELECT * FROM country WHERE population > 50000000 AND population < 70000000 ORDER BY population;
SELECT * FROM country WHERE population NOT BETWEEN 50000000 AND 70000000 order by population;
SELECT * FROM country WHERE continent = 'Asia' OR continent = 'North America' OR continent = 'Oceania' ORDER BY continent;
SELECT * FROM country WHERE continent IN ('Asia', 'North America', 'Oceania');

-- IN y BEETWEN se usan con where

SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC;

-- LIKE Buscar un patron especifico
-- '_' especifica un solo caracter
-- '%' busca cualquier cantidad de caracteres
SELECT * FROM country WHERE `name` LIKE '%and';

-- DISTINCT
SELECT Continent FROM Country;
SELECT DISTINCT Continent FROM Country ORDER BY Continent;
