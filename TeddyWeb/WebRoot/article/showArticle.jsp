<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta content="true" name="mssmarttagspreventparsing" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Teddy' Blog</title>
	<link href="<%=basePath %>css/style.css" rel="stylesheet" type="text/css" />
	<!-- IE fixes -->
	<!--[if lte IE 6]>
	<style type="text/css">
		.side_link, .previous, .next {_height:25px;}
		span.next, span.previous {filter: alpha(opacity=50);}
		.urbanism_logo {margin:75px 0px 0 0px;}
		.cntitle_home{margin-top:25px;}
		.cntitle_graphics{margin-top:35px;}
		.cntitle_articles{margin-top:20px;}
		.cntitle_contact{margin-top:25px;}
		.cntitle_rss{margin-top:17px;}
	</style>
	<![endif]-->
	<script type="text/javascript">
	// Javascript:
	// --= Value setter for the search input: 
	function clS(t){
		var srch = document.getElementById('s'), val = srch.value.toString().toLowerCase(), re = /^\s+$/;
		if(t) {
			if(val == 'search...' || val == 'search'){ 
				srch.value = '';
			}
		} else {
			if(val == 'search...' || val == 'search' || val == '' || re.test(val)) {
				srch.value = 'Search...';
			}
		}
	}
	</script>
