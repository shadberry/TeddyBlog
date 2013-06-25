<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Teddy and Shall's blog</title>
<link href="${basePath }css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<!--body start -->
	<div id="body">
		<!--left panel start -->
		<s:include value="../common/leftSideBar.jsp"></s:include>
		<!--left panel end -->
		<!--right panel start -->
		<div id="right">
			<a href="${basePath }article!edit.do?id=${article.id}" class="register">Edit</a> 
			<!-- An ariicle -->
			<h2 class="why">
					${article.title }
			</h2>
			<!-- The Article Content -->
			<div class="articleContent">
				${articleContent }
			</div>
			<br class="spacer" />
		</div>
		<!--right panel end -->
		<br class="spacer" />
	</div>
	<!--body end -->
	<!--footer start -->
	<s:include value="../common/footBar.jsp"></s:include>
	<!--footer end -->
</body>
</html>
