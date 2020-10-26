<%-- 
    Document   : DTrans_EditPengiriman
    Created on : Apr 16, 2017, 8:16:56 PM
    Author     : ASJoker76
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Model.DTransaction"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Date"%>
<%
    String username = (String) session.getAttribute("username");
    String idadmin = (String) session.getAttribute("idadmin");
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
       <title>Edit Pengiriman</title>
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
	
        
        <h1>Edit Pengiriman</h1>
        
        Welcome in IA Qurban <% out.println(username); %> ||<% out.println(idadmin); %>
        
        <form action="Pengiriman_Edit" method="POST">
            <%
                ResultSet rs = (ResultSet) request.getAttribute("dataeditpengiriman");
                if (rs.next()) {
                %>
                   <%
                        Date ys = new Date();
                        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                   %>
                   Id Transaction       : <input readonly type="text" name="idtrans" class="form-control" value="<% out.println(rs.getString(1)); %>"><br>
                   Tanggal Pengiriman   : <input readonly type="text" name="tanggalpengiriman" class="form-control" value="<% out.println(s.format(ys)); %>"><br>
                   Status               : <input readonly type="text" name="status" class="form-control" value="Pengiriman"><br>
                   
                <%
                }
            %>
            <br><br>
            <input type="submit" value="Update" class="form-control">
            <br>
        </form>
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

