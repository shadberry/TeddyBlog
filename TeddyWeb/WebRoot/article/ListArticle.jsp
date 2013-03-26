<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Teddy and Shall</title>
<link rel="stylesheet" href="${basePath }css/style.css" type="text/css" />
</head>
<body>
	<div id="wrapper_home">
		<div id="header_home">
			<!-- header -->
			<a href="" >
				<img src="#" />
			</a>
		</div>
		<div id="content_home">
			<div id="home_teddyside">
				<div><h3><a href="${basePath }writeTeddyArticle.do">New Article</a></h3></div>
				<!-- The Loop -->
				<s:iterator status="status" value="#request.teddyArticleList"  id="article">
					<s:if test="#status.odd">
					<div class="post_summary_1">
						<div class="post_inner_1" >
					</s:if>
					
					<s:else>
					<div class="post_summary_4">
						<div class="post_inner_4" >
					</s:else>
							<div class="post_title">
								<h4>
									<!-- BEGIN item's title -->
									<a href="${basePath }showTeddyArticle.do?id=${article[0]}" class="post_title"><s:property value='#article[1]'/></a>
									<a href="${basePath }editTeddyArticle.do?id=${article[0] }">(edit)</a>
								</h4>
							</div>
							<!-- BEGIN item's content -->
							<div class="homeentry">
								<p>${article[2] }</p>
							</div>
							<!-- Read More button -->
							<div class="post_read"><a href="${basePath }showArticle.do?id=${article[0]}">Read More ...</a></div>
							<!-- Comment Count -->
							<div class="post_comment">Comment: </div>
							<!-- BEGIN item's info: date, author... -->
							<div class="post_time">
								<span class="date">${article[4] } Posted by: designer, 20 comments</span>
							</div>
						</div>
					</div>
				</s:iterator>
				<!-- End Loop-->
			</div>

			<!-- BEGIN Side Bar -->
			<s:include value="../common/sideBar.jsp">
				<s:param name="sideBarId" value="'home_bar'" ></s:param>
			</s:include>

			<div id="home_shallside">
				<div><h3>New Article</h3></div>
				<!-- The Loop -->
				<s:iterator status="status" value="#request.shallArticleList"  id="sa">
					<s:if test="#status.odd">
					<div class="post_summary_2">
						<div class="post_inner_2" >
					</s:if>
					
					<s:else>
					<div class="post_summary_3">
						<div class="post_inner_3" >
					</s:else>
							<div class="post_title">
								<h4>
									<!-- BEGIN item's title -->
									<a href="${basePath }showShallArticle.do?id=${sa[0]}" class="post_title"><s:property value='#sa[1]'/></a>
									<a href="${basePath }editShallArticle.do?id=${article[0] }">(edit)</a>
								</h4>
							</div>
							<!-- BEGIN item's content -->
							<div class="homeentry">
								<p>${sa[2] }</p>
							</div>
							<!-- Read More button -->
							<div class="post_read"><a href="${basePath }showArticle.do?id=${sa[0]}">Read More ...</a></div>
							<!-- Comment Count -->
							<div class="post_comment">Comment: </div>
							<!-- BEGIN item's info: date, author... -->
							<div class="post_time">
								<span class="date">${sa[4] } Posted by: designer, 20 comments</span>
							</div>
						</div>
					</div>
				</s:iterator>
				<!-- End Loop-->
			</div>
		</div>
		<div id="footer_home">
			<div class="oldposts">
				<a href="http://www.hui-xiu.com/page/2/"><img
					src="wp-content/themes/rinwendyrev1/images/main_olderpost.jpg"
					tppabs="http://huihuiweb.cn/wp-content/themes/rinwendyrev1/images/main_olderpost.jpg"
					alt="前一页" />
				</a>
			</div>
			<div class="newposts"></div>
		</div>
		<!-- start footer -->
		<div id="footer">
			<p>
				&copy;Copyright 2012, Teddy<br />

			</p>
		</div>
	</div>
</body>
</html>
<!-- Dynamic Page Served (once) in 0.336 seconds -->
<!-- Cached page served by WP-Super-Cache -->
<!-- WP Super Cache is installed but broken. The path to wp-cache-phase1.php in wp-content/advanced-cache.php must be fixed! -->

