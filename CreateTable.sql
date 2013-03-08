#drop table `blog`.`t_article`;
#drop table `blog`.`t_user`;
#drop table `blog`.`t_visitor`;
#drop table `blog`.`userstate`;
-- �û���
CREATE TABLE blog.T_USER (
	id INT auto_increment NOT NULL PRIMARY KEY,	-- id
	NAME VARCHAR (50) NOT NULL,	-- �û�����
	description VARCHAR (500),	-- �û�����
	cellphone VARCHAR (50),	-- �绰
	email VARCHAR (50),	-- EMAIL
	sex VARCHAR (10), -- �Ա�
	username VARCHAR (50) NOT NULL UNIQUE, -- �˺�
	PASSWORD VARCHAR (50) NOT NULL -- ����
);

-- �ÿͱ�
CREATE TABLE blog.T_VISITOR (
	id INT auto_increment NOT NULL PRIMARY KEY, -- ID
	username VARCHAR(50) NOT NULL UNIQUE, -- �ÿ�����
	password VARCHAR(50) NOT NULL, -- ��ʱ����
	description VARCHAR(500), -- ����
	createddate datetime NOT NULL, -- ����ʱ��
	ipaddress VARCHAR(50) -- ip��ַ
);

-- �ĵ���
CREATE TABLE blog.T_ARTICLE (
	id INT auto_increment NOT NULL PRIMARY KEY, -- ID
	TITLE VARCHAR(100) NOT NULL, -- ����
	SUMMARY VARCHAR(500), -- ժҪ
	CONTENT BLOB, -- ����
	createddate DATE, -- ��������
	createduserid INTEGER, -- ������
	modifydate DATE -- �޸�����
	modifyuserid INTEGER -- �޸���
);