create database cabalito_db;
use cabalito_db;

CREATE TABLE brand (
    id_brand int NOT NULL AUTO_INCREMENT,
    brand varchar(50) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT brand_pk PRIMARY KEY (id_brand)
);

-- Table: city
CREATE TABLE city (
    id_city int NOT NULL AUTO_INCREMENT,
    city varchar(50) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT city_pk PRIMARY KEY (id_city)
);

-- Table: color
CREATE TABLE color (
    id_color int NOT NULL AUTO_INCREMENT,
    color varchar(50) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT color_pk PRIMARY KEY (id_color)
);

-- Table: h_mechanic
CREATE TABLE h_mechanic (
    id_h_mechanic int NOT NULL,
    id_mechanic int NOT NULL,
    id_person int NOT NULL,
    id_city int NOT NULL,
    location varchar(255) NOT NULL,
    shop_name varchar(255) NOT NULL,
    stars tinyint NOT NULL,
    stars_count int NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT h_mechanic_pk PRIMARY KEY (id_h_mechanic)
);

-- Table: h_person
CREATE TABLE h_person (
    h_id_person int NOT NULL,
    id_person int NOT NULL,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    phone_number varchar(50) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT h_person_pk PRIMARY KEY (h_id_person)
);

-- Table: h_publication
CREATE TABLE h_publication (
    id_h_publication int NOT NULL,
    id_publication int NOT NULL,
    id_seller int NOT NULL,
    id_model int NOT NULL,
    id_brand int NOT NULL,
    id_color int NOT NULL,
    id_city int NOT NULL,
    door_number int NOT NULL,
    license_plate varchar(50) NOT NULL,
    description varchar(255) NOT NULL,
    motor varchar(100) NOT NULL,
    price numeric(9,2) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT h_publication_pk PRIMARY KEY (id_h_publication)
);

-- Table: h_seller
CREATE TABLE h_seller (
    id_h_seller int NOT NULL,
    id_seller int NOT NULL,
    id_person int NOT NULL,
    id_user int NOT NULL,
    status tinyint NOT NULL,
    image_path varchar(255) NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT h_seller_pk PRIMARY KEY (id_h_seller)
);

-- Table: h_user
CREATE TABLE h_user (
    h_id_user int NOT NULL,
    id_user int NOT NULL,
    password varchar(50) NOT NULL,
    email varchar(100) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT h_user_pk PRIMARY KEY (h_id_user)
);

-- Table: image_publication
CREATE TABLE image_publication (
    id_image_publication int NOT NULL AUTO_INCREMENT,
    id_publication int NOT NULL,
    path varchar(255) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT image_publication_pk PRIMARY KEY (id_image_publication)
);

-- Table: mechanic
CREATE TABLE mechanic (
    id_mechanic int NOT NULL AUTO_INCREMENT,
    id_person int NOT NULL,
    id_city int NOT NULL,
    location varchar(255) NOT NULL,
    shop_name varchar(255) NOT NULL,
    stars tinyint NOT NULL,
    starts_count int NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT mechanic_pk PRIMARY KEY (id_mechanic)
);

-- Table: model
CREATE TABLE model (
    id_model int NOT NULL AUTO_INCREMENT,
    model int NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT model_pk PRIMARY KEY (id_model)
);

-- Table: person
CREATE TABLE person (
    id_person int NOT NULL AUTO_INCREMENT,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    phone_number varchar(50) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT person_pk PRIMARY KEY (id_person)
);

-- Table: publication
CREATE TABLE publication (
    id_publication int NOT NULL AUTO_INCREMENT,
    id_seller int NOT NULL,
    id_model int NOT NULL,
    id_brand int NOT NULL,
    id_color int NOT NULL,
    id_city int NOT NULL,
    door_number int NOT NULL,
    license_plate varchar(50) NOT NULL,
    description varchar(255) NOT NULL,
    motor varchar(100) NOT NULL,
    price numeric(9,2) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT publication_pk PRIMARY KEY (id_publication)
);

