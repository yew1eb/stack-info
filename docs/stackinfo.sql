-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: stackinfo
-- ------------------------------------------------------
-- Server version	5.5.48

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
-- Table structure for table `t_activecode`
--

DROP TABLE IF EXISTS `t_activecode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_activecode` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL,
  `code` varchar(64) NOT NULL,
  `type` varchar(10) NOT NULL COMMENT 'signup:注册 reset:修改密码',
  `is_use` tinyint(2) NOT NULL DEFAULT '0',
  `c_time` int(10) NOT NULL COMMENT '创建时间',
  KEY `id` (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_comment`
--

DROP TABLE IF EXISTS `t_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_comment` (
  `cid` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL COMMENT '评论人uid',
  `to_uid` int(10) NOT NULL COMMENT '被评论人uid',
  `tid` int(10) NOT NULL COMMENT '帖子id',
  `content` text CHARACTER SET utf8mb4 NOT NULL COMMENT '评论内容',
  `device` varchar(255) DEFAULT 'pc' COMMENT '设备',
  `c_time` int(10) NOT NULL COMMENT '评论时间',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_favorite`
--

DROP TABLE IF EXISTS `t_favorite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_favorite` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) NOT NULL COMMENT 'topic:帖子 node:节点',
  `uid` int(10) NOT NULL,
  `event_id` int(10) NOT NULL,
  `c_time` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_link`
--

DROP TABLE IF EXISTS `t_link`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_link` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `url` varchar(100) NOT NULL,
  `c_time` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_node`
--

DROP TABLE IF EXISTS `t_node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_node` (
  `nid` int(10) NOT NULL AUTO_INCREMENT,
  `pid` int(10) NOT NULL DEFAULT '0' COMMENT '父节点id',
  `title` varchar(30) DEFAULT NULL COMMENT '节点名称',
  `description` varchar(255) DEFAULT NULL COMMENT '节点描述',
  `slug` varchar(50) NOT NULL COMMENT '节点英文简写',
  `pic` varchar(100) DEFAULT NULL COMMENT '节点图片',
  `topics` int(10) DEFAULT '0' COMMENT '帖子数',
  `c_time` int(10) NOT NULL COMMENT '创建时间',
  `u_time` int(10) NOT NULL,
  `is_del` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_notice`
--

DROP TABLE IF EXISTS `t_notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_notice` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `type` varchar(10) NOT NULL,
  `uid` int(10) NOT NULL,
  `to_uid` int(10) NOT NULL,
  `event_id` int(10) NOT NULL,
  `is_read` tinyint(1) NOT NULL DEFAULT '0',
  `c_time` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_openid`
--

DROP TABLE IF EXISTS `t_openid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_openid` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(50) DEFAULT NULL,
  `open_id` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `create_time` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `u_openid` (`open_id`,`type`,`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_settings`
--

DROP TABLE IF EXISTS `t_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_settings` (
  `skey` varchar(50) NOT NULL,
  `svalue` text,
  PRIMARY KEY (`skey`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_topic`
--

DROP TABLE IF EXISTS `t_topic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_topic` (
  `tid` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL COMMENT '发布人',
  `nid` int(10) NOT NULL COMMENT '所属节点',
  `title` varchar(50) CHARACTER SET utf8mb4 DEFAULT '' COMMENT '帖子标题',
  `content` text CHARACTER SET utf8mb4 COMMENT '帖子内容',
  `is_top` tinyint(2) DEFAULT '0' COMMENT '是否置顶',
  `is_essence` tinyint(2) DEFAULT '0' COMMENT '是否精华帖',
  `weight` double(10,2) DEFAULT '0.00' COMMENT '帖子权重',
  `c_time` int(10) NOT NULL COMMENT '帖子创建时间',
  `u_time` int(10) NOT NULL COMMENT '最后更新时间',
  `status` tinyint(2) NOT NULL DEFAULT '1' COMMENT '1:正常 2:删除',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_topiccount`
--

DROP TABLE IF EXISTS `t_topiccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_topiccount` (
  `tid` int(10) NOT NULL,
  `views` int(10) DEFAULT '0',
  `loves` int(10) DEFAULT '0',
  `favorites` int(10) DEFAULT '0',
  `comments` int(10) DEFAULT '0',
  `sinks` int(10) DEFAULT '0',
  `c_time` int(10) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) NOT NULL COMMENT '电子邮箱',
  `c_time` int(10) NOT NULL COMMENT '创建时间',
  `u_time` int(10) NOT NULL COMMENT '最后一次操作时间',
  `role_id` tinyint(2) DEFAULT '5' COMMENT '5:普通用户 2:管理员 1:系统管理员',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '0:待激活 1:正常 2：删除',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_userinfo`
--

DROP TABLE IF EXISTS `t_userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_userinfo` (
  `uid` int(10) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `jobs` varchar(100) DEFAULT NULL,
  `web_site` varchar(255) DEFAULT NULL,
  `github` varchar(20) DEFAULT NULL,
  `weibo` varchar(50) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `signature` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL,
  `instructions` text CHARACTER SET utf8mb4,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_userlog`
--

DROP TABLE IF EXISTS `t_userlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_userlog` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) NOT NULL,
  `action` varchar(100) NOT NULL,
  `content` text,
  `ip` varchar(50) DEFAULT NULL,
  `c_time` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=232 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-30 19:30:31
