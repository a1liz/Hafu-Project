<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<link href="css/bootstrap2.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style2.css" type="text/css" rel="stylesheet" media="all">
<!-- js -->
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //js -->	
<!-- cart -->
<script src="js/simpleCart.min.js"> </script>
<!-- cart -->
</head>



<body>
	<!--header-->
	<div class="header">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<h1 class="navbar-brand"><a  href="index.html">dicos</a></h1>
				</div>
				<!--navbar-header-->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="index.html" class="active">主页</a></li>
						<li class="dropdown">
						
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="col-sm-4"><!-- 不能删 -->
	
					<!--/.navbar-collapse-->
				</div>
				
				
				
				
				
				
				
				<!--//navbar-header-->
			</nav>
			<div class="header-info">
				<div class="header-right search-box">
					<a href="#"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>				
					<div class="search">
						<form class="navbar-form">
							<input type="text" class="form-control">
							<button type="submit" class="btn btn-default" aria-label="Left Align">
								Search
							</button>
						</form>
					</div>	
				</div>
				<div class="header-right login">
					   <!-- 以下删除的剩余 -->
					<div id="loginBox">                
						<form id="loginForm">
							<fieldset id="body">
								
								
								<fieldset>
									<label for="email">Email Address</label>
									<input type="text" name="email" id="email">
								</fieldset>
								<fieldset>
									<label for="password">Password</label>
									<input type="password" name="password" id="password">
								</fieldset>
								<input type="submit" id="login" value="Sign in">
								<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
							</fieldset>
							
							
							<p>New User ? <a class="sign" href="account.html">Sign Up</a> <span><a href="#">Forgot your password?</a></span></p>
						</form>
					</div>
				</div>
				<div class="header-right cart">
					
					<!-- 以上为登录剩余 -->
					
					
					<a href="#"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
					<div class="cart-box">
						<h4><a href="checkout.html">
							<span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span>) 
						</a></h4>
						<p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!--//header-->
	<!--banner-->
	<div class="banner">
		<div class="container">
			<h2 class="hdng">hafuhafu <span>DICOS</span> for u</h2>
			<p>开心就要咔滋咔滋</p>
			<a href="products.html">SHOP NOW</a>
			<div class="banner-text">			
				<img src="images/dicoslogo.png" alt=""/>	
			</div>
		</div>
	</div>			
	<!--//banner-->
	<!--gallery-->
	<div class="gallery">
		<div class="container">
			<div class="gallery-grids">
				<!-- <div class="col-md-8 gallery-grid glry-one">
					<a href="products.html"><img src="images/g1.jpg" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>Lorem Ipsum is simply</p>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">$95.00</h5>
							</div>
							<div class="rating">
								<span>☆</span>
								<span>☆</span>
								<span>☆</span>
								<span>☆</span>
								<span>☆</span>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-4 gallery-grid glry-two">
					<a href="products.html"><img src="images/g2.jpg" class="img-responsive" alt=""/>
						<div class="gallery-info galrr-info-two">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>Lorem Ipsum is simply</p>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">$95.00</h5>
							</div>
							<div class="rating">
								<span>☆</span>
								<span>☆</span>
								<span>☆</span>
								<span>☆</span>
								<span>☆</span>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div> -->
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di1.png" class="img-responsive"  width="299px" height="315px" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>脆皮照烧鸡肉饭</p>
						<!-- <div class="product-info-cust prt_name">

							<span class="item_price">¥8.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥10.00</del></p>
								<p class="disc">[20% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
							<input type="button" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div> -->
						</br></br></br></br></br>
							<p>暂无</p>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥25.00</h5>
							</div>
							<div class="rating">
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di2.png" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>脆皮鸡腿堡</p>
						<div class="product-info-cust prt_name">
															
							<span class="item_price">¥15.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥20.00</del></p>
								<p class="disc">[25% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
							<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥15.00</h5>
							</div>
							<div class="rating">
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di3.png" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>至尊鸡腿堡</p>
						
						<div class="product-info-cust prt_name">
															
							<span class="item_price">¥12.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥15.00</del></p>
								<p class="disc">[20% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
							<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div>
						
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥14.00</h5>
							</div>
							
							<div class="rating">
								<span>☆</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di4.png" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>脆皮鸡腿</p>
						<div class="product-info-cust prt_name">
															
							<span class="item_price">¥8.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥10.00</del></p>
								<p class="disc">[20% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
							<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥8.00</h5>
							</div>
							<div class="rating">
								<span>☆</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di6.png" class="img-responsive"width="299px" height="315px alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>巧克力圣代</p>
						
						
						
						<div class="product-info-cust prt_name">
															
							<span class="item_price">¥8.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥10.00</del></p>
								<p class="disc">[20% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
							<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div>
						
						
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥8.00</h5>
							</div>
							
							
							
							<div class="rating">
								<span>☆</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di10.png" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>摩卡雪慕斯</p>
						
						
					<div class="product-info-cust prt_name">
														
						<span class="item_price">¥18.00</span>
						<div class="ofr">
							<p class="pric1"><del>¥36.00</del></p>
							<p class="disc">[50% Off]</p>
						</div>
						<input type="text" class="item_quantity" value="1" />
						<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
						<div class="clearfix"> </div>
					</div>
						
						
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥18.00</h5>
							</div>
							<div class="rating">
								<span>☆</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di11.png" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>鸡柳蛋手卷</p>
						
						<div class="product-info-cust prt_name">
															
							<span class="item_price">¥15.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥20.00</del></p>
								<p class="disc">[75% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
														<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥15.00</h5>
							</div>
							<div class="rating">
								<span>☆</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="col-md-3 gallery-grid ">
					<a href="products.html"><img src="images/di7.png" class="img-responsive" alt=""/>
						<div class="gallery-info">
							<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
							<a class="shop" href="single.html">SHOP NOW</a>
							<div class="clearfix"> </div>
						</div>
					</a>
					<div class="galy-info">
						<p>薯条小）</p>
						<div class="product-info-cust prt_name">
															
							<span class="item_price">¥5.00</span>
							<div class="ofr">
								<p class="pric1"><del>¥6.00</del></p>
								<p class="disc">[10% Off]</p>
							</div>
							<input type="text" class="item_quantity" value="1" />
							<input type="button" onclick="alert('呐，已添加购物车')" class="item_add items" value="Add">
							<div class="clearfix"> </div>
						</div>
						<div class="galry">
							<div class="prices">
								<h5 class="item_price">¥5.00</h5>
							</div>
							<div class="rating">
								<span>☆</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
								<span>★</span>
							</div>						
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
			</div>	
		</div>
	</div>
	
	
	
	
	
	
	
	<div style = "text-align:right;"
<div class="df">
			<a href="products.html">查看购物车</a>
	<div class="df-text">			
		<img src="images/right1.png" alt=""/>	
	</div>
	</div>
	</div>

	
	<!--//gallery-->
	<!--subscribe-->
	<div class="subscribe">
		 <div class="container">
			 <h3>what else？</h3>
			 <form>
				 <input type="text" class="text" value="你是鸹貔么" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
				 <input type="submit" value="是">
			 </form>
		 </div>
	</div>
	
	
	
	<!--//subscribe-->
	<!--footer-->
	<!-- <div class="footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-2 footer-grid">
					<h4>company</h4>
					<ul>
						<li><a href="products.html">products</a></li>
						<li><a href="#">Work Here</a></li>
						<li><a href="#">Team</a></li>
						<li><a href="#">Happenings</a></li>
						<li><a href="#">Dealer Locator</a></li>
					</ul>
				</div>
				<div class="col-md-2 footer-grid">
					<h4>service</h4>
					<ul>
						<li><a href="#">Support</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Warranty</a></li>
						<li><a href="contact.html">Contact Us</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>order & returns</h4>
					<ul>
						<li><a href="#">Order Status</a></li>
						<li><a href="#">Shipping Policy</a></li>
						<li><a href="#">Return Policy</a></li>
						<li><a href="#">Digital Gift Card</a></li>
					</ul>
				</div>
				<div class="col-md-2 footer-grid">
					<h4>legal</h4>
					<ul>
						<li><a href="#">Privacy</a></li>
						<li><a href="#">Terms and Conditions</a></li>
						<li><a href="#">Social Responsibility</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid icons">
					<h4>Connect with Us</h4>
					<ul>
						<li><a href="#"><img src="images/i1.png" alt=""/>Follow us on Facebook</a></li>
						<li><a href="#"><img src="images/i2.png" alt=""/>Follow us on Twitter</a></li>
						<li><a href="#"><img src="images/i3.png" alt=""/>Follow us on Google-plus</a></li>
						<li><a href="#"><img src="images/i4.png" alt=""/>Follow us on Pinterest</a></li>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div> -->
	<!--//footer-->
	<div class="footer-bottom">
		<div class="container">
			<p> &copy;饿！你就死了吧.<a target="_blank" href="http://www.17sucai.com/">@hafuhafu</a></p>
		</div>
	</div>
</body>
</html>