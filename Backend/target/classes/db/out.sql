-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: filmticket
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cinema` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(2048) DEFAULT NULL,
  `image` text,
  `location` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL,
  `rating` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES (1,'sdafsdf','/Cinema/1.jpg','闵行区吴泾镇紫星路488弄129号3层','AMG海上明珠影城',5),(2,'dsaf','/Cinema/2.jpg','闵行区浦江镇永跃路360号浦江万达广场4层','万达影城',4),(3,'sdf','/Cinema/3.jpg','闵行区漕宝路3366号上海七宝万科广场5层L501单元\n\n','CGV影城',5),(4,'sadfs','/Cinema/4.jpg','闵行区七宝镇七莘路1809号红点城3层L3-120室','DFC影城',3);
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `film`
--

DROP TABLE IF EXISTS `film`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `film` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(2048) DEFAULT NULL,
  `image` text,
  `name` varchar(128) NOT NULL,
  `price` double NOT NULL,
  `release_date` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `film`
--

LOCK TABLES `film` WRITE;
/*!40000 ALTER TABLE `film` DISABLE KEYS */;
INSERT INTO `film` VALUES (1,'2023年顶级大银幕视觉盛宴来袭！时隔5年，变形金刚震撼归来！故事重返上世纪90年代，终极反派宇宙大帝从天而降，驱使以天灾为首的恐惧兽掀起地球危机。绝境之中，蛰伏许久的巨无霸终觉醒，联合汽车人变形出发！一场前所未有的史诗决战即将上演！','/Film/1.jpg','变形金刚:超能勇士崛起',11,'1'),(2,'影片讲述全民期待了27年的全国大赛。 宫城良田、三井寿、流川枫、樱木花道和赤木刚宪终于站在全国大赛的赛场，代表湘北高中与日本最强球队山王工业展开激烈对决。上半场两队势均力敌，下半场在山王盯人战术的高压之下，湘北节节落败。 面对强大的对手和几乎不可能追回的悬殊分差，湘北五人组能够再一次践行永不言弃的精神，突破自我团结一致，在这场生死大战中反败为胜吗？','/Film/2.jpg','灌篮高手',10,'1'),(3,'小号一响、热泪盈眶，全被治愈，被爱与美好包围，这就是独一无二的宫崎骏的《天空之城》。2023年夏天，这个儿童节，疗愈鼓舞所有人的机会只此一次！让所有人孩子与曾经的孩子重享美好。','/Film/3.jpg','天空之城',10,'1'),(4,'银河护卫队全员回归，寻觅身世记忆，迎战全新危机，携手踏上最后一次旅程。','/Film/4.jpg','银河护卫队',10,'1'),(5,'暑期劲燃现实题材佳作！根据真实事件改编，王宝强六年打磨，动情演绎震撼人心！电影讲述了向腾辉（王宝强 饰）倾注心血想把当地无人照料的孩子培养成才，这让生活本没有出路的孩子们看到了一丝通向未来的曙光。然而，随着往日的表演视频被爆出，这些“残忍、血腥”的画面刺激了不明真相的人们的神经。一夜之间，舆论开始发酵。向腾辉的生活、孩子们的前途都陷入到人们以善良为名编织的大网中，让他们难以挣脱，重回泥沼，关于未来，他们的“出路”又将在哪……','/Film/5.jpg','八角笼中',10,'1'),(6,'影帝影后绝赞演技，年度爱情片神作，带你领悟爱情真谛。你是否想过自己会如何老去？四个花甲老人，两段迟暮之恋，他们的爱善良而纯粹、浪漫又浓烈。在生命这段有限的旅程里，趁还来得及，我要对你说声“我爱你！”。','/Film/6.jpg','我爱你',11,'1'),(7,'超两千万人认证的高分喜剧！爆笑之外收获燃泪感动！乔杉、范丞丞、马丽、张婧仪、常远、田雨、尹正笑闹囧途！车队大佬周东海（乔杉 饰）和老婆霍梅梅（马丽 饰）阴差阳错地与女儿周微雨（张婧仪 饰）及女儿的男朋友万一帆（范丞丞 饰）同行自驾，踏上人生路不熟的探亲之旅，周东海决定借此机会给准女婿来一场全方位无死角的考察，万一帆也用生命演绎了什么叫做教科书级翻车。一路上先后遭遇周东海死对头“添堵专业户”贾主任（田雨 饰）的房车事故、微雨“青梅竹马”光子(常远 饰)的“野鸡”山庄醉酒闹剧、捉拿公路贼团“油耗子”的围堵大战，鸡飞狗跳的探亲之旅窘态百出，爆笑不断！\n演职人员','/Film/7.jpg','人生路不熟',10,'1'),(8,'巴里用自己的超能力重返过去，想要改变历史、拯救自己的家人，然而他的所作所为，也在无意间改变了未来。在这个新的未来里，佐德将军回归，并威胁要毁灭世界。巴里孤立无援，除非他能劝动一位非常不同且已隐退的蝙蝠侠重出江湖，并拯救被囚禁的氪星人——尽管这位并不是他所熟悉的超人。最终，为了拯救他身处这个世界，并回到他熟知的未来，巴里惟一的希望就是为命运而极速狂奔。不过，即使巴里做出最终极的牺牲……他真的能让整个宇宙都重归正轨吗？','/Film/8.jpg','闪电侠',10,'1'),(9,'奥斯卡最佳动画长片续作《蜘蛛侠：纵横宇宙》呈现了脑洞大开、潮流酷炫的视听风格。影片讲述了新生代蜘蛛侠迈尔斯携手蜘蛛格温，穿越多元宇宙踏上更宏大的冒险征程的故事。面临每个蜘蛛侠都会失去至亲的宿命，迈尔斯誓言打破命运魔咒，找到属于自己的英雄之路。而这个决定和蜘蛛侠2099所领军的蜘蛛联盟产生了极大冲突，一场以一敌百的蜘蛛侠大战即将拉响！','/Film/9.jpg','蜘蛛侠：纵横宇宙',10,'1'),(10,'影片以一段挑战极限的爱情故事带观众走进元素城居民的生活。在四大元素风、火、水、土共同生活又泾渭分明的世界里，来自水元素的男生渡阿波（Wade）和来自火元素的女孩炉小焰（Ember）巧遇邂逅并暗生情愫，但面对“水火不相容”的客观事实和各大元素之间泾渭分明的悠久传统，两位主角将如何跨越隔阂，深入彼此的内心？一连串妙趣横生又感人肺腑的故事由此展开。','/Film/10.jpg','疯狂元素城',10,'1');
/*!40000 ALTER TABLE `film` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hall`
--

