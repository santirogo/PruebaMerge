DROP DATABASE IF EXISTS AppUAlfa;

CREATE DATABASE AppUAlfa;

USE AppUAlfa;


CREATE TABLE Usuarios (
	
	Celular int(15) NOT NULL,

	Nombre varchar(20) NOT NULL,

	Correo varchar(50) NOT NULL,
    
	Contrasena varchar(20) NOT NULL,

	Puntuacion double NOT NULL,
    
	PRIMARY KEY (Celular)

);


create table Vendedores(
correo varchar (50),
celular varchar(10),
nombre varchar(50),
contrasena varchar(50),
puntuacion int(2),
primary key(correo)
);

create table Tiendas(
id int (10),
nombre varchar (50),
vendedor varchar(50),
puntuacion double,
idfondo varchar (50),
categoria varchar (25)
);
create table Productos(
	id int,
    nombre varchar(24),
    categoria varchar(20),
    precio int,
    imagen varchar(25),
    cantidad int,
    tienda int(10)
);


insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (1,'McDonalds','312 2231312',4.0,'fondo1.png');
insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (2,'American Eagle','317 6533433',3.5,'fondo2.png');
insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (3,'Lufthansa','321 5449807',4.7,'fondo3.jpg');

insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (4,'Adidas Originals','1234',3.9,'fondo4.gif');
insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (5,'Hollister','317 6533433',4.1,'fondo5.jpg');
insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (6,'Fly Emirates','321 5449807',5.0,'fondo6.jpg');

insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (7,'Juan Valdez Cafe','312 2231312',4.2,'fondo7.jpg');
insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (8,'Victorias Secret','317 6533433',4.0,'fondo8.png');
insert into Tiendas(id,nombre,vendedor,puntuacion,idfondo) values (9,'Starbucks Coffee','321 5449807',5.0,'fondo9.gif');


insert into Productos values (1,'Papitas','Comidas Rapidas', 5500,'papitas.jpg',12, 1);
insert into Productos values (2,'Hamburguesa','Comidas Rapidas', 6000,'hamburguesa.jpg',12, 1);
insert into Productos values (3,'Sueter Tejido','Ropa', 162500,'sac11.jpg',25, 2);
insert into Productos values (4,'Sueter Ligero','Ropa', 119900,'sac21.jpg',25, 2);
insert into Productos values (5,'Sueter Con Dobladillo','Ropa', 121750,'sac31.jpg',25, 2);
insert into Productos values (6,'Bogota - Atenas','Transporte', 4447599,'luf1.jpg',1000, 3);
insert into Productos values (7,'Bogota - Frankfurt','Transporte', 3766899,'luf22.jpg',1000, 3);
insert into Productos values (8,'Bogota - Barcelona','Transporte', 3223499,'luf3.jpg',1000, 3);
insert into Productos values (9,'CAMISETA TRIFOLIO BIG','Ropa', 94900,'ad10.jpg',30, 4);
insert into Productos values (10,'CHAQUETA EUROPA','Ropa', 239900,'ad20.jpg',30, 4);
insert into Productos values (11,'LICRAS PASSAREDO','Ropa', 134900,'ad30.jpg',30, 4);
insert into Productos values (12,'Logo Graphic Tee','Ropa', 78100,'hol10.jpg',30, 5);
insert into Productos values (13,'Crewneck T-Shirt','Ropa', 62400,'hol20.jpg',30, 5);
insert into Productos values (14,'Full-Zip Icon Hoodie','Ropa', 250120,'hol30.jpg',30, 5);
insert into Productos values (15,'Miami - Dubai','Transporte', 3768000,'fly1.jpg',1000, 6);
insert into Productos values (16,'Dubai - Ciudad del Cabo','Transporte', 2568000,'fly2.jpg',1000, 6);
insert into Productos values (17,'Dubai - Rio de Janeiro','Transporte', 5460000,'fly3.jpg',1000, 6);
insert into Productos values (18,'Nevado Con Kisses','Cafe', 9500,'j1.jpg',30, 7);
insert into Productos values (19,'Latte Caramelo','Cafe', 6200,'j2.jpg',30, 7);
insert into Productos values (20,'Malteada Kisses','Cafe', 7300,'j3.jpg',30, 7);
insert into Productos values (21,'Demi Bra','Ropa', 155580,'v1.jpg',30, 8);
insert into Productos values (22,'Floral Lace Thong Panty','Ropa', 51860,'v2.jpg',30, 8);
insert into Productos values (23,'Lace-trim Satin Slip','Ropa', 132000,'v3.jpg',30, 8);
insert into Productos values (24,'Frappuccino Chips','Cafe', 8200,'chips.jpg',100, 9);
insert into Productos values (25,'Frappuccino Caramel','Cafe', 7500,'caramel.jpg',100, 9);
insert into Productos values (26,'Frappuccino Fresa Cream','Cafe', 6800,'fresa.jpg',100, 9);



INSERT INTO Usuarios values(1234, 'Diego', 'diego@correo.usa.edu.co','diego',5.0);
INSERT INTO Usuarios values(2345, 'David', 'david.acevedo@correo.usa.edu.co','qwerty',5.0);
INSERT INTO vendedores values('diego@correo.usa.edu.co',1234, 'Diego','diego',5.0);
INSERT INTO vendedores values('david.acevedo@correo.usa.edu.co',2345, 'David','qwerty',5.0);


##SELECT * FROM Usuarios;
SELECT * FROM Tiendas;

##SELECT * FROM Vendedores;

##select * from productos where nombre='Papitas' and tienda=1;

##select nombre, idfondo from Tiendas where id=1;

##select nombre from Tiendas where id=1;
