<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!--footer start -->
	<div id="footerMain">
		<div id="footer">
			<ul>
				<li><a href="#">Home Page</a></li>
				<li><a href="#">Categories</a></li>
				<li><a href="#">About us</a></li>
				<li><a href="#">Make Contact</a></li>
			</ul>
			<p class="copyright">Copyright &copy;Teddy 2013. All Rights
				Reserved.</p>
			<a href="http://validator.w3.org/check?uri=referer" class="xhtml"></a>
			<a href="http://jigsaw.w3.org/css-validator/check/referer"
				class="css"></a>
		</div>
	</div>
	<!--footer end -->