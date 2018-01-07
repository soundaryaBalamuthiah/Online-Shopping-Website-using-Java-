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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
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
@WebServlet(name = "PaymentServlet", urlPatterns = {"/PaymentServlet"})
public class PaymentServlet extends HttpServlet {

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
        int i=0;
        Cart shoppingCart;
        HttpSession session = request.getSession(false);
        shoppingCart = (Cart) session.getAttribute("cart");

        //GET Redgistration date for the user
        java.util.Date utilDate = new Date();

        //Convert the date to sql date
        java.sql.Date date = new java.sql.Date(utilDate.getTime());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String saddrl1 = request.getParameter("saddrl1");
        String saddrl2 = request.getParameter("saddrl2");
        String scity = request.getParameter("scity");
        String state = request.getParameter("state");
        String szip = request.getParameter("szip");
        String cnum = request.getParameter("cnum");
        String cname = request.getParameter("cname");
        String ctype=request.getParameter("ctype");
        String edate = request.getParameter("edate");
        String cvv =request.getParameter("cvv");
        
        java.util.Date utilDate1 = new Date();
        java.sql.Date pdate = new java.sql.Date(utilDate1.getTime());

        if (saddrl1.isEmpty() || saddrl2.isEmpty() || scity.isEmpty() || state.isEmpty() || szip.isEmpty() || cnum.isEmpty() || cname.isEmpty() || edate.isEmpty() || cvv.isEmpty()) 
        {
            RequestDispatcher rd = request.getRequestDispatcher("payment.jsp");
            out.println("<font color=red size=10>Please fill in all the details.</font>");
            rd.include(request, response);
        }
        try {
            
            if(session.getAttribute("emailid")!=null)
            {
            System.out.println("rock");
            String email=(String) session.getAttribute("emailid");
            String pname=(String)session.getAttribute("pname");            
            Integer pqty=(Integer)session.getAttribute("pqty");
            double subtotal=(double)session.getAttribute("subtotal");
            
            
            System.out.println(email);
            System.out.println(pname);
            System.out.println(pqty);
            System.out.println(subtotal);
            System.out.println(pdate);
            
           
            System.out.println("paper"); 
            
            System.out.println((String) session.getAttribute("emailid"));
            
            System.out.println("scissors"); 
            //To register the JDBC Driver    
            Class.forName("com.mysql.jdbc.Driver");
            //Establisjh a connection 
            Connection conn = DriverManager.getConnection(DB_URL, USER, PSWD);
            HashMap<String, Integer> items = shoppingCart.getCartItems();
            for (String key : items.keySet()) {
                    
                    session.setAttribute("subtotal", subtotal);
                    session.setAttribute("pqty",items.get(key));
                    session.setAttribute("pname", key);
                    pqty=items.get(key);
                    pname=key;

                    subtotal=items.get(key) * 2.5;
                    
                             
                   System.out.println("before purchase table insertion");        
                   PreparedStatement updatePurchaseTable = conn.prepareStatement("insert into purchase_info(emailid,pname,pqty,ptotal,pdate) values(?,?,?,?,?)");
                   //updatePurchaseTable.setInt(1,1);
                   updatePurchaseTable.setString(1, email);
                   updatePurchaseTable.setString(2, pname);                
                   updatePurchaseTable.setInt(3, pqty);
                   updatePurchaseTable.setDouble(4,subtotal);
                   updatePurchaseTable.setDate(5, pdate);
                   i = updatePurchaseTable.executeUpdate();
              }
                            
            
            System.out.println("before payment table insertion");     
            PreparedStatement updatePaymentTable =conn.prepareStatement("insert into payment_info(emailid,cardnum,cvv,ctype,cname) values(?,?,?,?,?)");
                updatePaymentTable.setString(1, email);
                updatePaymentTable.setString(2, cnum);
                updatePaymentTable.setString(3, cvv);
                updatePaymentTable.setString(4, ctype);
                updatePaymentTable.setString(5, cname);
                
                
                int j = updatePaymentTable.executeUpdate();
                if (i > 0 && j>0){
                    RequestDispatcher rd1;                    
                    rd1 = request.getRequestDispatcher("thankyou.jsp");
                    rd1.include(request,response);
                    System.out.println("SUCCESS!!!");
                }
            }  
             
                         
           else {
               
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                out.println("<font color=red size=10>Please login to continue..!!!</font>");
                rd.include(request, response);
            }
        }
        
         catch (Exception e) {
            e.printStackTrace();
        }
        out.close();
    }
}
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
