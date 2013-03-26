<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<body>
	<!-- BEGIN Side Bar -->
	<div id="${param.sideBarId }">
		<div id="home-tag">
			<!--home tag -->
			<a href="index.php"> </a>
		</div>
		<p class="slogantext"><a href="${basePath }index.do">Teddy&Shall</a></p>
		<p>&nbsp;</p>
		<div id="sidebar">
			<ul>
				<li>
					<!-- Search Begin -->
					<form name="form" id="searchform" action="http://www.hui-xiu.com/"
						method="post">
						<input name="s" type="text" class="searchInput" id="text"
							onBlur="mousedown()" onClick="mouseover()" /> <input
							class="searchBtn" type="submit" id="searchsubmit" value="搜 索" />
					</form> <!-- Search End -->
				</li>
			</ul>
			<ul>
				<li>
					<div class="sidebar-titletagcolor">
						<h3 class="pagetitle">页面</h3>
					</div>
					<ul>
						<li class="page_item page-item-32836"><a
							href="http://www.hui-xiu.com/login-2/">Log In</a></li>
					</ul>
				</li>
				<li>
					<div class="sidebar-titletagcolor">
						<h3 class="pagetitle">新文</h3>
					</div>
					<ul>
						<li><a
							href="http://www.hui-xiu.com/%e5%b8%b8%e7%94%a8%e8%b0%83%e7%94%a8%e4%bb%a3%e7%a0%81/">常用调用代码</a>
						</li>
					</ul>
				</li>
				<li>
					<div class="sidebar-titletagcolor">
						<h3 class="pagetitle">热评</h3>
					</div>
					<ul>
						<ul>
							<li><a href="#" title="on 流口水ing"> 快点好吧</a></li>
						</ul>
					</ul>
				</li>
				<li>
					<div class="sidebar-titletagcolor">
						<h3 class="pagetitle">标签云</h3>
					</div>
				</li>
				<li>
					<div class="sidebar-titletagcolor">
						<h3 class="pagetitle">文章分类</h3>
					</div>
					<ul>
						<li class="cat-item cat-item-107"><a
							href="http://www.hui-xiu.com/category/wordpress-computer/"
							title="View all posts filed under wordpress">wordpress</a>
						</li>
					</ul>
				</li>
				<li>
					<div class="sidebar-titletagcolor">
						<h3 class="pagetitle">链接表</h3>
					</div>
					<ul class='xoxo blogroll'>
						<li><a href="http://feifeii.com/" title="others"
							target="_blank">...</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
