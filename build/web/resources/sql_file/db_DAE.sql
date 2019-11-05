CREATE DATABASE IF NOT EXISTS `db_DAE`;
USE `db_DAE`;
-- DROP DATABASE `db_DAE`;

CREATE TABLE IF NOT EXISTS `Users` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `password` VARCHAR(255) NOT NULL, -- Hash
  `user_type` VARCHAR(15) NULL DEFAULT 'Customer', -- Administrador / Cliente,
  `last_name` VARCHAR(30) NULL,
  `cellphone` CHAR(10) NULL, -- Forzosamente 10 caracteres
  `email` VARCHAR(30),
  PRIMARY KEY (`id_user`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Products` (
  `id_product` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `image_path` TEXT NOT NULL,
  `information` VARCHAR(50) NOT NULL,
  `unit_cost` DECIMAL(11,2) NOT NULL,
  `stock` INT NOT NULL,
  `departament` VARCHAR(5) NOT NULL, -- Código del departamento
  PRIMARY KEY (`id_product`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Payments` (
  `id_payment` INT NOT NULL AUTO_INCREMENT,
  `card_number` VARCHAR(16) NOT NULL,
  `cvv` VARCHAR(3) NOT NULL,
  `month` VARCHAR(10) NOT NULL, -- Para colocar ya sea número o nombre
  `year` VARCHAR(4), -- Ya sea en formato AA o AAAA
  PRIMARY KEY (`id_payment`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Sales` (
  `id_sale` INT NOT NULL AUTO_INCREMENT,
  `subtotal` DOUBLE(11,2) NOT NULL, 
  `iva` DOUBLE(11,2) NOT NULL, -- 16%
  `total` DOUBLE(11,2) NOT NULL,
  `address` VARCHAR(50) NOT NULL,
  `postal_code` CHAR(5), -- Forzosamente 5 caracteres
  `status` TINYINT, 
  `id_payment` INT NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`id_sale`),
  CONSTRAINT `fk_sale_user` FOREIGN KEY (`id_user`) REFERENCES `Users` (`id_user`) ON DELETE CASCADE,
  CONSTRAINT `fk_sale_payment` FOREIGN KEY (`id_payment`) REFERENCES `Payments` (`id_payment`) ON DELETE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Sales_details` (
  `id_detail` INT NOT NULL AUTO_INCREMENT,
  `quantity` INT NOT NULL,
  `product_total` DOUBLE(11,2) NOT NULL, 
  `id_sale` INT NOT NULL,
  `id_product` INT NOT NULL,
  PRIMARY KEY (`id_detail`),
  CONSTRAINT `fk_detail_sale` FOREIGN KEY (`id_sale`) REFERENCES `Sales` (`id_sale`) ON DELETE CASCADE,
  CONSTRAINT `fk_detail_product` FOREIGN KEY (`id_product`) REFERENCES `Products` (`id_product`) ON DELETE CASCADE
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Information` (
  `id_information` INT NOT NULL AUTO_INCREMENT,
  `register_type` VARCHAR(10) NOT NULL, -- Usuarios | Articulos | Clientes | Ventas
  `id_register` INT NOT NULL,
  `id_creation_user` INT NOT NULL,
  `create_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_updating_user` INT NOT NULL,
  `update_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_information`),
  CONSTRAINT `fk_info_userC` FOREIGN KEY (`id_creation_user`) REFERENCES `Users` (`id_user`) ON DELETE CASCADE,
  CONSTRAINT `fk_info_userU` FOREIGN KEY (`id_updating_user`) REFERENCES `Users` (`id_user`) ON DELETE CASCADE
) ENGINE = InnoDB;





