/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : gym

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 13/05/2020 17:10:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_area
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_area`;
CREATE TABLE `t_sys_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `area_code` varchar(40) NOT NULL COMMENT '区代码',
  `city_code` varchar(40) DEFAULT NULL COMMENT '父级市代码',
  `area_name` varchar(40) NOT NULL COMMENT '市名称',
  `short_name` varchar(20) NOT NULL COMMENT '简称',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `sort` int(6) DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) DEFAULT NULL COMMENT '备注',
  `data_state` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`),
  KEY `Index_1` (`area_code`)
) ENGINE=InnoDB AUTO_INCREMENT=2013 DEFAULT CHARSET=utf8 COMMENT='地区设置';

-- ----------------------------
-- Records of t_sys_area
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_area` VALUES (1975, '500101', '500100', '万州区', '万州', '108.380249', '30.807808', 28, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1976, '500102', '500100', '涪陵区', '涪陵', '107.394905', '29.703651', 11, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1977, '500103', '500100', '渝中区', '渝中', '106.562881', '29.556742', 37, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1978, '500104', '500100', '大渡口区', '大渡口', '106.48613', '29.481003', 6, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1979, '500105', '500100', '江北区', '江北', '106.532845', '29.575352', 13, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1980, '500106', '500100', '沙坪坝区', '沙坪坝', '106.454201', '29.541224', 24, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1981, '500107', '500100', '九龙坡区', '九龙坡', '106.480988', '29.523493', 15, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1982, '500108', '500100', '南岸区', '南岸', '106.560814', '29.523993', 18, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1983, '500109', '500100', '北碚区', '北碚', '106.437866', '29.82543', 2, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1984, '500112', '500100', '渝北区', '渝北', '106.512848', '29.601452', 35, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1985, '500113', '500100', '巴南区', '巴南', '106.519424', '29.38192', 1, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1986, '500114', '500100', '黔江区', '黔江', '108.782578', '29.527548', 21, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1987, '500115', '500100', '长寿区', '长寿', '107.074852', '29.833672', 4, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1988, '500222', '500100', '綦江区', '綦江', '106.651421', '29.028091', 22, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1989, '500223', '500100', '潼南县', '潼南', '105.84182', '30.189554', 27, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1990, '500224', '500100', '铜梁县', '铜梁', '106.054947', '29.839945', 26, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1991, '500225', '500100', '大足区', '大足', '105.715317', '29.700499', 7, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1992, '500226', '500100', '荣昌县', '荣昌', '105.594063', '29.403627', 23, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1993, '500227', '500100', '璧山县', '璧山', '106.231125', '29.59358', 3, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1994, '500228', '500100', '梁平县', '梁平', '107.800034', '30.672169', 17, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1995, '500229', '500100', '城口县', '城口', '108.664902', '31.946293', 5, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1996, '500230', '500100', '丰都县', '丰都', '107.732483', '29.866425', 9, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1997, '500231', '500100', '垫江县', '垫江', '107.348694', '30.330011', 8, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1998, '500232', '500100', '武隆县', '武隆', '107.756554', '29.323759', 29, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1999, '500233', '500100', '忠县', '忠县', '108.037521', '30.291536', 38, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2000, '500234', '500100', '开县', '开县', '108.413315', '31.167734', 16, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2001, '500235', '500100', '云阳县', '云阳', '108.697701', '30.930529', 36, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2002, '500236', '500100', '奉节县', '奉节', '109.465775', '31.019966', 10, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2003, '500237', '500100', '巫山县', '巫山', '109.878929', '31.074842', 30, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2004, '500238', '500100', '巫溪县', '巫溪', '109.628914', '31.396601', 31, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2005, '500240', '500100', '石柱土家族自治县', '石柱', '108.11245', '29.998529', 25, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2006, '500241', '500100', '秀山土家族苗族自治县', '秀山', '108.99604', '28.444773', 32, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2007, '500242', '500100', '酉阳土家族苗族自治县', '酉阳', '108.767204', '28.839828', 34, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2008, '500243', '500100', '彭水苗族土家族自治县', '彭水', '108.16655', '29.293856', 20, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2009, '500381', '500100', '江津区', '江津', '106.253159', '29.283386', 14, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2010, '500382', '500100', '合川区', '合川', '106.265556', '29.990993', 12, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2011, '500383', '500100', '永川区', '永川', '105.894714', '29.348747', 33, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2012, '500384', '500100', '南川区', '南川', '107.098152', '29.156647', 19, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_city
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_city`;
CREATE TABLE `t_sys_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `city_code` varchar(40) NOT NULL COMMENT '市代码',
  `city_name` varchar(40) NOT NULL COMMENT '市名称',
  `short_name` varchar(20) NOT NULL COMMENT '简称',
  `province_code` varchar(40) DEFAULT NULL COMMENT '省代码',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `sort` int(6) DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) DEFAULT NULL COMMENT '备注',
  `data_state` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`),
  KEY `Index_1` (`city_code`)
) ENGINE=InnoDB AUTO_INCREMENT=256 DEFAULT CHARSET=utf8 COMMENT='城市设置';

-- ----------------------------
-- Records of t_sys_city
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_city` VALUES (255, '500100', '重庆市', '重庆', '500000', '106.504959', '29.533155', 1, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_comment`;
CREATE TABLE `t_sys_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评价表',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `name` varchar(255) DEFAULT NULL COMMENT '课程或教练名称',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `course_id` int(10) DEFAULT NULL COMMENT '课程id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_comment
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_comment` VALUES (1, '没有', '2020-02-22 19:28:59', '123', '关于课程评价', 1, NULL, NULL);
INSERT INTO `t_sys_comment` VALUES (2, '324', '2020-02-22 19:29:14', '小懒虫', '测试', 2, NULL, NULL);
INSERT INTO `t_sys_comment` VALUES (3, '344', '2020-02-29 14:00:00', '123', '测试4', 1234, '3123', NULL);
INSERT INTO `t_sys_comment` VALUES (4, '', '1899-12-31 00:00:00', '112', '24', 32, '123', NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_course
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_course`;
CREATE TABLE `t_sys_course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL COMMENT '容纳人数',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `end` varchar(255) DEFAULT NULL COMMENT '结束时间',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `start` varchar(255) DEFAULT NULL COMMENT '开始时间',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态',
  `type` varchar(255) DEFAULT NULL COMMENT '授课类型',
  `user_id` bigint(20) DEFAULT NULL COMMENT '教练id',
  `user_name` varchar(20) DEFAULT NULL COMMENT '教练姓名',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `room` varchar(50) DEFAULT NULL COMMENT '教室',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_course
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_course` VALUES (6, 1, '2020-02-26 20:00:00', '2020-1-1', '测试', '无', '2019-1-1', 1, '', NULL, '', NULL, '');
INSERT INTO `t_sys_course` VALUES (7, 100, '2020-02-28 22:00:00', '2020-2', '你好', '无', '2020-1', 3, '123', 1, '管理员', 123.00, '344');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_customer`;
CREATE TABLE `t_sys_customer` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(20) DEFAULT NULL COMMENT '性别',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `address` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `hobby` varchar(255) DEFAULT NULL COMMENT '爱好',
  `user_id` int(10) DEFAULT NULL COMMENT 'userid',
  `create_date` datetime DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_sys_customer
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_customer` VALUES (1, '小雨', 1, '男', '2020-02-26 20:00:00', '15248409766', '中国', '123@163.com', '无', 1, '2020-02-26 20:00:00');
INSERT INTO `t_sys_customer` VALUES (2, 'test', 14, '', NULL, '', '', '', '', 9338787, NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_datas
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_datas`;
CREATE TABLE `t_sys_datas` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '主键',
  `file_path` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '文件地址',
  `file_suffix` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '后缀',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文件表存储表';

-- ----------------------------
-- Records of t_sys_datas
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_datas` VALUES ('354984152409444352', 'static/images_upload/655e075657837d5f18a8371b66b8a230.jpg', '.jpg');
INSERT INTO `t_sys_datas` VALUES ('399147852363862016', 'static/images_upload/5990c973526439e0a933b870a91fa957.png', NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_dict_data
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dict_data`;
CREATE TABLE `t_sys_dict_data` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `dict_sort` int(4) DEFAULT '0' COMMENT '字典排序',
  `dict_label` varchar(100) DEFAULT '' COMMENT '字典标签',
  `dict_value` varchar(100) DEFAULT '' COMMENT '字典键值',
  `dict_type` varchar(100) DEFAULT '' COMMENT '字典类型',
  `css_class` varchar(100) DEFAULT '' COMMENT '样式属性（其他样式扩展）',
  `list_class` varchar(100) DEFAULT '' COMMENT '表格回显样式',
  `is_default` char(1) DEFAULT 'N' COMMENT '是否默认（Y是 N否）',
  `status` char(1) DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典数据表';

-- ----------------------------
-- Records of t_sys_dict_data
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_dict_data` VALUES ('331043380933038080', 1, '一般', '1', 'sys_notice_type', '', 'info', 'Y', '0', 'admin', '2019-09-09 22:15:03', 'admin', '2019-09-09 22:15:43', '');
INSERT INTO `t_sys_dict_data` VALUES ('331043525137403904', 2, '重要', '2', 'sys_notice_type', '', 'important', 'N', '0', 'admin', '2019-09-09 22:15:37', 'admin', '2019-09-11 00:30:04', '');
INSERT INTO `t_sys_dict_data` VALUES ('340080322395901952', 1, '开启', '0', 'sys_province_state', '', 'info', 'Y', '0', 'admin', '2019-10-04 20:44:37', 'admin', '2019-10-04 20:46:41', '');
INSERT INTO `t_sys_dict_data` VALUES ('340080779201744896', 2, '关闭', '-1', 'sys_province_state', '', 'important', 'Y', '0', 'admin', '2019-10-04 20:46:26', 'admin', '2019-10-04 20:46:45', '');
INSERT INTO `t_sys_dict_data` VALUES ('373494384659927040', 0, 'GET请求', '1', 'sys_inter_url_type', '', 'primary', 'Y', '0', 'admin', '2020-01-05 01:40:11', 'admin', '2020-01-05 01:52:43', '');
INSERT INTO `t_sys_dict_data` VALUES ('373494483465146368', 1, 'POST请求', '2', 'sys_inter_url_type', '', 'info', 'N', '0', 'admin', '2020-01-05 01:40:34', 'admin', '2020-01-05 01:52:18', '');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_dict_type
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dict_type`;
CREATE TABLE `t_sys_dict_type` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `dict_name` varchar(100) DEFAULT '' COMMENT '字典名称',
  `dict_type` varchar(100) DEFAULT '' COMMENT '字典类型',
  `status` char(1) DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dict_type` (`dict_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典类型表';

-- ----------------------------
-- Records of t_sys_dict_type
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_dict_type` VALUES ('340079827459641344', '省份状态', 'sys_province_state', '0', 'admin', '2019-10-04 20:42:39', '', '2019-10-04 20:42:39', '省份状态');
INSERT INTO `t_sys_dict_type` VALUES ('373493952487231488', '拦截器类型', 'sys_inter_url_type', '0', 'admin', '2020-01-05 01:38:28', 'admin', '2020-01-05 01:38:50', '拦截器类型');
INSERT INTO `t_sys_dict_type` VALUES ('6', '通知类型', 'sys_notice_type', '0', 'admin', '2018-03-16 11:33:00', 'admin', '2019-09-15 00:29:19', '通知类型列表');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_email
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_email`;
CREATE TABLE `t_sys_email` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '主键',
  `receivers_email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '接收人电子邮件',
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '邮件标题',
  `content` text COLLATE utf8_bin COMMENT '内容',
  `send_user_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '发送人id',
  `send_user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '发送人账号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='电子邮件';

-- ----------------------------
-- Records of t_sys_email
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_email` VALUES ('399147981363875840', 'nylrain@164.com', '而为', '<p>发顺丰<br/></p>', '1', 'admin', '2020-03-15 20:38:25');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_file
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_file`;
CREATE TABLE `t_sys_file` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '主键',
  `file_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '图片名字',
  `create_user_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人名字',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人',
  `update_user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '修改人名字',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文件信息表';

-- ----------------------------
-- Records of t_sys_file
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_file` VALUES ('354984159875305472', '3333', '1', 'admin', '2019-11-14 23:47:09', NULL, NULL, NULL);
INSERT INTO `t_sys_file` VALUES ('399147852472913920', '百度富文本上传', '1', 'admin', '2020-03-15 20:37:54', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_file_data
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_file_data`;
CREATE TABLE `t_sys_file_data` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '主键',
  `data_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '数据id',
  `file_id` varchar(255) COLLATE utf8_bin DEFAULT '文件id' COMMENT '文件id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文件数据外键绑定表';

-- ----------------------------
-- Records of t_sys_file_data
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_file_data` VALUES ('354984159875305473', '354984152409444352', '354984159875305472');
INSERT INTO `t_sys_file_data` VALUES ('399147852472913921', '399147852363862016', '399147852472913920');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_inter_url
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_inter_url`;
CREATE TABLE `t_sys_inter_url` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `inter_name` varchar(255) DEFAULT NULL COMMENT '拦截名称',
  `url` varchar(255) DEFAULT NULL COMMENT '拦截url',
  `type` int(2) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拦截url表';

-- ----------------------------
-- Records of t_sys_inter_url
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_inter_url` VALUES ('373496755515428864', '用户添加', '/UserController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373497670557372416', '用户删除', '/UserController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373497840930000896', '用户修改', '/UserController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373497897913815040', '用户修改密码', '/UserController/editPwd', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498025491959808', '自动生成添加', '/autoCodeController/addGlobal', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498096644132864', '自动生成保存', '/autoCodeController/saveOne', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498292627181568', '字典表添加', '/DictDataController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498349552275456', '字典表删除', '/DictDataController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498496684265472', '字典表修改', '/DictDataController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498567521865728', '字典表类型添加', '/DictTypeController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498625474564096', '字典表类型删除', '/DictTypeController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498715475939328', '字典表类型修改', '/DictTypeController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498811429031936', '邮箱添加', '/EmailController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498868127633408', '邮箱修改', '/EmailController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498918975180800', '邮箱删除', '/EmailController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373498988751622144', '文件上传', '/FileController/upload', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499051250946048', '文件上传添加', '/FileController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499108104736768', '文件上传删除', '/FileController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499205047685120', '文件上传删除2', '/FileController/del_file', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499263713415168', '文件上传修改', '/FileController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499326967713792', '日志删除', '/LogController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499404776247296', '权限添加', '/PermissionController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499452364820480', '权限删除', '/PermissionController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499526859853824', '权限修改', '/PermissionController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499613015052288', '定时器添加', '/SysQuartzJobController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499677636694016', '定时器删除', '/SysQuartzJobController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499748591734784', '定时器修改', '/SysQuartzJobController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499825582379008', '定时器状态切换', '/SysQuartzJobController/changeStatus', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499894721286144', '定时器启动', '/SysQuartzJobController/run', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373499948769087488', '定时器日志删除', '/SysQuartzJobLogController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500039596740608', '角色添加', '/RoleController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500088284221440', '角色删除', '/RoleController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500133054222336', '角色修改', '/RoleController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500178268819456', '公告添加', '/SysNoticeController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500217934352384', '公告删除', '/SysNoticeController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500268949671936', '公告展示', '/SysNoticeController/viewinfo', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500319365206016', '公告修改', '/SysNoticeController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500397240848384', '省份添加', '/SysProvinceController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500437623607296', '省份删除', '/SysProvinceController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500524961599488', '省份修改', '/SysProvinceController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500569433804800', '地区添加', '/SysAreaController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500609669763072', '地区删除', '/SysAreaController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500648181862400', '地区修改', '/SysAreaController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500706268778496', '城市添加', '/SysCityController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500743581306880', '城市删除', '/SysCityController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500781405540352', '城市修改', '/SysCityController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500835193294848', '街道添加', '/SysStreetController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500877971001344', '街道删除', '/SysStreetController/remove', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373500915308695552', '街道修改', '/SysStreetController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373501029066608640', '百度编辑器添加', '/UeditorController/ueditor', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373501103570030592', '百度编辑器', '/UeditorController/', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373501147362758656', '百度编辑器上传', '/UeditorController/imgUpload', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373501199686701056', '七牛文件上传', '/QiNiuCloudController/uploadToQiNiu', 2);
INSERT INTO `t_sys_inter_url` VALUES ('373501333854097408', '定时器停止', '/quartz/stop', 1);
INSERT INTO `t_sys_inter_url` VALUES ('373501434756468736', '定时器继续', '/quartz/resume', 1);
INSERT INTO `t_sys_inter_url` VALUES ('373501545595146240', '定时器状态修改', '/quartz/update', 1);
INSERT INTO `t_sys_inter_url` VALUES ('373501599198351360', '定时器删除2', '/quartz/delete', 1);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_mycourse
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_mycourse`;
CREATE TABLE `t_sys_mycourse` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) DEFAULT NULL,
  `course_id` int(10) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_sys_mycourse
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_mycourse` VALUES (1, 1, 6, '2020-02-27 22:09:34', 3);
INSERT INTO `t_sys_mycourse` VALUES (2, 2, 6, '2020-02-27 22:21:19', 3);
INSERT INTO `t_sys_mycourse` VALUES (3, 9338787, 7, '2020-02-28 23:30:21', 1);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_notice`;
CREATE TABLE `t_sys_notice` (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '内容',
  `type` int(5) DEFAULT NULL COMMENT '类型',
  `create_id` varchar(255) DEFAULT NULL COMMENT '创建人id',
  `create_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '创建人name',
  `create_time` datetime DEFAULT NULL COMMENT '发信时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告';

-- ----------------------------
-- Records of t_sys_notice
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_notice` VALUES ('393297509184835584', '测试', '<p>324324</p>', 2, '1', 'admin', '2020-02-28 17:10:44');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_notice_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_notice_user`;
CREATE TABLE `t_sys_notice_user` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `notice_id` varchar(255) DEFAULT NULL COMMENT '公告id',
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `state` int(2) DEFAULT NULL COMMENT '0未阅读 1 阅读',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告_用户外键';

-- ----------------------------
-- Records of t_sys_notice_user
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_notice_user` VALUES ('330381411037089792', '330381411007729664', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('330381411045478400', '330381411007729664', '488294747442511872', 0);
INSERT INTO `t_sys_notice_user` VALUES ('330381806375407616', '330381806358630400', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('330381806379601920', '330381806358630400', '488294747442511872', 0);
INSERT INTO `t_sys_notice_user` VALUES ('330622143622680576', '330622143597514752', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('330622143626874880', '330622143597514752', '488294747442511872', 0);
INSERT INTO `t_sys_notice_user` VALUES ('354984345649418240', '354984345632641024', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('373478037158760448', '373478036928073728', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('373478037162954752', '373478036928073728', '368026921239449600', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037171343360', '373478036928073728', '368026937181999104', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037175537664', '373478036928073728', '368027013392502784', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037183926272', '373478036928073728', '368027030899527680', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037192314880', '373478036928073728', '368027048402358272', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037204897792', '373478036928073728', '368027066563694592', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037213286400', '373478036928073728', '368027087866564608', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037217480704', '373478036928073728', '368027104895438848', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037225869312', '373478036928073728', '368027130728157184', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037230063616', '373478036928073728', '368027151624179712', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037238452224', '373478036928073728', '368382463233363968', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509218390016', '393297509184835584', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('393297509226778624', '393297509184835584', '2', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509230972928', '393297509184835584', '368026921239449600', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509235167232', '393297509184835584', '368026937181999104', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509239361536', '393297509184835584', '368027013392502784', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509243555840', '393297509184835584', '368027030899527680', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509251944448', '393297509184835584', '368027048402358272', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509256138752', '393297509184835584', '368027066563694592', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509260333056', '393297509184835584', '368027087866564608', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509268721664', '393297509184835584', '368027104895438848', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509272915968', '393297509184835584', '368027130728157184', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509277110272', '393297509184835584', '368027151624179712', 0);
INSERT INTO `t_sys_notice_user` VALUES ('393297509281304576', '393297509184835584', '368382463233363968', 0);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_oper_log
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_oper_log`;
CREATE TABLE `t_sys_oper_log` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '标题',
  `method` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '方法',
  `oper_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `oper_url` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT 'url',
  `oper_param` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '参数',
  `error_msg` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `oper_time` date DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='日志记录表';

-- ----------------------------
-- Table structure for t_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_permission`;
CREATE TABLE `t_sys_permission` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `descripion` varchar(255) DEFAULT NULL COMMENT '权限描述',
  `url` varchar(255) DEFAULT NULL COMMENT '授权链接',
  `is_blank` int(255) DEFAULT '0' COMMENT '是否跳转 0 不跳转 1跳转',
  `pid` varchar(255) DEFAULT NULL COMMENT '父节点id',
  `perms` varchar(255) DEFAULT NULL COMMENT '权限标识',
  `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(255) DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `visible` int(255) DEFAULT NULL COMMENT '是否可见',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of t_sys_permission
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_permission` VALUES ('1', '首页', '首页', '#', 0, '0', '#', 0, 'fa fa-home', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('10', '角色集合', '角色集合', '/RoleController/list', 0, '9', 'system:role:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('11', '角色添加', '角色添加', '/RoleController/add', 0, '9', 'system:role:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('12', '角色删除', '角色删除', '/RoleController/remove', 0, '9', 'system:role:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('13', '角色修改', '角色修改', '/RoleController/edit', 0, '9', 'system:role:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('14', '权限展示', '权限展示', '/PermissionController/view', 0, '592059865673760768', 'system:permission:view', 1, 'fa fa-key', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('15', '权限集合', '权限集合', '/PermissionController/list', 0, '14', 'system:permission:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('16', '权限添加', '权限添加', '/permissionController/add', 0, '14', 'system:permission:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('17', '权限删除', '权限删除', '/PermissionController/remove', 0, '14', 'system:permission:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('18', '权限修改', '权限修改', '/PermissionController/edit', 0, '14', 'system:permission:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('330365026642825216', '公告管理', '公告展示', '/SysNoticeController/view', 0, '592059865673760768', 'gen:sysNotice:view', 1, 'fa fa-telegram', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252171', '公告集合', '公告集合', '/SysNoticeController/list', 0, '330365026642825216', 'gen:sysNotice:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252182', '公告添加', '公告添加', '/SysNoticeController/add', 0, '330365026642825216', 'gen:sysNotice:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252193', '公告删除', '公告删除', '/SysNoticeController/remove', 0, '330365026642825216', 'gen:sysNotice:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252204', '公告修改', '公告修改', '/SysNoticeController/edit', 0, '330365026642825216', 'gen:sysNotice:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('392619620881797120', '健身课程管理', '展示', '/SysCourseController/view', 0, '589559748521623552', 'gen:sysCourse:view', 1, 'fa fa-quora', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926196208859914241', '集合', '集合', '/SysCourseController/list', 0, '392619620881797120', 'gen:sysCourse:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926196208859914252', '添加', '添加', '/SysCourseController/add', 0, '392619620881797120', 'gen:sysCourse:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926196208859914263', '删除', '删除', '/SysCourseController/remove', 0, '392619620881797120', 'gen:sysCourse:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926196208859914274', '修改', '修改', '/SysCourseController/edit', 0, '392619620881797120', 'gen:sysCourse:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('392620214652637184', '会员信息管理', '展示', '/SysCustomerController/view', 0, '589559748521623552', 'gen:sysCustomer:view', 1, 'fa fa-quora', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926202146526371851', '集合', '集合', '/SysCustomerController/list', 0, '392620214652637184', 'gen:sysCustomer:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926202146568314882', '添加', '添加', '/SysCustomerController/add', 0, '392620214652637184', 'gen:sysCustomer:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926202146568314893', '删除', '删除', '/SysCustomerController/remove', 0, '392620214652637184', 'gen:sysCustomer:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926202146568314904', '修改', '修改', '/SysCustomerController/edit', 0, '392620214652637184', 'gen:sysCustomer:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('392620312317005824', '会员卡管理', '展示', '/SysVipController/view', 0, '589559748521623552', 'gen:sysVip:view', 1, 'fa fa-quora', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926203123170058251', '集合', '集合', '/SysVipController/list', 0, '392620312317005824', 'gen:sysVip:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926203123170058262', '添加', '添加', '/SysVipController/add', 0, '392620312317005824', 'gen:sysVip:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926203123170058273', '删除', '删除', '/SysVipController/remove', 0, '392620312317005824', 'gen:sysVip:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3926203123170058284', '修改', '修改', '/SysVipController/edit', 0, '392620312317005824', 'gen:sysVip:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('392643829007781888', '课程购买', '', '/SysCourseController/buy', 0, '589559748521623552', 'gen:sysCourse:buy', 1, 'fa fa-drivers-license-o', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393278841784766464', '评价管理', '展示', '/SysCommentController/view', 0, '589559748521623552', 'gen:sysComment:view', 1, 'fa fa-quora', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3932788417847664651', '集合', '集合', '/SysCommentController/list', 0, '393278841784766464', 'gen:sysComment:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3932788417847664662', '添加', '添加', '/SysCommentController/add', 0, '393278841784766464', 'gen:sysComment:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3932788417847664673', '删除', '删除', '/SysCommentController/remove', 0, '393278841784766464', 'gen:sysComment:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3932788417847664684', '修改', '修改', '/SysCommentController/edit', 0, '393278841784766464', 'gen:sysComment:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393281296937390080', '我的课程', '', '/SysCourseController/my', 0, '589559748521623552', 'gen:sysCourse:my', 1, 'fa fa-eercast', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393304694174388224', '我的会员', '', '/SysCustomerController/edit2', 0, '589559748521623552', 'gen:sysCustomer:edit2', 1, 'fa fa-vcard-o', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393318867012816896', '修改密码', '', '/UserController/editPwd2', 0, '589559748521623552', 'system:user:editPwd2', 1, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393327396855615488', '销售业绩', '', '/SysCommentController/bar', 1, '393377199522189312', 'gen:sysComment:bar', 1, 'fa fa-eercast', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393347538712924160', '教练业绩', '', '/SysCommentController/pie', 0, '393377199522189312', 'gen:sysComment:pie', 1, 'fa fa-at', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('393377199522189312', '报表管理', '', '#', 0, '589559475422101504', '#', 1, 'fa fa-bar-chart', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('4', '用户管理', '用户展示', '/UserController/view', 0, '592059865673760768', 'system:user:view', 1, 'icon icon-user', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('486690002869157888', '用户密码修改', '用户密码修改', '/UserController/editPwd', 0, '4', 'system:user:editPwd', 2, 'entypo-tools', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('496126970468237312', '日志展示', '日志管理', '/LogController/view', 0, '592059865673760768', 'system:log:view', 1, 'fa fa-info', 9, 0);
INSERT INTO `t_sys_permission` VALUES ('496127240363311104', '日志删除', '日志删除', '/LogController/remove', 0, '496126970468237312', 'system:log:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('496127794879660032', '日志集合', '日志集合', '/LogController/list', 0, '496126970468237312', 'system:log:list', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('496782496638173184', '系统设置', '后台设置', NULL, 0, '1', NULL, 0, 'fa fa-gear', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('5', '用户集合', '用户集合', '/UserController/list', 0, '4', 'system:user:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('589559475422101504', '我的功能', '功能', NULL, 0, '1', NULL, 0, 'fa fa-etsy', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('589559748521623552', '功能管理', '测试菜单', '#', 0, '589559475422101504', '#', 1, 'fa fa-address-book', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('592059865673760768', '系统管理', '后台管理', '#', 0, '496782496638173184', '#', 1, 'fa fa-home', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('592167738407911424', '系统监控', '系统监控', '/ServiceController/view', 0, '617766548966211584', 'system:service:view', 1, 'fa fa-video-camera', 7, 0);
INSERT INTO `t_sys_permission` VALUES ('594691026430459904', '电子邮件管理', '电子邮件展示', '/EmailController/view', 0, '592059865673760768', 'system:email:view', 1, 'fa fa-envelope', 8, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599041', '电子邮件集合', '电子邮件集合', '/EmailController/list', 0, '594691026430459904', 'system:email:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599042', '电子邮件添加', '电子邮件添加', '/EmailController/add', 0, '594691026430459904', 'system:email:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599043', '电子邮件删除', '电子邮件删除', '/EmailController/remove', 0, '594691026430459904', 'system:email:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599044', '电子邮件修改', '电子邮件修改', '/EmailController/edit', 0, '594691026430459904', 'system:email:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6', '用户添加', '用户添加', '/UserController/add', 0, '4', 'system:user:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('617766548966211584', '系统工具', '系统工具', '#', 0, '496782496638173184', '#', 1, 'fa fa-th-large', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('7', '用户删除', '用户删除', '/UserController/remove', 0, '4', 'system:user:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('8', '用户修改', '用户修改', '/UserController/edit', 0, '4', 'system:user:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('9', '角色管理', '角色展示', '/RoleController/view', 0, '592059865673760768', 'system:role:view', 1, 'fa fa-group', 2, 0);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_permission_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_permission_role`;
CREATE TABLE `t_sys_permission_role` (
  `id` varchar(255) NOT NULL,
  `role_id` varchar(255) DEFAULT NULL COMMENT '角色id',
  `permission_id` varchar(255) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限中间表';

-- ----------------------------
-- Records of t_sys_permission_role
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_permission_role` VALUES ('00d63177-cf3d-4846-8ada-fc98a3ef8457', '488243256161730560', '592167738407911424');
INSERT INTO `t_sys_permission_role` VALUES ('0b9839c0-178e-46e4-8b6b-9e9f7bf531ab', '488243256161730560', '1');
INSERT INTO `t_sys_permission_role` VALUES ('193a5f30-725c-45bb-8e13-60ceb9ccf3fc', '488243256161730560', '8');
INSERT INTO `t_sys_permission_role` VALUES ('1d9a8a03-ab96-4004-8572-085245a90bca', '488243256161730560', '3926203123170058262');
INSERT INTO `t_sys_permission_role` VALUES ('21b06546-3a5d-4c6e-bdfa-cbe67a6eb049', '488243256161730560', '393304694174388224');
INSERT INTO `t_sys_permission_role` VALUES ('252b5b95-9984-4dc2-9998-58e647812c25', '488243256161730560', '393318867012816896');
INSERT INTO `t_sys_permission_role` VALUES ('25e88b46-54d1-48d3-8e6a-07a3b8deec9e', '393320526766018560', '');
INSERT INTO `t_sys_permission_role` VALUES ('27ab9663-2743-4a05-99e0-1e7b85ea04f4', '488243256161730560', '10');
INSERT INTO `t_sys_permission_role` VALUES ('286da78d-6979-416a-a701-f6eee121589b', '488289006124007424', '393318867012816896');
INSERT INTO `t_sys_permission_role` VALUES ('29ca6d36-7055-4a1c-813d-a65faeaa44c1', '488243256161730560', '393377199522189312');
INSERT INTO `t_sys_permission_role` VALUES ('2eff51aa-0430-447f-8569-394cbf448f1e', '488243256161730560', '3926196208859914241');
INSERT INTO `t_sys_permission_role` VALUES ('38592a58-2e62-4777-9ee7-6945ea2fede2', '488243256161730560', '393347538712924160');
INSERT INTO `t_sys_permission_role` VALUES ('3f820407-2c10-4654-a55d-443568b3a6a8', '488289006124007424', '393304694174388224');
INSERT INTO `t_sys_permission_role` VALUES ('41a44a82-1060-4fdc-9f83-a5ae80b5b8ed', '488243256161730560', '3303650266428252193');
INSERT INTO `t_sys_permission_role` VALUES ('437e67d0-656a-4bc7-aa75-75897d682a4e', '488243256161730560', '3926196208859914263');
INSERT INTO `t_sys_permission_role` VALUES ('55e5f7ea-9cd0-4e70-8380-f77d64a4e37a', '488243256161730560', '592059865673760768');
INSERT INTO `t_sys_permission_role` VALUES ('579d8f40-3957-4bf1-a053-5d08f353edf6', '488243256161730560', '3932788417847664684');
INSERT INTO `t_sys_permission_role` VALUES ('5c3dab10-63fb-4713-b97f-bded23dd9469', '488243256161730560', '496127794879660032');
INSERT INTO `t_sys_permission_role` VALUES ('5fc5b699-cb43-47c7-abc1-48e11cf4aa55', '488243256161730560', '393281296937390080');
INSERT INTO `t_sys_permission_role` VALUES ('6410905c-b818-4b66-9a34-f8ffeb41b5e7', '488243256161730560', '3926203123170058273');
INSERT INTO `t_sys_permission_role` VALUES ('6c5eabbf-a616-4dc8-ac22-98d22d18e564', '488243256161730560', '11');
INSERT INTO `t_sys_permission_role` VALUES ('6f116feb-523f-4218-b439-d952ea0f253e', '488289006124007424', '589559475422101504');
INSERT INTO `t_sys_permission_role` VALUES ('75aff0af-80d0-4513-8320-173b6d724716', '488243256161730560', '392620214652637184');
INSERT INTO `t_sys_permission_role` VALUES ('78fc93cb-839c-42e2-833f-fbb356df50dd', '488243256161730560', '5');
INSERT INTO `t_sys_permission_role` VALUES ('7cfb32a7-dcec-452e-8371-454d4bd6f907', '488243256161730560', '392620312317005824');
INSERT INTO `t_sys_permission_role` VALUES ('7ddb6b7f-1d57-4c78-90d9-b2b5f955f48d', '488243256161730560', '4');
INSERT INTO `t_sys_permission_role` VALUES ('8012b1e4-5b21-4068-b626-fd2b5d416d4b', '488243256161730560', '3932788417847664651');
INSERT INTO `t_sys_permission_role` VALUES ('80bf6ef1-cd08-4fb1-b1f5-8d7764770567', '488243256161730560', '3926203123170058251');
INSERT INTO `t_sys_permission_role` VALUES ('80f168e5-8031-4963-a2af-e56eb98dc2c3', '488243256161730560', '617766548966211584');
INSERT INTO `t_sys_permission_role` VALUES ('81774532-6bce-4ab4-a849-81a13cb3beb7', '488243256161730560', '589559475422101504');
INSERT INTO `t_sys_permission_role` VALUES ('853d23f5-b693-41d0-8cd0-38bd3b1e2e3e', '488243256161730560', '496126970468237312');
INSERT INTO `t_sys_permission_role` VALUES ('898a4a7b-1046-4082-86f0-768f08d7d42d', '488243256161730560', '3932788417847664662');
INSERT INTO `t_sys_permission_role` VALUES ('8d39e1b1-b3ec-4fca-8111-5f59e2c44230', '488243256161730560', '486690002869157888');
INSERT INTO `t_sys_permission_role` VALUES ('8ddafc1b-f428-4985-8d12-cddff93d1f98', '488243256161730560', '393327396855615488');
INSERT INTO `t_sys_permission_role` VALUES ('917442a6-07b5-49bf-8cd3-d45649ee11f4', '488243256161730560', '5946910264304599043');
INSERT INTO `t_sys_permission_role` VALUES ('94f7fdda-e9a7-4658-98ec-4d5440e20bf8', '488243256161730560', '12');
INSERT INTO `t_sys_permission_role` VALUES ('9699d4a5-e7ec-46a1-91b8-93a011f25dcb', '488243256161730560', '7');
INSERT INTO `t_sys_permission_role` VALUES ('ad284e5b-743a-4c13-8746-c03cdc4b8891', '488243256161730560', '5946910264304599044');
INSERT INTO `t_sys_permission_role` VALUES ('ae3cc81b-562a-4e7f-8c7f-477e095b4bba', '488243256161730560', '3932788417847664673');
INSERT INTO `t_sys_permission_role` VALUES ('b0c2b089-39ea-4c77-80b3-e3acd288ac33', '488243256161730560', '330365026642825216');
INSERT INTO `t_sys_permission_role` VALUES ('b12a75a5-6b44-43c7-b099-8a802db14fb1', '488243256161730560', '16');
INSERT INTO `t_sys_permission_role` VALUES ('b506f7e8-3ec6-48dc-9e47-aa4bd2dc589f', '488289006124007424', '589559748521623552');
INSERT INTO `t_sys_permission_role` VALUES ('b5850236-a63b-4f51-aa9e-e464be4ec1d1', '488289006124007424', '1');
INSERT INTO `t_sys_permission_role` VALUES ('b7c70c5f-5700-4f5a-80da-c1f9482efbba', '488243256161730560', '9');
INSERT INTO `t_sys_permission_role` VALUES ('b7ed9ba7-9ebd-48b6-b5f3-67149560023f', '488243256161730560', '392643829007781888');
INSERT INTO `t_sys_permission_role` VALUES ('bcba7c79-7023-4866-bdb7-519758cbb9f2', '488243256161730560', '594691026430459904');
INSERT INTO `t_sys_permission_role` VALUES ('bcd34679-5252-4897-9810-7cae42d73cf7', '488243256161730560', '3926202146568314893');
INSERT INTO `t_sys_permission_role` VALUES ('be880b39-a0c5-49cc-b3bc-65522bba130f', '488243256161730560', '5946910264304599041');
INSERT INTO `t_sys_permission_role` VALUES ('bfc6dbeb-5a84-4b12-84e7-da610285c172', '488243256161730560', '393278841784766464');
INSERT INTO `t_sys_permission_role` VALUES ('c35cf68f-6865-4081-9442-119fea934a6c', '488243256161730560', '3303650266428252204');
INSERT INTO `t_sys_permission_role` VALUES ('c3e34d4d-a79b-4a51-a8a3-dd9e82dc1439', '488243256161730560', '15');
INSERT INTO `t_sys_permission_role` VALUES ('c4126dcb-86a0-4e8b-a7f3-7a3d68e33cbe', '488243256161730560', '3303650266428252182');
INSERT INTO `t_sys_permission_role` VALUES ('c792bf76-4279-4649-b9aa-87a44d2787f0', '488243256161730560', '3926202146568314904');
INSERT INTO `t_sys_permission_role` VALUES ('c7ac1572-d84f-4f04-b112-a48552ac9bff', '488243256161730560', '3303650266428252171');
INSERT INTO `t_sys_permission_role` VALUES ('d2d31526-cc71-4f0a-9313-dbb60397174e', '488243256161730560', '14');
INSERT INTO `t_sys_permission_role` VALUES ('d423fa05-8074-4c3e-a0b1-5b7d01784892', '488289006124007424', '392643829007781888');
INSERT INTO `t_sys_permission_role` VALUES ('d6ed27ae-6df2-4b1d-a90f-4847d4b0df65', '488243256161730560', '3926202146526371851');
INSERT INTO `t_sys_permission_role` VALUES ('d9819965-0d1b-4b85-8096-abf1cd74abf3', '488243256161730560', '496127240363311104');
INSERT INTO `t_sys_permission_role` VALUES ('dbfd5a30-7f49-4ad4-b05a-95bfa65801fe', '488243256161730560', '3926196208859914274');
INSERT INTO `t_sys_permission_role` VALUES ('dd3762c5-068f-4d69-b0e0-505a35465c9c', '488243256161730560', '6');
INSERT INTO `t_sys_permission_role` VALUES ('ded61ad1-eeb9-480d-be4e-2681550550cc', '488243256161730560', '3926196208859914252');
INSERT INTO `t_sys_permission_role` VALUES ('df42bca7-d821-45a9-b21f-8e9bba04d1d1', '488243256161730560', '3926203123170058284');
INSERT INTO `t_sys_permission_role` VALUES ('df9559de-b886-4278-85a3-fefcb70bbad3', '488243256161730560', '5946910264304599042');
INSERT INTO `t_sys_permission_role` VALUES ('e25abf50-03c2-4299-af94-a00312361edf', '488243256161730560', '496782496638173184');
INSERT INTO `t_sys_permission_role` VALUES ('e2cf1190-a43c-44bf-a187-780c3db93a9f', '488243256161730560', '589559748521623552');
INSERT INTO `t_sys_permission_role` VALUES ('e6d45354-6940-4d28-aa32-ccb5f7d9c5b1', '488243256161730560', '392619620881797120');
INSERT INTO `t_sys_permission_role` VALUES ('ea99faab-bca9-4e6c-861f-8de74219980c', '488243256161730560', '3926202146568314882');
INSERT INTO `t_sys_permission_role` VALUES ('eadebfaa-fbbc-429b-99b7-64131543eb5a', '488243256161730560', '17');
INSERT INTO `t_sys_permission_role` VALUES ('eec268e7-12b2-4bdf-aa59-c0c22a4d4607', '488243256161730560', '18');
INSERT INTO `t_sys_permission_role` VALUES ('f715202d-8aa1-4045-bfa3-af4fb8cf8b4b', '488289006124007424', '393281296937390080');
INSERT INTO `t_sys_permission_role` VALUES ('f7537aa1-47a9-4046-ab0e-2db40d93cef7', '488243256161730560', '13');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_physical
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_physical`;
CREATE TABLE `t_sys_physical` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `height` varchar(20) DEFAULT NULL COMMENT '身高',
  `weight` varchar(20) DEFAULT NULL COMMENT '体重',
  `bmi` varchar(20) DEFAULT NULL COMMENT 'bmi',
  `fat` varchar(20) DEFAULT NULL COMMENT '体内脂肪',
  `muscle` varchar(20) DEFAULT NULL COMMENT '肌肉',
  `moisture` varchar(20) DEFAULT NULL COMMENT '水分',
  `protein` varchar(20) DEFAULT NULL COMMENT '蛋白质',
  `bone` varchar(20) DEFAULT NULL COMMENT '骨量',
  `sex` varchar(20) DEFAULT NULL COMMENT '性别',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `username` varchar(50) DEFAULT NULL COMMENT '姓名',
  `course_id` int(10) DEFAULT NULL COMMENT '课程id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_sys_physical
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_physical` VALUES (2, '1', '1', '1', '1', '1', '1', '1', '1', '1', 1, '1', NULL, 1);
INSERT INTO `t_sys_physical` VALUES (3, '1', '1', '1', '1', '1', '1', '1', '1', '11', 1, '1', NULL, 1);
INSERT INTO `t_sys_physical` VALUES (4, '100', '100', '100', '100', '100', '100', '100', '100', '男', 29, '', NULL, 1);
INSERT INTO `t_sys_physical` VALUES (5, '1', '1', '1', '1', '1', '1', '1', '1', '1', 1, '1', '144', 6);
INSERT INTO `t_sys_physical` VALUES (6, '11', '1', '1', '1', '', '', '', '', '', NULL, '', 'test', 7);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_province
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_province`;
CREATE TABLE `t_sys_province` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `province_code` varchar(40) NOT NULL COMMENT '省份代码',
  `province_name` varchar(50) NOT NULL COMMENT '省份名称',
  `short_name` varchar(20) NOT NULL COMMENT '简称',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `sort` int(6) DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) DEFAULT NULL COMMENT '备注',
  `data_state` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`),
  KEY `Index_1` (`province_code`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='省份表';

-- ----------------------------
-- Records of t_sys_province
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_province` VALUES (22, '500000', '重庆', '重庆', '106.504959', '29.533155', 22, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_quartz_job
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_quartz_job`;
CREATE TABLE `t_sys_quartz_job` (
  `id` varchar(255) NOT NULL COMMENT '日志id',
  `job_name` varchar(255) DEFAULT NULL COMMENT '任务名称',
  `job_group` varchar(255) DEFAULT NULL COMMENT '任务组名',
  `invoke_target` varchar(255) DEFAULT NULL COMMENT '调用目标字符串',
  `cron_expression` varchar(255) DEFAULT NULL COMMENT 'cron执行表达式',
  `misfire_policy` varchar(255) DEFAULT NULL COMMENT 'cron计划策略',
  `concurrent` varchar(255) DEFAULT NULL COMMENT '是否并发执行（0允许 1禁止）',
  `status` int(11) DEFAULT NULL COMMENT '任务状态（0正常 1暂停）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='定时任务调度表';

-- ----------------------------
-- Records of t_sys_quartz_job
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_quartz_job` VALUES ('332182389491109888', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', '*/10 * * * * ?', '12', '1', 1);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_quartz_job_log
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_quartz_job_log`;
CREATE TABLE `t_sys_quartz_job_log` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `job_name` varchar(255) DEFAULT NULL COMMENT '任务名称',
  `job_group` varchar(255) DEFAULT NULL COMMENT '任务组名',
  `invoke_target` varchar(255) DEFAULT NULL COMMENT '调用目标字符串',
  `job_message` varchar(255) DEFAULT NULL COMMENT '日志信息',
  `status` int(11) DEFAULT NULL COMMENT '执行状态（0正常 1失败）',
  `exception_info` varchar(255) DEFAULT NULL COMMENT '异常信息',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='定时任务调度日志表';

-- ----------------------------
-- Records of t_sys_quartz_job_log
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610541354455040', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2019-09-17 00:16:01', '2019-09-17 00:16:01');
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610547549442048', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2019-09-17 00:16:03', '2019-09-17 00:16:03');
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610553832509440', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2019-09-17 00:16:04', '2019-09-17 00:16:04');
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610558995697664', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2019-09-17 00:16:06', '2019-09-17 00:16:06');
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610566486724608', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2019-09-17 00:16:07', '2019-09-17 00:16:07');
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610572270669824', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2019-09-17 00:16:09', '2019-09-17 00:16:09');
INSERT INTO `t_sys_quartz_job_log` VALUES ('354984595927732224', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2019-11-14 23:48:53', '2019-11-14 23:48:53');
INSERT INTO `t_sys_quartz_job_log` VALUES ('354990312722141184', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2019-11-15 00:11:36', '2019-11-15 00:11:36');
INSERT INTO `t_sys_quartz_job_log` VALUES ('354996339316232192', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2019-11-15 00:35:33', '2019-11-15 00:35:33');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_role` VALUES ('393320526766018560', '教练');
INSERT INTO `t_sys_role` VALUES ('488243256161730560', '管理员');
INSERT INTO `t_sys_role` VALUES ('488289006124007424', '会员');
INSERT INTO `t_sys_role` VALUES ('488305788310257664', '能修改用户密码角色');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_user`;
CREATE TABLE `t_sys_role_user` (
  `id` varchar(255) NOT NULL,
  `sys_user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `sys_role_id` varchar(255) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色中间表';

-- ----------------------------
-- Records of t_sys_role_user
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_role_user` VALUES ('353711021275353089', '353711021275353088', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('353714370687143936', '488294747442511872', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('354984037766533120', '354984005751410688', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('354988722443390977', '354988722443390976', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('354989789679849472', '354989789675655168', '488305788310257664');
INSERT INTO `t_sys_role_user` VALUES ('392603506332274688', '368027013392502784', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('393347615607099392', '368382463233363968', '393320526766018560');
INSERT INTO `t_sys_role_user` VALUES ('393349734133272576', '1', '393320526766018560');
INSERT INTO `t_sys_role_user` VALUES ('393349734162632704', '1', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('393368260843802625', '393368260843802624', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('393385787816808448', '393385787812614144', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('393386400751423489', '393386400751423488', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('393387873509969921', '9338787', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('612107905532952576', '612107905532952576', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('612107905537146880', '612107905532952576', '488305788310257664');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_street
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_street`;
CREATE TABLE `t_sys_street` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `street_code` varchar(40) NOT NULL COMMENT '街道代码',
  `area_code` varchar(40) DEFAULT NULL COMMENT '父级区代码',
  `street_name` varchar(50) NOT NULL COMMENT '街道名称',
  `short_name` varchar(30) NOT NULL COMMENT '简称',
  `lng` varchar(20) DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) DEFAULT NULL COMMENT '纬度',
  `sort` int(6) DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) DEFAULT NULL COMMENT '备注',
  `data_state` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`),
  KEY `Index_1` (`street_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='街道设置';

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '主键',
  `username` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户账号',
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户密码',
  `nickname` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户表';

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_user` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '管理员');
INSERT INTO `t_sys_user` VALUES ('2', 'adminpppoooo2', '8769c8e5c430f5a461e10680357bef09', 'pppppppppp');
INSERT INTO `t_sys_user` VALUES ('368026921239449600', 'admin1', 'e00cf25ad42683b3df678c61f42c6bda', '');
INSERT INTO `t_sys_user` VALUES ('368026937181999104', 'admin2', 'c84258e9c39059a89ab77d846ddab909', '');
INSERT INTO `t_sys_user` VALUES ('368027013392502784', '44', '73882ab1fa529d7273da0db6b49cc4f3', '444');
INSERT INTO `t_sys_user` VALUES ('368027030899527680', '5555555', '7a48932b26f04fccb55f0409ba3451fc', '5555555555555');
INSERT INTO `t_sys_user` VALUES ('368027048402358272', '66', '9f0863dd5f0256b0f586a7b523f8cfe8', '6666666666');
INSERT INTO `t_sys_user` VALUES ('368027066563694592', '2222', '0d777e9e30b918e9034ab610712c90cf', '2222222222222222');
INSERT INTO `t_sys_user` VALUES ('368027087866564608', '4444', '9a741f0ad60975ae15d3d83a769442a1', '44444444444');
INSERT INTO `t_sys_user` VALUES ('368027104895438848', '5555', '90a3e7de4de4a1f8bbe3c092858ed812', '555555555555');
INSERT INTO `t_sys_user` VALUES ('368027130728157184', '666', '68bac75ed032e0a86bc3eae1b5c996cf', '666666666');
INSERT INTO `t_sys_user` VALUES ('368027151624179712', '33333333333333', '7b9e4ac60eb7c66e06592cee6dbd0c57', '33333333333333');
INSERT INTO `t_sys_user` VALUES ('368382463233363968', 'adminpppoooo', '8769c8e5c430f5a461e10680357bef09', 'pppppppppp');
INSERT INTO `t_sys_user` VALUES ('393368260843802624', '423', 'e10adc3949ba59abbe56e057f20f883e', '4324');
INSERT INTO `t_sys_user` VALUES ('9338787', 'test', 'e10adc3949ba59abbe56e057f20f883e', 'test');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_vip
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_vip`;
CREATE TABLE `t_sys_vip` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `card` varchar(20) DEFAULT NULL COMMENT '卡号',
  `level` varchar(20) DEFAULT NULL COMMENT '会员级别',
  `balance` decimal(10,2) DEFAULT NULL COMMENT '余额',
  `type` varchar(50) DEFAULT NULL COMMENT '会员卡类型 1月卡 2季卡 3半年卡 4 年卡',
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `create_date` datetime DEFAULT NULL COMMENT '建立时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_sys_vip
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_vip` VALUES (3, '1001', '金卡', 1000.00, '月卡', 1, '2020-02-26 19:00:00', '无', 1, '2020-02-26 19:00:00', 'admin');
INSERT INTO `t_sys_vip` VALUES (6, '44', '4324', 877.00, '月卡', 9338787, '2020-02-28 22:00:00', '', 1, NULL, 'test');
COMMIT;

-- ----------------------------
-- Table structure for t_test
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `age` int(11) DEFAULT NULL COMMENT '性别',
  `cratetime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试表';

SET FOREIGN_KEY_CHECKS = 1;
