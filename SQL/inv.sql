create database IF NOT EXISTS  inventory2;
use inventory2;
  
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
  `soldby` varchar(11) NOT NULL,
  `salesid` int(11) NOT NULL
) ;


  

CREATE TABLE `categorie` (
  `catid` int(11) NOT NULL,
  `catName` int(11) NOT NULL
) ;
 
--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `customercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL
) ;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customercode`, `fullname`, `location`, `phone`) VALUES
('cl1', 'deidine3', 'atar', '899389'),
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
 

-- Dumping data for table `loansinfo`
CREATE TABLE `payloan` (
  `id` int(11) NOT NULL,
  `customercode` varchar(22) NOT NULL,
  `total_paye` double NOT NULL,
  `recu` double NOT NULL,
  `changeMony` double NOT NULL,
  `soldby` varchar(22) NOT NULL,
  `date` varchar(22) NOT NULL
) ;

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
) ;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`productcode`, `productname`, `costprice`, `quantity`, `sellprice`, `brand`) VALUES
('co1', 'coca', 100, 212, 100, 'coca'),
('eau', 'eau', 22, 21, 22, 'eau'),
('f1', 'fanta', 100, 1352, 100, 'fanta'),
('prod1', 'the', 43, 23, 323, 'the');

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
) ;

--
-- Dumping data for table `purchaseinfo`
--

INSERT INTO `purchaseinfo` (`purchaseID`, `suppliercode`, `productcode`, `date`, `quantity`, `totalcost`) VALUES
(10, 'fou1', 'co1', 'Thu Oct 05 14:28:55 GMT 2023', 2, 200),
(14, 'fou1', 'co1', '01-01-1970', 2, 200),
(18, 'four4', 'f1', '2023-10-12', 338, 33800),
(22, 'four2', 'co1', '2023-10-12', 3456, 345600),
(23, 'four4', 'co1', '2023-10-12', 6912, 691200),
(24, 'fou1', 'f1', '2023-10-12', 676, 67600),
(25, 'fou1', 'co1', '2023-10-12', 13824, 1382400);

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
  `isLoan` varchar(22) NOT NULL
) ;

--
-- Dumping data for table `salesinfo`
--
-- --------------------------------------------------------

--
-- Table structure for table `sale_detail`
--

CREATE TABLE `sale_detail` (
  `salesid` int(11) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL
) ;

--
-- Dumping data for table `sale_detail`
--
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
) ;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`suppliercode`, `fullname`, `location`, `mobile`) VALUES
('fou1', 'deidien', 'atar', '8543'),
('four2', 'sidi', 'didi', '3122'),
('four3', 'deid', 'atar', '3232'),
('four4', 'fourni', 'wee', '3233');

-- --------------------------------------------------------

--
-- Table structure for table `userlogs`
--

CREATE TABLE `userlogs` (
  `username` varchar(45) NOT NULL,
  `in_time` varchar(45) NOT NULL,
  `out_time` varchar(45) NOT NULL
) ;

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
  `usertype` varchar(45) NOT NULL
) ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `location`, `phone`, `username`, `password`, `usertype`) VALUES
(1, 'inconu', 'atar', '12345', 'inconue', '123456', 'ADMINISTRATOR'),
(2, 'deodone', 'atar', '12345', 'deodone', '123456', 'ADMINISTRATOR');

-- --------------------------------------------------------

--
-- Structure for view `loandata`
--
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

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `salledata`  AS SELECT `sin`.`salesid` AS `salesid`, `sin`.`date` AS `date`, `sin`.`customercode` AS `customercode`, `sin`.`total_paye` AS `total_paye`, `sin`.`recu` AS `recu`, `sin`.`changeMony` AS `changeMony`, `sin`.`soldby` AS `soldby`, `sldt`.`productcode` AS `productcode`, `sldt`.`quantity` AS `quantity`, `sin`.`isLoan` FROM (((`salesinfo` `sin` join `sale_detail` `sldt` on(`sin`.`salesid` = `sldt`.`salesid`)) join `products` `p` on(`sldt`.`productcode` = `p`.`productcode`)) join `users` on(`sin`.`soldby` = `users`.`name`))  ;

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
  ADD PRIMARY KEY (`caisseid`),
  ADD KEY `salesid` (`salesid`);

 
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
-- Indexes for table `salesinfo`
--
ALTER TABLE `salesinfo`
  ADD PRIMARY KEY (`salesid`),
  ADD KEY `customercode` (`customercode`);

--
-- Indexes for table `sale_detail`
--
ALTER TABLE `sale_detail`
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
-- AUTO_INCREMENT for table `caisse`
--
ALTER TABLE `caisse`
  MODIFY `caisseid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `casseloan`
--
--
-- AUTO_INCREMENT for table `categorie`
--
ALTER TABLE `categorie`
  MODIFY `catid` int(11) NOT NULL AUTO_INCREMENT;
 
--
-- AUTO_INCREMENT for table `payloan`
--
ALTER TABLE `payloan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `purchaseinfo`
--
ALTER TABLE `purchaseinfo`
  MODIFY `purchaseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `salesinfo`
--
ALTER TABLE `salesinfo`
  MODIFY `salesid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `caisse`
--
ALTER TABLE `caisse`
  ADD CONSTRAINT `caisse_ibfk_1` FOREIGN KEY (`salesid`) REFERENCES `salesinfo` (`salesid`) ON DELETE CASCADE ON UPDATE CASCADE;
 
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
COMMIT;

 