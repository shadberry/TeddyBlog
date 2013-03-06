<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<title>free-css-templates-289</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" />
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
			<%System.out.println(1); 
				System.out.println(request.getAttribute("articleList"));
			%>
			<s:iterator status="status" value="#request.articleList"  id="article">
				<!-- BEGIN Article, Post, Product, Item... -->
				<div class="post">
					<!-- BEGIN item's title -->
					<a href="#" class="post_title"><s:property value='#article.title'/></a>
					<!-- BEGIN item's info: date, author... -->
					<span class="date"><s:property value="#article.createddate"/> Posted by: designer, 20 comments</span>
					<!-- BEGIN item's content -->
					<p>
						<s:property value="#article.summary" />
					</p>
					<br class="clr"/>
					<!-- Read More button -->
					<div class="read_post"><a href="#">Read More ...</a></div>
					<hr/>
				</div> 
			</s:iterator>
			<!-- BEGIN Article, Post, Product, Item... -->
			<div class="post">
				<!-- BEGIN item's title -->
				<a href="#" class="post_title">Logo Design Process Tutorial</a>
				<!-- BEGIN item's info: date, author... -->
				<span class="date">February 28th, 2009 Posted by: designer, 20 comments</span>
				
				<!-- BEGIN item's content -->
				<p><a href="#"><img border="0" alt="Logo design tutorial by DryIcons" src="images/tutorial_index.jpg"/></a></p>
				<p><strong><span style="font-size: 14pt;">Introduction</span></strong></p>
				<p>
				One of the main aspects of the branding process includes logo development. Your logo, or <em>brand mark</em>, in other words, needs to reflect your brand accurately, as it will play a huge role in your brand recognition. This however doesn't mean that the branding process ends when you've developed your logo, branding takes a lot of time, commitment, managing skills and finally, the ability to reflect the image you want others to have of you and your business</p>
				<p>This tutorial is intended to benefit both our potential <em>clients</em>, so they can have a fully comprehensive overview of our logo design process and methods; and many of our <em>users</em>, interested in the process of designing and developing a logo.</p>
				<p>For the purpose of this tutorial, we're going to design and develop a logo for an imaginary company, called "LTD", short from Logo Tutorial by DryIcons.</p>
				<br class="clr"/>
				<!-- Read More button -->
				<div class="read_post"><a href="#">Read More ...</a></div>
				<hr/>
			</div>
			<!-- END Article, Post, Product, Item... -->
			
			<!-- BEGIN Article, Post, Product, Item... -->
			<div class="post">
				<a href="#" class="post_title">865171.cn 2.0</a>
				<span class="date">February 5th, 2009 Posted by: radiohead, 5 comments</span>
				<p><a style="border: 0pt none;" href="#"><img border="0" alt="DryIcons Redesign" src="images/dryicons_redesign.jpg"/></a></p>
				<p>The DryIcons website has grown so much in the past year, it's slowly becoming a monster (but it's one of those cute ones). Well aware of this fact we've made a monstrous decision to redesign the DryIcons website. We assure you, this was not an easy decision to make, but as time passed, the redesign project became a necessity, so the need to update the design was kind of self-made (by our monster-child), it was simply inevitable.
				</p>
				<br class="clr"/>
				<div class="read_post"><a href="#">Read More ...</a></div>
				<hr/>
			</div>
			<!-- END Article, Post, Product, Item... -->
			
			
			<!-- BEGIN Pagination -->
			<div id="pagination">
				<span class="previous"> </span>
				<span class="pag_num_activ">1</span>
				<a href="#page-2-goes-here" class="pag_num">2</a>
				<a href="#page-3-goes-here" class="pag_num">3</a>
				<a href="#page-4-goes-here" class="pag_num">4</a>
				<a href="#page-5-goes-here" class="pag_num">5</a>
				<a href="#page-2-is-next" class="next"></a>
			</div>
			<!-- END Pagination -->
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
			<div id="foo_dry"><a href="/#/" target="_blank">Free Template and Icons</a></div>
			<div id="foo_badge"><a href="/#/" target="_blank"></a></div>
		</div>
	</div>
	<!-- END Footer -->
</div>
<!-- END Wrapper -->
</body>
</html>
