/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : daoyun

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 26/03/2021 17:44:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `account` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '后台管理员账号',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '后台管理员密码',
  `roles` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '后台管理员权限',
  `last_ip` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '后台管理员最后一次登录ip',
  `last_time` datetime NULL DEFAULT NULL COMMENT '后台管理员最后一次登录时间',
  `login_count` int NULL DEFAULT 0 COMMENT '登录次数',
  `level` int NOT NULL DEFAULT 1 COMMENT '后台管理员级别',
  `status` bit(1) NOT NULL DEFAULT b'1' COMMENT '后台管理员状态 1有效0无效',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员手机号',
  PRIMARY KEY (`id`, `account`) USING BTREE,
  UNIQUE INDEX `account`(`account`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', '4297f44b13955235245b2497399d7a93', '超级管理员', '12.1.1.23', '2021-03-14 13:50:36', 0, 1, b'1', '13015959118');
INSERT INTO `admin` VALUES (3, 'admin123', 'admin123', '管理员', '', '2021-03-14 13:52:12', 0, 2, b'1', '13015959117');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tid` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `site` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上课地点',
  `schoolcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `majorcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE,
  INDEX `tid`(`tid`) USING BTREE,
  INDEX `schoolcode`(`schoolcode`) USING BTREE,
  INDEX `majorcode`(`majorcode`) USING BTREE,
  CONSTRAINT `class_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `teacher` (`tid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `class_ibfk_3` FOREIGN KEY (`schoolcode`) REFERENCES `school` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `class_ibfk_4` FOREIGN KEY (`majorcode`) REFERENCES `major` (`majorcode`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, '课程1', '1', '地点1', '10384', '123');
INSERT INTO `class` VALUES (2, '课程2', '1', '地点2', '10384', '123');
INSERT INTO `class` VALUES (3, '课程3', '1', '地点3', '10384', '123');
INSERT INTO `class` VALUES (4, '课程4', '1', '地点4', '10384', '123');

-- ----------------------------
-- Table structure for courseselect
-- ----------------------------
DROP TABLE IF EXISTS `courseselect`;
CREATE TABLE `courseselect`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `classid` int NOT NULL,
  `sid` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sid`(`sid`) USING BTREE,
  INDEX `classid`(`classid`) USING BTREE,
  CONSTRAINT `courseselect_ibfk_1` FOREIGN KEY (`classid`) REFERENCES `class` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `courseselect_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courseselect
-- ----------------------------
INSERT INTO `courseselect` VALUES (1, 1, '123');
INSERT INTO `courseselect` VALUES (2, 1, '124');
INSERT INTO `courseselect` VALUES (3, 1, '125');
INSERT INTO `courseselect` VALUES (5, 1, '126');
INSERT INTO `courseselect` VALUES (6, 1, '127');
INSERT INTO `courseselect` VALUES (7, 1, '128');
INSERT INTO `courseselect` VALUES (8, 1, '129');
INSERT INTO `courseselect` VALUES (9, 1, '130');
INSERT INTO `courseselect` VALUES (10, 1, '131');
INSERT INTO `courseselect` VALUES (11, 1, '132');
INSERT INTO `courseselect` VALUES (12, 1, '133');
INSERT INTO `courseselect` VALUES (13, 1, '134');
INSERT INTO `courseselect` VALUES (14, 1, '135');
INSERT INTO `courseselect` VALUES (15, 1, '136');
INSERT INTO `courseselect` VALUES (16, 1, '137');
INSERT INTO `courseselect` VALUES (17, 1, '138');
INSERT INTO `courseselect` VALUES (18, 1, '139');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `schoolId` int NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `学校id`(`schoolId`) USING BTREE,
  CONSTRAINT `学校id` FOREIGN KEY (`schoolId`) REFERENCES `school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, 2, '人文学院');
INSERT INTO `department` VALUES (2, 2, '国际学院');
INSERT INTO `department` VALUES (3, 2, '经济学院');
INSERT INTO `department` VALUES (4, 2, '管理学院');
INSERT INTO `department` VALUES (5, 2, '法学院');
INSERT INTO `department` VALUES (6, 2, '马克思主义学院');
INSERT INTO `department` VALUES (7, 2, '经济学院');
INSERT INTO `department` VALUES (8, 2, '社会与人类学院');
INSERT INTO `department` VALUES (9, 2, '数学科学学院');
INSERT INTO `department` VALUES (10, 2, '信息科学与技术学院');
INSERT INTO `department` VALUES (11, 2, '软件学院');
INSERT INTO `department` VALUES (12, 2, '航空航天学院');
INSERT INTO `department` VALUES (13, 2, '电子科学与技术学院');
INSERT INTO `department` VALUES (14, 3, '电气工程与自动化学院');
INSERT INTO `department` VALUES (15, 3, '外国语学院');
INSERT INTO `department` VALUES (16, 3, '法学院');
INSERT INTO `department` VALUES (17, 3, '外国语学院');
INSERT INTO `department` VALUES (18, 3, '数学与计算机科学学院');
INSERT INTO `department` VALUES (19, 3, '环境与资源学院学院');
INSERT INTO `department` VALUES (20, 3, '建筑与城乡规划学院');
INSERT INTO `department` VALUES (21, 3, '厦门工艺美术学院');
INSERT INTO `department` VALUES (22, 3, '海洋学院');
INSERT INTO `department` VALUES (23, 3, '马克思主义学院');
INSERT INTO `department` VALUES (24, 3, '经济与管理学院');
INSERT INTO `department` VALUES (25, 3, '外国语学院');
INSERT INTO `department` VALUES (26, 3, '法学院');
INSERT INTO `department` VALUES (27, 3, '化学学院');
INSERT INTO `department` VALUES (28, 3, '土木工程学院');

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `schoolcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `majorcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `学校代码`(`schoolcode`) USING BTREE,
  INDEX `majorcode`(`majorcode`) USING BTREE,
  CONSTRAINT `学校代码` FOREIGN KEY (`schoolcode`) REFERENCES `school` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES (1, '电子信息', '10384', '123');
INSERT INTO `major` VALUES (2, '软件工程', '10384', '456');
INSERT INTO `major` VALUES (3, '计算机技术', '10384', '789');

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin` bit(1) NULL DEFAULT NULL,
  `superadmin` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, 'iconfont icon-wode', 'index', '系统首页', b'1', b'1');
INSERT INTO `menu` VALUES (2, 'iconfont icon-all', 'student', '学生管理', b'1', b'1');
INSERT INTO `menu` VALUES (3, 'iconfont icon-Customermanagement-fill', 'admin', '管理员管理', b'0', b'1');
INSERT INTO `menu` VALUES (4, 'iconfont icon-office-supplies', 'class', '班级管理', b'1', b'1');

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校名称',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学校代码',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `code`(`code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES (1, '北京大学', '1001');
INSERT INTO `school` VALUES (2, '厦门大学', '10384');
INSERT INTO `school` VALUES (3, '福州大学', '10386');
INSERT INTO `school` VALUES (4, '清华大学', '1003');
INSERT INTO `school` VALUES (5, '华侨大学', '10385');
INSERT INTO `school` VALUES (6, '福建工程学院', '10388');
INSERT INTO `school` VALUES (7, '福建农林大学', '10389');
INSERT INTO `school` VALUES (8, '集美大学', '10390');
INSERT INTO `school` VALUES (9, '福建医科大学', '10392');
INSERT INTO `school` VALUES (10, '福建中医药学院', '10393');
INSERT INTO `school` VALUES (11, '福建师范大学', '10394');
INSERT INTO `school` VALUES (12, '闽江学院', '10395');
INSERT INTO `school` VALUES (13, '泉州师范学院', '10399');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `schoolcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `clocktimes` int UNSIGNED NULL DEFAULT NULL,
  `clockscore` int NULL DEFAULT NULL,
  `lastclocktime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lastclocksite` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE,
  INDEX `schoolcode`(`schoolcode`) USING BTREE,
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`schoolcode`) REFERENCES `school` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('123', '学生1', '12345678911', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('124', '学生2', '12345678912', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('125', '学生3', '12345678913', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('126', '学生4', '12345678914', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('127', '学生5', '12345678927', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('128', '学生6', '12345678928', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('129', '学生7', '12345678929', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('130', '学生8', '12345678930', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('131', '学生9', '12345678931', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('132', '学生10', '12345678932', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('133', '学生11', '12345678933', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('134', '学生12', '12345678934', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('135', '学生13', '12345678935', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('136', '学生14', '12345678914', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('137', '学生15', '12345678937', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('138', '学生16', '12345678938', '女', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('139', '学生17', '12345678939', '男', '10384', 0, 0, NULL, NULL);
INSERT INTO `student` VALUES ('140', '学生18', '12345678918', '女', '10384', 0, 0, NULL, NULL);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `tid` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `schoolcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `majorcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tid`) USING BTREE,
  INDEX `schoolcode`(`schoolcode`) USING BTREE,
  INDEX `majorcode`(`majorcode`) USING BTREE,
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`schoolcode`) REFERENCES `school` (`code`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `teacher_ibfk_2` FOREIGN KEY (`majorcode`) REFERENCES `major` (`majorcode`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '老师1', '12345678901', '10384', '123');
INSERT INTO `teacher` VALUES ('2', '老师2', '13015959118', '10384', '123');
INSERT INTO `teacher` VALUES ('3', '老师3', '13015959117', '10384', '123');
INSERT INTO `teacher` VALUES ('4', '老师4', '13015959104', '10384', '123');
INSERT INTO `teacher` VALUES ('5', '老师5', '13015959105', '10384', '123');
INSERT INTO `teacher` VALUES ('6', '老师6', '13015959106', '10384', '123');

SET FOREIGN_KEY_CHECKS = 1;
