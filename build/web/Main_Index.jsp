<%-- 
    Document   : Main_Index
    Created on : Apr 18, 2017, 5:33:07 AM
    Author     : Nuryani
--%>
<%@page import="java.sql.ResultSet"%>
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
        <title>IA Qurban</title>
    </head>
    <body>
        <header id="header" role="banner">		
            <div class="main-nav">
                <div class="container">
                    <div class="header-top">
                    <!--    <div class="pull-right social-icons">
                            <%/*    if(username!=null)    
                                {
                                    out.println(username); 
                                    out.println(idcust);
                                }
                           */ %>
                            <%/*
                                String sessionuname = (String) request.getAttribute("messagefailed");
                                if (sessionuname!=null) {
                                out.println("Status : " + sessionuname);
                                }
                                String authstatus = request.getParameter("auth");
                                if (authstatus!=null && authstatus.equals("forbidden")) {
                                out.println("Status : Anda harus melakukan login.");
                                }
                                String statuslogout = (String) request.getAttribute("messagelogout");
                                if (statuslogout!=null) {
                                out.println("Status : " + statuslogout);
                                }
                           */ %>
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
		                 <li class="scroll active"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Main_Index">Home</a></li>
                                 <li class="scroll"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Customer_Login.jsp">Login</a></li>                        
                                <li class="scroll"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Customer_Create.jsp">Register</a></li>
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
    </section><!--/#home-->
        
        <section id="explore">
		<div class="container">
			<div class="row">
				<div class="watch">
					<img class="img-responsive" src="images/watch.png" alt="">
				</div>				
				<div class="col-md-4 col-md-offset-2 col-sm-5">
					<h2>List Semua Hewan</h2>
                                        <br><br><br><br><br><br>
				</div>				
        <form method="post" action="Hewan_Search">
            
		<div class="col-sm-6 col-sm-offset-3">
                    <label><span>Pencarian</span></label>
                    <div class="text-center carousel-inner center-block">
                        <input tabindex="2" size="25"  name="search" type="text" class="form-control"/><br>
                    <input type="submit" value="Cari" class="btn btn-primary"/>
                    </div>
                </div>
        	
            
        </form>
                                <br><br>
        <table border='1' cellpadding='10' cellspacing='1' align="center" width="90%">
            <thead>
                <tr bgcolor="saddlebrown">
                    <th><p align="center">  Foto </p></th>
                    <th><p align="center">  Id Hewan </p></th>
                    <th><p align="center">  Id Customer  </p></th>
                    <th><p align="center">  Nama  </p></th>
                    <th><p align="center">  Berat  </p></th>
                    <th><p align="center">  Umur  </p></th>
                    <th><p align="center">  Harga  </p></th>
                    <th><p align="center">  Type  </p></th>
                    <th><p align="center">  Status  </p></th>
                </tr>
            </thead>
            <tbody>
                <%
                    ResultSet rs = (ResultSet) request.getAttribute("data");
                    ResultSet rssearch = (ResultSet) request.getAttribute("datacarihewan");
                    if (rs != null){
                        while(rs.next()){
                            %>
                            <tr bgcolor="burlywood">
                                <td>
                                    <p align="center"><img style="width:100px;" src="/IAQurban/Uploads/<% out.println(rs.getString(9)); %>"></p>
                                </td>
                                <td><p align="center"><% out.println(rs.getString(1)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(2)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(3)); %></p></td>
                                <td><p align="center"><% out.println(rs.getInt(4)); %></p></td>
                                <td><p align="center"><% out.println(rs.getInt(5)); %></p></td>
                                <td><p align="center"><% out.println(rs.getInt(6)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(7)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(8)); %></p></td>
                                <td>
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Hewan_Info?idhewan=<% out.println(rs.getString(1)); %>" class="form-control">Beli</a> 
                                </td>
                            </tr>
                            <%
                        }
                    }
                    else if (rssearch != null)
                    {
                        while(rssearch.next()){
                            %>
                            <tr bgcolor="burlywood">
                                <td>
                                    <p align="center"><img style="width:100px;" src="/IAQurban/Uploads/<% out.println(rssearch.getString(9)); %>"></p>
                                </td>
                                <td><p align="center"><% out.println(rssearch.getString(1)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(2)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(3)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getInt(4)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getInt(5)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getInt(6)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(7)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(8)); %></p></td>
                                <td>
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Hewan_Info?idhewan=<% out.println(rssearch.getString(1)); %>" class="form-control">Beli</a> 
                                </td>
                            </tr>
                            <%        
                        }
                    }
                %>
            </tbody>
        </table>
            <br>
              
        </div>
			
		</div>
	</section><!--/#explore-->
        
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
    </body>
</html>

