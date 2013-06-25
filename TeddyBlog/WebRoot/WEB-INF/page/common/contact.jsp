<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
</head>
<body>
	<!--body start -->
	<div id="body">
		<!--left panel start -->
		<s:include value="../common/leftSideBar.jsp"></s:include>
		<!--left panel end -->
		<!--right panel start -->
		<div id="right">
			<h2 class="contact">Contact Email Form</h2>
			<p align="justify" class="rightTxt1">
				<span>某镇某街某号 <br /> 
					南部，中国。<br /><br /> 
					Phone: 抱歉要保密 <br /> 
					Fax: 这个我也没<br /><br /> 
					Office Hours: 10:30 a.m. to 4 p.m.
					<br /> Email: shadberry89@gmail.com</span>
			</p>
			<p align="justify" class="rightTxt1">
				<span>If you have any questions, please fill out the form
					below and we will respond to you at the earliest.</span>
			</p>
			<div class="contacttextarea">
				<div class="contactindicate">
					<span class="errortext">*</span> indicates required fields
				</div>
				<div class="contactindicate"></div>
				<div class="contacttext" id="div3">Subject:</div>
				<div class="contactformtext">
					<label> <select name="select" class="dropdownEffect">
							<option>Your Selection</option>
							<option>Your Selection</option>
					</select> <span class="errortext">*</span> </label>
				</div>
				<div class="contacttext" id="name">Your Name:</div>
				<div class="contactformtext">
					<span class="contactformfield"> <input name="textfield22"
						type="text" class="textboxEffect" /> <label><span
							class="errortext">*</span> </label> </span>
				</div>
				<div class="contacttext" id="business">Business Name:</div>
				<div class="contactformtext" id="bnametb">
					<span class="contactformfield"> <input name="textfield222"
						type="text" class="textboxEffect" /> <label></label> </span>
				</div>
				<div class="contacttext" id="email">Email Address:</div>
				<div class="contactformtext" id="eatb">
					<span class="contactformfield"> <input name="textfield2222"
						type="text" class="textboxEffect" /> <label><span
							class="errortext">*</span> </label> </span>
				</div>
				<div class="contacttext" id="phno">Phone Number:</div>
				<div class="contactformtext" id="ptb">
					<span class="contactformfield"> <input name="textfield22222"
						type="text" class="textboxEffect" /> <label><span
							class="errortext">*</span> </label> </span>
				</div>
				<div class="contacttext" id="cno">Cell Number:</div>
				<div class="contactformtext" id="ctb">
					<span class="contactformfield"> <input
						name="textfield222222" type="text" class="textboxEffect" /> <label></label>
					</span>
				</div>
				<div class="contacttext" id="contactvia">Contact Via:</div>
				<div class="contactformtext" id="cttb">
					<select name="select2" class="dropdownEffect">
						<option>Email</option>
						<option>Phone Number</option>
						<option>Cell Number</option>
					</select>
				</div>
				<div class="commentslabel" id="div4">Comments:</div>
				<div class="contactformmsgtxt">
					<span class="contactformmessage"> <textarea name="textarea"
							class="MassageboxEffect" rows="" cols=""></textarea> </span>
				</div>
				<div class="submittextarea">
					<div align="center">
						<div class="contacttext" id="div2"></div>
						<div align="left">
							<input name="Submit" type="submit" class="submitbutton"
								value="Submit" />
						</div>
					</div>
				</div>
			</div>
			<!--update start -->
			<!--update end -->
			<!--service start -->
			<!--service end -->
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

