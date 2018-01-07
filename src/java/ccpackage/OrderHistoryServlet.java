/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Soundarya BM
 */
@WebServlet(name = "OrderHistoryServlet", urlPatterns = {"/OrderHistoryServlet"})
public class OrderHistoryServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String DB_URL="jdbc:mysql://localhost/cupcake";
        final String USER="root";
        final String PWD="sesame";
        HttpSession session = request.getSession(false);
        String email=(String) session.getAttribute("emailid");
        try{
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
        
            //To register the JDBC Driver    
            Class.forName("com.mysql.jdbc.Driver");
            //Establisjh a connection 
            Connection conn = DriverManager.getConnection(DB_URL, USER, PWD);

            //check if already user has registered
            PreparedStatement orderhistoryquery = conn.prepareStatement("select order_id,pname,pqty,ptotal,pdate from purchase_info WHERE emailid=?");

            orderhistoryquery.setString(1, email);

            ResultSet rs = orderhistoryquery.executeQuery();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>My Order History");                
            out.println("</title>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/css/style.css'/ >");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Your Previous Orders..</h2>");
            out.println("<a href='logout' method='post'> Click here to LOGOUT ");
            out.println("</a>");            
            out.println("<hr>");
            out.println("<table id='register'>");
            out.println("<tr>");
            out.println("<th>Order ID </th>");
            out.println("<th>Product Name</th>");
            out.println("<th>Quantity</th>");
            out.println("<th>Product Total</th>");
            out.println("<th>Purchase Date</th>");
            out.println("</tr>");
                
            while(rs.next())
                {
                 int orderid=rs.getInt("order_id");
                 String pname=rs.getString("pname");
                 int pqty=rs.getInt("pqty");
                 double ptotal=rs.getDouble("ptotal");
                 Date pdate=rs.getDate("pdate");                                 
                    
                
                out.println("<tr>");
                out.println("<td>");
                out.println(orderid + "</td>");
                out.println("<td>");
                out.println(pname + " </td>");
                out.println("<td>");
                out.println(pqty + "</td>");
                out.println("<td>");
                out.println(ptotal + "</td>");
                out.println("<td>");
                out.println(pdate + "</td>");
                out.println("</tr>");
                                
                }
               out.println("</table>");
               out.println("</body>");
               out.println("</html>");
        }
  
        catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
