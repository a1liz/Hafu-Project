<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 最上层文本：请选择支付方式
     下一层几张图片 微信支付 支付宝 银联  图片附带超链接跳转到二维码界面 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请支付</title>
</head>
<body>
<center><font size="7" face="sans-serif">***请选择支付方式***</font></center><br>
<center>饿死了么提供下列两种支付方式</center>
<a href="QRcode.jsp">
<img alt="支付宝" src="images/gezi3.jpg" 
 style="width:200px;height:200px; position:absolute;left:100px;top:150px;"></a>
 <a href="QRcode.jsp">
 <img alt="微信支付" src="images/gezi2.jpg"
 style="width:200px;height:200px; position:absolute;left:500px;top:150px;"></a>
 <div class="box" style="position:absolute;left:350px;top:420px;">@饿死了么外卖</div>
</body>
</html>