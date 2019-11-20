/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.60 : Database - project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`project` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `project`;

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `carid` int(11) NOT NULL,
  `vid` int(11) NOT NULL,
  `totalmoney` double NOT NULL,
  `totalnum` int(11) NOT NULL,
  `discount` double NOT NULL,
  PRIMARY KEY (`carid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

/*Table structure for table `cars` */

DROP TABLE IF EXISTS `cars`;

CREATE TABLE `cars` (
  `carsid` int(11) NOT NULL,
  `carid` int(11) NOT NULL,
  `goodnum` int(11) NOT NULL,
  `goodname` varchar(50) NOT NULL,
  `goodprice` double NOT NULL,
  PRIMARY KEY (`carsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cars` */

/*Table structure for table `cashregister` */

DROP TABLE IF EXISTS `cashregister`;

CREATE TABLE `cashregister` (
  `cashRegisterID` int(11) NOT NULL,
  `commodityIMG` varchar(50) NOT NULL,
  `commodityName` varchar(50) NOT NULL,
  `specifications` varchar(50) NOT NULL,
  `price` float NOT NULL,
  `count` int(11) NOT NULL,
  `moneyamt` float NOT NULL,
  `shopID` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `payCount` int(11) NOT NULL,
  `staffId` varchar(50) NOT NULL,
  PRIMARY KEY (`cashRegisterID`) USING BTREE,
  KEY `userid` (`userid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `cashregister` */

/*Table structure for table `good` */

DROP TABLE IF EXISTS `good`;

CREATE TABLE `good` (
  `Goodid` int(11) NOT NULL AUTO_INCREMENT,
  `Goodname` varchar(50) NOT NULL,
  PRIMARY KEY (`Goodid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `good` */

insert  into `good`(`Goodid`,`Goodname`) values (5,'外套');

/*Table structure for table `goodsdetail` */

DROP TABLE IF EXISTS `goodsdetail`;

CREATE TABLE `goodsdetail` (
  `id` int(11) NOT NULL,
  `gid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `gid` (`gid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `goodsdetail` */

/*Table structure for table `goodspec` */

DROP TABLE IF EXISTS `goodspec`;

CREATE TABLE `goodspec` (
  `gid` int(11) NOT NULL,
  `gname` varchar(50) NOT NULL,
  PRIMARY KEY (`gid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `goodspec` */

/*Table structure for table `integral` */

DROP TABLE IF EXISTS `integral`;

CREATE TABLE `integral` (
  `integral` int(11) DEFAULT NULL COMMENT '积分',
  `Inte_money` double DEFAULT NULL COMMENT '可低金额 t:100 = 1元',
  `flag` int(11) DEFAULT NULL COMMENT '是否开启',
  `intid` int(10) NOT NULL AUTO_INCREMENT,
  `bz2` varchar(50) DEFAULT NULL,
  `bz3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`intid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `integral` */

insert  into `integral`(`integral`,`Inte_money`,`flag`,`intid`,`bz2`,`bz3`) values (1000,1,0,1,NULL,NULL);

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `messageid` int(10) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) NOT NULL,
  `username` varchar(20) NOT NULL,
  `createdate` datetime NOT NULL,
  PRIMARY KEY (`messageid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `message` */

insert  into `message`(`messageid`,`content`,`username`,`createdate`) values (1,'哇哈哈哈','娃娃','2019-07-30 10:53:30'),(3,'哇哈哈哈1','娃娃1','2019-07-30 10:54:05'),(4,'哇哈哈哈2','娃娃2','2019-07-30 10:54:21');

/*Table structure for table `nexus` */

DROP TABLE IF EXISTS `nexus`;

CREATE TABLE `nexus` (
  `id` int(11) NOT NULL,
  `zid` int(11) NOT NULL,
  `jid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nexus` */

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `userid` int(11) NOT NULL,
  `JurisdictionId` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `userid` (`userid`) USING BTREE,
  KEY `JurisdictionId` (`JurisdictionId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `post` */

/*Table structure for table `powerone` */

DROP TABLE IF EXISTS `powerone`;

CREATE TABLE `powerone` (
  `Jid` int(11) NOT NULL,
  `JurisdictionName` varchar(50) NOT NULL,
  PRIMARY KEY (`Jid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `powerone` */

/*Table structure for table `powertwo` */

DROP TABLE IF EXISTS `powertwo`;

CREATE TABLE `powertwo` (
  `id` int(11) NOT NULL,
  `Jid` int(11) NOT NULL,
  `JurisdictionName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `Jid` (`Jid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `powertwo` */

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `purchaseid` int(11) NOT NULL,
  `Userid` int(11) NOT NULL,
  `odd` varchar(50) NOT NULL,
  `delivery time` date NOT NULL,
  `SuId` int(11) NOT NULL,
  `Number` int(11) NOT NULL,
  `Price` float NOT NULL,
  `shop` varchar(50) NOT NULL,
  PRIMARY KEY (`purchaseid`) USING BTREE,
  KEY `Userid` (`Userid`) USING BTREE,
  KEY `SuId` (`SuId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `purchase` */

insert  into `purchase`(`purchaseid`,`Userid`,`odd`,`delivery time`,`SuId`,`Number`,`Price`,`shop`) values (1,1,'1','2019-11-16',1,1,1,'1'),(2,2,'2','2019-11-16',2,2,2,'2');

/*Table structure for table `purchasedetails` */

DROP TABLE IF EXISTS `purchasedetails`;

CREATE TABLE `purchasedetails` (
  `Id` int(11) NOT NULL,
  `purchaseid` int(11) NOT NULL,
  `ltemno` varchar(50) NOT NULL,
  `shapecode` varchar(50) NOT NULL,
  `goodsname` varchar(50) NOT NULL,
  `goodsphoto` varchar(50) NOT NULL,
  `specification` varchar(50) NOT NULL,
  `costprice` float NOT NULL,
  `count` int(11) NOT NULL,
  `money` float NOT NULL,
  PRIMARY KEY (`Id`) USING BTREE,
  KEY `purchaseid` (`purchaseid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `purchasedetails` */

insert  into `purchasedetails`(`Id`,`purchaseid`,`ltemno`,`shapecode`,`goodsname`,`goodsphoto`,`specification`,`costprice`,`count`,`money`) values (1,1,'1','1','1','1','1',1,1,1),(2,2,'2','2','2','2','2',2,2,2);

/*Table structure for table `recharge` */

DROP TABLE IF EXISTS `recharge`;

CREATE TABLE `recharge` (
  `rechargeID` int(11) NOT NULL,
  `rechargeDate` datetime DEFAULT NULL,
  `weChatNumber` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `recharge` float NOT NULL,
  `give` float NOT NULL,
  `balance` float NOT NULL,
  `remarks` varchar(50) NOT NULL,
  `vid` int(11) NOT NULL,
  PRIMARY KEY (`rechargeID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `recharge` */

/*Table structure for table `saletype` */

DROP TABLE IF EXISTS `saletype`;

CREATE TABLE `saletype` (
  `Saleid` int(11) NOT NULL,
  `Salename` varchar(50) NOT NULL,
  `Jobnumber` varchar(50) NOT NULL,
  PRIMARY KEY (`Saleid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `saletype` */

/*Table structure for table `shop` */

DROP TABLE IF EXISTS `shop`;

CREATE TABLE `shop` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `shh` varchar(20) DEFAULT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `sdpprice` double DEFAULT NULL,
  `scbprice` double DEFAULT NULL,
  `goodid` int(11) DEFAULT NULL,
  `goodimg` varchar(2000) DEFAULT NULL,
  `goodText` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `shop` */

insert  into `shop`(`sid`,`shh`,`sname`,`sdpprice`,`scbprice`,`goodid`,`goodimg`,`goodText`) values (1,'111','111111',111,111,5,NULL,NULL),(2,'222','22',2,22,4,NULL,NULL),(3,'333','33',3,33,5,NULL,'123sssss'),(4,'44','444',44,44,5,'D:\\staticSource/content3.jpg,D:\\staticSource/content4.jpg,D:\\staticSource/content2.jpg','123123'),(5,'lls','4444',44,44,5,'D:\\staticSource/content1.jpg,D:\\staticSource/content3.jpg','ggggg');

/*Table structure for table `shopdetails` */

DROP TABLE IF EXISTS `shopdetails`;

CREATE TABLE `shopdetails` (
  `sdid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) DEFAULT NULL,
  `scolor` varchar(10) DEFAULT NULL,
  `scc` varchar(10) DEFAULT NULL,
  `snum` int(11) DEFAULT NULL,
  `sNumbe` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sdid`),
  KEY `shopdetails_ibfk_1` (`sid`),
  CONSTRAINT `shopdetails_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `shop` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `shopdetails` */

insert  into `shopdetails`(`sdid`,`sid`,`scolor`,`scc`,`snum`,`sNumbe`) values (2,1,'黑色','30',10,'20191120177718277584'),(3,2,'x','x',11,'20191120535486561599'),(4,3,'绿色','x',2,'20191120444771524114'),(5,3,'绿色','30',3,'20191120375056711239'),(6,3,'浅绿色','x',4,'20191120-89378761251'),(7,3,'浅绿色','30',3,'20191120329414259551');

/*Table structure for table `size` */

DROP TABLE IF EXISTS `size`;

CREATE TABLE `size` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `size` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `size` */

insert  into `size`(`id`,`size`) values (47,'x'),(55,'30'),(57,'l'),(58,'s');

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffId` varchar(20) NOT NULL,
  `staffName` varchar(50) NOT NULL,
  `staffpwd` varchar(50) NOT NULL,
  `staffPhone` varchar(50) NOT NULL,
  `staffTime` varchar(50) NOT NULL,
  `headPortrait` varchar(50) NOT NULL,
  `industry` varchar(50) NOT NULL,
  PRIMARY KEY (`staffId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `staff` */

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `id` int(11) NOT NULL,
  `Did` int(11) NOT NULL,
  `People` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Telephone` varchar(50) NOT NULL,
  `StarTime` date NOT NULL,
  `EndTime` date NOT NULL,
  `Province` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `area` varchar(50) NOT NULL,
  `DItem` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `Did` (`Did`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `store` */

/*Table structure for table `storetype` */

DROP TABLE IF EXISTS `storetype`;

CREATE TABLE `storetype` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `item` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `storetype` */

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `SuId` int(11) NOT NULL,
  `Suname` varchar(50) NOT NULL,
  `Sucompany` varchar(50) NOT NULL,
  `People` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Telephone` varchar(50) NOT NULL,
  `Province` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `area` varchar(50) NOT NULL,
  `Street` varchar(50) NOT NULL,
  PRIMARY KEY (`SuId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `supplier` */

insert  into `supplier`(`SuId`,`Suname`,`Sucompany`,`People`,`Phone`,`Email`,`Telephone`,`Province`,`City`,`area`,`Street`) values (1,'1','1','1','1','1','1','1','2','2','2');

/*Table structure for table `turnover` */

DROP TABLE IF EXISTS `turnover`;

CREATE TABLE `turnover` (
  `order_id` varchar(50) NOT NULL,
  `user_id` int(11) NOT NULL,
  `order_count` int(11) NOT NULL,
  `order_totalMoney` float NOT NULL,
  `order_payment` varchar(50) NOT NULL,
  `order_date` date NOT NULL,
  `Ordername` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `turnover` */

/*Table structure for table `turnoverdetails` */

DROP TABLE IF EXISTS `turnoverdetails`;

CREATE TABLE `turnoverdetails` (
  `id` int(11) NOT NULL,
  `order_id` varchar(50) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `goods_price` double NOT NULL,
  `goods_count` int(11) NOT NULL,
  `order_details_discount` float NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `order_id` (`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `turnoverdetails` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `Userid` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Userpwd` varchar(50) NOT NULL,
  `Userphone` int(11) NOT NULL,
  PRIMARY KEY (`Userid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `user` */

/*Table structure for table `vip` */

DROP TABLE IF EXISTS `vip`;

CREATE TABLE `vip` (
  `VID` int(11) NOT NULL,
  `Vtypeid` int(11) NOT NULL,
  `code` varchar(50) NOT NULL,
  `Userid` int(11) NOT NULL,
  `Integral` varchar(50) NOT NULL,
  `Transaction` int(11) NOT NULL,
  PRIMARY KEY (`VID`) USING BTREE,
  KEY `Userid` (`Userid`) USING BTREE,
  KEY `Vtypeid` (`Vtypeid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `vip` */

/*Table structure for table `vote` */

DROP TABLE IF EXISTS `vote`;

CREATE TABLE `vote` (
  `voteid` int(10) NOT NULL,
  `messageid` int(10) NOT NULL,
  `username` varchar(200) NOT NULL,
  `createdate` datetime NOT NULL,
  KEY `messageid` (`messageid`),
  CONSTRAINT `vote_ibfk_1` FOREIGN KEY (`messageid`) REFERENCES `message` (`messageid`),
  CONSTRAINT `vote_ibfk_2` FOREIGN KEY (`messageid`) REFERENCES `message` (`messageid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vote` */

insert  into `vote`(`voteid`,`messageid`,`username`,`createdate`) values (0,1,'娃娃','2019-07-30 10:53:30'),(0,3,'娃娃1','2019-07-30 10:54:05'),(0,4,'娃娃2','2019-07-30 10:54:21');

/*Table structure for table `vtype` */

DROP TABLE IF EXISTS `vtype`;

CREATE TABLE `vtype` (
  `VTid` int(11) NOT NULL AUTO_INCREMENT,
  `VTname` varchar(50) NOT NULL,
  `VtDiscount` float NOT NULL,
  `vrule` int(1) NOT NULL COMMENT '升级规则  0是自动 1是手动',
  `maxmoney` double DEFAULT NULL COMMENT '消费达到',
  `validityData` int(11) DEFAULT NULL COMMENT '有效期 0永久 1 一年',
  `bz1` varchar(50) DEFAULT NULL,
  `bz2` varchar(50) DEFAULT NULL,
  `bz3` varchar(50) DEFAULT NULL,
  `bz4` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`VTid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `vtype` */

insert  into `vtype`(`VTid`,`VTname`,`VtDiscount`,`vrule`,`maxmoney`,`validityData`,`bz1`,`bz2`,`bz3`,`bz4`) values (7,'vip',0.8,0,1,0,NULL,NULL,NULL,NULL),(8,'测试等级1',1,0,1111,0,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