</head>
<body>
<!-- BEGIN Wrapper -->
<div id="cnt">
	<!-- BEGIN Header -->
	<div id="header">
		<div class="urbanism_logo"><a href="#"></a></div>
		<!-- BEGIN Main Menu -->
		<div id="menu">
			<!-- ::Main Menu Item -->
			<dl id="title_home" class="menu_home">
				<dt class="menu_tit"><span>Home</span></dt>
				<dd><a class="mlink" href="index.htm"></a></dd>
			</dl>
			
			<!-- ::Main Menu Item -->
			<dl id="title_graphics" class="menu_graphics">

				<dt class="menu_tit"><span>Graphics</span></dt>
				<dd><a class="mlink" href="article.html"></a></dd>
			</dl>
			<dl id="title_articles" class="menu_articles">
				<dt class="menu_tit"><span>Articles</span></dt>
				<dd><a class="mlink" href="index.htm"></a></dd>
			</dl>
			
			<!-- ::Main Menu Item -->
			<dl id="title_contact" class=menu_contact>

				<dt class="menu_tit"><span>Contact</span></dt>
				<dd><a class="mlink" href="contact.html"></a></dd>
			</dl>
			
			<!-- ::Main Menu Item RSS Feed -->
			<dl id="title_rss">
				<dd><a class="menu_rss" href="#"></a></dd>
			</dl>
			
			<!-- BEGIN Search Form -->
			<div id="search">
				<form id="search_form" action="" method="get">
					<input class="search_field" type="text" value="Search..."  name="s" id="s" onfocus="clS(1);" onblur="clS(0);" />
					<input class="search_button" type="submit"  value="" id="searchsubmit" />
				</form>
			</div>
			<!-- END Search Form -->
		</div>
		<!-- END Main Menu -->
	</div>
	<!-- END Header -->
	
	<!-- BEGIN Main Container -->
        <div id="content">
		
		<!-- BEGIN Left Column Container -->
		<div id="lcont">
			<!-- BEGIN Article, Post, Product, Item... -->
			<div class="post">
				<!-- BEGIN item's title -->
				<a href="#" class="post_title">${article.title }</a>
				<!-- BEGIN item's info: date, author... -->
				<span class="date">${article.createddate } Posted by: designer, 20 comments</span>
				
				<!-- BEGIN item's content -->
				<p>
				${article.content }
				</p>
				<br class="clr" />
				<div class="view_comments">
					<a href="#comments">8 Comments</a>
				</div>
			</div>
			<!-- END Article, Post, Product, Item... -->
			
			
			<!-- BEGIN Comments -->
			<a name="comments"></a>
			<div id="all_comments">
				<div class="comment">
					<div class="comment_header">
						<p>1. Persia Emily <span>Says:</span></p>
						<span class="comment_time">Fevruary 20th, 2009 20:29</span><br />
						<div class="avatar">
							<div class="avatar_frame"></div>	
						</div>
					</div>
					<div class="comment_text">
						<div>
							<p>How excited I am! Coquette Part4 comes out! I love Dryicons' products very much!</p>
							<p>They're all good!</p>
						</div>
					</div>
				</div>
			</div>
			<div id="post_your_comment">
				<div id="contact">
					<h3>Post your comment</h3>
					<form action="#" method="post" id="contact_form">
						<div id="input_fields">
							<div class="contact_name">

								<input type="text" maxlength="255" /><div class="cn"><strong>Name</strong> (required)</div><br />
							</div>
							<div class="contact_name">
								<input type="text" maxlength="255" /><div class="cn"><strong>E-mail</strong> (will not be published) (required)</div><br />
							</div>
							<div class="contact_name">

								<input type="text" maxlength="255" /><div class="cn"><strong>Website</strong> </div><br />
							</div>
							<div class="contact_text">
								<textarea cols="78" rows="9"></textarea>
							</div>
							<div class="submit">
								<input class="submit_button" type="submit" name="submin" value="Post comment" tabindex="5" />

							</div>
						</div>
					</form>
				</div>
			</div>
			<!-- END Comments -->
			
		</div>
		<!-- END Left Column Container -->
		
		<!-- BEGIN Right Column Container a.k.a. Sidebar -->
		<div id="rcont">
			<!-- BEGIN Sidebar Categories -->
			<h3 class="category">Categories</h3>
			<div id="categories">
				<a class="side_link" href="#">Free Icons</a>
				<a class="side_link" href="#">Custom Icons</a>
				<a class="side_link" href="#">Vector Graphics</a>
				<a class="side_link" href="#">Blog</a>
				<a class="side_link" href="#">Free Templates</a>
			</div>
			<!-- BEGIN Sidebar Categories -->
			
			<!-- BEGIN Sidebar Sponsors -->
			<h3 class="category">Our Sponsors</h3>
			<div class="sponsor">
				<a href="/advertise/"><img src="images/advertise_here.jpg" width="200" height="100" alt="Advertise here" /></a>
				<a href="/advertise/"><img src="images/advertise_here.jpg" width="200" height="100" alt="Advertise here" /></a>
			</div>
			<!-- END Sidebar Sponsors -->
			
			<!-- BEGIN Sidebar Recent Posts -->
			<h3 class="category">Recent Posts</h3>
			<div id="side_posts">
				<a class="side_link" href="#">Logo Design Process Tutorial</a>
				<a class="side_link" href="#">Great use of pop music in great films</a>
				<a class="side_link" href="#">Icon design tutorial: How to make a Calendar icon</a>
				<a class="side_link" href="#">865171.cn 2.0</a>
				<a class="side_link" href="#">1st Anniversary and Graphics Giveaway Winners</a>
			</div>
			<!-- END Sidebar Recent Posts -->
			
			
			<!-- BEGIN Sidebar Recent Comments -->
			<h3 class="category">Recent Comments</h3>
			<div id="side_comments">
				<a class="side_link" href="#">Coder Says:<br />No problem!</a>
				<a class="side_link" href="#">Designer Says:<br />Thanks Coder.</a>
				<a class="side_link" href="#">PF Says:<br />Keep talking!</a>
				<a class="side_link" href="#">RH Says:<br />Paranoid Android</a>
			</div>
			<!-- END Sidebar Recent Comments -->
		</div>
		<!-- END Right Column Container -->
	</div>
	<!-- END Main Container -->
	
	<!-- BEGIN Footer -->
	<div id="footer">
		<div id="lfoo">
			<div id="llfoo">
				<div id="about_photo"><div class="about_frame"></div></div>
			</div>
			
			<div id="rlfoo">
				<div id="about_text">
					<h3>About me</h3>
					<div class="about_hr"><hr /></div>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer faucibus nunc vel orci. Proin ante quam, porta sit amet, semper eu, vulputate ut, quam. Nunc facilisis iaculis elit. Aliquam suscipit elit in urna. Aenean tellus mauris, vehicula vitae, lobortis nec, porttitor non, sapien. Donec metus pede, scelerisque in, sodales ac, viverra a, risus. Aliquam erat volutpat. Duis eget tellus vitae libero suscipit rutrum. Suspendisse lobortis.</p>
				</div>
			</div>
		</div>
		
		<div id="rfoo">
			<!-- BEGIN Twitter -->
			<div id="twitter_logo"></div>
			<div class="twitter_hr"><hr /></div>
			<div id="twitter_text">
				<p>
				<span>@ Mon 27 Apr 2009 20:15</span>
				Great day for freedom:
				<a class="twitter_link" href="/#//free-graphics/preview/thank-you-card/" target="_blank">Thank you card</a>
				</p>
				<p>
					<span>@ Sat 24 Apr 2009 08:43</span>
					Flowery background: Vector Graphic
					<a class="twitter_link" href="/#//free-graphics/preview/flowery-background/" target="_blank">Flowery background</a>
				</p>
			</div>
			<div id="twitter_follow"><a href="http://twitter.com/dryicons" target="_blank"></a></div>
			<!-- END Twitter -->
		</div>
		
		<!-- DryIcons credit: Do not remove the following code if you are using this template under the DryIcons Free License Terms of Use 
		     If you'd like to use this theme without the obligatory back-link to /#// please 
		     consider using it under the DryIcons Commercial License Terms 
		     For details see /#//terms/ -->
		<div id="bfoo">
			<div id="foo_copy"><p>&copy;2009 Urbanism. All rights reserved.</p></div>
			<div id="foo_dry"><a href="/#/" target="_blank">Free Template and Icons </a></div>
			<div id="foo_badge"><a href="/#/" target="_blank"></a></div>
		</div>
	</div>
	<!-- END Footer -->
</div>
<!-- END Wrapper -->
</body>
</html>