-- Table: seller
CREATE TABLE seller (
    id_seller int NOT NULL AUTO_INCREMENT,
    id_person int NOT NULL,
    id_user int NOT NULL,
    status tinyint NOT NULL,
    image_path varchar(255) NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT seller_pk PRIMARY KEY (id_seller)
);

-- Table: user
CREATE TABLE user (
    id_user int NOT NULL AUTO_INCREMENT,
    password varchar(50) NOT NULL,
    email varchar(100) NOT NULL,
    status tinyint NOT NULL,
    tx_date date NOT NULL,
    tx_id_user int NOT NULL,
    tx_host varchar(100) NOT NULL,
    tx_update date NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id_user)
);

-- foreign keys
-- Reference: image_publication (table: image_publication)
ALTER TABLE image_publication ADD CONSTRAINT image_publication FOREIGN KEY image_publication (id_publication)
    REFERENCES publication (id_publication);

-- Reference: mechanic_city (table: mechanic)
ALTER TABLE mechanic ADD CONSTRAINT mechanic_city FOREIGN KEY mechanic_city (id_city)
    REFERENCES city (id_city);

-- Reference: mechanic_persona (table: mechanic)
ALTER TABLE mechanic ADD CONSTRAINT mechanic_persona FOREIGN KEY mechanic_persona (id_person)
    REFERENCES person (id_person);

-- Reference: publication_brand (table: publication)
ALTER TABLE publication ADD CONSTRAINT publication_brand FOREIGN KEY publication_brand (id_brand)
    REFERENCES brand (id_brand);

-- Reference: publication_city (table: publication)
ALTER TABLE publication ADD CONSTRAINT publication_city FOREIGN KEY publication_city (id_city)
    REFERENCES city (id_city);

-- Reference: publication_color (table: publication)
ALTER TABLE publication ADD CONSTRAINT publication_color FOREIGN KEY publication_color (id_color)
    REFERENCES color (id_color);

-- Reference: publication_model (table: publication)
ALTER TABLE publication ADD CONSTRAINT publication_model FOREIGN KEY publication_model (id_model)
    REFERENCES model (id_model);

-- Reference: sale_seller (table: publication)
ALTER TABLE publication ADD CONSTRAINT sale_seller FOREIGN KEY sale_seller (id_seller)
    REFERENCES seller (id_seller);

-- Reference: seller_person (table: seller)
ALTER TABLE seller ADD CONSTRAINT seller_person FOREIGN KEY seller_person (id_person)
    REFERENCES person (id_person);

-- Reference: seller_user (table: seller)
ALTER TABLE seller ADD CONSTRAINT seller_user FOREIGN KEY seller_user (id_user)
    REFERENCES user (id_user);

