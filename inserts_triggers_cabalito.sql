-- End of file.
drop trigger if exists tg_insert_h_person;
drop trigger if exists tg_update_h_person;
drop trigger if exists tg_insert_h_user;
drop trigger if exists tg_update_h_user;
drop trigger if exists tg_insert_h_seller;
drop trigger if exists tg_update_h_seller;

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
	INSERT INTO `h_person`(`id_person`,`first_name`,`last_name`,`phone_number`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NEW.id_person,NEW.first_name,NEW.last_name,NEW.phone_number,NEW.status, NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
    END;
|
DELIMITER ;

drop trigger if exists tg_insert_h_person;
drop trigger if exists tg_update_h_person;
drop trigger if exists tg_insert_h_user;
drop trigger if exists tg_update_h_user;
drop trigger if exists tg_insert_h_seller;
drop trigger if exists tg_update_h_seller;

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
	INSERT INTO `h_person`(`id_person`,`first_name`,`last_name`,`phone_number`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NEW.id_person,NEW.first_name,NEW.last_name,NEW.phone_number,NEW.status, NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
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
	INSERT INTO `h_user`(`id_user`,`password`,`email`,`status`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NEW.id_user,NEW.password,NEW.email,NEW.status,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
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
	INSERT INTO `h_seller`(`id_seller`,`id_person`,`id_user`,`status`,`image_path`,`tx_date`,`tx_id_user`,`tx_host`,`tx_update`) VALUES (NEW.id_seller,NEW.id_person,NEW.id_user,NEW.status,NEW.image_path,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|
DELIMITER ;

INSERT INTO seller VALUES 
(1,1,1,1,"https://cdn.pixabay.com/photo/2016/11/29/03/36/beautiful-1867093_1280.jpg",now(),1,"192.168.10.1",now()),
(2,2,2,1,"https://cdn.pixabay.com/photo/2016/01/19/15/05/doctor-1149149_1280.jpg",now(),1,"192.168.10.1",now()),
(3,3,3,1,"https://cdn.pixabay.com/photo/2019/02/11/20/20/woman-3990680_1280.jpg",now(),1,"192.168.10.1",now()),
(4,4,4,1,"https://cdn.pixabay.com/photo/2017/08/30/17/27/business-woman-2697954_960_720.jpg",now(),1,"192.168.10.1",now()),
(5,5,5,1,"https://cdn.pixabay.com/photo/2016/11/29/03/36/beautiful-1867093_1280.jpg",now(),1,"192.168.10.1",now());

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

drop trigger tg_update_h_publication;
drop trigger tg_insert_h_publication;

delimiter |
CREATE TRIGGER tg_insert_h_publication AFTER INSERT ON publication
    FOR EACH ROW
    BEGIN
        INSERT INTO h_publication VALUES (null,NEW.id_publication,NEW.id_seller,NEW.id_brand,NEW.id_color,NEW.id_city, NEW.title
        ,NEW.model,NEW.door_number,NEW.license_plate,NEW.description,NEW.motor,NEW.price,NEW.date_publication,NEW.status,NEW.tx_date,
        NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
    END;
|
delimiter ;

delimiter |
CREATE TRIGGER tg_update_h_publication AFTER UPDATE ON publication
    FOR EACH ROW
    BEGIN
        INSERT INTO h_publication VALUES (null, NEW.id_publication,NEW.id_seller,NEW.id_brand,NEW.id_color,NEW.id_city,NEW.title,
        NEW.model,NEW.door_number,NEW.license_plate,NEW.description,NEW.motor,NEW.price,NEW.date_publication,NEW.status,NEW.tx_date,
        NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
    END;
|
delimiter ;




-- Creacion de las publicaciones
START TRANSACTION;
INSERT INTO publication VALUES
(null,1,1,1,1,'',2018,5,'4258BFG','','2000cc','25000.00',NOW(),1,NOW(),1,'172.0.0.1',NOW()),
(null,2,5,2,5,'',2019,5,'4657PER','','1600cc','21000.00',NOW(),1,NOW(),1,'172.0.0.1',NOW()),
(null,3,4,3,4,'',2002,3,'2365APO','Hermoso Vehiculo','2000cc','10000.00',NOW(),1,NOW(),1,'172.0.0.1',NOW()),
(null,4,3,4,3,'',2008,5,'3056ASD','','4000cc','18000.00',NOW(),1,NOW(),1,'172.0.0.1',NOW()),
(null,5,2,5,2,'',2009,5,'3898GHU','','5000cc','20000.00',NOW(),1,NOW(),1,'172.0.0.1',NOW());
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
	INSERT INTO h_mechanic (id_mechanic,id_person,id_city,location,shop_name,shop_phone_number,stars,stars_count,status,tx_date,tx_id_user,tx_host,tx_update)
    VALUES (NEW.id_mechanic,NEW.id_person,NEW.id_city,NEW.location,NEW.shop_name,NEW.shop_phone_number,NEW.stars,NEW.stars_count,NEW.status
    ,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|

CREATE TRIGGER tg_h_mechanic_update
AFTER UPDATE ON mechanic
FOR EACH ROW
BEGIN
	INSERT INTO h_mechanic (id_mechanic,id_person,id_city,location,shop_name,shop_phone_number,stars,stars_count,status,tx_date,tx_id_user,tx_host,tx_update)
    VALUES (NEW.id_mechanic,NEW.id_person,NEW.id_city,NEW.location,NEW.shop_name,NEW.shop_phone_number,NEW.stars,NEW.stars_count,NEW.status
    ,NEW.tx_date,NEW.tx_id_user,NEW.tx_host,NEW.tx_update);
END;
|

DELIMITER ;


INSERT INTO mechanic VALUES (NULL,6,1,'Av. 20 de Octubre','Fierro Veloz','22015478',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,7,2,'Av. Alemana','Taller Iwanaga','25634857',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,8,3,'Av. Busch','Taller Brillante','25639845',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,9,4,'Av. Los Sargentos','Taller El Tuercas','23561547',0,0,1,NOW(),1,'192.168.10.215',NOW()),
(NULL,10,5,'Av. Landaeta','Solo Autos','22365894',0,0,1,NOW(),1,'192.168.10.215',NOW());













