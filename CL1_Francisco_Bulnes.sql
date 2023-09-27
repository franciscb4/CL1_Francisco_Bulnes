DROP DATABASE IF EXISTS DAW1_CL1_Francisco_Bulnes;
CREATE DATABASE DAW1_CL1_Francisco_Bulnes;
USE DAW1_CL1_Francisco_Bulnes;

DROP TABLE IF EXISTS categoria;
CREATE TABLE categoria(
idcategoria	INT,
nombre	VARCHAR(45),
PRIMARY KEY(idcategoria)
);

INSERT INTO categoria VALUES(1, "activo"), (2, "inactivo");

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente(
idcliente	INT,
nombre	VARCHAR(45),
apellido	VARCHAR(45),
correo	VARCHAR(45),
fechanacimiento	VARCHAR(45),
dni	VARCHAR(45),
idcategoria	INT,
PRIMARY KEY(idcliente),
FOREIGN KEY(idcategoria) REFERENCES categoria(idcategoria)
);

INSERT INTO cliente VALUES(1, "Francisco Javier", "Bulnes Tijero", "franciscobulnes@gmail.com", "2004-01-21", "88467372", 1);