#drop table `blog`.`t_article`;
#drop table `blog`.`t_user`;
#drop table `blog`.`t_visitor`;
#drop table `blog`.`userstate`;
-- 用户表
CREATE TABLE blog.T_USER (
	id INT auto_increment NOT NULL PRIMARY KEY,	-- id
	NAME VARCHAR (50) NOT NULL,	-- 用户名称
	description VARCHAR (500),	-- 用户描述
	cellphone VARCHAR (50),	-- 电话
	email VARCHAR (50),	-- EMAIL
	sex VARCHAR (10), -- 性别
	username VARCHAR (50) NOT NULL UNIQUE, -- 账号
	PASSWORD VARCHAR (50) NOT NULL -- 密码
);

-- 访客表
CREATE TABLE blog.T_VISITOR (
	id INT auto_increment NOT NULL PRIMARY KEY, -- ID
	username VARCHAR(50) NOT NULL UNIQUE, -- 访客名称
	password VARCHAR(50) NOT NULL, -- 临时密码
	description VARCHAR(500), -- 描述
	createddate datetime NOT NULL, -- 创建时间
	ipaddress VARCHAR(50) -- ip地址
);

-- 文档表
CREATE TABLE blog.T_ARTICLE (
	id INT auto_increment NOT NULL PRIMARY KEY, -- ID
	TITLE VARCHAR(100) NOT NULL, -- 标题
	SUMMARY VARCHAR(500), -- 摘要
	CONTENT BLOB, -- 内容
	createddate DATE, -- 创建日期
	createduserid INTEGER, -- 创建者
	modifydate DATE -- 修改日期
	modifyuserid INTEGER -- 修改者
);