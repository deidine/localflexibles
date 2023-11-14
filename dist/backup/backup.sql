-- MariaDB dump 10.19  Distrib 10.4.27-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: inventory2
-- ------------------------------------------------------
-- Server version	10.4.27-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `inventory2`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `inventory2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `inventory2`;

--
-- Table structure for table `caisse`
--

DROP TABLE IF EXISTS `caisse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caisse` (
  `caisseid` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(22) NOT NULL,
  `total_paye` double NOT NULL,
  `soldby` varchar(11) NOT NULL,
  PRIMARY KEY (`caisseid`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caisse`
--

LOCK TABLES `caisse` WRITE;
/*!40000 ALTER TABLE `caisse` DISABLE KEYS */;
INSERT INTO `caisse` VALUES (20,'1',33,'1'),(21,'1',33,'1'),(22,'1',33,'1'),(23,'1',33,'1'),(24,'1',33,'1'),(25,'1',33,'1'),(26,'1',33,'1'),(27,'1',33,'1'),(28,'1',33,'1'),(29,'1',33,'1'),(30,'1',33,'1'),(31,'1',33,'1'),(32,'1',33,'1'),(33,'1',33,'1'),(34,'1',33,'1'),(35,'1',33,'1'),(36,'1',33,'1'),(37,'1',33,'1'),(38,'1',33,'1'),(39,'1',33,'1'),(40,'1',33,'1'),(41,'1',33,'1'),(42,'1',33,'1'),(43,'1',33,'1'),(44,'1',33,'1'),(45,'1',33,'1'),(46,'1',33,'1'),(47,'1',33,'1'),(48,'1',33,'1'),(49,'1',33,'1'),(50,'1',33,'1'),(51,'1',33,'1'),(52,'1',33,'1'),(53,'1',33,'1'),(54,'1',33,'1'),(55,'1',33,'1'),(56,'1',33,'1'),(57,'1',33,'1'),(58,'1',33,'1'),(59,'1',33,'1'),(60,'1',33,'1'),(61,'1',33,'1'),(62,'1',33,'1'),(63,'1',33,'1'),(64,'1',33,'1'),(65,'1',33,'1'),(66,'1',33,'1'),(67,'1',33,'1'),(68,'1',33,'1'),(69,'1',33,'1'),(70,'1',33,'1'),(71,'1',33,'1'),(72,'1',33,'1'),(73,'1',33,'1'),(74,'1',33,'1'),(75,'1',33,'1'),(76,'1',33,'1'),(77,'1',33,'1'),(78,'1',33,'1'),(79,'1',33,'1'),(80,'1',33,'1'),(81,'1',33,'1'),(82,'1',33,'1'),(83,'1',33,'1'),(84,'1',33,'1'),(85,'1',33,'1'),(86,'1',33,'1'),(87,'1',33,'1'),(88,'1',33,'1'),(89,'1',33,'1'),(90,'1',33,'1'),(91,'1',33,'1'),(92,'1',33,'1'),(93,'1',33,'1'),(94,'1',33,'1'),(95,'1',33,'1'),(96,'1',33,'1'),(97,'1',33,'1'),(98,'1',33,'1'),(99,'1',33,'1'),(100,'1',33,'1'),(101,'1',33,'1'),(102,'1',33,'1'),(103,'1',33,'1'),(104,'1',33,'1'),(105,'1',33,'1'),(106,'1',33,'1'),(107,'1',33,'1'),(108,'1',33,'1'),(109,'1',33,'1'),(110,'1',33,'1'),(111,'1',33,'1'),(112,'1',33,'1'),(113,'1',33,'1'),(114,'1',33,'1'),(115,'1',33,'1'),(116,'1',33,'1'),(117,'1',33,'1'),(118,'1',33,'1'),(119,'1',33,'1'),(120,'1',33,'1'),(121,'1',33,'1'),(122,'1',33,'1'),(123,'1',33,'1'),(124,'1',33,'1'),(125,'1',33,'1'),(126,'1',33,'1'),(127,'1',33,'1'),(128,'1',33,'1'),(129,'1',33,'1'),(130,'1',33,'1'),(131,'1',33,'1'),(132,'1',33,'1'),(133,'1',33,'1'),(134,'1',33,'1'),(135,'1',33,'1'),(136,'1',33,'1'),(137,'1',33,'1'),(138,'1',33,'1'),(139,'1',33,'1'),(140,'1',33,'1'),(141,'1',33,'1'),(142,'1',33,'1'),(143,'1',33,'1'),(144,'1',33,'1'),(145,'1',33,'1'),(146,'1',33,'1'),(147,'1',33,'1');
/*!40000 ALTER TABLE `caisse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorie` (
  `catid` int(11) NOT NULL AUTO_INCREMENT,
  `catName` int(11) NOT NULL,
  PRIMARY KEY (`catid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorie`
--

LOCK TABLES `categorie` WRITE;
/*!40000 ALTER TABLE `categorie` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `customercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`customercode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES ('inconue','inconue','inconue','123456789');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `devisdata`
--

DROP TABLE IF EXISTS `devisdata`;
/*!50001 DROP VIEW IF EXISTS `devisdata`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `devisdata` AS SELECT
 1 AS `salesid`,
  1 AS `date`,
  1 AS `customercode`,
  1 AS `total_paye`,
  1 AS `recu`,
  1 AS `changeMony`,
  1 AS `soldby`,
  1 AS `productcode`,
  1 AS `quantity`,
  1 AS `isLoan`,
  1 AS `detaild`,
  1 AS `sellprice` */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `payloan`
