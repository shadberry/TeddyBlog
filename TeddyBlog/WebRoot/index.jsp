<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<title>Teddy and Shall's blog</title>
<link href="<%=basePath %>css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<!--body start -->
	<div id="body">
		<a href="index.html"><img src="<%=basePath %>images/logo.gif" alt="Iinfinite"
			title="Iinfinite" width="197" height="64" border="0" /> </a>
		<p class="toptxt">Phasellus consequat</p>
		<!--left panel start -->
		<div id="left">
			<ul class="menu">
				<li><a href="#" class="home"></a></li>
				<li><a href="#" class="about"></a></li>
			</ul>
			<p class="leftTop"></p>
			<ul class="menu2">
				<li><a href="#">Latest Profiles</a></li>
				<li><a href="#">Support</a></li>
				<li><a href="#">More About Depertment</a></li>
				<li><a href="#">Blog</a></li>
				<li><a href="#">Cliet Testimonials</a></li>
				<li><a href="#">About Organigation</a></li>
				<li><a href="#">Our Work</a></li>
				<li class="noBdr"><a href="#">Make Contact</a></li>
			</ul>
			<p class="leftBot"></p>
			<h2 class="mem">Members login</h2>
			<form name="member_login" action="#" method="post">
				<input type="text" name="name" value="-Your Name-" class="txtBox" />
				<input type="password" name="password" value="-password-"
					class="txtBox" /> <input type="submit" name="go" value=""
					class="go" /> <br class="spacer" />
			</form>
			<a href="#" class="register">Register here</a> <br class="spacer" />
		</div>
		<!--left panel end -->
		<!--right panel start -->
		<div id="right">
			<h2 class="why">why infinite extent123</h2>
			
			<p class="rightTxt1">
				<span>Morbi sollicitudin, augue a fringilla</span> pharetra, tellus
				risus malesuada nisi, id dignissim eros magna eget erat. Proin sit
				amet turpis. Proin nec lectus eget urna placerat euismod.
			</p>
			<p class="rightTxt2">Nullam egestas condimentum est. Sed
				venenatis urna ut nibh. Nunc laoreet commodo dui. Integer vehicula.
				Nunc pharetra ante et tortor. Morbi vel tellus et est varius dictum.
				Nunc sit amet risus. Integer tortor mauris, dapibus pharetra,
				dignissim nec, luctus vel, augue. Pellentesque habitanmorbi
				tristique senectus et netus eteuspendisse diam. Nullam fermentum.
				Phasellus elit. Morbi dapibim id ligula. Curabitur malesuada
				dignissim diam.</p>
			<p class="rm">
				<a href="#">read more</a>
			</p>
			<!--update start -->
			<div id="update">
				<h2>latest update</h2>
				<p class="updateTxt">
					<span>on 23rd march 2007</span><b>Nam consequat, orci at</b><br />
					pharetra elit arcu sit amet quam. ante ipsum primis in faucibus
					orci luctus et ultrices posre cubilia Curae
				</p>
				<a href="#" class="readmore2">read more</a>
				<p class="updateTxt">
					<span>on 29th march 2007</span><b>vitae interdum justo quama</b>
					metus. Nunc felis. Morbi vitae ligula vel lorem luctus lobois.
					Nullam egestas a iaculis orci erat id tellus
				</p>
				<a href="#" class="readmore2">read more</a> <br class="spacer" />
			</div>
			<!--update end -->
			<!--service start -->
			<div id="service">
				<h2>our service</h2>
				<p class="serviceTxt">
					<b>Curabitur nonummy.</b><br /> Maecenas iaculis nonummy dolor.
					Sed sed risus ut felis pellentesque suscipit. Morbi sit amet
					libero.
				</p>
				<p class="serviceTxt">
					<b>Phasellus porta nulla id risus.</b> Maecenas fermentum, tellus
					id tempor posuere, urna risus posuere
				</p>
				<p class="serviceTxt">
					<b>pede, in semper tortor nisi eu</b> massa. Quisque accumsan,
					diaeu egestas ullamcorper a iaculierat id tellus. Fusce dolor
					nulla,
				</p>
				<br class="spacer" />
			</div>
			<!--service end -->
			<br class="spacer" />
		</div>
		<!--right panel end -->
		<br class="spacer" />
	</div>
	<!--body end -->
	<!--footer start -->
	<div id="footerMain">
		<div id="footer">
			<ul>
				<li><a href="#">Latest Profiles</a>|</li>
				<li><a href="#">Support</a>|</li>
				<li><a href="#">More About Depertment</a>|</li>
				<li><a href="#">Blog</a>|</li>
				<li><a href="#">Cliet Testimonials</a>|</li>
				<li><a href="#">About Organigation</a>|</li>
				<li><a href="#">Our Work</a>|</li>
				<li><a href="#">Make Contact</a></li>
			</ul>
			<p class="copyright">Copyright ?infinite extend 20XX. All Rights
				Reserved.</p>
			<a href="http://validator.w3.org/check?uri=referer" class="xhtml"></a>
			<a href="http://jigsaw.w3.org/css-validator/check/referer"
				class="css"></a>
		</div>
	</div>
	<!--footer end -->
	<div style="display:none">
		<script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540'
			language='JavaScript' charset='gb2312'></script>
	</div>
</body>
</html>

