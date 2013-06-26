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
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Teddy and Shall's blog</title>
<link href="${basePath }css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${basePath }js/ckeditor/ckeditor.js"></script>
</head>
<body>
	<!--body start -->
	<div id="body">
		<!--left panel start -->
		<s:include value="../common/leftSideBar.jsp"></s:include>
		<!--left panel end -->
		<!--right panel start -->
		<div id="right">
			<!-- BEGIN Teddy Content -->
			<form action="${basePath }article!saveEdit.do" method="post">
				<div id="home_teddy_article">
					<div class="article_write">
						<p>
							<label for="articleTitle">
								<strong>Title:</strong>
							</label>
							<br/>
							<input type="text" size="70" maxlength="100"  name="articleTitle" id="articleTitle"  value="${article.title }"/>
						</p>
						<p>
							<label for="articleContent">
								<strong>Content:</strong>
							</label>
							<textarea class="ckeditor" name="articleContent"  id="articleContent">${articleContent }</textarea>
						</p>
						<p>
							<label for="articleTags">
								<strong>Tags:</strong>
							</label>
							<br/>
							<input type="text" size="70" maxlength="100"  name="articleTags" id="articleTags"  value="${articleTags }"/>
						</p>
						<div style="margin-top: 10px;">
							<p>
									<input  type="button" value="Cancel Edit" style="font-weight: bold;" onclick="javascript:window.location.href='${basePath}article!show.do?id=${article.id}'"/>
									<input  type="submit" value="Post Article" style="font-weight: bold;" />
							</p>
						</div>
						<input type="hidden" id="id" name="id" value="${article.id}" />
					</div>
				</div>
			</form>
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
