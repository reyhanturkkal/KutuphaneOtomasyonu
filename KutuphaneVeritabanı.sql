-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: lib_management
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS books;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE books (
  book_id int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  author varchar(50) DEFAULT NULL,
  `page` int DEFAULT NULL,
  category_name varchar(50) DEFAULT NULL,
  added_by_user_id int DEFAULT NULL,
  PRIMARY KEY (book_id),
  KEY added_by_user_id (added_by_user_id),
  CONSTRAINT books_ibfk_1 FOREIGN KEY (added_by_user_id) REFERENCES users (user_id)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES books WRITE;
/*!40000 ALTER TABLE books DISABLE KEYS */;
INSERT INTO books VALUES (1,'YASLI ADAM VE DENIZ','ERNEST HEMINGWAY',115,'ROMAN',12),(2,'YALNIZ EFE','ÖMER SEYFETTIN',127,'KURGU',39),(3,'VATAN YAHUT SILISTRE','NAMIK KEMAL',80,'KURGU',39),(4,'ÜÇ SILAHSÖRLER','ALEXANDRE DUMAS',80,'TARIH',37),(5,'TOM SAWYER','MARK TWAIN',128,'Roman',14),(6,'SERMIN','TEVFIK FIKRET',79,'Roman',28),(7,'80 GÜNDE DEVRI ALEM','JULES VERNE',81,'Macera',43),(8,'ROBIN HOOD','HOWARD PYLE',80,'Roman',9),(9,'POLLYANNA','ELEANOR H. PORTER',128,'Roman',45),(10,'PINOKYO','C. COLLODI',142,'Roman',45),(11,'PETER PAN','J.M. BARRIE',144,'Macera',7),(12,'ÖMER\'IN ÇOÇUKLUGU','MUALLIM NACI',62,'Roman',34),(13,'OLIVER TWIST','CHARLES DICKENS',96,'Roman',22),(14,'MUTLU PRENS','OSCAR WILDE',96,'Masal',47),(15,'GULIVER\'IN GEZILERI','JONATTAN SWIFT',94,'Roman',24),(16,'HEIDI','JOHANNA SPYRI',128,'Roman',24),(17,'DEFINE ADASI','ROBERT L. STEVENSON',120,'Macera',12),(18,'DEDE KORKUT MASALLARI','DEDE KORKUT',111,'Masal',22),(19,'ALTIN ISIK','ZIYA GÖKALP',63,'Öykü',9),(20,'ANDERSEN MASALLARI','ANDERSEN',72,'Masal',37),(23,'ÇALI KUSU','H.EDIP ADIVAR',406,'Kurgu',9),(24,'GENIS ZAMANLAR','AYSE KULIN',114,'Hikaye',14),(25,'YAPRAK DÖKÜMÜ','R.NURI GÜNTEKIN',134,'Roman',43),(26,'INTIBAH','NAMIK KEMAL',176,'Roman',37),(28,'DON KISOT','CERVANTES',320,'Kurgu',37),(29,'VADIDEKI ZAMBAK','BALZAK',366,'Kurgu',11),(30,'SEMERKANT','AMIN MAALOUF',318,'Roman',43),(31,'IKI SEHRIN HIKAYESI','CHARLES DICKENS',399,'Hikaye',18),(32,'KUMARBAZ','DOSTOYEVSKI',160,'Roman',5),(33,'ÖLÜCANLAR','GOGOL',319,'Roman',16),(34,'ANA','GORKI',344,'Roman',22),(35,'ROBIN HOOD','HOWARD PYLE',80,'ROMAN',32),(36,'NOTRE DAME’IN KAMBURU','VICTOR HUGO',408,'Roman',45),(38,'SOKRATES’IN SAVUNMASI','PLATON',129,'Felsefe',43),(39,'BABALAR VE OGULLAR','TURGENYEV',287,'Roman',12),(40,'CIMRI','MOLIERE',120,'Drama',12),(41,'DIRILIS','TOLSTOY',284,'Roman',26),(42,'SAVAS VE BARIS II','TOLSTOY',768,'Tarih',43),(44,'MOR SALKIMLI EV','H.EDIP ADIVAR',301,'Gezi',28),(45,'KILIÇ YARASI GIBI','H.EDIP ADIVAR',344,'Tarih',14),(46,'SINEKLI BAKKAL','H.EDIP ADIVAR',455,'Roman',41),(47,'IÇIMIZDE BIR YER','AHMET ALTAN',158,'Roman',24),(48,'ATESTEN GÖMLEK','H.EDIP ADIVAR',221,'Kurgu',30),(49,'HANDAN','H.EDIP ADIVAR',216,'Kurgu',37),(50,'SARI ZEYBEK','CAN DÜNDAR',140,'Biyografi',12),(51,'YARIM HAZIRAN','CAN DÜNDAR',155,'Roman',18),(53,'MURTAZA','ORHAN KEMAL',356,'Roman',11),(54,'RUH ADAM','HÜSEYIN NIHAL ATSIZ',320,'Roman',41),(55,'Uğultulu Tepeler','Emily Bronte',416,'Roman',NULL);
/*!40000 ALTER TABLE books ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loans`
--

DROP TABLE IF EXISTS loans;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE loans (
  loan_id int NOT NULL AUTO_INCREMENT,
  book_id int DEFAULT NULL,
  user_id int DEFAULT NULL,
  loan_date date DEFAULT NULL,
  return_date date DEFAULT NULL,
  PRIMARY KEY (loan_id),
  KEY user_id (user_id),
  KEY loans_ibfk_1 (book_id),
  CONSTRAINT loans_ibfk_2 FOREIGN KEY (user_id) REFERENCES users (user_id)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loans`
--

LOCK TABLES loans WRITE;
/*!40000 ALTER TABLE loans DISABLE KEYS */;
INSERT INTO loans VALUES (1,1,5,'2023-12-19','2024-01-09'),(2,35,13,'2023-12-20','2024-01-15'),(3,12,22,'2023-12-22','2024-01-12'),(4,20,8,'2023-12-25','2024-01-14'),(5,28,29,'2023-12-27','2024-01-20'),(6,32,17,'2023-12-29','2024-01-09'),(7,23,12,'2023-12-30','2024-01-10'),(8,35,21,'2024-01-01','2024-01-25'),(9,38,9,'2024-01-03','2024-01-13');
/*!40000 ALTER TABLE loans ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS reservations;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE reservations (
  reservation_id int NOT NULL,
  book_id int DEFAULT NULL,
  user_id int DEFAULT NULL,
  reservation_date date DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (reservation_id),
  KEY book_id (book_id),
  KEY user_id (user_id),
  CONSTRAINT reservations_ibfk_2 FOREIGN KEY (user_id) REFERENCES users (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES reservations WRITE;
/*!40000 ALTER TABLE reservations DISABLE KEYS */;
INSERT INTO reservations VALUES (1,35,41,'2023-12-19',NULL),(2,18,23,'2023-12-20',NULL),(3,25,13,'2023-12-21',NULL),(4,40,22,'2023-12-25',NULL),(5,46,18,'2023-12-26',NULL),(6,54,35,'2023-12-28',NULL),(7,42,26,'2023-12-31',NULL),(8,48,23,'2024-01-02',NULL),(9,25,19,'2024-01-04',NULL),(10,36,37,'2024-01-06',NULL),(11,33,6,'2024-01-08',NULL),(12,30,11,'2024-01-10',NULL);
/*!40000 ALTER TABLE reservations ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviews`
--

DROP TABLE IF EXISTS reviews;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE reviews (
  review_id int NOT NULL,
  book_id int DEFAULT NULL,
  user_id int DEFAULT NULL,
  review_text text,
  rating int DEFAULT NULL,
  bookName varchar(255) DEFAULT NULL,
  userName varchar(255) DEFAULT NULL,
  PRIMARY KEY (review_id),
  KEY book_id (book_id),
  KEY user_id (user_id),
  CONSTRAINT reviews_ibfk_2 FOREIGN KEY (user_id) REFERENCES users (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviews`
--

LOCK TABLES reviews WRITE;
/*!40000 ALTER TABLE reviews DISABLE KEYS */;
INSERT INTO reviews VALUES (1,35,15,'Harika bir kitap!',4,'ROBIN HOOD','Osman Akyol'),(2,18,24,'Çok ilginç bir hikaye.',3,'DEDE KORKUT MASALLARI','Ercan ılmaz'),(3,25,44,'Okurken keyif aldım.',5,'YAPRAK DÖKÜMÜ','Gülşah Erdem'),(4,20,7,'Çok etkileyici bir kitap.',5,'ANDERSEN MASALLARI','Ayse Gül'),(5,28,29,'Harika bir roman!',4,'DON KISOT','Berkay Özdemir'),(6,32,16,'Beklentilerimi karşılamadı.',2,'KUMARBAZ','Zehra Öz'),(7,23,3,'Muhteşem bir kurgu!',5,'ÇALI KUSU','Demir Akyol'),(8,35,20,'Çok sürükleyici bir kitap.',4,'ROBIN HOOD','Nazlı Kara'),(9,38,8,'Harika bir tarih kitabı.',4,'SOKRATES’IN SAVUNMASI','Cengiz Köy'),(10,42,24,'Beklentilerimi aştı!',5,'SAVAS VE BARIS II','Ercan ılmaz'),(11,44,17,'Çok etkileyici bir gezi yazısı.',4,'MOR SALKIMLI EV','Murat Gül'),(12,51,22,'Ortalama bir roman.',3,'YARIM HAZIRAN','Mehmet Kara');
/*!40000 ALTER TABLE reviews ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS users;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE users (
  user_id int NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  user_type varchar(20) NOT NULL,
  telefon varchar(15) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES users WRITE;
/*!40000 ALTER TABLE users DISABLE KEYS */;
INSERT INTO users VALUES (1,'Kerem Tepetepe','s0k9p3h7','Ögrenci','555482607868','user1@example.com'),(2,'Ece Naz','f4u2w8x1','Personel','55525272722','user2@example.com'),(3,'Demir Akyol','j6g5k9q2','Ögrenci','555678540035','user3@example.com'),(4,'Mehmet Ay','a9z1x3b7','Ögrenci','555316882042','user4@example.com'),(5,'Fatma Sah','r5f2d9e6','Personel','555548790135','user5@example.com'),(6,'Emre Kara','b7m4n1p8','Ögrenci','555793304582','user6@example.com'),(7,'Ayse Gül','d9q8i2s6','Personel','555320152537','user7@example.com'),(8,'Cengiz Köy','c3v7t1y6','Ögrenci','555220848968','user8@example.com'),(9,'Selman Kurt','l5o3w9z1','Personel','555143787261','user9@example.com'),(10,'Asli Öz','t7k4r1u9','Ögrenci','55556389431','user10@example.com'),(11,'Fatih Bal','h8e2d6s5','Öğretim Elemanı','555850585404','user11@example.com'),(12,'Neslihan Bul','v9a1s3x7','Personel','55583758759','user12@example.com'),(13,'Berk Cengiz','e2n5m7q1','Ögrenci','555867037613','user13@example.com'),(14,'Elif Kaya','x6o3y9t2','Personel','55583911821','user14@example.com'),(15,'Osman Akyol','p1g4j9r3','Ögrenci','555818446296','user15@example.com'),(16,'Zehra Öz','u7w5v9f3','Personel','555840496047','user16@example.com'),(17,'Murat Gül','k9l3z6x1','Ögrenci','555747141378','user17@example.com'),(18,'Ayşe Yılmaz','y2h8c1o5','Personel','555214218782','user18@example.com'),(19,'Emre Uçar','w4t1p7q9','Ögrenci','555829669806','user19@example.com'),(20,'Nazlı Kara','z6x2b8n3','Personel','555505692718','user20@example.com'),(21,'Hatice Aydin','m7s3e9g2','Ögrenci','55539454200','user21@example.com'),(22,'Mehmet Kara','i5r1p9k3','Personel','555680192878','user22@example.com'),(23,'Sema Tekin','o3u8f6v1','Ögrenci','555282601820','user23@example.com'),(24,'Ercan ılmaz','n1z7d4a8','Personel','555372430499','user24@example.com'),(25,'Gizem Uzun','f2x6h4s1','Ögrenci','55514347064','user25@example.com'),(26,'Ali Turan','r8q7j5d2','Personel','555954443855','user26@example.com'),(27,'Deniz Koç','b5v1n9w6','Ögrenci','555729178113','user27@example.com'),(28,'Aysun Akar','a9e3c6g4','Personel','555782559033','user28@example.com'),(29,'Berkay Özdemir','q4k1u8h2','Ögrenci','555725260856','user29@example.com'),(30,'Elif Erdoğan','c7y5i3m8','Personel','555278627212','user30@example.com'),(31,'Cemil Şahin','l9p2o6x4','Ögrenci','555217353523','user31@example.com'),(32,'Selma Kaya','d4m6t8y2','Personel','555250886013','user32@example.com'),(33,'Ufuk Kurt','g1w7r5v3','Ögrenci','555602369524','user33@example.com'),(34,'Selin Çelik','t6s4b9k2','Personel','555259189612','user34@example.com'),(35,'Murat Yıldız','u8z2o6n3','Ögretim Elemanı','555488839520','user35@example.com'),(36,'Emine Yılmaz','e3q1x7w5','Ögretim Elemanı','555666628796','user36@example.com'),(37,'Ahmet Kaya','o5d8h2j6','Personel','555866625450','user37@example.com'),(38,'Yasemin Demir','s9i6v3t7','Ögrenci','555333240893','user38@example.com'),(39,'Hakan Yıldırım','p4g7l9u1','Personel','55566328149','user39@example.com'),(40,'Ayse Aydın','x1c5r8b2','Ögretim Elemanı','555331918095','user40@example.com'),(41,'Serdar Arslan','y9n2f4z8','Personel','555460606060','user41@example.com'),(42,'Fatma Öztürk','w3u7a5o2','Ögrenci','555307276046','user42@example.com'),(43,'Ömer Kocaman','v5j6m9q3','Personel','555154562080','user43@example.com'),(44,'Gülşah Erdem','z2t8p7e6','Ögrenci','555850982294','user44@example.com'),(45,'Cem Demir','m4h9y1i8','Personel','555791225260','user45@example.com'),(46,'Sevil Güler','h7l3w6f9','Ögrenci','555403179452','user46@example.com'),(47,'Hasan Aydın','n6b4k2s8','Personel','555642221509','user47@example.com'),(48,'Murat Efe Coşar','k1f8x7g3','Ögretim Elemanı','5551569219','user48@example.com'),(49,'Esma Güler','i3o9y6c4','Ögretim Elemanı','55581181602','user49@example.com'),(50,'Aslı Uzuner','j8r5d2l9','Personel','555401200384','user50@example.com'),(51,'Yasin Özbek','g4q6n9t2','Ögrenci','555762457144','user51@example.com'),(52,'Hakan Ata Kılıç','c9s3v2o8','Personel','555608684599','user52@example.com'),(53,'Atiye Duman','b1a5u7p9','Ögretim Elemanı','555756051593','user53@example.com'),(54,'Serhat Demirören','q7e6z1h8','Personel','555954204199','user54@example.com'),(55,'Reyhan Türkkal','a3m8i2l9','Ögrenci','555502866249','user55@example.com'),(56,'Ömer Faruk Yalçınkaya','x9g7f3n4','Personel','555651718681','user56@example.com'),(57,'Pelin Üstünel','p2k6w4o8','Ögrenci','555749994687','user57@example.com'),(58,'Cemre Aydoğdu','l7y3j9t5','Personel','555794817424','user58@example.com'),(59,'Hüseyin Aktaş','t4r2c8v7','Ögrenci','555724103089','user59@example.com'),(60,'Nazlı Nurdan','u5o1z9b3','Personel','555236063203','user60@example.com'),(61,'Huseyin Aktasbak','a1s2d3f4','personel','5333322221','user65@gmail.com');
/*!40000 ALTER TABLE users ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-08  2:12:22
