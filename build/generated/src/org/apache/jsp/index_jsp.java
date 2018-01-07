package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("       <title>CUPCAKE CORNER</title>\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("     </head>\n");
      out.write("     <body bgcolor=\"thistle\">\n");
      out.write("             ");
 
                 if((String)request.getAttribute("fname") !=null){
             
      out.write("\n");
      out.write("            \n");
      out.write("             <ul class=\"navbar\" >\n");
      out.write("             <li><a href=\"order.jsp\">Menu</a></li>    \n");
      out.write("             <li><a href=\"Christmas.jsp\">Seasonal Special</a></li>  \n");
      out.write("              \n");
      out.write("            <li><a href=\"index.jsp\">Logout</a></li> \n");
      out.write("              </ul>\n");
      out.write("             \n");
      out.write("             ");
 } else {
             
      out.write("\n");
      out.write("             <ul class=\"navbar\" >\n");
      out.write("             <li><a href=\"order.jsp\">Menu</a></li>    \n");
      out.write("             <li><a href=\"Chritsmas.jsp\">Seasonal Special</a></li>  \n");
      out.write("             \n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li> \n");
      out.write("              </ul>\n");
      out.write("             ");
 } 
      out.write("  \n");
      out.write("              <img  src=\"images/logo.jpg\" alt=\"icon\" height=\"200\" width=\"300\"/>\n");
      out.write("              <img src=\"images/slide1.jpg\" alt=\"slide1\" height=\"200\" width=\"600\"/>\n");
      out.write("              <img src=\"images/slide2.jpg\" alt=\"slide1\" height=\"200\" width=\"600\"/>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("             \n");
      out.write("</body>\n");
      out.write(" </html>\n");
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
