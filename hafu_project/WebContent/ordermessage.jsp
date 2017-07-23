<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>商家</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<!-- stylesheet -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/storestyle.css" rel="stylesheet" type="text/css" media="all" />
<!-- //stylesheet -->
<!-- online fonts -->
<link href="http://fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Dancing+Script" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
<!-- //online fonts -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" type="text/css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
</head>
<body>
<div class="agileits_main">
<!-- header -->
<div class="w3_agile_logo">
	<h1 class="text-center"><a href="index.html">饿死了me</a></h1>
</div>
<!-- banner -->
<div class="w3_banner">
	<div class="container">
		<div class="slider">
			<div class="callbacks_container">
			   <ul class="rslides callbacks callbacks1" id="slider4">
					<li>	
						<div class="banner_text_w3layouts">
							<h3>这里为您精选多种上等商家</h3>
							<span> </span>
							<p>饿死了么一心为顾客服务</p>
						</div>
					</li>
					 <li>	
						<div class="banner_text_w3layouts">
							<h3>属于您的营养专家</h3>
							<span> </span>
							<p>No more hungry WE always with you.</p>
						</div>
					</li>
					 <li>	
						<div class="banner_text_w3layouts">
							<h3>nutrition，delicious，convenient</h3>
							<span> </span>
							<p>정녕 진짜 멋있다. </p>
						</div>
					</li>
				</ul>
			</div>
		  <script src="js/responsiveslides.min.js"></script>
		  <script>
			// You can also use "$(window).load(function() {"
			$(function () {
			  // Slideshow 4
			  $("#slider4").responsiveSlides({
				auto: true,
				pager:true,
				nav:true,
				speed: 500,
				namespace: "callbacks",
				before: function () {
				  $('.events').append("<li>before event fired.</li>");
				},
				after: function () {
				  $('.events').append("<li>after event fired.</li>");
				}
			  });
		
			});
		 </script>
	   </div>
	</div>   
</div>
<!-- menu -->
<nav class="navbar navbar-inverse ">
	<div class="container">
		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
		</button>
	<div class="collapse navbar-collapse top-nav w3l" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav linkEffects linkHoverEffect_11 custom-menu">
			<li class="agile_active"><a href="index.html" class="scroll"><span>精选商家</span></a></li>
			<li><a href="#about" class="scroll"><span>优秀商家</span></a></li>
			<li><a href="#gallery" class="scroll"><span>精选美食 </span></a></li>
			<!-- <li><a href="#team" class="scroll"><span>team</span></a></li> -->
			<li><a href="#contact" class="scroll"><span>search</span></a></li>
		</ul>
	</div>
	</div>
</nav>
<!-- //menu -->
  </div>	
<!-- //banner -->	
<!-- home -->
<div class="home_ w3layouts">
 <div class="home_grids_w3">
  <div class="home_main">
	   <div class="col-md-7 col-sm-7 col-xs-7 img1 img-grid">
		   <div class="img_text_w3ls text-center">
				<h4>Starbucks.</h4>
				<span> </span>
				<p>我们提供的不是普通的速溶咖啡，而是味道香浓立等可取的星巴克咖啡 </p>
			</div>
		</div>
		<div class="col-md-5 img2 col-sm-5 col-xs-5 img-grid">
		    <div class="img_text_w3ls text-center">
				<h4>McDonald's.</h4>
				<span> </span>
				<p>I am lovin it</p>
			  </div>
		</div>
		<div class="clearfix"></div>
	</div>
  <div class="home_main">
	   <div class="col-md-5 col-sm-5 col-xs-5 img3 img-grid ">
		    <div class="img_text_w3ls text-center">
				<h4>DICOS.</h4>
				<span> </span>
				<p>开心就要咔嚓咔嚓 </p>
			  </div>
		</div>
	  <div class="col-md-7 col-sm-7 col-xs-7 img4 img-grid">
		    <div class="img_text_w3ls text-center">
				<h4>PizzaHut</h4>
				<span> </span>
				<p>pizza and more </p>
			</div>
	 </div>
	<div class="clearfix"></div>
  </div>
   <div class="home_main">
	   <div class="col-md-7 col-sm-7 col-xs-7 img-grid  img5">
		  <div class="img_text_w3ls text-center">
				<h4> 松本家</h4>
				<span> </span>
				<p>いい料理を作る。 </p>
		  </div>
		 </div>
		<div class="col-md-5 col-sm-5 col-xs-5 img-grid img6">
		  <div class="img_text_w3ls text-center">
				<h4>鲜芋仙.</h4>
				<span> </span>
				<p>两个老大的私房的甜品</p>
		  </div>
		 </div>
		<div class="clearfix"></div>
  </div>