--

DROP TABLE IF EXISTS `payloan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payloan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customercode` varchar(22) NOT NULL,
  `total_paye` double NOT NULL,
  `soldby` varchar(22) NOT NULL,
  `date` varchar(22) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `customercode` (`customercode`),
  CONSTRAINT `payloan_ibfk_1` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payloan`
--

LOCK TABLES `payloan` WRITE;
/*!40000 ALTER TABLE `payloan` DISABLE KEYS */;
/*!40000 ALTER TABLE `payloan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `productcode` varchar(45) NOT NULL,
  `productname` varchar(45) NOT NULL,
  `costprice` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `sellprice` double NOT NULL,
  `brand` varchar(45) NOT NULL,
  PRIMARY KEY (`productcode`),
  UNIQUE KEY `productcode_UNIQUE` (`productcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `purchasedata`
--

DROP TABLE IF EXISTS `purchasedata`;
/*!50001 DROP VIEW IF EXISTS `purchasedata`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `purchasedata` AS SELECT
 1 AS `purchaseID`,
  1 AS `supplierName`,
  1 AS `productname`,
  1 AS `date`,
  1 AS `quantity`,
  1 AS `totalcost` */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `purchaseinfo`
--

DROP TABLE IF EXISTS `purchaseinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchaseinfo` (
  `purchaseID` int(11) NOT NULL AUTO_INCREMENT,
  `suppliercode` varchar(45) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `totalcost` double NOT NULL,
  PRIMARY KEY (`purchaseID`),
  KEY `productcode` (`productcode`),
  KEY `suppliercode` (`suppliercode`),
  CONSTRAINT `purchaseinfo_ibfk_1` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `purchaseinfo_ibfk_2` FOREIGN KEY (`suppliercode`) REFERENCES `suppliers` (`suppliercode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchaseinfo`
--

LOCK TABLES `purchaseinfo` WRITE;
/*!40000 ALTER TABLE `purchaseinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchaseinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale_detail`
--

DROP TABLE IF EXISTS `sale_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sale_detail` (
  `salesid` int(11) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `detaild` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`detaild`),
  KEY `productcode` (`productcode`),
  KEY `salesid` (`salesid`),
  CONSTRAINT `sale_detail_ibfk_1` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sale_detail_ibfk_2` FOREIGN KEY (`salesid`) REFERENCES `salesinfo` (`salesid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=371 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale_detail`
--

LOCK TABLES `sale_detail` WRITE;
/*!40000 ALTER TABLE `sale_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `sale_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale_devis_detail`
--

DROP TABLE IF EXISTS `sale_devis_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sale_devis_detail` (
  `salesid` int(11) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `detaild` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`detaild`),
  KEY `productcode` (`productcode`),
  KEY `salesid` (`salesid`),
  CONSTRAINT `sale_detail_ssibfk_2` FOREIGN KEY (`salesid`) REFERENCES `salesdevis` (`salesid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sale_details_ibfk_1` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale_devis_detail`
--

LOCK TABLES `sale_devis_detail` WRITE;
/*!40000 ALTER TABLE `sale_devis_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `sale_devis_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesdevis`
--

DROP TABLE IF EXISTS `salesdevis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesdevis` (
  `salesid` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `customercode` varchar(45) NOT NULL,
  `total_paye` double NOT NULL,
  `recu` double NOT NULL,
  `changeMony` double NOT NULL,
  `soldby` varchar(45) NOT NULL,
  `isLoan` varchar(22) NOT NULL,
  PRIMARY KEY (`salesid`),
  KEY `customercode` (`customercode`),
  CONSTRAINT `salesdevis_ibfk_1` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesdevis`
--

LOCK TABLES `salesdevis` WRITE;
/*!40000 ALTER TABLE `salesdevis` DISABLE KEYS */;
/*!40000 ALTER TABLE `salesdevis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesinfo`
--

DROP TABLE IF EXISTS `salesinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesinfo` (
  `salesid` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `customercode` varchar(45) NOT NULL,
  `total_paye` double NOT NULL,
  `recu` double NOT NULL,
  `changeMony` double NOT NULL,
  `soldby` varchar(45) NOT NULL,
  `isLoan` varchar(22) NOT NULL,
  `isTva` varchar(22) NOT NULL,
  PRIMARY KEY (`salesid`),
  KEY `customercode` (`customercode`),
  CONSTRAINT `salesinfo_ibfk_1` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=319 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesinfo`
--

LOCK TABLES `salesinfo` WRITE;
/*!40000 ALTER TABLE `salesinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `salesinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `salledata`
--

DROP TABLE IF EXISTS `salledata`;
/*!50001 DROP VIEW IF EXISTS `salledata`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `salledata` AS SELECT
 1 AS `salesid`,
  1 AS `date`,
  1 AS `customercode`,
  1 AS `total_paye`,
  1 AS `recu`,
  1 AS `changeMony`,
  1 AS `soldby`,
  1 AS `productcode`,
  1 AS `quantity`,
  1 AS `isLoan`,
  1 AS `detaild`,
  1 AS `sellprice` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `salleraport`
--

DROP TABLE IF EXISTS `salleraport`;
/*!50001 DROP VIEW IF EXISTS `salleraport`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `salleraport` AS SELECT
 1 AS `date`,
  1 AS `total_paye`,
  1 AS `salesid`,
  1 AS `soldby` */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suppliers` (
  `suppliercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  PRIMARY KEY (`suppliercode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogs`
--

DROP TABLE IF EXISTS `userlogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userlogs` (
  `username` varchar(45) NOT NULL,
  `in_time` varchar(45) NOT NULL,
  `out_time` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogs`
--

LOCK TABLES `userlogs` WRITE;
/*!40000 ALTER TABLE `userlogs` DISABLE KEYS */;
/*!40000 ALTER TABLE `userlogs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `usertype` varchar(45) NOT NULL,
  `canLoan` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'deidine','atar','49619609','deidine','deidine','ADMINISTRATOR',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Current Database: `inventory2`
--

USE `inventory2`;

--
-- Final view structure for view `devisdata`
--

/*!50001 DROP VIEW IF EXISTS `devisdata`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `devisdata` AS select `sin`.`salesid` AS `salesid`,`sin`.`date` AS `date`,`sin`.`customercode` AS `customercode`,`sin`.`total_paye` AS `total_paye`,`sin`.`recu` AS `recu`,`sin`.`changeMony` AS `changeMony`,`sin`.`soldby` AS `soldby`,`sldt`.`productcode` AS `productcode`,`sldt`.`quantity` AS `quantity`,`sin`.`isLoan` AS `isLoan`,`sldt`.`detaild` AS `detaild`,`p`.`sellprice` AS `sellprice` from (((`salesdevis` `sin` join `sale_devis_detail` `sldt` on(`sin`.`salesid` = `sldt`.`salesid`)) join `products` `p` on(`sldt`.`productcode` = `p`.`productcode`)) join `users` on(`sin`.`soldby` = `users`.`name`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `purchasedata`
--

/*!50001 DROP VIEW IF EXISTS `purchasedata`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `purchasedata` AS select `prcs`.`purchaseID` AS `purchaseID`,`sp`.`fullname` AS `supplierName`,`p`.`productname` AS `productname`,`prcs`.`date` AS `date`,`prcs`.`quantity` AS `quantity`,`prcs`.`totalcost` AS `totalcost` from ((`purchaseinfo` `prcs` join `products` `p` on(`prcs`.`productcode` = `p`.`productcode`)) join `suppliers` `sp` on(`prcs`.`suppliercode` = `sp`.`suppliercode`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `salledata`
--

/*!50001 DROP VIEW IF EXISTS `salledata`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `salledata` AS select distinct `sin`.`salesid` AS `salesid`,`sin`.`date` AS `date`,`sin`.`customercode` AS `customercode`,`sin`.`total_paye` AS `total_paye`,`sin`.`recu` AS `recu`,`sin`.`changeMony` AS `changeMony`,`sin`.`soldby` AS `soldby`,`sldt`.`productcode` AS `productcode`,`sldt`.`quantity` AS `quantity`,`sin`.`isLoan` AS `isLoan`,`sldt`.`detaild` AS `detaild`,`p`.`sellprice` AS `sellprice` from (((`salesinfo` `sin` join `sale_detail` `sldt` on(`sin`.`salesid` = `sldt`.`salesid`)) join `products` `p` on(`sldt`.`productcode` = `p`.`productcode`)) join `users` on(`sin`.`soldby` = `users`.`name`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `salleraport`
--

/*!50001 DROP VIEW IF EXISTS `salleraport`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `salleraport` AS select `slinf`.`date` AS `date`,`slinf`.`total_paye` AS `total_paye`,`slinf`.`salesid` AS `salesid`,`slinf`.`soldby` AS `soldby` from (`salesinfo` `slinf` join `users` on(`slinf`.`soldby` = `users`.`username`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-14 17:02:10
