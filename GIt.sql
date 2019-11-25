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

insert  into `good`(`Goodid`,`Goodname`) values (4,'裙子'),(5,'外套'),(6,'袜子');

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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) NOT NULL,
  `userid` int(11) NOT NULL,
  `JurisdictionId` int(11) NOT NULL,
  `coummt1` varchar(50) DEFAULT NULL,
  `coummt2` varchar(50) DEFAULT NULL,
  `coummt3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `userid` (`userid`) USING BTREE,
  KEY `JurisdictionId` (`JurisdictionId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `post` */

insert  into `post`(`id`,`type`,`userid`,`JurisdictionId`,`coummt1`,`coummt2`,`coummt3`) values (1,'经理',1,1,'1','1','1'),(2,'总监',2,2,'2','2','2');

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

/*Table structure for table `pruchasedetails` */

DROP TABLE IF EXISTS `pruchasedetails`;

CREATE TABLE `pruchasedetails` (
  `prdid` int(11) NOT NULL AUTO_INCREMENT,
  `shh` varchar(20) DEFAULT NULL,
  `snumbe` varchar(20) DEFAULT NULL,
  `sname` varchar(20) DEFAULT NULL,
  `sgg` varchar(50) DEFAULT NULL,
  `scbprice` float DEFAULT NULL,
  `snum` int(11) DEFAULT NULL,
  `sprice` float DEFAULT NULL,
  `bz1` int(20) DEFAULT NULL,
  `bz2` varchar(20) DEFAULT NULL,
  `bz3` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`prdid`),
  KEY `bz1` (`bz1`),
  CONSTRAINT `pruchasedetails_ibfk_1` FOREIGN KEY (`bz1`) REFERENCES `purchase` (`purid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `pruchasedetails` */

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `purid` int(11) NOT NULL AUTO_INCREMENT,
  `purno` varchar(20) DEFAULT NULL,
  `purdata` varchar(50) DEFAULT NULL,
  `gysid` int(11) DEFAULT NULL,
  `staffid` int(11) DEFAULT NULL,
  `purtext` varchar(200) DEFAULT NULL,
  `bz1` varchar(20) DEFAULT NULL,
  `bz2` varchar(20) DEFAULT NULL,
  `bz3` varchar(20) DEFAULT NULL COMMENT '0审核 1提交',
  PRIMARY KEY (`purid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `purchase` */

insert  into `purchase`(`purid`,`purno`,`purdata`,`gysid`,`staffid`,`purtext`,`bz1`,`bz2`,`bz3`) values (6,'',NULL,29,0,'','',NULL,NULL);

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
  `scolor` varchar(200) DEFAULT NULL,
  `scc` varchar(200) DEFAULT NULL,
  `bz1` varchar(10) DEFAULT NULL,
  `bz2` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;

/*Data for the table `shop` */

insert  into `shop`(`sid`,`shh`,`sname`,`sdpprice`,`scbprice`,`goodid`,`goodimg`,`goodText`,`scolor`,`scc`,`bz1`,`bz2`) values (15,'123','123',123,123,4,'content3.jpg,content1.jpg,floor-left-item4.jpg',NULL,'桔色,红色','米,27','6',NULL),(16,'1233','123',123,123,6,'banner-small-1.jpg',NULL,'军绿色','26','6','1'),(17,'56488','保温杯',44,444,4,'banner-small-3.jpg',NULL,'酒红色','','8',NULL),(116,'12','312',1,1,4,'1.jpg',NULL,'透明','','6',NULL),(117,'12312','31231',1,11,4,'1.jpg',NULL,'','','11',NULL),(118,'123','123',123,123,5,'1.jpg',NULL,'黑色','','10',NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

/*Data for the table `shopdetails` */

insert  into `shopdetails`(`sdid`,`sid`,`scolor`,`scc`,`snum`,`sNumbe`) values (34,15,'桔色','m',22,'20191121101574643767'),(35,15,'绿色','m',10,'20191121378016963357'),(36,16,'军绿色','26',10,'20191121500378413556'),(37,17,'酒红色',NULL,0,'20191122157343073562'),(40,15,'桔色','米',0,'20191123-95245194451'),(41,15,'红色','米',0,'20191123562908404919'),(42,15,'桔色','27',0,'20191123209041601246'),(43,15,'红色','27',0,'2019112386601698824'),(44,116,'透明',NULL,10,'20191123374920821725'),(45,117,NULL,'26',12,'20191123208163054901'),(46,117,'',NULL,20,'20191123370809674734'),(47,118,'黑色',NULL,123,'20191125283025822296');

/*Table structure for table `size` */

DROP TABLE IF EXISTS `size`;

CREATE TABLE `size` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `size` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `size` */

insert  into `size`(`id`,`size`) values (1,'s'),(2,'m'),(3,'l'),(4,'xl'),(5,'xxl'),(6,'26'),(7,'27'),(8,'28'),(9,'29'),(10,'30'),(11,'31');

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffId` int(20) NOT NULL AUTO_INCREMENT,
  `staffName` varchar(50) DEFAULT NULL,
  `staffpwd` varchar(50) DEFAULT NULL,
  `staffPhone` varchar(50) DEFAULT NULL,
  `staffTime` varchar(50) DEFAULT NULL,
  `headPortrait` varchar(50) DEFAULT NULL,
  `industry` varchar(50) DEFAULT NULL,
  `storeid` int(50) DEFAULT NULL,
  `CardGo` varchar(50) DEFAULT NULL,
  `postid` int(11) DEFAULT NULL,
  `storename` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`staffId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `staff` */

insert  into `staff`(`staffId`,`staffName`,`staffpwd`,`staffPhone`,`staffTime`,`headPortrait`,`industry`,`storeid`,`CardGo`,`postid`,`storename`) values (1,'1vg','1',NULL,'1',NULL,'444',2,'13334444',1,'好莱坞'),(2,'刘礼斯','2222',NULL,'2002-2-2',NULL,'4',2,'2222',2,'李老师的店'),(3,'22','222',NULL,NULL,NULL,'4',6,'222',2,'好莱坞'),(4,'33','33',NULL,NULL,NULL,'44',6,'33',2,'李老师的店'),(5,'22','22',NULL,NULL,NULL,'4',6,'22',2,'好莱坞'),(6,'理论上','3',NULL,NULL,NULL,'4',6,'28',2,'好莱坞'),(7,'22','22',NULL,NULL,NULL,'4',6,'22',2,'好莱坞'),(8,NULL,NULL,NULL,NULL,NULL,'4',6,'44',2,'好莱坞'),(9,NULL,NULL,NULL,NULL,NULL,'4',6,'4',2,'好莱坞'),(10,NULL,NULL,NULL,NULL,NULL,'4',6,'4',2,'好莱坞'),(13,NULL,NULL,NULL,NULL,NULL,'',NULL,NULL,NULL,NULL);

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Did` int(11) DEFAULT NULL,
  `People` varchar(50) DEFAULT NULL,
  `Phone` varchar(50) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT NULL,
  `StarTime` date DEFAULT NULL,
  `EndTime` date DEFAULT NULL,
  `Province` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `area` varchar(50) DEFAULT NULL,
  `DItem` varchar(50) DEFAULT NULL,
  `storename` varchar(50) DEFAULT NULL,
  `card` varchar(50) DEFAULT NULL,
  `img` varchar(50) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `jcname` varchar(50) DEFAULT NULL,
  `coummt1` varchar(50) DEFAULT NULL,
  `count2` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `Did` (`Did`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `store` */

insert  into `store`(`id`,`Did`,`People`,`Phone`,`Telephone`,`StarTime`,`EndTime`,`Province`,`City`,`area`,`DItem`,`storename`,`card`,`img`,`remark`,`jcname`,`coummt1`,`count2`) values (6,NULL,'王五','1111','13107006762','2001-01-01',NULL,'湖南省','株洲市','石峰区','湖南省株洲市石峰区','李老师的店','43022105105642','1.jpeg','真好','好莱坞',NULL,NULL),(8,NULL,'刘礼斯','444444444444444','4',NULL,NULL,'湖南省','株洲市','石峰区','湖南省株洲市石峰区','4','4','1.jpeg','444','444',NULL,NULL),(10,NULL,'55','444444444444444','13107006762',NULL,NULL,'山东省','济南市','历下区','山东省济南市历下区','555','43022105105642','1.jpeg','5555','555',NULL,NULL),(11,NULL,'刘丽','1111','13107006762',NULL,NULL,'安徽省','合肥市','瑶海区','安徽省合肥市瑶海区','44tgg','43022105105642','1.jpeg','44','44',NULL,NULL);

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
  `SuId` int(11) NOT NULL AUTO_INCREMENT,
  `Suname` varchar(50) DEFAULT NULL,
  `Sucompany` varchar(50) DEFAULT NULL,
  `People` varchar(50) DEFAULT NULL,
  `Phone` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT NULL,
  `Province` varchar(50) DEFAULT NULL,
  `City` varchar(50) DEFAULT NULL,
  `area` varchar(50) DEFAULT NULL,
  `Street` varchar(50) DEFAULT NULL,
  `Usserid` int(11) DEFAULT NULL,
  PRIMARY KEY (`SuId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `supplier` */

insert  into `supplier`(`SuId`,`Suname`,`Sucompany`,`People`,`Phone`,`Email`,`Telephone`,`Province`,`City`,`area`,`Street`,`Usserid`) values (29,'刘礼斯','ee','刘礼斯','444444444444444','2222@qq.com','13107006762','株洲','株洲','株洲','44',NULL),(30,'刘礼斯','ee','刘礼斯','444444444444444','2222@qq.com','13107006762','株洲','株洲','株洲','44',NULL),(31,'是是是','213','123','123','123','123','株洲','株洲','株洲','1223',NULL);

/*Table structure for table `turnover` */

DROP TABLE IF EXISTS `turnover`;

CREATE TABLE `turnover` (
  `order_id` int(50) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `order_count` int(11) DEFAULT NULL,
  `order_totalMoney` float DEFAULT NULL,
  `order_payment` varchar(50) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `Ordername` varchar(50) DEFAULT NULL,
  `Phone` varchar(50) DEFAULT NULL,
  `vid` int(20) DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE,
  KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `turnover` */

insert  into `turnover`(`order_id`,`user_id`,`order_count`,`order_totalMoney`,`order_payment`,`order_date`,`Ordername`,`Phone`,`vid`) values (1,1,1,1,'1','2019-11-20','11','11',1),(2,2,2,2,'2','2019-12-07','22','22',1),(3,1,1,1,'1','2019-12-07','11','11',2),(4,2,2,2,'2','2019-12-07','22','22',2);

/*Table structure for table `turnoverdetails` */

DROP TABLE IF EXISTS `turnoverdetails`;

CREATE TABLE `turnoverdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(50) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `goods_price` double DEFAULT NULL,
  `goods_count` int(11) DEFAULT NULL,
  `order_details_discount` float DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `order_id` (`order_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `turnoverdetails` */

insert  into `turnoverdetails`(`id`,`order_id`,`goods_id`,`goods_price`,`goods_count`,`order_details_discount`) values (1,'1',1,111,22,333333),(2,'2',2,222,4444,5555);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `Userid` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Userpwd` varchar(50) NOT NULL,
  `Userphone` int(11) NOT NULL,
  PRIMARY KEY (`Userid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `user` */

insert  into `user`(`Userid`,`Username`,`Userpwd`,`Userphone`) values (1,'刘丽斯','123',123),(2,'林佳斌','123',123);

/*Table structure for table `vip` */

DROP TABLE IF EXISTS `vip`;

CREATE TABLE `vip` (
  `VID` int(11) NOT NULL AUTO_INCREMENT,
  `Vtypeid` int(11) NOT NULL,
  `code` varchar(50) NOT NULL,
  `Userid` int(11) NOT NULL,
  `Integral` varchar(50) NOT NULL,
  `Transaction` int(11) NOT NULL,
  `vname` varchar(50) DEFAULT NULL,
  `vphone` varchar(50) DEFAULT NULL,
  `vprice` varchar(50) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `commt1` varchar(50) DEFAULT NULL,
  `commt2` varchar(50) DEFAULT NULL,
  `commt3` varchar(50) DEFAULT NULL,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `area` varchar(50) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `vpwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`VID`) USING BTREE,
  KEY `Userid` (`Userid`) USING BTREE,
  KEY `Vtypeid` (`Vtypeid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `vip` */

insert  into `vip`(`VID`,`Vtypeid`,`code`,`Userid`,`Integral`,`Transaction`,`vname`,`vphone`,`vprice`,`order_id`,`commt1`,`commt2`,`commt3`,`province`,`city`,`area`,`street`,`vpwd`) values (1,1,'1',1,'1',1,'张三','19987346734','566',1,NULL,NULL,NULL,'湖南省','湘潭市','岳麓区','1008街道','123'),(2,2,'2',2,'2',2,'李四','17729387465','233',2,NULL,NULL,NULL,'北极','北京','诶见','多吃点','343');

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

insert  into `vtype`(`VTid`,`VTname`,`VtDiscount`,`vrule`,`maxmoney`,`validityData`,`bz1`,`bz2`,`bz3`,`bz4`) values (7,'vip',0.8,0,1,0,NULL,NULL,NULL,NULL),(8,'svip',1,0,1111,0,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
