-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: test
-- ------------------------------------------------------
-- Server version	5.7.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `TP_SCORE`
--

DROP TABLE IF EXISTS `TP_SCORE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TP_SCORE` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `studentId` int(11) DEFAULT NULL COMMENT '学员ID',
  `subjectName` varchar(20) DEFAULT NULL COMMENT '科目名称',
  `score` float DEFAULT NULL COMMENT '考试成绩',
  `examTime` datetime DEFAULT NULL COMMENT '考试时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TP_SCORE`
--

LOCK TABLES `TP_SCORE` WRITE;
/*!40000 ALTER TABLE `TP_SCORE` DISABLE KEYS */;
INSERT INTO `TP_SCORE` VALUES (1,1,'语文',70,'2015-02-26 18:11:39'),(2,1,'数学',88.8,'2015-03-26 18:11:50'),(3,1,'英语',76,'2015-04-26 18:11:56'),(4,1,'历史',96,'2015-05-26 18:12:02'),(5,2,'语文',84,'2015-02-26 18:11:39'),(6,2,'数学',56,'2015-03-26 18:11:50'),(7,2,'英语',86,'2015-04-26 18:11:56'),(8,2,'历史',45,'2015-05-26 18:12:02'),(9,3,'语文',87,'2015-02-26 18:11:39'),(10,3,'数学',98,'2015-03-26 18:11:50'),(11,3,'英语',67,'2015-04-26 18:11:56'),(12,3,'历史',86,'2015-05-26 18:12:02'),(13,4,'语文',97,'2015-02-26 18:11:39'),(14,4,'数学',68,'2015-03-26 18:11:50'),(15,4,'英语',79,'2015-04-26 18:11:56'),(16,4,'历史',83,'2015-05-26 18:12:02'),(17,5,'语文',92,'2015-02-26 18:11:39'),(18,5,'数学',93,'2015-03-26 18:11:50'),(19,5,'英语',65,'2015-04-26 18:11:56'),(20,5,'历史',88,'2015-05-26 18:12:02'),(21,6,'语文',87,'2015-01-05 18:48:48'),(22,6,'数学',67,'2015-01-05 18:48:48'),(24,6,'历史',88,'2015-01-05 18:48:48');
/*!40000 ALTER TABLE `TP_SCORE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TP_STUDENT`
--

DROP TABLE IF EXISTS `TP_STUDENT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TP_STUDENT` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `score_sum` varchar(20) DEFAULT NULL COMMENT '总成绩',
  `score_avg` varchar(20) DEFAULT NULL COMMENT '平均成绩',
  `age` int(11) DEFAULT NULL COMMENT '1男0女',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TP_STUDENT`
--

LOCK TABLES `TP_STUDENT` WRITE;
/*!40000 ALTER TABLE `TP_STUDENT` DISABLE KEYS */;
INSERT INTO `TP_STUDENT` VALUES (1,'小明','355','84',18),(2,'小王','187','62.3',19),(4,'柱子','230','76.7',19),(5,'大毛','300','80',18),(6,'亮子','350','80',19),(18,'莉莉','288.5','88.5',20);
/*!40000 ALTER TABLE `TP_STUDENT` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-25 15:35:55
