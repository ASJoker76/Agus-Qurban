<%-- 
    Document   : Proses_Beli
    Created on : Apr 13, 2017, 10:48:18 AM
    Author     : ASJoker76
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Model.DTransaction"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Date"%>
<%
    String username = (String) session.getAttribute("username");
    String idcust = (String) session.getAttribute("idcust");
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
        <title>Proses Beli</title>
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
	
        <h1>Proses Beli</h1>
        
        Welcome in IA Qurban <% out.println(username); %> ||<% out.println(idcust); %>
        
        <form action="Hewan_Beli" method="POST">
            <%
                ResultSet rs = (ResultSet) request.getAttribute("datainfo");
                if (rs.next()) {
                %>
                   <%
                        DTransaction obj = new DTransaction();
                        String idtrans = obj.AutoIDTrans();
                        
                        Date ys = new Date();
                        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                   %>
                   Id Transaction       : <input readonly type="text" name="idtrans" class="form-control" value="<% out.println(idtrans); %>"><br>
                   Id Hewan             : <input readonly type="text" name="idhewan" class="form-control" value="<% out.println(rs.getString(1)); %>"><br>
                   Id Customer Jual     : <input readonly type="text" name="idcustjual" class="form-control" value="<% out.println(rs.getString(2)); %>"><br>
                   Id Customer Beli     : <input readonly type="text" name="idcustbeli" class="form-control" value="<% out.println(idcust); %>"><br>
                   Tanggal Pemesanan    : <input readonly type="text" name="tanggalpemesanan" class="form-control" value="<% out.println(s.format(ys)); %>"><br>
                   Harga Hewan          : <input readonly type="text" name="harga" class="form-control" value="<% out.println(rs.getInt(6)); %>"><br>
                   Foto                 : <td>
                       <img style="width:100px;" src="/IAQurban/Uploads/<% out.println(rs.getString(9)); %>"><br><br>
                                            <input readonly name="foto" value="<% out.println(rs.getString(9)); %>" class="form-control"/>
                                          </td>
                   
                <%
                }
            %>
            <br><br>
            <p align="center"><img src="/IAQurban/Uploads/Bank logo.png"/></p>
            <input type="radio" name="rb" value="<% session.setAttribute("rekening","1232323123");%>" class="form-control">BCA &nbsp;
            <input type="radio" name="rb" value="<% session.setAttribute("rekening","1232322342");%>" class="form-control">BNI &nbsp;
            <input type="radio" name="rb" value="<% session.setAttribute("rekening","1234234109");%>" class="form-control">BRI &nbsp;
            <input type="radio" name="rb" value="<% session.setAttribute("rekening","1209874234");%>" class="form-control">Mandiri &nbsp;
                        <br><br>
            <input type="submit" value="Beli" class="btn btn-primary">
            <br><br><br>
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


