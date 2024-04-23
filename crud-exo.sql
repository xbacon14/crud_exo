/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 8.0.33 : Database - cotizacion_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cotizacion_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `cotizacion_db`;

/*Table structure for table `bs_cotizacion` */

DROP TABLE IF EXISTS `bs_cotizacion`;

CREATE TABLE `bs_cotizacion` (
  `ID_COTIZACION` int NOT NULL AUTO_INCREMENT,
  `VL_COMPRA` decimal(20,6) NOT NULL,
  `VL_VENTA` decimal(20,6) NOT NULL,
  `DT_COTIZACION` datetime NOT NULL,
  `ID_MONEDA` int NOT NULL,
  PRIMARY KEY (`ID_COTIZACION`),
  KEY `FK_MONEDA` (`ID_MONEDA`),
  CONSTRAINT `FK_MONEDA` FOREIGN KEY (`ID_MONEDA`) REFERENCES `bs_moneda` (`ID_MONEDA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Table structure for table `bs_moneda` */

DROP TABLE IF EXISTS `bs_moneda`;

CREATE TABLE `bs_moneda` (
  `ID_MONEDA` int NOT NULL AUTO_INCREMENT,
  `DS_MONEDA` varbinary(24) NOT NULL,
  PRIMARY KEY (`ID_MONEDA`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
