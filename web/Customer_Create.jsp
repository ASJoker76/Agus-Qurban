<%-- 
    Document   : Customer_Create
    Created on : Apr 6, 2017, 2:32:16 PM
    Author     : ASJoker76
--%>

<%@page import="Model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">	
        <link href="css/responsive.css" rel="stylesheet">

        <!--[if lt IE 9]>
                <script src="js/html5shiv.js"></script>
                <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
        <title>Customer</title>
    </head>
    <body>
        <header id="header" role="banner">		
            <div class="main-nav">
                <div class="container">
                    <div class="header-top">
                      <!--  <div class="pull-right social-icons">
                            <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Customer_Login.jsp">Login</a>
                            <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Customer_Create.jsp">Register</a>
                            <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Hewan_Index">My Qurban</a>
                        </div>-->
                    </div>     
		    <div class="row">	        		
		        <div class="navbar-header">
		            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
		                <span class="sr-only">Toggle navigation</span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		            </button>
		            <a class="navbar-brand" href="index.html">
                                <img class="img-responsive" src="images/logoqurban.png" alt="logo">
		            </a>                    
		        </div>
		        <div class="collapse navbar-collapse">
		            <ul class="nav navbar-nav navbar-right">                 
		                <li class="scroll "><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Main_Index">Home</a></li>
		                <li class="scroll"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Customer_Login.jsp">Login</a></li>                         
		                <li class="scroll active"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Customer_Create.jsp">Register</a></li>
                                <li class="scroll"><a href="#event">Contact</a></li>      
		            </ul>
		        </div>
		    </div>
                </div>
        </div>                    
    </header><!--/#header--> 
    
        <section id="home">	
		<div id="main-slider" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#main-slider" data-slide-to="0" class="active"></li>
				<li data-target="#main-slider" data-slide-to="1"></li>
				<li data-target="#main-slider" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
                                    <img class="img-responsive" src="images/slider/kambing-qurban.jpg" alt="slider">						
					<div class="carousel-caption">
						<h2>Selamat Datang di IAQurban </h2>
						<h4>Mari kita Berqurban</h4>
						</div>
                                    </div>
				<div class="item">
                                    <img class="img-responsive" src="images/slider/sapi-sapi.jpg" alt="slider">	
					<div class="carousel-caption">
						<h2>Selamat Datang di IAQurban </h2>
						<h4>Ayo Segera Daftar untuk Qurban</h4>
                                        </div>
				</div>
				<div class="item">
                                    <img class="img-responsive" src="images/slider/sapi.jpg" alt="slider">	
					<div class="carousel-caption">
						<h2>Selamat Datang di IAQurban </h2>
						<h4>Registrasi untuk melakukan MYQurban</h4>
						
                                        </div>
                                 </div>				
                            </div>				
			</div>
		</div>    	
    </section><!--/#home-->
	
	<!--<section id="explore">
		<div class="container">
			<div class="row">
				<div class="watch">
					<img class="img-responsive" src="images/watch.png" alt="">
				</div>				
				<div class="col-md-4 col-md-offset-2 col-sm-5">
					<h2>our next event in</h2>
				</div>				
				<div class="col-sm-7 col-md-6">					
					<ul id="countdown">
						<li>					
							<span class="days time-font">00</span>
							<p>days </p>
						</li>
						<li>
							<span class="hours time-font">00</span>
							<p class="">hours </p>
						</li>
						<li>
							<span class="minutes time-font">00</span>
							<p class="">minutes</p>
						</li>
						<li>
							<span class="seconds time-font">00</span>
							<p class="">seconds</p>
						</li>				
					</ul>
				</div>
			</div>
			<div class="cart">
				<a href="#"><i class="fa fa-shopping-cart"></i> <span>Purchase Tickets</span></a>
			</div>
		</div>
	</section><!--/#explore-->

	<section id="about">
		<div class="guitar2">				
                    <img class="img-responsive" src="images/watch.png" alt="Clock">
		</div>
		<div class="about-content">					
                    <h2>Membuat Customer Baru</h2>
                    <form method="POST" action="Customer_Insert">
                        <%
                                Customer obj = new Customer();
                                String idcustomer = obj.AutoIDCustomers();
                        %>
                        Id Customer: <input readonly type="text" name="idcust" class="form-control" required="required" value="<% out.println(idcustomer); %>"><br>
                        Nama       : <input type="text" name="nama" class="form-control" required="required" placeholder="Name"><br>
                        Alamat     : <input type="text" name="alamat" class="form-control" required="required" placeholder="Alamat"><br>
                        No Telepon : <input type="text" name="notlp" class="form-control" required="required" placeholder="No Telepon"><br>
                        UserName   : <input type="text" name="username" class="form-control" required="required" placeholder="Username"><br>
                        Password   : <input type="password" name="pw" class="form-control" required="required" placeholder="Password"><br>
                        <input type="submit" value="simpan" class="btn btn-primary">
                    </form>
                    <%
                        try 
                        {
                            String message = request.getParameter("message");
                            if (message!=null) 
                            {
                                if (message.equals("inputsuccess")) 
                                {
                                    out.println("Status: Registrasi Anda Berhasil.");
                                }
                                else if(message.equals("inputfailed"))
                                {
                                    out.println("Status: Registrasi Anda Gagal.");
                                }
                            }
                        }
                        catch (Exception e) 
                        {
                            System.err.println();
                        }

                    %>
		</div>
	</section><!--/#about-->
	
       <!-- <section id="event">
            <div class="container">
			<div class="row">
				<div class="col-sm-12 col-md-9">
					<div id="event-carousel" class="carousel slide" data-interval="false">
						<h2 class="heading">THE ROCKING Performers</h2>
						<a class="even-control-left" href="#event-carousel" data-slide="prev"><i class="fa fa-angle-left"></i></a>
						<a class="even-control-right" href="#event-carousel" data-slide="next"><i class="fa fa-angle-right"></i></a>
						<div class="carousel-inner">
							<div class="item active">
								<div class="row">
									<div class="col-sm-4">
										<div class="single-event">
											<img class="img-responsive" src="images/event/event1.jpg" alt="event-image">
											<h4>Chester Bennington</h4>
											<h5>Vocal</h5>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="single-event">
											<img class="img-responsive" src="images/event/event2.jpg" alt="event-image">
											<h4>Mike Shinoda</h4>
											<h5>vocals, rhythm guitar</h5>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="single-event">
											<img class="img-responsive" src="images/event/event3.jpg" alt="event-image">
											<h4>Rob Bourdon</h4>
											<h5>drums</h5>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="row">
									<div class="col-sm-4">
										<div class="single-event">
											<img class="img-responsive" src="images/event/event1.jpg" alt="event-image">
											<h4>Chester Bennington</h4>
											<h5>Vocal</h5>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="single-event">
											<img class="img-responsive" src="images/event/event2.jpg" alt="event-image">
											<h4>Mike Shinoda</h4>
											<h5>vocals, rhythm guitar</h5>
										</div>
									</div>
									<div class="col-sm-4">
										<div class="single-event">
											<img class="img-responsive" src="images/event/event3.jpg" alt="event-image">
											<h4>Rob Bourdon</h4>
											<h5>drums</h5>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="guitar">
					<img class="img-responsive" src="images/guitar.png" alt="guitar">
				</div>
			</div>			
		</div>
	</section><!--/#event-->
        
	<section id="explore">
		<!--<div id="map">
			<div id="gmap-wrap">
	 			<div id="gmap"> 				
	 			</div>	 			
	    	</div>
		</div><!--/#map-->
		<div class="contact-section">
			<div class="ear-piece">
				<img class="img-responsive" src="images/ear-piece.png" alt="">
			</div>
			<div class="container">
				<div class="row">
					<div class="col-sm-3 col-sm-offset-4">
						<div class="contact-text">
							<h3>Contact</h3>
							<address>
								G-mail: agussmata76@gmail.com<br>
								Phone: +62 897 1729 681<br>
				
							</address>
						</div>
						<div class="contact-address">
							<h3>Contact</h3>
							<address>
								Kedung Badak,No 34<br>
								Jl Baru,<br>
								Kota Bogor, 16164<br>
								Indonesia
							</address>
						</div>
					</div>
					<div class="col-sm-5">
						<div id="contact-section">
							<h3>Send a message</h3>
					    	<div class="status alert alert-success" style="display: none"></div>
					    	<form id="main-contact-form" class="contact-form" name="contact-form" method="post" action="sendemail.php">
					            <div class="form-group">
					                <input type="text" name="name" class="form-control" required="required" placeholder="Name">
					            </div>
					            <div class="form-group">
					                <input type="email" name="email" class="form-control" required="required" placeholder="Email ID">
					            </div>
					            <div class="form-group">
					                <textarea name="message" id="message" required="required" class="form-control" rows="4" placeholder="Enter your message"></textarea>
					            </div>                        
					            <div class="form-group">
					                <button type="submit" class="btn btn-primary pull-right">Send</button>
					            </div>
					        </form>	       
					    </div>
					</div>
				</div>
			</div>
		</div>		
	</section><!--/#contact-->
 
        <footer id="footer">
        <div class="container">
            <div class="text-center">
                <p> Copyright  &copy;2017<a target="_blank" href="#">IA Qurban </a><br><a>CCIT-FTUI DEPOK</a>
                </p>                 
            </div>
        </div>
    </footer><!--/#footer-->
    
  
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
  	<script type="text/javascript" src="js/gmaps.js"></script>
	<script type="text/javascript" src="js/smoothscroll.js"></script>
        <script type="text/javascript" src="js/jquery.parallax.js"></script>
        <script type="text/javascript" src="js/coundown-timer.js"></script>
        <script type="text/javascript" src="js/jquery.scrollTo.js"></script>
        <script type="text/javascript" src="js/jquery.nav.js"></script>
        <script type="text/javascript" src="js/main.js"></script>  
</html>