DROP TABLE IF EXISTS `hall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hall` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cinema_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKte75ikgkdmhfutuupvx2lhknr` (`cinema_id`),
  CONSTRAINT `FKte75ikgkdmhfutuupvx2lhknr` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hall`
--

LOCK TABLES `hall` WRITE;
/*!40000 ALTER TABLE `hall` DISABLE KEYS */;
/*!40000 ALTER TABLE `hall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_item`
--

DROP TABLE IF EXISTS `order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_item` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `order_id` bigint DEFAULT NULL,
  `screening_id` bigint NOT NULL,
  `seat_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt4dc2r9nbvbujrljv3e23iibt` (`order_id`),
  KEY `FKakhedrmo3fgwuauplj7xaggc` (`screening_id`),
  KEY `FKoxqjd59fosi5kqvv9jd0vtlk3` (`seat_id`),
  CONSTRAINT `FKakhedrmo3fgwuauplj7xaggc` FOREIGN KEY (`screening_id`) REFERENCES `screening` (`id`),
  CONSTRAINT `FKoxqjd59fosi5kqvv9jd0vtlk3` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`id`),
  CONSTRAINT `FKt4dc2r9nbvbujrljv3e23iibt` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_item`
--

LOCK TABLES `order_item` WRITE;
/*!40000 ALTER TABLE `order_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `purchase_time` datetime(6) NOT NULL,
  `total_price` double NOT NULL,
  `user_id` bigint DEFAULT NULL,
  `screening_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKel9kyl84ego2otj2accfd8mr7` (`user_id`),
  KEY `FKdnbmbc4u1aqn49xexnclln561` (`screening_id`),
  CONSTRAINT `FKdnbmbc4u1aqn49xexnclln561` FOREIGN KEY (`screening_id`) REFERENCES `screening` (`id`),
  CONSTRAINT `FKel9kyl84ego2otj2accfd8mr7` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screening`
--

DROP TABLE IF EXISTS `screening`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screening` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `end_time` datetime(6) NOT NULL,
  `price` double NOT NULL,
  `start_time` datetime(6) NOT NULL,
  `cinema_id` bigint DEFAULT NULL,
  `film_id` bigint DEFAULT NULL,
  `hall_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlf8ol40h1l4kfd6qyjkgf5xy0` (`cinema_id`),
  KEY `FKr5f8ggthy4oigd31nbq91csww` (`film_id`),
  KEY `FKmabwib04cmaxjgf252iimc18e` (`hall_id`),
  CONSTRAINT `FKlf8ol40h1l4kfd6qyjkgf5xy0` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`),
  CONSTRAINT `FKmabwib04cmaxjgf252iimc18e` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`),
  CONSTRAINT `FKr5f8ggthy4oigd31nbq91csww` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screening`
--

LOCK TABLES `screening` WRITE;
/*!40000 ALTER TABLE `screening` DISABLE KEYS */;
/*!40000 ALTER TABLE `screening` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `seat_column` int NOT NULL,
  `seat_row` int NOT NULL,
  `hall_id` bigint NOT NULL,
  `is_sold` bit(1) NOT NULL,
  `screening_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKg6ltooo0e2ddvo624h3nc8jmb` (`hall_id`),
  KEY `FKgh6chbbs5wskb6sphn5royfas` (`screening_id`),
  CONSTRAINT `FKg6ltooo0e2ddvo624h3nc8jmb` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`),
  CONSTRAINT `FKgh6chbbs5wskb6sphn5royfas` FOREIGN KEY (`screening_id`) REFERENCES `screening` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `avatar` varchar(128) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `phone` varchar(128) DEFAULT NULL,
  `username` varchar(128) NOT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'/User/1.jpg','','','','user1',NULL),(2,'/User/2.jpg','','','','user2',NULL),(3,'/User/3.jpg','','','','user3',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_auth`
--

DROP TABLE IF EXISTS `user_auth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_auth` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(128) NOT NULL,
  `username` varchar(128) NOT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8pefkt453l7vq56pt2qoo5h4p` (`user_id`),
  CONSTRAINT `FK8pefkt453l7vq56pt2qoo5h4p` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_auth`
--

LOCK TABLES `user_auth` WRITE;
/*!40000 ALTER TABLE `user_auth` DISABLE KEYS */;
INSERT INTO `user_auth` VALUES (1,'12345','user1',1),(2,'123456','user2',2),(3,'123456','user3',3);
/*!40000 ALTER TABLE `user_auth` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-17 12:33:01