</div>
</div>
<!-- //home -->
<!-- about -->
<div class="about_agileinfo" id="about">
  <div class="container">
      <h3 class="title">精选商家</h3>
	  <div class="about_main">
		  <div class="col-md-6 col-sm-6 col-xs-6 about_agileits"></div>
		  <div class="col-md-6 col-sm-6 col-xs-6 about_text_w3l">
		    <h4>Häagen-Dazs</h4>
			<P>Today, haagen-dazs has become a symbol of high-end ice cream around the world.Haagen-dazs main flavors include vanilla, chocolate, strawberry, matcha, crankies, milk toffee, macadamia nuts, mango, coffee, grape rum, tiramisu, etc. Desserts include romance, love, life, love, love, boat dreams, garden of Eden, etc.And Every year, haagen-dazs will launch several Mid-Autumn mooncake gift boxes for your choice!All products are made of ice cream and must be preserved with dry ice! Mouthfeel.<br/>
				       <font color="red">推荐指数</font>  ★★★★★
			</P>
		  </div>
		  <div class="clearfix"></div>
	  </div>	  
  </div>
 </div> 
<!-- //about -->
<!-- gallery -->
<div class="gallery_wthree" id="gallery">
 <div class="container">
      <h3 class="title">精选美食</h3>
	  <div class="gallery_grid agileits_w3layouts">
	    <div class="col-md-6  col-sm-6 col-xs-6 grid_w3">
			<div class="grid-1">
				 <a href="registered.html"> <!-- 跳转 -->
					<img src="images/star1.png" alt=" " class="img-responsive" />
					 <div class="w3agile-text w3agile-text-smal1">
						<h5>Frappuccino</h5>
					</div>
				</a>
			</div>
			 <div class="sub_grid gallery_w3l">
				   <div class="col-md-6 col-sm-6 col-xs-6 grid-1 grid-c grid_w3l">
						<a class="cm-overlay" href="images/14.jpg">
							<img src="images/m3.png" alt=" " class="img-responsive" />
							<div class="w3agile-text w3agile-text-small">
								<h5>French fries</h5>
					        </div>
						</a>
					</div>
				   <div class="col-md-6 col-sm-6 col-xs-6 grid-1 grid-b grid_w3l">
					 	<a class="cm-overlay" href="images/13.jpg">
							<img src="images/pizza1.png" alt=" " class="img-responsive" />
							<div class="w3agile-text w3agile-text-smal1">
								<h5>pizza</h5>
							</div>
						</a>
					</div>
				   <div class="clearfix"></div>
			 </div>  
        </div>
		<div class="col-md-6 col-sm-6 col-xs-6 grid_w3">
		   <div class="sub_grid">
			   <div class="col-md-6 col-sm-6 col-xs-6 grid-1 grid-c grid_w3l">
          			<a class="cm-overlay" href="images/15.jpg">
						<img src="images/han1.jpg" alt=" " class="img-responsive" />
						<div class="w3agile-text w3agile-text-small">
							<h5>Crispy Chicken Burger </h5>
						</div>
					</a>
			   </div>
			   <div class="col-md-6 col-sm-6 col-xs-6 grid-1 grid-d grid_w3l">
					<a class="cm-overlay" href="images/16.jpg">
						<img src="http://pic.chinasspp.com/quan/News/image/20130927/20130927141352_2968.jpg" alt=" " class="img-responsive" />
						<div class="w3agile-text w3agile-text-smal1">
							<h5>如意“芋”滿堂</h5>
						</div>
					</a>
				</div>
				 <div class="clearfix"></div>
			   </div>
		    <div class="grid-1 grid-2">
				<a class="cm-overlay" href="images/7.jpg">
					<img src="images/p1.png" alt=" " class="img-responsive" />
					<div class="w3agile-text w3agile-text-smal1">
							<h5>Paralithodes brevipes</h5>
					</div>
				</a>
		    </div>
		   <div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>
	  </div>	
