-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 02, 2023 at 08:21 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory2`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `BenfitToDay` (IN `date` DATE, OUT `totalBenifit` DECIMAL(10,2))   BEGIN SELECT SUM((p.sellprice - p.costprice) * dp.quantity) INTO totalBenifit FROM Sale_detail dp JOIN products p ON dp.productcode = p.productcode JOIN salesinfo j ON dp.salesid = j.salesid WHERE DATE(j.date) = date;  
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Product_less_then` (IN `input_quantity` INT)   BEGIN
    SELECT *
    FROM products
    WHERE quantity < input_quantity;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `SaleAmount` (IN `dateSalle` DATE, OUT `SaleAmount` INT)   BEGIN SELECT COUNT(*) INTO SaleAmount FROM salesinfo WHERE DATE(date) = dateSalle;  
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `TopProduct` (IN `input_count` INT)   BEGIN

SELECT p.*
    FROM products p
    INNER JOIN (
        SELECT productcode
        FROM salledata
        GROUP BY productcode
        ORDER BY SUM(quantity) DESC
        LIMIT input_count
    ) AS top ON p.productcode = top.productcode ;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `TotalPayee` (IN `date` DATE, OUT `totalPaye` DECIMAL(10,2))   BEGIN SELECT SUM(total_paye) INTO totalPaye FROM salesinfo WHERE DATE(date) = date;  
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `caisse`
--

