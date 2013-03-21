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
<meta content="true" name="mssmarttagspreventparsing" />
<meta http-equiv="imagetoolbar" content="no" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Teddy' Blog</title>
<link href="<%=basePath%>css/style.css" rel="stylesheet"
	type="text/css" />
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
			<div id="home_teddy_article">
				<div id="article_title">
					${article.title }
				</div>
				<div id="article_info">
					${article. createddate}
				</div>
				<div id="article_text">
					${article.content }
				</div>
			</div>
			
			<!-- BEGIN Side Bar -->
			<div id="home_teddy_bar">
				<div id="home-tag">
					<!--home tag -->
					<a href="index.php"> </a>
				</div>
				<p class="slogantext">123</p>
				<p class="slogantext-small">(Teddy&Shall)</p>
				<p>&nbsp;</p>
				<div id="sidebar">
					<ul>
						<li>
							<!-- Search Begin -->
							<form name="form" id="searchform"
								action="http://www.hui-xiu.com/" method="post">
								<input name="s" type="text" class="searchInput" id="text"
									onBlur="mousedown()" onClick="mouseover()" /> <input
									class="searchBtn" type="submit" id="searchsubmit" value="搜 索" />
							</form> <!-- Search End --></li>
					</ul>
					<ul>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">页面</h3>
							</div>
							<ul>
								<li class="page_item page-item-32836"><a
									href="http://www.hui-xiu.com/login-2/">Log In</a>
								</li>
							</ul></li>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">新文</h3>
							</div>
							<ul>
								<li><a
									href="http://www.hui-xiu.com/%e5%b8%b8%e7%94%a8%e8%b0%83%e7%94%a8%e4%bb%a3%e7%a0%81/">常用调用代码</a>
								</li>
							</ul></li>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">热评</h3>
							</div>
							<ul>
								<ul>
									<li><a href="#" title="on 流口水ing"> 快点好吧</a>
									</li>
								</ul>
							</ul></li>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">标签云</h3>
							</div></li>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">文章分类</h3>
							</div>
							<ul>
								<li class="cat-item cat-item-107"><a
									href="http://www.hui-xiu.com/category/wordpress-computer/"
									title="View all posts filed under wordpress">wordpress</a></li>
							</ul></li>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">链接表</h3>
							</div>
							<ul class='xoxo blogroll'>
								<li><a href="http://feifeii.com/" title="others"
									target="_blank">...</a>
								</li>
							</ul></li>
					</ul>
				</div>
			</div>

		</div>
	</div>
	<!-- END Wrapper -->
</body>
</html>
