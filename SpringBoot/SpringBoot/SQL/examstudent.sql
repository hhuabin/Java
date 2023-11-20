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

 Date: 02/03/2023 16:38:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for examstudent
-- ----------------------------
DROP TABLE IF EXISTS `examstudent`;
CREATE TABLE `examstudent`  (
  `FlowID` int NOT NULL AUTO_INCREMENT,
  `Type` int NULL DEFAULT NULL,
  `IDCard` varchar(18) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `ExamCard` varchar(15) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `StudentName` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `Location` varchar(20) CHARACTER SET gb2312 COLLATE gb2312_chinese_ci NULL DEFAULT NULL,
  `Grade` int NULL DEFAULT NULL,
  PRIMARY KEY (`FlowID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = gb2312 COLLATE = gb2312_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of examstudent
-- ----------------------------
INSERT INTO `examstudent` VALUES (1, 4, '412824195263214584', '200523164754000', '张锋', '郑州', 85);
INSERT INTO `examstudent` VALUES (2, 4, '222224195263214584', '200523164754001', '孙朋', '大连', 56);
INSERT INTO `examstudent` VALUES (3, 6, '342824195263214584', '200523164754002', '刘明', '沈阳', 72);
INSERT INTO `examstudent` VALUES (4, 6, '100824195263214584', '200523164754003', '赵虎', '哈尔滨\r\n', 95);
INSERT INTO `examstudent` VALUES (5, 4, '454524195263214584', '200523164754004', '杨丽', '北京', 64);
INSERT INTO `examstudent` VALUES (6, 4, '854524195263214584', '200523164754005', '王小红', '太原', 60);

SET FOREIGN_KEY_CHECKS = 1;
