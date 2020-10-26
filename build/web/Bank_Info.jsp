<%-- 
    Document   : Bank_Info
    Created on : Apr 14, 2017, 2:29:01 PM
    Author     : ASJoker76
--%>
<%@page import="java.sql.ResultSet"%>
<%
    String username = (String) session.getAttribute("username");
    String idcust = (String) session.getAttribute("idcust");
    String rekening = (String) session.getAttribute("rekening");
    String harga = (String) session.getAttribute("total");
    
    if (username==null) {
    response.sendRedirect("Customer_Login.jsp?auth=forbidden");
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
       <title>Bank Info</title>
    </head>
    <body>
         <section id="explore">
            
		<!--<div id="map">
			<div id="gmap-wrap">
	 			<div id="gmap"> 				
	 			</div>	 			
                        </div>
		</div><!--/#map-->
		<div class="contact-section">
	<div class="ear-piece">
            <img class="img-responsive" src="images/watch.png" alt="watch">
			</div>
			<div class="container">
				<div class="row">
					<div class="col-sm-3 col-sm-offset-4">
			
        <h3><%
                try 
                {
                    String message = request.getParameter("message");
                    if (message!=null) {
                        if (message.equals("inputsuccess")) 
                        {
                            out.println("Selamat Anda Berhasil");
                        } 
                        else if(message.equals("inputfailed"))
                        {
                            out.println("Maaf Anda Gagal");
                        }
                    }
                }
                catch (Exception e) 
                {
                    System.err.println();
                }
                
            %> Membeli Hewan Quran Di IA Qurban</h3>
            <h3>Segera Bayarkan Ke Bank Tersebut dengan <br> no Rek <% out.println(rekening); %><br> Dengan Total <% out.println(harga); %></h3>
                
        <% out.println(username); %> ||<% out.println(idcust); %>
        
        <a href="http://<% out.println(request.getServerName()); %>:8080/IAQurban/DTrans_Infobeli?idcust=<% out.println(idcust); %>" class="btn btn-primary">Lihat Daftar PemBelian</a><br>
    
                                	</div>
                        	</div>
                	</div>	
                </div>
	</section><!--/#contact-->
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

