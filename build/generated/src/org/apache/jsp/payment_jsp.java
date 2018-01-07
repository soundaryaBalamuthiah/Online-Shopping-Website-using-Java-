package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("       <title>PAYMENT</title>\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("     </head>\n");
      out.write("<body background=\"images/background.jpg\">\n");
      out.write("       <h1>Payment Details . . .  </h1>\n");
      out.write("<br/>\n");
      out.write("<form action=\"PaymentServlet\" method=\"post\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("\n");
      out.write("<table id=\"register\" >\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>Address Line 1</b></label></td>\n");
      out.write("    <td><input type=\"text\" placeholder=\"Enter Adress Line 1\" name=\"saddrl1\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>Address Line 2 </b></label></td>\n");
      out.write("    <td><input type=\"text\" placeholder=\"Enter Address Line 2\" name=\"saddrl2\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>City</b></label></td>\n");
      out.write("    <td><input type=\"text\" placeholder=\"Enter City\" name=\"scity\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>State</b></label></td>\n");
      out.write("    <td><select name=\"state\">\n");
      out.write("\t<option value=\"AL\">Alabama</option>\n");
      out.write("\t<option value=\"AK\">Alaska</option>\n");
      out.write("\t<option value=\"AZ\">Arizona</option>\n");
      out.write("\t<option value=\"AR\">Arkansas</option>\n");
      out.write("\t<option value=\"CA\">California</option>\n");
      out.write("\t<option value=\"CO\">Colorado</option>\n");
      out.write("\t<option value=\"CT\">Connecticut</option>\n");
      out.write("\t<option value=\"DE\">Delaware</option>\n");
      out.write("\t<option value=\"DC\">District Of Columbia</option>\n");
      out.write("\t<option value=\"FL\">Florida</option>\n");
      out.write("\t<option value=\"GA\">Georgia</option>\n");
      out.write("\t<option value=\"HI\">Hawaii</option>\n");
      out.write("\t<option value=\"ID\">Idaho</option>\n");
      out.write("\t<option value=\"IL\">Illinois</option>\n");
      out.write("\t<option value=\"IN\">Indiana</option>\n");
      out.write("\t<option value=\"IA\">Iowa</option>\n");
      out.write("\t<option value=\"KS\">Kansas</option>\n");
      out.write("\t<option value=\"KY\">Kentucky</option>\n");
      out.write("\t<option value=\"LA\">Louisiana</option>\n");
      out.write("\t<option value=\"ME\">Maine</option>\n");
      out.write("\t<option value=\"MD\">Maryland</option>\n");
      out.write("\t<option value=\"MA\">Massachusetts</option>\n");
      out.write("\t<option value=\"MI\">Michigan</option>\n");
      out.write("\t<option value=\"MN\">Minnesota</option>\n");
      out.write("\t<option value=\"MS\">Mississippi</option>\n");
      out.write("\t<option value=\"MO\">Missouri</option>\n");
      out.write("\t<option value=\"MT\">Montana</option>\n");
      out.write("\t<option value=\"NE\">Nebraska</option>\n");
      out.write("\t<option value=\"NV\">Nevada</option>\n");
      out.write("\t<option value=\"NH\">New Hampshire</option>\n");
      out.write("\t<option value=\"NJ\">New Jersey</option>\n");
      out.write("\t<option value=\"NM\">New Mexico</option>\n");
      out.write("\t<option value=\"NY\">New York</option>\n");
      out.write("\t<option value=\"NC\">North Carolina</option>\n");
      out.write("\t<option value=\"ND\">North Dakota</option>\n");
      out.write("\t<option value=\"OH\">Ohio</option>\n");
      out.write("\t<option value=\"OK\">Oklahoma</option>\n");
      out.write("\t<option value=\"OR\">Oregon</option>\n");
      out.write("\t<option value=\"PA\">Pennsylvania</option>\n");
      out.write("\t<option value=\"RI\">Rhode Island</option>\n");
      out.write("\t<option value=\"SC\">South Carolina</option>\n");
      out.write("\t<option value=\"SD\">South Dakota</option>\n");
      out.write("\t<option value=\"TN\">Tennessee</option>\n");
      out.write("\t<option value=\"TX\">Texas</option>\n");
      out.write("\t<option value=\"UT\">Utah</option>\n");
      out.write("\t<option value=\"VT\">Vermont</option>\n");
      out.write("\t<option value=\"VA\">Virginia</option>\n");
      out.write("\t<option value=\"WA\">Washington</option>\n");
      out.write("\t<option value=\"WV\">West Virginia</option>\n");
      out.write("\t<option value=\"WI\">Wisconsin</option>\n");
      out.write("\t<option value=\"WY\">Wyoming</option>\n");
      out.write("</select></td>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>Zip Code</b></label></td>\n");
      out.write("    <td><input type=\"text\" placeholder=\"Enter Zip Code\" name=\"szip\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>  \n");
      out.write("    <td><label><b>CARD NUMBER</b></label></td>\n");
      out.write("    <td><input type=\"text\" placeholder=\"Enter Card Number\" name=\"cnum\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>CARD TYPE</b></label></td>\n");
      out.write("    <td><select name=\"ctype\">\n");
      out.write("\t<option value=\"visa\">VISA</option>\n");
      out.write("\t<option value=\"mastercard\">MASTER CARD</option>\n");
      out.write("\t<option value=discover>DISCOVER</option>\n");
      out.write("        <option value=\"other\">OTHER</option>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>NAME ON THE CARD</b></label></td>\n");
      out.write("    <td><input type=\"text\" placeholder=\"Enter Full Name\" name=\"cname\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>EXPIRY DATE</b></label></td>\n");
      out.write("    <td><input type=\"month\" align=\"left\" placeholder=\"Enter Date\" name=\"edate\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><label><b>CVV</b></label></td>\n");
      out.write("    <td><input type=\"password\" placeholder=\"Enter CVV\" name=\"cvv\" required></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    <p>By using our servies, you agree to our <a href=\"tandc.html\">Terms & Privacy</a>.</p>\n");
      out.write("<br/>\n");
      out.write("    <div class=\"clearfix\">\n");
      out.write("      <button type=\"submit\" class=\"placeorderbtn\">Place My Order</button>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
