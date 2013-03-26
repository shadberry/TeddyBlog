<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"/>
<meta content="true" name="mssmarttagspreventparsing" />
<meta http-equiv="imagetoolbar" content="no" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Shall' Blog</title>
<link href="<%=basePath%>css/style.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<!-- BEGIN Wrapper -->
	<div id="wrapper_home">
		<!-- BEGIN Header -->
		<div id="header_shall_home"></div>
		<!-- END Header -->

		<!-- BEGIN Main Container -->
		<div id="content_shall_home">
			<!-- BEGIN Side Bar -->
			<s:include value="../common/sideBar.jsp">
				<s:param name="sideBarId" value="'home_shall_bar'" ></s:param>
			</s:include>
			<!-- BEGIN Shall Content -->
			<div class="article_show">
				<div id="home_shall_article">
					<div id="article_title">
						${article.title }
					</div>
					<div id="article_info">
						${article. createddate}
					</div>
					<div id="article_text">
						${articleContent }
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- END Wrapper -->
</body>
</html>
