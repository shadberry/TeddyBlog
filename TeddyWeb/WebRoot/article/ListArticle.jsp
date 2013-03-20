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

			<div id="home_bar">
				<div id="home-tag">
					<!--home tag -->
					<a href="index.php" tppabs="http://huihuiweb.cn/photo-2/"><img
						src="wp-content/themes/rinwendyrev1/images/tag_home.jpg"
						tppabs="http://huihuiweb.cn/wp-content/themes/rinwendyrev1/images/tag_home.jpg" />
					</a>
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
								<li class="page_item page-item-31771"><a
									href="http://www.hui-xiu.com/about-2/">关于</a>
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
								<li><a
									href="http://www.hui-xiu.com/%e5%8f%88%e4%b8%80%e9%83%a8%e5%8e%a6%e9%97%a8%e6%8b%8d%e7%9a%84%e5%89%a7-%e3%80%8a%e8%b4%a4%e5%a6%bb%e3%80%8b/">又一部厦门拍的剧&#8211;《贤妻》</a>
								</li>
							</ul></li>
						<li>
							<div class="sidebar-titletagcolor">
								<h3 class="pagetitle">热评</h3>
							</div>
							<ul>
								<ul>
									<li><a
										href="http://www.hui-xiu.com/%e6%b5%81%e5%8f%a3%e6%b0%b4ing/#comment-3326"
										title="on 流口水ing">狒狒: 快点好吧</a>
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
								<li class="cat-item cat-item-106"><a
									href="http://www.hui-xiu.com/category/biology/"
									title="View all posts filed under 分子生物">分子生物</a></li>
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
					<p>&nbsp;</p>
					<p>&nbsp;</p>
				</div>
			</div>

			<div id="home_shallside">
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

