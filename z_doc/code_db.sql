/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : code_db

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-05-05 13:58:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `code`
-- ----------------------------
DROP TABLE IF EXISTS `code`;
CREATE TABLE `code` (
  `id` varchar(50) NOT NULL COMMENT '主键ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID-外键',
  `name` varchar(10) DEFAULT NULL COMMENT 'code名',
  `key_word` varchar(30) DEFAULT NULL COMMENT 'key键',
  `value_word` varchar(30) DEFAULT NULL COMMENT 'value值',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '更新时间',
  `star` int(2) DEFAULT '0' COMMENT '星级',
  `remark` varchar(200) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of code
-- ----------------------------
INSERT INTO `code` VALUES ('12541564', '4144545', null, null, null, '2017-05-04 11:15:09', null, '0', '');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(50) NOT NULL COMMENT '主键ID',
  `user_name` varchar(10) NOT NULL COMMENT '用户名',
  `nick` varchar(10) DEFAULT NULL COMMENT '昵称',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `icon` varchar(50) DEFAULT NULL COMMENT '头像url',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `score` int(10) DEFAULT '0' COMMENT '积分',
  `token` varchar(50) DEFAULT NULL COMMENT 'token',
  `finger` varchar(10) DEFAULT NULL COMMENT 'wait',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
