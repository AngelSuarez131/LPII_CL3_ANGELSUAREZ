-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 03-07-2024 a las 06:52:26
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdangelsuarezcl3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productocl3`
--

CREATE TABLE IF NOT EXISTS `tbl_productocl3` (
  `isproductoscl3` int(11) NOT NULL AUTO_INCREMENT,
  `nombrecl3` varchar(255) DEFAULT NULL,
  `precioventacl3` double DEFAULT NULL,
  `preciocompcl3` double DEFAULT NULL,
  `estadocl3` varchar(255) DEFAULT NULL,
  `descripcl3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`isproductoscl3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuariocl3`
--

CREATE TABLE IF NOT EXISTS `tbl_usuariocl3` (
  `idusuariocl3` int(11) NOT NULL AUTO_INCREMENT,
  `usuariocl3` varchar(255) DEFAULT NULL,
  `passwordcl3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idusuariocl3`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `tbl_usuariocl3`
--

INSERT INTO `tbl_usuariocl3` (`idusuariocl3`, `usuariocl3`, `passwordcl3`) VALUES
(1, 'admin', '1234');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
