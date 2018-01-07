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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        System.out.println("I am here");
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
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        String email=request.getParameter("email");
        String pwd=request.getParameter("psw");
        
        if(email.isEmpty()|| pwd.isEmpty())
        {
          RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
          out.println("<font color= red size=15> Please enter your emailid and password!!!</font>");
          rd.include(request,response);
        }
        else
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(DB_URL,USER,PWD);
                PreparedStatement userCheck=conn.prepareStatement("select * from user_info where emailid=?");
                userCheck.setString(1,email);
                ResultSet rs=userCheck.executeQuery();
                if(rs.next())
                {
                    PreparedStatement pwdCheck=conn.prepareStatement("select fname,pwd from user_info where emailid=?");
                    pwdCheck.setString(1, email);
                    ResultSet rset=pwdCheck.executeQuery();
                    if(rset.next())
                    {
                        String pwd1=rset.getString("pwd");
                        String fname1=rset.getString("fname");
                        if(pwd1.equals(pwd))
                        { 
                            request.setAttribute("fname",fname1);
                            request.getRequestDispatcher("index.jsp").include(request,response);
                            
                            out.println("<br/>");
                            out.println("<h2>");
                            out.println("Welcome" +" " + " "+ request.getAttribute("fname"));
                            out.println("</h2>");
                            HttpSession session=request.getSession(false);
                            request.getSession();
                            String session_id=request.getSession().getId();
                            System.out.println("session_id" + session_id);
                            session.setAttribute("fname",fname1);
                            session.setAttribute("emailid",email);
                            System.out.println((String)session.getAttribute("emailid"));
                        } 
                        else{
                            out.println("<font color=red size=15>Please check your email id or password.You are not registered!! </font>");
                            request.getRequestDispatcher("login.jsp").include(request,response);
                            
                        } 
                    }
                }
            }
            catch(Exception e)
            {
              e.printStackTrace();
            }
        }
        out.close();
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