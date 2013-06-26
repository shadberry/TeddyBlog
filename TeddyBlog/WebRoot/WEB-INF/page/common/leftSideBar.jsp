<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!--left panel start -->
		<a href="index.html"><img src="${basePath}images/logo.png"
			alt="Teddy & Shall" title="Teddy & Shall"  border="0" />
		</a>
		<p class="toptxt">Phasellus consequat</p>
		<div id="left" class="leftSideBar">
			<ul class="menu">
				<li><a href="${basePath }index.do" class="home"></a></li>
				<li><a href="#" class="about"></a></li>
			</ul>
			<p class="leftTop"></p>
			<ul class="menu2">
				<li><a href="${basePath }index.do">Home Page</a></li>
				<li><a href="#">Categories</a></li>
				<li><a href="#">About us</a></li>
				<li class="noBdr"><a href="${basePath }common!contact.do">Make Contact</a></li>
			</ul>
			<p class="leftBot"></p>
			<s:if test="#session.currentUser==null">
			<h2 class="mem">Members login</h2>
				<form name="member_login" action="${basePath }sign!in.do" method="post">
					<input type="text" name="username" value="-Your Name-" class="txtBox" />
					<input type="password" name="password" value="-password-"
						class="txtBox" /> <input type="submit" name="go" value=""
						class="go" /> <br class="spacer" />
				</form>
			</s:if>
			<s:else>
				<p>
				You already sign in, welcome!
				</p>
				<br/>
				<input type="button" name="logOut" value="Log out"   onclick="javascript:window.location.href='${basePath }sign!out.do'"/>
				 
				<br class="spacer" />
			</s:else>
		</div>
		<!--left panel end -->
