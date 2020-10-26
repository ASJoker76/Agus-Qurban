<%-- 
    Document   : Hewan_Edit
    Created on : Apr 14, 2017, 8:21:19 PM
    Author     : ASJoker76
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
        <title>Hewan Edit</title>
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
	
        <h1>Edit Hewan</h1>
        <form action="Hewan_Update" method="POST">
            <%
                ResultSet rs = (ResultSet) request.getAttribute("dataedithewan");
                if (rs.next()) {
                %>
            Id Hewan   : <input readonly type="text" name="idhewan" class="form-control" required="required" value="<% out.println(rs.getString(1)); %>"><br>
            Id Customer: <input readonly type="text" name="idcust" class="form-control" required="required" value="<% out.println(rs.getString(2)); %>"><br>
            Nama Hewan : <input type="text" name="namahewan" class="form-control" required="required" placeholder="Name Hewan" value="<% out.println(rs.getString(3)); %>"><br>
            Berat Hewan: <input type="text" name="berat" class="form-control" required="required" placeholder="Berat Hewan" value="<% out.println(rs.getInt(4)); %>"><br>
            Umur Hewan : <input type="text" name="umur" class="form-control" required="required" placeholder="Umur Hewan" value="<% out.println(rs.getInt(5)); %>"><br>
            Harga Hewan: <input type="text" name="harga" class="form-control" required="required" placeholder="Harga Hewan" value="<% out.println(rs.getInt(6)); %>"><br>
            Type Hewan : <input type="text" name="type" class="form-control" required="required" placeholder="Type Hewan" value="<% out.println(rs.getString(7)); %>"><br>
            Status     : <select name="status" class="form-control">
                            <option value="Ada">Ada</option>
                            <option value="Sudah Terjual">Sudah Terjual</option>
                         </select><br>
                        
                          
            <%
                }
            %>
            <input type="submit" value="Update" class="btn btn-primary">
           
                        
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
