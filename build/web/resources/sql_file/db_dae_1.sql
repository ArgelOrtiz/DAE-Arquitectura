-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-11-2019 a las 17:02:16
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_dae`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `information`
--

DROP TABLE IF EXISTS `information`;
CREATE TABLE IF NOT EXISTS `information` (
  `id_information` int(11) NOT NULL AUTO_INCREMENT,
  `register_type` varchar(10) NOT NULL,
  `id_register` int(11) NOT NULL,
  `id_creation_user` int(11) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_updating_user` int(11) NOT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_information`),
  KEY `fk_info_userC` (`id_creation_user`),
  KEY `fk_info_userU` (`id_updating_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `payments`
--

DROP TABLE IF EXISTS `payments`;
CREATE TABLE IF NOT EXISTS `payments` (
  `id_payment` int(11) NOT NULL AUTO_INCREMENT,
  `card_number` varchar(16) NOT NULL,
  `cvv` varchar(3) NOT NULL,
  `month` varchar(10) NOT NULL,
  `year` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id_payment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `id_product` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `image_path` text NOT NULL,
  `information` varchar(50) NOT NULL,
  `unit_cost` decimal(11,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `departament` varchar(5) NOT NULL,
  PRIMARY KEY (`id_product`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `products`
--

INSERT INTO `products` (`id_product`, `name`, `image_path`, `information`, `unit_cost`, `stock`, `departament`) VALUES
(1, 'Celular', 'Maldita sea', 'Celular bonito de suave lomito', '15.00', 20, 'F15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sales`
--

DROP TABLE IF EXISTS `sales`;
CREATE TABLE IF NOT EXISTS `sales` (
  `id_sale` int(11) NOT NULL AUTO_INCREMENT,
  `subtotal` double(11,2) NOT NULL,
  `iva` double(11,2) NOT NULL,
  `total` double(11,2) NOT NULL,
  `address` varchar(50) NOT NULL,
  `postal_code` char(5) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `id_payment` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`id_sale`),
  KEY `fk_sale_user` (`id_user`),
  KEY `fk_sale_payment` (`id_payment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sales_details`
--

DROP TABLE IF EXISTS `sales_details`;
CREATE TABLE IF NOT EXISTS `sales_details` (
  `id_detail` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) NOT NULL,
  `product_total` double(11,2) NOT NULL,
  `id_sale` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  PRIMARY KEY (`id_detail`),
  KEY `fk_detail_sale` (`id_sale`),
  KEY `fk_detail_product` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_type` varchar(15) DEFAULT 'Customer',
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `cellphone` char(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id_user`, `nickname`, `password`, `user_type`, `first_name`, `last_name`, `cellphone`, `email`) VALUES
(1, 'Jessica', 'Jessica', 'Admin', 'Nicasio', 'HernÃ¡ndez', '4777026926', 'jessi@hotmail.com'),
(3, 'Jaime', 'Jaime', '', '', '', '', ''),
(4, 'Liliana', 'Liliana', '', '', '', '', 'admin@admin.com'),
(5, 'Batman', 'Batman', 'Customer', '', '', '', 'admin@admin.com'),
(7, 'Abril', 'Abril', 'Admin', 'Santos', 'Salas', '4778541236', 'abril@hotmail.com'),
(8, 'Miguel', 'Miguel', 'Admin', 'Gutierrez', 'Baca', '4776548723', 'miguel@hotmail.com'),
(9, 'Sandra', 'Sandra', 'Customer', 'Paola', 'Nicasio', '4773654218', 'sandra@hotmail.com'),
(10, 'Carmen', 'San', '', '', '', '', ''),
(11, 'a', 'a', 'Admin', 'a', 'a', '5248796123', 'a');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `information`
--
ALTER TABLE `information`
  ADD CONSTRAINT `fk_info_userC` FOREIGN KEY (`id_creation_user`) REFERENCES `users` (`id_user`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_info_userU` FOREIGN KEY (`id_updating_user`) REFERENCES `users` (`id_user`) ON DELETE CASCADE;

--
-- Filtros para la tabla `sales`
--
ALTER TABLE `sales`
  ADD CONSTRAINT `fk_sale_payment` FOREIGN KEY (`id_payment`) REFERENCES `payments` (`id_payment`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_sale_user` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`) ON DELETE CASCADE;

--
-- Filtros para la tabla `sales_details`
--
ALTER TABLE `sales_details`
  ADD CONSTRAINT `fk_detail_product` FOREIGN KEY (`id_product`) REFERENCES `products` (`id_product`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_detail_sale` FOREIGN KEY (`id_sale`) REFERENCES `sales` (`id_sale`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
