package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Hewan_005fInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hewan Qurban</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Tambah Hewan Qurban</h2>\n");
      out.write("        <form method=\"POST\" action=\"Hewan_Insert\">\n");
      out.write("            Id Hewan   : <input type=\"text\" name=\"idhewan\" class=\"form-control\" required=\"required\"><br>\n");
      out.write("            Id Customer: <input type=\"text\" name=\"idcust\" class=\"form-control\" required=\"required\"><br>\n");
      out.write("            Nama Hewan : <input type=\"text\" name=\"namahewan\" class=\"form-control\" required=\"required\" placeholder=\"Name Hewan\"><br>\n");
      out.write("            Berat Hewan: <input type=\"text\" name=\"berat\" class=\"form-control\" required=\"required\" placeholder=\"Berat Hewan\"><br>\n");
      out.write("            Umur Hewan : <input type=\"text\" name=\"umur\" class=\"form-control\" required=\"required\" placeholder=\"Umur Hewan\"><br>\n");
      out.write("            Harga Hewan: <input type=\"text\" name=\"harga\" class=\"form-control\" required=\"required\" placeholder=\"Harga Hewan\"><br>\n");
      out.write("            Type Hewan : <input type=\"text\" name=\"type\" class=\"form-control\" required=\"required\" placeholder=\"Type Hewan\"><br>\n");
      out.write("            Status     : <input type=\"text\" name=\"status\" class=\"form-control\" required=\"required\" placeholder=\"Status Hewan\"><br>\n");
      out.write("            <input type=\"submit\" value=\"simpan\" class=\"btn btn-primary\">\n");
      out.write("        </form>\n");
      out.write("        ");

            try 
            {
                String message = request.getParameter("message");
                if (message!=null) 
                {
                    if (message.equals("inputsuccess")) 
                    {
                        out.println("Status: Registrasi Anda Berhasil.");
                    }
                    else if(message.equals("inputfailed"))
                    {
                        out.println("Status: Registrasi Anda Gagal.");
                    }
                }
            }
            catch (Exception e) 
            {
                System.err.println();
            }

        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
