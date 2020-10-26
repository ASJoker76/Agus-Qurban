package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Hewan_005fIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String username = (String) session.getAttribute("username");
    String idcust = (String) session.getAttribute("idcust");
    if (username==null) {
    response.sendRedirect("Customer_Login.jsp?auth=forbidden");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("         <header id=\"header\" role=\"banner\">\t\t\n");
      out.write("            <div class=\"main-nav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"header-top\">\n");
      out.write("                        <div class=\"pull-right social-icons\">\n");
      out.write("                            <h3>WELCOME</h3> ");
 out.println(username); 
      out.write(" ||");
 out.println(idcust); 
      out.write("\n");
      out.write("                       <!-- <div class=\"pull-right social-icons\">\n");
      out.write("                            <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Customer_Login.jsp\">Login</a>\n");
      out.write("                            <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Customer_Create.jsp\">Register</a>\n");
      out.write("                            <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Hewan_Index\">My Qurban</a>\n");
      out.write("                        </div>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>     \n");
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
      out.write("\t\t                <li class=\"scroll active\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Hewan_Index.jsp\">Home</a></li>\n");
      out.write("\t\t                <li class=\"scroll\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Hewan_Insert.jsp\">Tambah Hewan</a></li>\n");
      out.write("\t\t                <li class=\"scroll\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/DTrans_Infobeli?idcust=");
 out.println(idcust); 
      out.write("\">Daftar Pembelian</a></li>                         \n");
      out.write("\t\t                <li class=\"scroll\"><a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/DTrans_Infojual?idcust=");
 out.println(idcust); 
      out.write("\">Daftar Penjualan</a></li>\n");
      out.write("                                <li class=\"scroll\"><a href=\"#event\">Contact</a></li>     \n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>                    \n");
      out.write("    </header><!--/#header-->                    \n");
      out.write("       \n");
      out.write("     <section id=\"home\">\t\n");
      out.write("\t\t<div id=\"main-slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t<li data-target=\"#main-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#main-slider\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#main-slider\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"item active\">\n");
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
      out.write("                            </div>\t\t\t\t\n");
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
      out.write("          \n");
      out.write("                                <br><br>\n");
      out.write("\n");
      out.write("        <table border='1' cellpadding='10' cellspacing='0'>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id Hewan</th>\n");
      out.write("                    <th>Id Customer</th>\n");
      out.write("                    <th>Nama</th>\n");
      out.write("                    <th>Berat</th>\n");
      out.write("                    <th>Umur</th>\n");
      out.write("                    <th>Harga</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Foto</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    ResultSet rs = (ResultSet) request.getAttribute("datahewanid");
                    if (rs != null){
                        while(rs.next()){
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
 out.println(rs.getString(1)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getString(3)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getInt(4)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getInt(5)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getInt(6)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getString(7)); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.println(rs.getString(8)); 
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img style=\"width:100px;\" src=\"/IAQurban/Uploads/");
 out.println(rs.getString(9)); 
      out.write("\">\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Hewan_Edit?idhewan=");
 out.println(rs.getString(1)); 
      out.write("\">Edit</a>&nbsp;\n");
      out.write("                                    <a href=\"http://");
 out.println(request.getServerName()); 
      out.write(":8080/IAQurban/Hewan_EditImage?idhewan=");
 out.println(rs.getString(1)); 
      out.write("\">Edit Foto</a>&nbsp;\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                        }
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            <br>\n");
      out.write("            ");

                
            
      out.write("    \n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("              \n");
      out.write("                </div>\n");
      out.write("\t</div>\n");
      out.write("    </section><!--/#explore-->\n");
      out.write("      <footer id=\"footer\">\n");
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
      out.write("</html>");
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