CREATE TABLE `caisse` (
  `caisseid` int(11) NOT NULL,
  `date` varchar(22) NOT NULL,
  `total_paye` double NOT NULL,
  `soldby` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `caisse`
--

INSERT INTO `caisse` (`caisseid`, `date`, `total_paye`, `soldby`) VALUES
(1, '2023-10-21', 200, 'deodone'),
(2, '2023-10-21', 0, 'deodone'),
(3, '2023-10-21', 200, 'deodone'),
(4, '2023-10-21', 0, 'deodone'),
(6, '2023-10-21', 200, 'deodone'),
(7, '2023-10-21', 0, 'deodone'),
(8, '2023-10-21', 200, 'deodone'),
(9, '2023-10-21', 0, 'deodone'),
(13, '2023-10-28', 15, 'null'),
(14, '2023-10-28', 5, 'null');

-- --------------------------------------------------------

--
-- Table structure for table `categorie`
--

CREATE TABLE `categorie` (
  `catid` int(11) NOT NULL,
  `catName` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `customercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customercode`, `fullname`, `location`, `phone`) VALUES
('a1', 'gh', 'hg', '12345'),
('a2', 'gh', 'hg', '2'),
('a2c', 'gh', 'hg', '2'),
('a2d', 'gh', 'hg', '2'),
('a2e', 'gh', 'hg', '2'),
('a3', 'gh', 'hg', '2'),
('a4', 'gh', 'hg', '2'),
('a5', 'gh', 'hg', '12345'),
('a6', 'gh', 'hg', '2'),
('a7', 'gh', 'hg', '2'),
('a8', 'gh', 'hg', '2'),
('a9', 'gh', 'hg', '2'),
('b', 'gh', 'hg', '2'),
('b2', 'gh', 'hg', '2'),
('b3', 'gh', 'hg', '2'),
('cl1', 'deidine JJH', 'atar', '899389'),
('cl2', 'sidi', 'atart', '2121'),
('d', 'ds', 'sd', 'd'),
('ddf', 'dvs', 'sd', 'd'),
('de', 'ds', 'sd', 'd'),
('df', 'dfs', 'sd', 'd'),
('ds', 'dcs', 'sd', 'd'),
('dv', 'devs', 'sd', 'd'),
('fd', 'ds', 'sd', 'd'),
('inconue', 'inconue', 'inconue', '123456789'),
('sd', 'dcs', 'sd', 'd'),
('wqd', 'deds', 'sd', 'd');

-- --------------------------------------------------------

--
-- Stand-in structure for view `devisdata`
-- (See below for the actual view)
--
CREATE TABLE `devisdata` (
`salesid` int(11)
,`date` varchar(45)
,`customercode` varchar(45)
,`total_paye` double
,`recu` double
,`changeMony` double
,`soldby` varchar(45)
,`productcode` varchar(45)
,`quantity` int(11)
,`isLoan` varchar(22)
,`detaild` int(11)
,`sellprice` double
);

-- --------------------------------------------------------

--
-- Table structure for table `payloan`
--

CREATE TABLE `payloan` (
  `id` int(11) NOT NULL,
  `customercode` varchar(22) NOT NULL,
  `total_paye` double NOT NULL,
  `soldby` varchar(22) NOT NULL,
  `date` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payloan`
--

INSERT INTO `payloan` (`id`, `customercode`, `total_paye`, `soldby`, `date`) VALUES
(1, 'a2c', 323, 'deidine', '2023-10-21'),
(2, 'a2d', 545, 'deidine', '2023-10-21'),
(3, 'a2c', 0, 'deidine', '2023-10-22'),
(4, 'a2c', 21134, 'deidine', '2023-10-24'),
(5, 'a1', 22270, 'deidine', '2023-10-26'),
(6, 'a1', 0, 'deidine', '2023-11-01'),
(7, 'a1', 899, 'deidine', '2023-11-01');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `productcode` varchar(45) NOT NULL,
  `productname` varchar(45) NOT NULL,
  `costprice` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `sellprice` double NOT NULL,
  `brand` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`productcode`, `productname`, `costprice`, `quantity`, `sellprice`, `brand`) VALUES
('b1', 'bana', 100, 47, 100, 'bana'),
('eau', 'safi', 100, -3, 100, 'safi'),
('f1', 'fanta', 100, 476, 100, 'fanta'),
('pom', 'pomme', 100, 5, 100, 'pomme'),
('prod1', 'the', 43, 306, 323, 'the'),
('prod2', 'sucre', 347, 16, 34, 'sucre'),
('prod3', 'gaz', 344, 20, 54, 'gaz'),
('prod5', 'cahier', 34, 9, 34, 'cahier'),
('telephone', 'telephone', 21000, 0, 21000, 'samsung');

-- --------------------------------------------------------

--
-- Stand-in structure for view `purchasedata`
-- (See below for the actual view)
--
CREATE TABLE `purchasedata` (
`purchaseID` int(11)
,`supplierName` varchar(45)
,`productname` varchar(45)
,`date` varchar(45)
,`quantity` int(11)
,`totalcost` double
);

-- --------------------------------------------------------

--
-- Table structure for table `purchaseinfo`
--

CREATE TABLE `purchaseinfo` (
  `purchaseID` int(11) NOT NULL,
  `suppliercode` varchar(45) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `totalcost` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `purchaseinfo`
--

INSERT INTO `purchaseinfo` (`purchaseID`, `suppliercode`, `productcode`, `date`, `quantity`, `totalcost`) VALUES
(18, 'four4', 'f1', '2023-10-12', 338, 33800),
(24, 'fou1', 'f1', '2023-10-12', 676, 67600),
(28, 'four2', 'f1', '2023-10-17', 2, 200),
(29, 'four2', 'prod1', '2023-10-17', 1, 43),
(30, 'four4', 'b1', '2023-10-24', 55, 5500),
(31, 'four3', 'pom', '2023-10-25', 12, 1200),
(32, 'four7', 'prod1', '2023-10-25', 322, 13846);

-- --------------------------------------------------------

--
-- Table structure for table `salesdevis`
--

CREATE TABLE `salesdevis` (
  `salesid` int(11) NOT NULL,
  `date` varchar(45) NOT NULL,
  `customercode` varchar(45) NOT NULL,
  `total_paye` double NOT NULL,
  `recu` double NOT NULL,
  `changeMony` double NOT NULL,
  `soldby` varchar(45) NOT NULL,
  `isLoan` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salesdevis`
--

INSERT INTO `salesdevis` (`salesid`, `date`, `customercode`, `total_paye`, `recu`, `changeMony`, `soldby`, `isLoan`) VALUES
(2, '2023-10-28', 'a3', 323, 0, 0, 'deodone', 'true'),
(3, '2023-10-28', 'inconue', 323, 0, 0, 'deodone', 'true'),
(11, '2023-10-30', 'a2d', 2324, 0, 0, 'deodone', 'true'),
(16, '2023-11-02', 'a1', 1700, 0, 0, 'deidine', 'true'),
(17, '2023-11-02', 'a2', 1200, 0, 0, 'deidine', 'true'),
(18, '2023-11-02', 'a2', 800, 0, 0, 'deidine', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `salesinfo`
--

CREATE TABLE `salesinfo` (
  `salesid` int(11) NOT NULL,
  `date` varchar(45) NOT NULL,
  `customercode` varchar(45) NOT NULL,
  `total_paye` double NOT NULL,
  `recu` double NOT NULL,
  `changeMony` double NOT NULL,
  `soldby` varchar(45) NOT NULL,
  `isLoan` varchar(22) NOT NULL,
  `isTva` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salesinfo`
--

INSERT INTO `salesinfo` (`salesid`, `date`, `customercode`, `total_paye`, `recu`, `changeMony`, `soldby`, `isLoan`, `isTva`) VALUES
(78, '2023-10-16', 'ddf', 322, 0, 0, 'deodone', 'true', ''),
(80, '2023-10-16', 'ds', 400, 0, 0, 'deodone', 'true', ''),
(82, '2023-10-17', 'cl1', 900, 900, 0, 'deodone', 'false', ''),
(92, '2023-10-18', 'inconue', 100, 220, 120, 'deidine', 'false', ''),
(95, '2023-10-18', 'a2', 100, 110, 110, 'deodone', 'false', ''),
(96, '2023-10-19', 'inconue', 85569, 85888, 319, 'deodone', 'false', ''),
(98, '2023-10-19', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(99, '2023-10-19', 'a2d', 100, 100, 0, 'deodone', 'false', ''),
(103, '2023-10-19', 'inconue', 21423, 22222, 799, 'deodone', 'false', ''),
(104, '2023-10-19', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(105, '2023-10-19', 'inconue', 100, 111, 11, 'deodone', 'false', ''),
(106, '2023-10-19', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(109, '2023-10-19', 'a2', 100, 110, 10, 'deodone', 'false', ''),
(111, '2023-10-19', 'inconue', 423, 440, 17, 'deodone', 'false', ''),
(113, '2023-10-20', 'a2e', 300, 0, 0, 'deodone', 'true', ''),
(114, '2023-10-20', 'dv', 34, 0, 0, 'deodone', 'true', ''),
(115, '2023-10-21', 'a2', 100, 0, 0, 'deodone', 'true', ''),
(116, '2023-10-21', 'inconue', 100, 222, 122, 'deodone', 'false', ''),
(117, '2023-10-21', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(119, '2023-10-21', 'a1', 300, 300, 0, 'deodone', 'false', ''),
(122, '2023-10-22', 'a2', 100, 100, 0, 'deodone', 'false', ''),
(123, '2023-10-22', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(124, '2023-10-22', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(125, '2023-10-22', 'inconue', 323, 330, 7, 'deodone', 'false', ''),
(126, '2023-10-22', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(127, '2023-10-22', 'inconue', 100, 220, 120, 'deodone', 'false', ''),
(128, '2023-10-22', 'inconue', 54, 770, 716, 'deodone', 'false', ''),
(129, '2023-10-22', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(130, '2023-10-22', 'inconue', 100, 770, 670, 'deodone', 'false', ''),
(131, '2023-10-23', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(132, '2023-10-23', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(133, '2023-10-23', 'a2', 323, 0, 0, 'deodone', 'true', ''),
(134, '2023-10-23', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(136, '2023-10-23', 'a2e', 142, 0, 0, 'deodone', 'true', ''),
(137, '2023-10-23', 'inconue', 323, 440, 117, 'deodone', 'false', ''),
(139, '2023-10-23', 'a2', 646, 0, 0, 'deodone', 'true', ''),
(140, '2023-10-23', 'inconue', 34, 55, 21, 'deodone', 'false', ''),
(141, '2023-10-23', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(142, '2023-10-23', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(143, '2023-10-23', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(144, '2023-10-23', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(145, '2023-10-23', 'inconue', 323, 2222, 1899, 'deodone', 'false', ''),
(148, '2023-10-23', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(149, '2023-10-23', 'inconue', 54, 110, 56, 'deodone', 'false', ''),
(151, '2023-10-23', 'inconue', 298, 2220, 1922, 'deodone', 'false', ''),
(152, '2023-10-23', 'inconue', 136, 1111, 975, 'deodone', 'false', ''),
(153, '2023-10-23', 'a2', 268, 330, 62, 'deodone', 'false', ''),
(154, '2023-10-23', 'inconue', 42202, 42202, 0, 'deodone', 'false', ''),
(155, '2023-10-23', 'inconue', 100, 220, 120, 'deodone', 'false', ''),
(156, '2023-10-23', 'inconue', 42000, 42220, 220, 'deodone', 'false', ''),
(157, '2023-10-23', 'inconue', 34, 40, 6, 'deodone', 'false', ''),
(158, '2023-10-23', 'cl1', 408, 0, 0, 'deodone', 'true', ''),
(159, '2023-10-23', 'cl1', 21622, 0, 0, 'deodone', 'true', ''),
(160, '2023-10-23', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(161, '2023-10-23', 'inconue', 100, 110, 10, 'deodone', 'false', ''),
(162, '2023-10-23', 'inconue', 68, 220, 152, 'deodone', 'false', ''),
(163, '2023-10-24', 'inconue', 288, 660, 372, 'deodone', 'false', ''),
(165, '2023-10-24', 'inconue', 258, 555, 297, 'deodone', 'false', ''),
(166, '2023-10-25', 'a2d', 100, 100, 0, 'deodone', 'false', ''),
(167, '2023-10-25', 'inconue', 188, 1220, 1032, 'deodone', 'false', ''),
(169, '2023-10-28', 'a2d', 15, 323, 308, 'null', 'false', ''),
(170, '2023-10-28', 'a2d', 15, 0, 0, 'null', 'true', ''),
(171, '2023-10-28', 'inconue', 5, 66, 61, 'null', 'false', ''),
(172, '2023-10-28', 'inconue', 100, 100, 0, 'deodone', 'false', ''),
(173, '2023-10-29', 'inconue', 54, 66, 12, 'deodone', 'false', ''),
(174, '2023-10-29', 'a2', 222, 0, 0, 'null', 'true', ''),
(175, '2023-10-29', 'a2c', 391, 0, 0, 'null', 'true', ''),
(176, '2023-10-29', 'inconue', 400, 400, 0, 'deodone', 'false', ''),
(177, '2023-10-29', 'inconue', 54, 3400, 3346, 'deodone', 'false', ''),
(178, '2023-10-30', 'inconue', 43, 444, 401, 'deodone', 'false', ''),
(179, '2023-10-30', 'a1', 34, 0, 0, 'null', 'true', ''),
(180, '2023-10-30', 'a2', 100, 0, 0, 'null', 'true', ''),
(181, '2023-10-30', 'inconue', 222, 330, 108, 'deodone', 'false', ''),
(182, '2023-10-30', 'inconue', 212, 2120, 1908, 'deodone', 'false', ''),
(183, '2023-10-30', 'inconue', 222, 222, 0, 'deodone', 'false', ''),
(184, '2023-10-30', 'a1', 154, 0, 0, 'null', 'true', ''),
(185, '2023-10-30', 'inconue', 656565, 999990, 343425, 'deodone', 'false', ''),
(189, '2023-10-31', 'a1', 3716.8, 8880, 6557, 'deodone', 'false', 'true'),
(191, '2023-11-02', 'a1', 1670.4, 0, 0, 'null', 'true', 'true');

-- --------------------------------------------------------

--
-- Table structure for table `sale_detail`
--

CREATE TABLE `sale_detail` (
  `salesid` int(11) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `detaild` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sale_detail`
--

INSERT INTO `sale_detail` (`salesid`, `productcode`, `quantity`, `detaild`) VALUES
(78, 'f1', 1, 40),
(80, 'f1', 1, 48),
(82, 'f1', 9, 52),
(92, 'f1', 1, 62),
(95, 'f1', 1, 65),
(96, 'eau', 2, 66),
(96, 'f1', 2, 67),
(96, 'b1', 2, 68),
(96, 'telephone', 4, 69),
(96, 'prod1', 3, 70),
(98, 'b1', 1, 72),
(99, 'eau', 1, 73),
(103, 'b1', 1, 77),
(103, 'prod1', 1, 78),
(103, 'telephone', 1, 79),
(104, 'b1', 1, 80),
(105, 'b1', 1, 81),
(106, 'b1', 1, 82),
(109, 'eau', 1, 85),
(111, 'f1', 1, 87),
(111, 'prod1', 1, 88),
(113, 'eau', 3, 91),
(114, 'prod5', 1, 92),
(115, 'f1', 1, 93),
(116, 'f1', 1, 94),
(117, 'eau', 1, 95),
(119, 'f1', 3, 97),
(119, 'pom', 1, 99),
(122, 'eau', 1, 106),
(123, 'f1', 1, 107),
(124, 'pom', 1, 108),
(125, 'prod1', 1, 109),
(126, 'f1', 1, 110),
(127, 'pom', 1, 111),
(128, 'prod3', 1, 112),
(129, 'pom', 1, 113),
(130, 'pom', 1, 114),
(131, 'pom', 1, 115),
(132, 'pom', 1, 116),
(133, 'prod1', 1, 117),
(134, 'f1', 1, 118),
(136, 'prod3', 2, 123),
(136, 'prod5', 1, 124),
(137, 'prod1', 1, 125),
(139, 'prod1', 2, 128),
(140, 'prod2', 1, 129),
(141, 'f1', 1, 130),
(142, 'pom', 1, 131),
(143, 'pom', 1, 132),
(144, 'pom', 1, 133),
(145, 'prod1', 1, 134),
(148, 'pom', 1, 137),
(149, 'prod3', 1, 138),
(151, 'prod5', 4, 140),
(151, 'prod3', 3, 141),
(151, 'prod2', 1, 143),
(151, 'pom', 1, 144),
(152, 'prod2', 3, 145),
(152, 'prod5', 1, 146),
(153, 'f1', 2, 148),
(153, 'prod5', 2, 149),
(154, 'eau', 1, 150),
(154, 'prod5', 2, 151),
(154, 'telephone', 2, 152),
(154, 'prod2', 1, 153),
(155, 'pom', 1, 154),
(156, 'telephone', 2, 155),
(157, 'prod2', 1, 156),
(158, 'prod2', 12, 157),
(159, 'prod2', 1, 158),
(159, 'prod3', 1, 159),
(159, 'prod5', 1, 160),
(159, 'pom', 1, 161),
(159, 'f1', 1, 162),
(159, 'eau', 3, 163),
(159, 'telephone', 1, 164),
(160, 'f1', 1, 165),
(161, 'f1', 1, 166),
(162, 'prod5', 2, 167),
(163, 'f1', 2, 168),
(163, 'prod3', 1, 169),
(163, 'prod5', 1, 170),
(163, 'pom', 2, 171),
(163, 'prod5', 1, 172),
(165, 'prod2', 6, 173),
(165, 'prod3', 1, 174),
(166, 'f1', 1, 175),
(167, 'prod5', 1, 176),
(167, 'prod3', 1, 177),
(167, 'f1', 1, 178),
(169, 'eau', 4, 180),
(169, 'prod1', 5, 181),
(169, 'prod5', 6, 182),
(170, 'eau', 4, 183),
(170, 'prod1', 5, 184),
(170, 'prod5', 6, 185),
(171, 'b1', 1, 186),
(171, 'f1', 3, 187),
(172, 'b1', 1, 188),
(173, 'prod3', 1, 189),
(174, 'b1', 1, 190),
(174, 'prod2', 2, 191),
(174, 'prod3', 1, 192),
(175, 'prod5', 1, 193),
(175, 'prod2', 1, 194),
(175, 'prod1', 1, 195),
(176, 'b1', 4, 196),
(177, 'prod3', 1, 197),
(178, 'prod1', 1, 198),
(178, 'prod3', 2, 199),
(179, 'prod2', 1, 200),
(180, 'pom', 1, 201),
(181, 'prod1', 1, 202),
(182, 'prod2', 2, 203),
(183, 'pom', 3, 204),
(184, 'f1', 1, 205),
(184, 'prod3', 1, 206),
(185, 'pom', 1, 207),
(189, 'f1', 1, 216),
(191, 'prod2', 1, 218),
(191, 'prod1', 1, 219),
(191, 'prod5', 1, 220),
(191, 'prod1', 1, 221),
(191, 'prod3', 1, 222),
(191, 'prod3', 1, 223),
(191, 'prod2', 1, 224),
(191, 'pom', 1, 225),
(191, 'prod5', 1, 226),
(191, 'prod3', 1, 227);

-- --------------------------------------------------------

--
-- Table structure for table `sale_devis_detail`
--

CREATE TABLE `sale_devis_detail` (
  `salesid` int(11) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `detaild` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sale_devis_detail`
--

INSERT INTO `sale_devis_detail` (`salesid`, `productcode`, `quantity`, `detaild`) VALUES
(11, 'pom', 2, 17),
(11, 'prod1', 2, 18),
(16, 'prod2', 2, 29),
(16, 'prod3', 1, 30),
(16, 'prod5', 1, 31),
(17, 'prod1', 2, 32),
(17, 'prod2', 1, 33),
(18, 'prod5', 1, 34);

-- --------------------------------------------------------

--
-- Stand-in structure for view `salledata`
-- (See below for the actual view)
--
CREATE TABLE `salledata` (
`salesid` int(11)
,`date` varchar(45)
,`customercode` varchar(45)
,`total_paye` double
,`recu` double
,`changeMony` double
,`soldby` varchar(45)
,`productcode` varchar(45)
,`quantity` int(11)
,`isLoan` varchar(22)
,`detaild` int(11)
,`sellprice` double
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `salleraport`
-- (See below for the actual view)
--
CREATE TABLE `salleraport` (
`date` varchar(45)
,`total_paye` double
,`salesid` int(11)
,`soldby` varchar(45)
);

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `suppliercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `mobile` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`suppliercode`, `fullname`, `location`, `mobile`) VALUES
('fou1', 'deidien', 'atar', '8543'),
('four2', 'sidi', 'didi', '3122'),
('four3', 'deid', 'atar', '3232'),
('four4', 'fourni', 'wee', '3233'),
('four5', 'hjv', 'vhj', '2222'),
('four6', 'gfty', 'yfyf', '676'),
('four7', 'fy', 'chf', '56'),
('four8', 'jhjv', 'hfv', '677r');

-- --------------------------------------------------------

--
-- Table structure for table `userlogs`
--

CREATE TABLE `userlogs` (
  `username` varchar(45) NOT NULL,
  `in_time` varchar(45) NOT NULL,
  `out_time` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `usertype` varchar(45) NOT NULL,
  `canLoan` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `location`, `phone`, `username`, `password`, `usertype`, `canLoan`) VALUES
(1, 'inconu', 'atar', '12345', 'inconue', '123456', 'ADMINISTRATOR', 0),
(3, 'deidin cheugeur', 'atarwe', '49619609', 'deidine', 'ssssss', 'EMPLOYEE', 1),
(4, 'deodone', 'atar', '12345', 'deodone', '123456', 'ADMINISTRATOR', 1);

-- --------------------------------------------------------

--
-- Structure for view `devisdata`
--
DROP TABLE IF EXISTS `devisdata`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `devisdata`  AS SELECT `sin`.`salesid` AS `salesid`, `sin`.`date` AS `date`, `sin`.`customercode` AS `customercode`, `sin`.`total_paye` AS `total_paye`, `sin`.`recu` AS `recu`, `sin`.`changeMony` AS `changeMony`, `sin`.`soldby` AS `soldby`, `sldt`.`productcode` AS `productcode`, `sldt`.`quantity` AS `quantity`, `sin`.`isLoan` AS `isLoan`, `sldt`.`detaild` AS `detaild`, `p`.`sellprice` AS `sellprice` FROM (((`salesdevis` `sin` join `sale_devis_detail` `sldt` on(`sin`.`salesid` = `sldt`.`salesid`)) join `products` `p` on(`sldt`.`productcode` = `p`.`productcode`)) join `users` on(`sin`.`soldby` = `users`.`name`))  ;

-- --------------------------------------------------------

--
-- Structure for view `purchasedata`
--
DROP TABLE IF EXISTS `purchasedata`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `purchasedata`  AS SELECT `prcs`.`purchaseID` AS `purchaseID`, `sp`.`fullname` AS `supplierName`, `p`.`productname` AS `productname`, `prcs`.`date` AS `date`, `prcs`.`quantity` AS `quantity`, `prcs`.`totalcost` AS `totalcost` FROM ((`purchaseinfo` `prcs` join `products` `p` on(`prcs`.`productcode` = `p`.`productcode`)) join `suppliers` `sp` on(`prcs`.`suppliercode` = `sp`.`suppliercode`))  ;

-- --------------------------------------------------------

--
-- Structure for view `salledata`
--
DROP TABLE IF EXISTS `salledata`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `salledata`  AS SELECT DISTINCT `sin`.`salesid` AS `salesid`, `sin`.`date` AS `date`, `sin`.`customercode` AS `customercode`, `sin`.`total_paye` AS `total_paye`, `sin`.`recu` AS `recu`, `sin`.`changeMony` AS `changeMony`, `sin`.`soldby` AS `soldby`, `sldt`.`productcode` AS `productcode`, `sldt`.`quantity` AS `quantity`, `sin`.`isLoan` AS `isLoan`, `sldt`.`detaild` AS `detaild`, `p`.`sellprice` AS `sellprice` FROM (((`salesinfo` `sin` join `sale_detail` `sldt` on(`sin`.`salesid` = `sldt`.`salesid`)) join `products` `p` on(`sldt`.`productcode` = `p`.`productcode`)) join `users` on(`sin`.`soldby` = `users`.`name`))  ;

-- --------------------------------------------------------

--
-- Structure for view `salleraport`
--
DROP TABLE IF EXISTS `salleraport`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `salleraport`  AS SELECT `slinf`.`date` AS `date`, `slinf`.`total_paye` AS `total_paye`, `slinf`.`salesid` AS `salesid`, `slinf`.`soldby` AS `soldby` FROM (`salesinfo` `slinf` join `users` on(`slinf`.`soldby` = `users`.`username`))  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caisse`
--
ALTER TABLE `caisse`
  ADD PRIMARY KEY (`caisseid`);

--
-- Indexes for table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`catid`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customercode`);

--
-- Indexes for table `payloan`
--
ALTER TABLE `payloan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customercode` (`customercode`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`productcode`),
  ADD UNIQUE KEY `productcode_UNIQUE` (`productcode`);

--
-- Indexes for table `purchaseinfo`
--
ALTER TABLE `purchaseinfo`
  ADD PRIMARY KEY (`purchaseID`),
  ADD KEY `productcode` (`productcode`),
  ADD KEY `suppliercode` (`suppliercode`);

--
-- Indexes for table `salesdevis`
--
ALTER TABLE `salesdevis`
  ADD PRIMARY KEY (`salesid`),
  ADD KEY `customercode` (`customercode`);

--
-- Indexes for table `salesinfo`
--
ALTER TABLE `salesinfo`
  ADD PRIMARY KEY (`salesid`),
  ADD KEY `customercode` (`customercode`);

--
-- Indexes for table `sale_detail`
--
ALTER TABLE `sale_detail`
  ADD PRIMARY KEY (`detaild`),
  ADD KEY `productcode` (`productcode`),
  ADD KEY `salesid` (`salesid`);

--
-- Indexes for table `sale_devis_detail`
--
ALTER TABLE `sale_devis_detail`
  ADD PRIMARY KEY (`detaild`),
  ADD KEY `productcode` (`productcode`),
  ADD KEY `salesid` (`salesid`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`suppliercode`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caisse`
--
ALTER TABLE `caisse`
  MODIFY `caisseid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `catid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payloan`
--
ALTER TABLE `payloan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `purchaseinfo`
--
ALTER TABLE `purchaseinfo`
  MODIFY `purchaseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `salesdevis`
--
ALTER TABLE `salesdevis`
  MODIFY `salesid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `salesinfo`
--
ALTER TABLE `salesinfo`
  MODIFY `salesid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=192;

--
-- AUTO_INCREMENT for table `sale_detail`
--
ALTER TABLE `sale_detail`
  MODIFY `detaild` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=228;

--
-- AUTO_INCREMENT for table `sale_devis_detail`
--
ALTER TABLE `sale_devis_detail`
  MODIFY `detaild` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payloan`
--
ALTER TABLE `payloan`
  ADD CONSTRAINT `payloan_ibfk_1` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `purchaseinfo`
--
ALTER TABLE `purchaseinfo`
  ADD CONSTRAINT `purchaseinfo_ibfk_1` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `purchaseinfo_ibfk_2` FOREIGN KEY (`suppliercode`) REFERENCES `suppliers` (`suppliercode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `salesdevis`
--
ALTER TABLE `salesdevis`
  ADD CONSTRAINT `salesdevis_ibfk_1` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `salesinfo`
--
ALTER TABLE `salesinfo`
  ADD CONSTRAINT `salesinfo_ibfk_1` FOREIGN KEY (`customercode`) REFERENCES `customers` (`customercode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sale_detail`
--
ALTER TABLE `sale_detail`
  ADD CONSTRAINT `sale_detail_ibfk_1` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sale_detail_ibfk_2` FOREIGN KEY (`salesid`) REFERENCES `salesinfo` (`salesid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sale_devis_detail`
--
ALTER TABLE `sale_devis_detail`
  ADD CONSTRAINT `sale_detail_ssibfk_2` FOREIGN KEY (`salesid`) REFERENCES `salesdevis` (`salesid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sale_details_ibfk_1` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
