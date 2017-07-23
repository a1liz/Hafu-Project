<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>饿死了么</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>
<body>
<div class="login-form">
			<div class="top-login">
				<span><img src="images/logo.png" alt=""/></span>
			</div>
			<h1>登录</h1>
			<div class="login-top">
			<s:actionerror/>
			<form action="login" name="form1" method="post">
				<div class="login-ic">  
					<i ></i>
					<input type="text" name="username"  value="用户名" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'User name';}"/>
			
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<i class="icon"></i>
					<input type="password" name="password" value="密码" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'password';}"/>
					<div class="clear"> </div>
				</div>
			
				<div class="log-bwn">
					<input type="submit"  value="登录" >
					<a href="signup.jsp">注册</a>
				</div>
				</form>
			</div>
			<p class="copy">© 饿了你就死了算了   eslm</p>
</div>		
</body>
</html>