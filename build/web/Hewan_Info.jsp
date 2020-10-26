<%-- 
    Document   : Hewan_Info
    Created on : Apr 13, 2017, 10:17:42 AM
    Author     : ASJoker76
--%>
<%
    String username = (String) session.getAttribute("username");
    String idcust = (String) session.getAttribute("idcust");
    if (username==null) {
    
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
       <title>Hewan Info</title>
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
	
        <h1>Hewan Info</h1>
        
        Welcome in IA Qurban <% out.println(username); %> ||<% out.println(idcust); %>
        
        <form action="Proses_Beli" method="POST">
            <%
                ResultSet rs = (ResultSet) request.getAttribute("datainfo");
                if (rs.next()) {
                %>
                   Id Hewan   : <input readonly type="text" name="idhewan" class="form-control" value="<% out.println(rs.getString(1)); %>"><br>
                   Id Customer: <input readonly type="text" name="idcust" class="form-control" value="<% out.println(rs.getString(2)); %>"><br>
                   Nama Hewan : <input readonly type="text" name="namahewan" class="form-control" value="<% out.println(rs.getString(3)); %>"><br>
                   Berat Hewan: <input readonly type="text" name="berat" class="form-control" value="<% out.println(rs.getInt(4)); %>"><br>
                   Umur Hewan : <input readonly type="text" name="umur" class="form-control" value="<% out.println(rs.getInt(5)); %>"><br>
                   Harga Hewan: <input readonly type="text" name="harga" class="form-control" value="<% out.println(rs.getInt(6)); %>"><br>
                   Type Hewan : <input readonly type="text" name="type" class="form-control" value="<% out.println(rs.getString(7)); %>"><br>
                   Status     : <input readonly type="text" name="status" class="form-control" value="<% out.println(rs.getString(8)); %>"><br>
                   Foto       : <td>
                                    <p align="center"><img style="width:100px;" src="/IAQurban/Uploads/<% out.println(rs.getString(9)); %>"></p>
                                </td>
                   
                <%
                }
            %>
            <input type="submit" value="Beli" class="btn btn-primary">
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

