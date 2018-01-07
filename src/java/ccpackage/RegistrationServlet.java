/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Soundarya BM
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {

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
        final String JDBC_Driver = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/cupcake";

        final String USER = "root";
        final String PSWD = "sesame";

        //GET Redgistration date for the user
        java.util.Date utilDate = new Date();

        //Convert the date to sql date
        java.sql.Date date = new java.sql.Date(utilDate.getTime());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        String pnum = request.getParameter("pnum");
        String addrl1 = request.getParameter("addrl1");
        String addrl2 = request.getParameter("addrl2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");

        if (fname.isEmpty() || lname.isEmpty() || email.isEmpty() || pwd.isEmpty() || pnum.isEmpty() || addrl1.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty()) {
            RequestDispatcher rd = request.getRequestDispatcher("registrationform.jsp");
            out.println("<font color=red size=10>Please fill in all the details.</font>");
            rd.include(request, response);
        }
        try {

            //To register the JDBC Driver    
            Class.forName("com.mysql.jdbc.Driver");
            //Establisjh a connection 
            Connection conn = DriverManager.getConnection(DB_URL, USER, PSWD);

            //check if already user has registered
            PreparedStatement checkemailquery = conn.prepareStatement("select * from user_info WHERE emailid=?");

            checkemailquery.setString(1, email);

            ResultSet rs = checkemailquery.executeQuery();

            if (!rs.next())  {

                PreparedStatement ps = conn.prepareStatement("insert into user_info(fname,lname,emailid,pwd,pnum,addrl1,addrl2,city,state,zip,regdate) values(?,?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, email);
                ps.setString(4, pwd);
                ps.setString(5, pnum);
                ps.setString(6, addrl1);
                ps.setString(7, addrl2);
                ps.setString(8, city);
                ps.setString(9, state);
                ps.setString(10, zip);
                ps.setDate(11, date);

                int i = ps.executeUpdate();
                if (i > 0) {
                     out.println("<font color=red size=10>You are successfully registered!!!!!Please login to continue...</font>");
                    request.getRequestDispatcher("login.jsp").include(request,response);
                    
                }
            } else {
                out.println("<font color=red size=10>User Id already exists, Please login or register to continue shopping..</font>");
                request.getRequestDispatcher("login.jsp").include(request,response);
                
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
