/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 02/03/2023 16:38:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customers
-- ----------------------------
DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(15) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `email` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `birth` date NULL DEFAULT NULL,
  `photo` mediumblob NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customers
-- ----------------------------
INSERT INTO `customers` VALUES (19, 'bin', 'bin@qq.com', '1000-01-01', NULL);
INSERT INTO `customers` VALUES (21, 'binn', 'binn@qq.com', '1000-02-02', NULL);
INSERT INTO `customers` VALUES (22, 'binn', 'binn@qq.com', '2000-10-01', NULL);
INSERT INTO `customers` VALUES (23, 'binn', 'binn@qq.com', '2000-10-01', NULL);
INSERT INTO `customers` VALUES (24, 'binn', 'binn@qq.com', '2000-10-01', NULL);
INSERT INTO `customers` VALUES (25, 'binn', 'binn@qq.com', '2000-10-01', NULL);
INSERT INTO `customers` VALUES (26, 'binn', 'binn@qq.com', '2000-10-01', NULL);

SET FOREIGN_KEY_CHECKS = 1;
