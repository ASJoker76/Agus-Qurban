package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Main_005fIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\t\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                <script src=\"js/html5shiv.js\"></script>\n");
      out.write("                <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->       \n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        <title>IA Qurban</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\" role=\"banner\">\t\t\n");
      out.write("            <div class=\"main-nav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"header-top\">\n");
      out.write("                    <!--    <div class=\"pull-right social-icons\">\n");
      out.write("                            ");
/*    if(username!=null)    
                                {
                                    out.println(username); 
                                    out.println(idcust);
                                }
                           */ 
      out.write("\n");
      out.write("                            ");
/*
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
                           */ 
      out.write("\n");
      out.write("                        </div>-->\n");
      out.write("                    </div>    \n");
      out.write("\t\t    <div class=\"row\">\t        \t\t\n");
      out.write("\t\t        <div class=\"navbar-header\">\n");
      out.write("\t\t            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t\t                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t                <span class=\"icon-bar\"></span>\n");
      out.write("\t\t                <span class=\"icon-bar\"></span>\n");
      out.write("\t\t                <span class=\"icon-bar\"></span>\n");
      out.write("\t\t            </button>\n");
      out.write("\t\t            <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                                <img class=\"img-responsive\" src=\"images/logoqurban.png\" alt=\"logo\">\n");
      out.write("\t\t            </a>                    \n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"collapse navbar-collapse\">\n");
      out.write("\t\t            <ul class=\"nav navbar-nav navbar-right\">                 \n");
      out.write("\t\t                 <li class=\"scroll active\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Main_Index.jsp\">Home</a></li>\n");
      out.write("                                 <li class=\"scroll\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Customer_Login.jsp\">Login</a></li>                        \n");
      out.write("                                <li class=\"scroll\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Customer_Create.jsp\">Register</a></li>\n");
      out.write("                                <li class=\"scroll\"><a href=\"#event\">Contact</a></li>      \n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>                    \n");
      out.write("    </header><!--/#header--> \n");
      out.write("\n");
      out.write("        <section id=\"home\">\t\n");
      out.write("\t\t<div id=\"main-slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t<li data-target=\"#main-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#main-slider\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#main-slider\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t<div class=\"item active\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"images/slider/kambing-qurban.jpg\" alt=\"slider\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h2>Selamat Datang di IAQurban </h2>\n");
      out.write("\t\t\t\t\t\t<h4>Mari kita Berqurban</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"images/slider/sapi-sapi.jpg\" alt=\"slider\">\t\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h2>Selamat Datang di IAQurban </h2>\n");
      out.write("\t\t\t\t\t\t<h4>Ayo Segera Daftar untuk Qurban</h4>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"images/slider/sapi.jpg\" alt=\"slider\">\t\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t\t<h2>Selamat Datang di IAQurban </h2>\n");
      out.write("\t\t\t\t\t\t<h4>Registrasi untuk melakukan MYQurban</h4>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>    \t\n");
      out.write("    </section><!--/#home-->\n");
      out.write("        \n");
      out.write("        <section id=\"explore\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"watch\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"images/watch.png\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-md-offset-2 col-sm-5\">\n");
      out.write("\t\t\t\t\t<h2>List Semua Hewan</h2>\n");
      out.write("                                        <br><br><br><br><br><br>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("        <form method=\"post\" action=\"FRoom_Search\">\n");
      out.write("            <label><strong>Never Make Reservation Before? Register <a href=\"Register.jsp\">Here</a> </strong><br><br>\n");
      out.write("\t\t<fieldset>\n");
      out.write("\t\t<div class=\"clearfix\">\n");
      out.write("\t\t<label><span>Search</span></label>\n");
      out.write("\t\t<div class=\"input\">\n");
      out.write("                    <input tabindex=\"2\" size=\"25\" id=\"email\" name=\"search\" type=\"text\" value=\"\" class=\"input-xlarge\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                <div class=\"input\">\n");
      out.write("\t\t<input type=\"submit\" id=\"newsletter_submit\" value=\"Search\"/>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("\t\t</fieldset>\n");
      out.write("            </label>\n");
      out.write("        </form>\n");
      out.write("                                <br><br>\n");
      out.write("        <table border='1' cellpadding='10' cellspacing='1' align=\"center\" width=\"90%\">\n");
      out.write("            <thead>\n");
      out.write("                <tr bgcolor=\"saddlebrown\">\n");
      out.write("                    <th><p align=\"center\">  Foto </p></th>\n");
      out.write("                    <th><p align=\"center\">  Id Hewan </p></th>\n");
      out.write("                    <th><p align=\"center\">  Id Customer  </p></th>\n");
      out.write("                    <th><p align=\"center\">  Nama  </p></th>\n");
      out.write("                    <th><p align=\"center\">  Berat  </p></th>\n");
      out.write("                    <th><p align=\"center\">  Umur  </p></th>\n");
      out.write("                    <th><p align=\"center\">  Harga  </p></th>\n");
      out.write("                    <th><p align=\"center\">  Type  </p></th>\n");
      out.write("                    <th><p align=\"center\">  Status  </p></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    ResultSet rs = (ResultSet) request.getAttribute("data");
                    if (rs != null){
                        while(rs.next()){
                            
      out.write("\n");
      out.write("                            <tr bgcolor=\"burlywood\">\n");
      out.write("                                <td>\n");
      out.write("                                    <p align=\"center\"><img style=\"width:100px;\" src=\"/IAQurban/Uploads/");
 out.println(rs.getString(9)); 
      out.write("\"></p>\n");
      out.write("                                </td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getString(1)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getString(2)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getString(3)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getInt(4)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getInt(5)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getInt(6)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getString(7)); 
      out.write("</p></td>\n");
      out.write("                                <td><p align=\"center\">");
 out.println(rs.getString(8)); 
      out.write("</p></td>\n");
      out.write("                                <td>\n");
      out.write("                                     <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Hewan_Info?idhewan=");
 out.println(rs.getString(1)); 
      out.write("\" class=\"form-control\">Beli</a> \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                        }
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            <br>\n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><!--/#explore-->\n");
      out.write("        \n");
      out.write("        <section id=\"explore\">\n");
      out.write("            \n");
      out.write("\t\t<!--<div id=\"map\">\n");
      out.write("\t\t\t<div id=\"gmap-wrap\">\n");
      out.write("\t \t\t\t<div id=\"gmap\"> \t\t\t\t\n");
      out.write("\t \t\t\t</div>\t \t\t\t\n");
      out.write("                        </div>\n");
      out.write("\t\t</div><!--/#map-->\n");
      out.write("\t\t<div class=\"contact-section\">\n");
      out.write("\t\t\t<div class=\"ear-piece\">\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"images/ear-piece.png\" alt=\"\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-sm-offset-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-text\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Contact</h3>\n");
      out.write("\t\t\t\t\t\t\t<address>\n");
      out.write("\t\t\t\t\t\t\t\tG-mail: agussmata76@gmail.com<br>\n");
      out.write("\t\t\t\t\t\t\t\tPhone: +62 897 1729 681<br>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</address>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"contact-address\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Contact</h3>\n");
      out.write("\t\t\t\t\t\t\t<address>\n");
      out.write("\t\t\t\t\t\t\t\tKedung Badak,No 34<br>\n");
      out.write("\t\t\t\t\t\t\t\tJl Baru,<br>\n");
      out.write("\t\t\t\t\t\t\t\tKota Bogor, 16164<br>\n");
      out.write("\t\t\t\t\t\t\t\tIndonesia\n");
      out.write("\t\t\t\t\t\t\t</address>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-5\">\n");
      out.write("\t\t\t\t\t\t<div id=\"contact-section\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Send a message</h3>\n");
      out.write("\t\t\t\t\t    \t<div class=\"status alert alert-success\" style=\"display: none\"></div>\n");
      out.write("\t\t\t\t\t    \t<form id=\"main-contact-form\" class=\"contact-form\" name=\"contact-form\" method=\"post\" action=\"sendemail.php\">\n");
      out.write("\t\t\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t                <input type=\"text\" name=\"name\" class=\"form-control\" required=\"required\" placeholder=\"Name\">\n");
      out.write("\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t                <input type=\"email\" name=\"email\" class=\"form-control\" required=\"required\" placeholder=\"Email ID\">\n");
      out.write("\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t                <textarea name=\"message\" id=\"message\" required=\"required\" class=\"form-control\" rows=\"4\" placeholder=\"Enter your message\"></textarea>\n");
      out.write("\t\t\t\t\t            </div>                        \n");
      out.write("\t\t\t\t\t            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t                <button type=\"submit\" class=\"btn btn-primary pull-right\">Send</button>\n");
      out.write("\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t        </form>\t       \n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</section><!--/#contact-->\n");
      out.write("\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <p> Copyright  &copy;2017<a target=\"_blank\" href=\"#\">IA Qurban </a><br><a>CCIT-FTUI DEPOK</a>\n");
      out.write("                </p>                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer><!--/#footer-->\n");
      out.write("    \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("  \t<script type=\"text/javascript\" src=\"js/gmaps.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/smoothscroll.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.parallax.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/coundown-timer.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.scrollTo.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.nav.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
