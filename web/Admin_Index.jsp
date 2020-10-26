<%-- 
    Document   : Admin_Index
    Created on : Apr 14, 2017, 4:57:22 PM
    Author     : ASJoker76
--%>
<%
    String name = (String) session.getAttribute("name");
    String idadmin = (String) session.getAttribute("idadmin");
    if (idadmin==null) {
    response.sendRedirect("Admin_Login.jsp?auth=forbidden");
    }
%>
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
        <title>Admin_Index</title>
    </head>
    <body>
         <header id="header" role="banner">		
            <div class="main-nav">
                <div class="container">
                    <div class="header-top">
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
		                <li class="scroll active"><a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/Admin_Index">Home</a></li>
		                <li class="scroll"><a href="Logout_ProcessAdmin">Log Out</a></li>
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
					<h2>Admin Index</h2>
                                        <br><br><br><br><br><br>
				</div>				
        <form method="post" action="DTrans_Search">
            
		<div class="col-sm-6 col-sm-offset-3">
                    <label><span>Pencarian</span></label>
                    <div class="text-center carousel-inner center-block">
                        <input tabindex="2" size="25"  name="searchtrans" type="text" class="form-control"/><br>
                    <input type="submit" value="Cari" class="btn btn-primary"/>
                    </div>
                </div>
        	
            
        </form>
                                <br><br><br><br><br>
        <table border='1' cellpadding='10' cellspacing='0'>
            <thead>
                <tr  bgcolor="saddlebrown">
                    <th><p align="center">Id Transaksi</p></th>
                    <th><p align="center">Id Hewan</p></th>
                    <th><p align="center">Id Customer Beli</p></th>
                    <th><p align="center">Id Customer Jual</p></th>
                    <th><p align="center">Tanggal Pemesanan</p></th>
                    <th><p align="center">Tanggal Pembayaran</p></th>
                    <th><p align="center">Tanggal Pengiriman</p></th>
                    <th><p align="center">Tanggal Terima</p></th>
                    <th><p align="center">Total</p></th>
                    <th><p align="center">Status</p></th>
                    <th><p align="center">Foto</p></th>
                    <th><p align="center">Edit</p></th>
                </tr>
            </thead>
            <tbody>
                <%
                    ResultSet rs = (ResultSet) request.getAttribute("dataalltrans");
                    ResultSet rssearch = (ResultSet) request.getAttribute("datacaritrans");
                    if (rs != null){
                        while(rs.next()){
                            %>
                            <tr bgcolor="burlywood">
                                
                                <td><p align="center"><% out.println(rs.getString(1)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(2)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(3)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(4)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(5)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(6)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(7)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(8)); %></p></td>
                                <td><p align="center"><% out.println(rs.getInt(9)); %></p></td>
                                <td><p align="center"><% out.println(rs.getString(10)); %></p></td>
                                <td>
                                    <img style="width:100px;" src="/IAQurban/Uploads/<% out.println(rs.getString(11)); %>">
                                </td>
                                
                                <td>
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_EditPembayaran?idtrans=<% out.println(rs.getString(1)); %>" class="form-control">Pembayaran</a><br><br> 
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_EditPengiriman?idtrans=<% out.println(rs.getString(1)); %>" class="form-control">Pengiriman</a><br><br>
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_EditTerima?idtrans=<% out.println(rs.getString(1)); %>" class="form-control">Terima</a> <br><br>
                                </td>
                            </tr>
                            <%
                        }
                    }
                    else if(rssearch != null)
                    {
                        %>
                            <tr bgcolor="burlywood">
                                
                                <td><p align="center"><% out.println(rssearch.getString(1)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(2)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(3)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(4)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(5)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(6)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(7)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(8)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getInt(9)); %></p></td>
                                <td><p align="center"><% out.println(rssearch.getString(10)); %></p></td>
                                <td>
                                    <img style="width:100px;" src="/IAQurban/Uploads/<% out.println(rssearch.getString(11)); %>">
                                </td>
                                
                                <td>
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_EditPembayaran?idtrans=<% out.println(rssearch.getString(1)); %>" class="form-control">Pembayaran</a><br><br> 
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_EditPengiriman?idtrans=<% out.println(rssearch.getString(1)); %>" class="form-control">Pengiriman</a><br><br>
                                     <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_EditTerima?idtrans=<% out.println(rssearch.getString(1)); %>" class="form-control">Terima</a> <br><br>
                                </td>
                            </tr>
                            <%
                    }
                %>
            </tbody>
        </table>
            <%
                String message = request.getParameter("message");
                if (message!=null) 
                {
                    if(message.equals("updatesuccess")){
                        out.println("Status: Berhasil mengubah data.");
                    } else if(message.equals("updatefailed")){
                        out.println("Status: Gagal mengubah data.");
                    }
                }
            %></div>
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
