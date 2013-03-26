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
<title>Teddy' Blog</title>
<link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath%>js/ckeditor/ckeditor.js"></script>
</head>
<body>
	<!-- BEGIN Wrapper -->
	<div id="wrapper_home">
		<!-- BEGIN Header -->
		<div id="header_teddy_home"></div>
		<!-- END Header -->

		<!-- BEGIN Main Container -->
		<div id="content_teddy_home">
			<!-- BEGIN Teddy Content -->
			<form action="${basePath }saveTeddyArticle.do" method="post">
				<div id="home_teddy_article">
					<div class="article_write">
						<p>
							<label for="articleTitle">
								<strong>Title:</strong>
							</label>
							<br/>
							<input type="text" size="70" maxlength="100"  name="articleTitle" id="articleTitle" />
						</p>
						<p>
							<label for="articleContent">
								<strong>Content:</strong>
							</label>
							<textarea class="ckeditor" name="articleContent"  id="articleContent"></textarea>
						</p>
						<div style="margin-top: 10px;">
							<p>
									<input  type="submit" value="Post Article" style="font-weight: bold;" />
							</p>
						</div>
					</div>
				</div>
			</form>
			<!-- BEGIN Side Bar -->
			<s:include value="../common/sideBar.jsp">
				<s:param name="sideBarId" value="'home_teddy_bar'" ></s:param>
			</s:include>
		</div>
	</div>
	<!-- END Wrapper -->
</body>
</html>
