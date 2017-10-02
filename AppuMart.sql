drop database AppuMart;
create database AppuMart;
use AppuMart;

create table Usuarios(
	Celular varchar(15) not null,
    Nombre varchar(25),
    Correo varchar(30),
    Contrasena varchar(15),
    Puntuacion double,
    primary key (Celular)
);
# Contrasena o contrasena
create table Vendedores(
	Celular varchar(15) not null,
    Nombre varchar(25),
    Correo varchar(30),
    Contrasena varchar(15),
    primary key (Celular)
);


create table Tienda(
    nombre varchar(25),
    celular varchar(15),
    idfondo varchar(5),
    puntuacion varchar(20),
    primary key (celular)
);


create table Productos(
    nombre varchar(25),
    categoria varchar(20),
    precio int,
    cantidad int,
    tienda varchar(20)
);



insert into Usuarios values ('3203837680','David','davidfa15@hotmail.com','notengo',4.7);

insert into Vendedores values ('3209633504','Carlos','tato_1097@hotmail.com','notengotato');

insert into Tienda values ('Tienda De Perritos', '3209633504', 2, 4.0);

insert into Productos values ('Perritos Calientes :D','Comidas Rapidas', 5500,12, '3209633504');


select * from Usuarios;
select * from Vendedores;
select * from Tienda;
select * from Productos;
