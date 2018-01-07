package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seasonal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Seasonal Cupcakes </title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"background.jpg\">\n");
      out.write("        \n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\" method=\"post\">\n");
      out.write("              <input type=\"submit\" value=\"Logout\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("              \n");
      out.write("        <h1 align=\"center\">MENU</h1>\n");
      out.write("        \n");
      out.write("        <form action='order.jsp'>click here to add Regular cupcakes...MENU <input type='submit' value='Regular Cupcakes Menu'></form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<form action=\"AddtoCartServlet\">\n");
      out.write("    \n");
      out.write("    <table>\n");
      out.write("        <td><img src= \"images/cc/christ.jpg\"  alt=\"Christmas Special version 1\" height=\"300\" width=\"300\"/></td>\n");
      out.write("        <td>\n");
      out.write("            <table id=\"menudesc\" width =\"300\">                \n");
      out.write("                <tr><h2>Christmas Special Cupcake - 1</h2></tr>\n");
      out.write("                \n");
      out.write("        <tr><p>Christmas Special Cupcake with caramel and cream cheese frosting. </p></tr>\n");
      out.write("        <tr>Quantity<input type=\"number\" name=\"quantity\"  value=\"1\"></tr><br/><br/>\n");
      out.write("        <tr><button type=\"button\"   onclick=\"myFunction()\">Christmas Special offer price</button> \n");
      out.write("            <p id=\"demo\"></p>\n");
      out.write("            <script>\n");
      out.write("            function myFunction()\n");
      out.write("            {\n");
      out.write("             var str = \"$ 5.5\";\n");
      out.write("             var result = str.strike() + \"Special Price is  $2.5 each\" ;\n");
      out.write("             document.getElementById(\"demo\").innerHTML = result;\n");
      out.write("             }\n");
      out.write("            </script>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("        <input type=\"hidden\" name=\"image\" value=\"images/cc/ps.jpg\">\n");
      out.write("        <input type=\"hidden\" name=\"name\" value=\"Christmas Special Cupcake-Caramel\">\n");
      out.write("        <input type=\"hidden\" name=\"price\" value=\"1.50\">\n");
      out.write("        <input type=\"submit\" value=\"Add to cart\">\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</td>\n");
      out.write("</table>\n");
      out.write("   </form>\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("    <table>\n");
      out.write("        <td><img src= \"images/cc/mas.jpg\"  alt=\"Christmas Special version 2\" height=\"300\" width=\"300\"/></td>\n");
      out.write("        <td>\n");
      out.write("            <table id=\"menudesc\" width =\"300\">                \n");
      out.write("                <tr><h2>Christmas Special Cupcake -2</h2></tr>\n");
      out.write("                \n");
      out.write("        <tr><p>Christmas Special Semisweet chocolate cake topped with semi sweet cream.</p></tr>\n");
      out.write("        <tr>Quantity<input type=\"number\" name=\"quantity\"  value=\"1\"></tr><br/><br/>\n");
      out.write("        <tr><button type=\"button\" onclick=\"myFunction()\">Christmas Special offer price</button> \n");
      out.write("        <tr><p id=\"demo\"></p>\n");
      out.write("            <h2>\n");
      out.write("            <script> \n");
      out.write("            function myFunction()\n");
      out.write("            {\n");
      out.write("             var str = \"$ 5.0\";\n");
      out.write("             var result = str.strike() + \"Special Price is  $2.5 each\" ;\n");
      out.write("             document.getElementById(\"demo\").innerHTML = result;\n");
      out.write("             }\n");
      out.write("            </script>\n");
      out.write("            </h2>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("        <input type=\"hidden\" name=\"image\" value=\"images/cc/ps.jpg\">\n");
      out.write("        <input type=\"hidden\" name=\"name\" value=\"Christmas Special Cupcake-Semisweet\">\n");
      out.write("        <input type=\"hidden\" name=\"price\" value=\"1.50\">\n");
      out.write("        <input type=\"submit\" value=\"Add to cart\">\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</td>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("  \n");
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