</div>   <!-- gallery的图片以及文字说明 -->
</div>    <!-- about us 但是找不到更改图片的位置 -->
<!-- //gallery -->
<!-- Tooltip -->
<div class="tooltip-content">
	<div class="modal fade features-modal" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
		<div class="modal-dialog modal-md">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h2 class="modal-title text-center">hafuhafu</h2>
				</div>    <!-- 工作室 -->
				<div class="modal-body">
					<img src="images/2.png" alt="image">
					<p>hafuhafu工作室</p>
				</div>
			</div>
		</div>
	</div>
</div>    <!-- 点击查看的编辑 -->
<!-- //Tooltip -->
<!-- section -->
<div class="w3layouts-section" id="blog">
	<div class="container">   
		<h3 class="title">饿死了么</h3> 
		<p>”饿死了么“是由”<font color="	#FF8000">hafuhafu</font>工作室“制作的面向高收入人群的网上订餐平台，“饿死了么”为您精选多种高档商家，在营养、便捷、美味等多方面做到最好，以满足您精神和物质的双重需要。</p>
		<a href="#myModal" class="agilebtn" data-toggle="modal" data-target="#myModal"><span>点击查看hafuhafu工作室</span></a>  
	</div>    <!-- let the creativity begin -->
</div> 
<!-- //section --> 
<!--team -->


<!-- contact --> 


		
		
		<!-- team表那块 -->
<!-- //contact --> 
<!-- subscribe -->
<div class="subscribe w3_agile">
 <div class="container">
    <h3 class="title text-center">WHAT ELES</h3>
	<div class="subscribe-wthree">
		<form action="#" method="post">
			<input type="email" placeholder="想要啥输啥" required=""> 
			<input type="submit" value="hafuhafu" class="botton">
		</form> 
	</div>
 </div>	  <!-- 最下面的sybscribe -->
</div>
<!-- //subscribe --> 
<!-- copy-right -->
<div class="copy-right agileits-w3layouts">
	<div class="container">
		<div class="social-icons agileits">
     		<ul>
				<li><a href="#" class="fa fa-facebook icon icon-border facebook"> </a></li>
				<li><a href="#" class="fa fa-twitter icon icon-border twitter"> </a></li>
				<li><a href="#" class="fa fa-google-plus icon icon-border googleplus"> </a></li>
				<li><a href="#" class="fa fa-dribbble icon icon-border dribbble"> </a></li>
			</ul>
			<div class="clearfix"> </div>
		</div> 
		<p> &copy; 饿！你就死了吧&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="	#FF8000">“饿死了么”</font> </p>	
	</div>   <!-- 最下面的一行字 -->
</div>
<!-- //copy-right -->
<!-- Gallery-plugin -->
<script src="js/jquery.mobile.custom.min.js"></script>
<script src="js/jquery.cm-overlay.js"></script>
		<script>
			$(document).ready(function(){
				$('.cm-overlay').cmOverlay();
			});
		</script>
<!-- //Gallery-plugin -->
<!-- start-smooth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>	
<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
		
		$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
			});
		});
</script>
<script src="js/SmoothScroll.min.js"></script>
<!-- //end-smooth-scrolling -->	
<!-- smooth-scrolling-of-move-up -->
<script type="text/javascript">
	$(document).ready(function() {
		/*
		var defaults = {
			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
		};
		*/
		$().UItoTop({ easingType: 'easeOutQuart' });
	});
</script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>