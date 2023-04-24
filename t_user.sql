/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 24/04/2023 23:09:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `real_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', '管理员', '123', '123', '123', '123', '123');
INSERT INTO `t_user` VALUES (2, 'czy', '小明', '222', '222', '222', '222', '222');
INSERT INTO `t_user` VALUES (3, 'tttt', 'ttt', '111', '111', '111', '111', '111');
INSERT INTO `t_user` VALUES (4, 'tttt', 'tttt', 'tttt', 'tttt', 'tttt', 'tttt', 'tttt');
INSERT INTO `t_user` VALUES (5, '123', '123', '123', '123123', '123', '123', '123');
INSERT INTO `t_user` VALUES (6, 'qqq', '$2a$10$0FaCxzRalyxmqX7vN7Mh.uo8Pgr6TQaW2vhDfLbGaTmLOOTX7HcsK', '1111', '1111', '1111', '111', '111');
INSERT INTO `t_user` VALUES (7, 'qwe', '$2a$10$MwA52TZ6tVfZs4DL3jKq/uhX4H3j/XSfuxzZon1PGp/1PTv07OZ5q', '$2a$10$CWkwZj9wLnS7XSjfq0hlpuh0zEElmlV7T3IbhjeafCnkp2FrN8pNi', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
