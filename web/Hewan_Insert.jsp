<%-- 
    Document   : Hewan_Insert
    Created on : Apr 10, 2017, 12:23:51 PM
    Author     : ASJoker76
--%>
<%@page import="Model.Hewan"%>
<%
    String username = (String) session.getAttribute("username");
    String idcust = (String) session.getAttribute("idcust");
    String rekening = (String) session.getAttribute("rek");
    if (username==null) {
    response.sendRedirect("Customer_Login.jsp?auth=forbidden");
    }
    else if (rekening == null)
    {
        response.sendRedirect("Rekening_Input.jsp?auth=forbidden");
    }
%>
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
        <title>Hewan Qurban</title>
    </head>
    <body>
<header id="header" role="banner">		
            <div class="main-nav">
                <div class="container">
                    <div class="header-top">
                        <div class="pull-right social-icons">
                            <div class="collapse navbar-collapse">
		            <ul class="nav navbar-nav navbar-right">                 
                         Selamat Datang <% out.println(username); %> || <% out.println(rekening); %>
                            </ul>
                            </div>
                          </div>
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
		                <li class="scroll "><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Index">Home</a></li>
		                <li class="scroll active"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Hewan_Insert.jsp">Tambah Hewan</a></li>
		                <li class="scroll"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_Infobeli?idcust=<% out.println(idcust); %>">Daftar Pembelian</a></li>                         
		                <li class="scroll"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_Infojual?idcust=<% out.println(idcust); %>">Daftar Penjualan</a></li>
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
         <section id="explore">
		<div class="container">
			<div class="row">
				<div class="watch">
					<img class="img-responsive" src="images/watch.png" alt="">
				</div>				
				<div class="col-md-4 col-md-offset-2 col-sm-5">
				<div class="text-center carousel-inner center-block">
                                    <h2>Tambah Hewan Qurban</h2>
                                        <br><br><br>
				</div>				
          
                            <br><br><br><br><br>
            <form method="POST" action="Hewan_Insert" enctype="multipart/form-data">
                            <%
                                Hewan obj = new Hewan();
                                String idhewan = obj.AutoIDHewan();
                            %>
            Id Hewan   : <input readonly type="text" name="idhewan" class="form-control" required="required" value="<% out.println(idhewan); %>"><br>
            Id Customer: <input readonly type="text" name="idcust" class="form-control" required="required" value="<% out.println(idcust); %>"><br>
            Nama Hewan : <input type="text" name="namahewan" class="form-control" required="required" placeholder="Name Hewan"><br>
            Berat Hewan: <input type="text" name="berat" class="form-control" required="required" placeholder="Berat Hewan"><br>
            Umur Hewan : <input type="text" name="umur" class="form-control" required="required" placeholder="Umur Hewan"><br>
            Harga Hewan: <input type="text" name="harga" class="form-control" required="required" placeholder="Harga Hewan"><br>
            Type Hewan : <input type="text" name="type" class="form-control" required="required" placeholder="Type Hewan"><br>
            Status     : <select name="status" class="form-control" required="required" placeholder="Status Hewan">
                         <option value="Ada">Ada</option>
                         <option value="Sudah Terjual">Sudah Terjual</option>
            </select><br><br>
            Foto       : <input type="file" name="foto" class="form-control" required="required" placeholder="Foto Qurban"><br>
            <input type="submit" value="simpan" class="btn btn-primary">
        </form>
                                </div>
            <div class="light">
				<img class="img-responsive" src="images/light.png" alt="">
			</div>
              </div>
            
	</div>
    </section><!--/#explore-->
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
