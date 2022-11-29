-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: thuhocphisv1
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

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
-- Table structure for table `dangky`
--

DROP TABLE IF EXISTS `dangky`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dangky` (
  `masv` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mamh` int(100) NOT NULL,
  `thoigian` datetime NOT NULL,
  `ghichu` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dangky`
--

LOCK TABLES `dangky` WRITE;
/*!40000 ALTER TABLE `dangky` DISABLE KEYS */;
INSERT INTO `dangky` VALUES ('5',1,'2022-06-02 16:39:45','');
/*!40000 ALTER TABLE `dangky` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hoadon` (
  `maHD` int(20) NOT NULL AUTO_INCREMENT,
  `soTienNop` int(100) NOT NULL,
  `hocky` int(20) NOT NULL,
  `ngayNop` date NOT NULL,
  `masv` int(100) NOT NULL,
  PRIMARY KEY (`maHD`),
  KEY `masv` (`masv`),
  CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`masv`) REFERENCES `sinhvien` (`masv`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
INSERT INTO `hoadon` VALUES (5,672000000,1,'2022-06-02',5),(10,1344000000,1,'2022-06-02',5),(15,12600000,1,'2022-06-02',1),(20,100000,4,'2022-06-02',1);
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khoa`
--

DROP TABLE IF EXISTS `khoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `khoa` (
  `makhoa` char(100) NOT NULL,
  `tenkhoa` varchar(500) NOT NULL,
  `ngaythanhlap` date NOT NULL,
  PRIMARY KEY (`makhoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khoa`
--

LOCK TABLES `khoa` WRITE;
/*!40000 ALTER TABLE `khoa` DISABLE KEYS */;
INSERT INTO `khoa` VALUES ('CK','Cơ Khí','2022-05-18'),('IT','Công nghệ thông tin','2005-05-18'),('OO','Ô Tô','2022-05-15');
/*!40000 ALTER TABLE `khoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lophoc`
--

DROP TABLE IF EXISTS `lophoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lophoc` (
  `tenlop` varchar(500) NOT NULL,
  `gvcn` varchar(500) NOT NULL,
  `sosv` int(10) NOT NULL,
  `makhoa` char(100) NOT NULL,
  `malop` int(100) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`malop`),
  KEY `makhoa` (`makhoa`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lophoc`
--

LOCK TABLES `lophoc` WRITE;
/*!40000 ALTER TABLE `lophoc` DISABLE KEYS */;
INSERT INTO `lophoc` VALUES ('Cơ khí 1','Linh',2,'CK',1),('Cơ khí 2','An',1,'CK',2);
/*!40000 ALTER TABLE `lophoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monhoc` (
  `mamh` int(100) NOT NULL,
  `tenmh` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sotin` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sotien` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc`
--

LOCK TABLES `monhoc` WRITE;
/*!40000 ALTER TABLE `monhoc` DISABLE KEYS */;
INSERT INTO `monhoc` VALUES (1,'Lập Trình Java','3','1400000');
/*!40000 ALTER TABLE `monhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sinhvien` (
  `hoten` varchar(500) NOT NULL,
  `ngaysinh` date NOT NULL,
  `gioitinh` char(10) NOT NULL,
  `quequan` varchar(500) NOT NULL,
  `sdt` int(100) NOT NULL,
  `gmail` varchar(50) NOT NULL,
  `malop` char(100) NOT NULL,
  `congno` int(100) NOT NULL,
  `password` varchar(500) NOT NULL,
  `masv` int(100) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`masv`),
  KEY `malop` (`malop`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES ('Hùng','2001-01-01','Nam','PT',866,'hung@gmail.com','-1',-100000,'Hùng2020',1),('Nam','2001-12-12','Nam','HN',12345678,'nam@gmail.com','-1',12600000,'Nam2020',2),('Hiếu','2001-01-01','Nam','HN',12343432,'hieu@gmail.com','-1',12600000,'Hiếu2020',3),('Đông','2001-01-01','Nam','HT',123123123,'dong@gmail.com','1',12600000,'Đông2020',4),('1','2022-06-02','Nam','2',1,'2','1',0,'12020',5),('1','2001-01-01','Nam','1',1,'1','-1',12600000,'12020',6),('1','2001-01-01','Nam','1',1,'1','-1',12600000,'12020',7),('1','2001-01-01','Nam','1',1,'1','-1',12600000,'12020',8),('1','2001-01-01','Nam','1',1,'1','2',13601000,'12020',9);
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sohocphi`
--

DROP TABLE IF EXISTS `sohocphi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sohocphi` (
  `stt` int(100) NOT NULL AUTO_INCREMENT,
  `hocky` int(10) NOT NULL,
  `namhoc` int(10) NOT NULL,
  `tungay` date NOT NULL,
  `denngay` date NOT NULL,
  `thongbao` varchar(500) NOT NULL,
  PRIMARY KEY (`stt`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sohocphi`
--

LOCK TABLES `sohocphi` WRITE;
/*!40000 ALTER TABLE `sohocphi` DISABLE KEYS */;
INSERT INTO `sohocphi` VALUES (1,1,2020,'2022-05-11','2022-05-20','Thu học phí đầu năm'),(2,2,2020,'2021-05-19','2022-05-19','Thu Công nợ sinh viên vay vốn');
/*!40000 ALTER TABLE `sohocphi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-02 17:37:07