-- End of file.
drop trigger tg_update_h_person
DELIMITER |
CREATE TRIGGER tg_insert_h_person
AFTER INSERT ON person
FOR EACH ROW
BEGIN
	INSERT INTO `h_person`(`id_person`,`first_name`,`last_name`,`phone_number`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES ( NEW.id_person,NEW.first_name,NEW.last_name,NEW.phone_number,NEW.status, NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|
DELIMITER ;

DELIMITER |
CREATE TRIGGER tg_update_h_person
AFTER UPDATE ON person
FOR EACH ROW
BEGIN
	INSERT INTO `h_person`(`id_person`,`first_name`,`last_name`,`phone_number`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NULL, NEW.id_person,NEW.first_name,NEW.last_name,NEW.phone_number,NEW.status, NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
    END;
|
DELIMITER ;

INSERT  INTO person VALUES 
(1, "Juan","Martinez","7412586",0,now(),1,"192.168.10.1",now()),
(2, "Jose","Poma","7612595",0,now(),1,"192.168.10.1",now()),
(3, "Johana","Sanchez","7155986",0,now(),1,"192.168.10.1",now()),
(4, "Maria","Paredes","7523495",0,now(),1,"192.168.10.1",now()),
(5, "Juana","Castro","7612586",0,now(),1,"192.168.10.1",now()),
(6, "Juan","Martinez","7412586",0,now(),1,"192.168.10.1",now()),
(7, "Jose","Poma","7612595",0,now(),1,"192.168.10.1",now()),
(8, "Johana","Sanchez","7155986",0,now(),1,"192.168.10.1",now()),
(9, "Maria","Paredes","7523495",0,now(),1,"192.168.10.1",now()),
(10, "Juana","Castro","7612586",0,now(),1,"192.168.10.1",now());

DELIMITER |
CREATE TRIGGER tg_insert_h_user
AFTER INSERT ON user
FOR EACH ROW
BEGIN
	INSERT INTO `h_user`(`id_user`,`password`,`email`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES ( NEW.id_user,NEW.password,NEW.email,NEW.status,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|
DELIMITER ;

DELIMITER |
CREATE TRIGGER tg_update_h_user
AFTER UPDATE ON user
FOR EACH ROW
BEGIN
	INSERT INTO `h_user`(`id_user`,`password`,`email`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NULL, NEW.id_user,NEW.password,NEW.email,NEW.status,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|
DELIMITER ;

INSERT INTO user VALUES 
(1, "12345","martinez@gmail.com",0,now(),1,"192.168.10.1",now()),
(2, "852369","rodriguez@gmail.com",0,now(),1,"192.168.10.1",now()),
(3, "945628","fernandez@gmail.com",0,now(),1,"192.168.10.1",now()),
(4, "698574","sanchez@gmail.com",0,now(),1,"192.168.10.1",now()),
(5, "732541","felipe@gmail.com",0,now(),1,"192.168.10.1",now());

DELIMITER |
CREATE TRIGGER tg_insert_h_seller
AFTER INSERT ON seller
FOR EACH ROW
BEGIN
	INSERT INTO `h_seller`(`id_seller`,`id_person`,`id_user`,`status`,`image_path`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NEW.id_seller,NEW.id_person,NEW.id_user,NEW.status,NEW.image_path,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|
DELIMITER ;

DELIMITER |
CREATE TRIGGER tg_update_h_seller
AFTER UPDATE ON seller
FOR EACH ROW
BEGIN
	INSERT INTO `h_seller`(`id_seller`,`id_person`,`id_user`,`status`,`image_path`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NULL, NEW.id_seller,NEW.id_person,NEW.id_user,NEW.status,NEW.image_path,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|
DELIMITER ;

INSERT INTO seller VALUES 
(1,1,1,1,"https://cdn.pixabay.com/photo/2016/11/29/03/36/beautiful-1867093_1280.jpg",now(),1,"192.168.10.1",now()),
(2,2,2,1,"https://cdn.pixabay.com/photo/2016/01/19/15/05/doctor-1149149_1280.jpg",now(),1,"192.168.10.1",now()),
(3,3,3,1,"https://cdn.pixabay.com/photo/2019/02/11/20/20/woman-3990680_1280.jpg",now(),1,"192.168.10.1",now()),
(4,4,4,1,"https://cdn.pixabay.com/photo/2017/08/30/17/27/business-woman-2697954_960_720.jpg",now(),1,"192.168.10.1",now()),
(5,5,5,1,"https://cdn.pixabay.com/photo/2016/11/29/03/36/beautiful-1867093_1280.jpg",now(),1,"192.168.10.1",now());

INSERT INTO mechanic VALUES (1,6,1,'Av. 20 de Octubre','Fierro Veloz',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(2,7,2,'Av. Alemana','Taller Iwanaga',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(3,8,3,'Av. Busch','Taller Brillante',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(4,9,4,'Av. Los Sargentos','Taller El Tuercas',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(5,10,5,'Av. Landaeta','Solo Autos',0,0,1,NOW(),1,'192.168.10.215',NOW());


show triggers


-- Creacion de marcas para la publicacion de los vehiculos
START TRANSACTION;
INSERT INTO brand VALUES
(null,'Toyota',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Mitsubishi',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Nissan',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Suzuki',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Chevrolet',1,NOW(),1,'172.0.0.1',NOW());
COMMIT;

-- Creacion de colores para la publicacion de los vehiculos
START TRANSACTION;
INSERT INTO color VALUES
(null,'Azul',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Rojo',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Verde',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Amarillo',1,NOW(),1,'172.0.0.1',NOW()),
(null,'Negro',1,NOW(),1,'172.0.0.1',NOW());
COMMIT;

-- Creacion de triggers para las publicaciones
delimiter |
CREATE TRIGGER tg_insert_h_publication AFTER INSERT ON publication
    FOR EACH ROW
    BEGIN
        INSERT INTO h_publication VALUES (null,NEW.id_publication,NEW.id_seller,NEW.id_brand,NEW.id_color,NEW.id_city,
        NEW.model,NEW.door_number,NEW.license_plate,NEW.description,NEW.motor,NEW.price,NEW.status,NEW.tx_date,
        NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
    END;
|
delimiter ;

delimiter |
CREATE TRIGGER tg_update_h_publication AFTER UPDATE ON publication
    FOR EACH ROW
    BEGIN
        INSERT INTO h_publication VALUES (null, NEW.id_publication,NEW.id_seller,NEW.id_brand,NEW.id_color,NEW.id_city,
        NEW.model,NEW.door_number,NEW.license_plate,NEW.description,NEW.motor,NEW.price,NEW.status,NEW.tx_date,
        NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
    END;
|
delimiter ;




-- Creacion de las publicaciones
START TRANSACTION;
INSERT INTO publication VALUES
(null,1,1,1,1,'2018','5','4258BFG','','2000cc','25000.00',1,NOW(),1,'172.0.0.1',NOW()),
(null,2,5,2,5,'2019','5','4657PER','','1600cc','21000.00',1,NOW(),1,'172.0.0.1',NOW()),
(null,3,4,3,4,'2002','3','2365APO','Hermoso Vehiculo','2000cc','10000.00',1,NOW(),1,'172.0.0.1',NOW()),
(null,4,3,4,3,'2008','5','3056ASD','','4000cc','18000.00',1,NOW(),1,'172.0.0.1',NOW()),
(null,5,2,5,2,'2009','5','3898GHU','','5000cc','20000.00',1,NOW(),1,'172.0.0.1',NOW());
COMMIT;


USE cabalito_db;
INSERT INTO city VALUES (NULL,'La Paz',1,NOW(),1,'192.168.10.215',NOW()),
(NULL,'Cochabamba',1,NOW(),1,'192.168.10.215',NOW()),
(NULL,'Santa Cruz',1,NOW(),1,'192.168.10.215',NOW()),
(NULL,'Potosi',1,NOW(),1,'192.168.10.215',NOW()),
(NULL,'Oruro',1,NOW(),1,'192.168.10.215',NOW());

DELIMITER |

CREATE TRIGGER tg_h_mechanic_insert
AFTER INSERT ON mechanic
FOR EACH ROW
BEGIN
	INSERT INTO h_mechanic (id_mechanic,id_person,id_city,location,shop_name,stars,stars_count,status,tx_date,tx_id_user,tx_host,tx_update) 
    VALUES (NEW.id_mechanic,NEW.id_person,NEW.id_city,NEW.location,NEW.shop_name,NEW.stars,NEW.stars_count,NEW.status
    ,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|

CREATE TRIGGER tg_h_mechanic_update
AFTER UPDATE ON mechanic
FOR EACH ROW
BEGIN
	INSERT INTO h_mechanic (id_mechanic,id_person,id_city,location,shop_name,stars,stars_count,status,tx_date,tx_id_user,tx_host,tx_update)
    VALUES (NEW.id_mechanic,NEW.id_person,NEW.id_city,NEW.location,NEW.shop_name,NEW.stars,NEW.stars_count,NEW.status
    ,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|


INSERT INTO mechanic VALUES (NULL,6,1,'Av. 20 de Octubre','Fierro Veloz',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,7,2,'Av. Alemana','Taller Iwanaga',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,8,3,'Av. Busch','Taller Brillante',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,9,4,'Av. Los Sargentos','Taller El Tuercas',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,10,5,'Av. Landaeta','Solo Autos',0,0,1,NOW(),1,'192.168.10.215',NOW());













