/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
@WebServlet(name = "DeleteItemServlet", urlPatterns = {"/DeleteItemServlet"})
public class DeleteItemServlet extends HttpServlet {

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
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String pname = request.getParameter("pname");
        Cart shoppingCart;
        HttpSession session = request.getSession(false);
        shoppingCart = (Cart) session.getAttribute("cart");
        HashMap<String, Integer> items = shoppingCart.getCartItems();
        System.out.println("Sound name: "+pname);
      
        Set set = items.entrySet();
        Iterator i= set.iterator();
        
        while(i.hasNext()) {
            
         Map.Entry me = (Map.Entry)i.next();
         
         if(me.getKey().equals(pname)){
         //String val= (String)me.getValue();
         System.out.println("iterate" + me.getKey());
         i.remove();
         }
        }
        
        //shoppingCart.deleteFromCart(pname);
        System.out.println("hello");
        session.setAttribute("cart", shoppingCart);
        System.out.println("World");
        shoppingCart = (Cart) session.getAttribute("cart");
           try (PrintWriter out = response.getWriter()) {
                
            /* TODO output your page here. You may use following sample code. */
            System.out.println("inside try");
            RequestDispatcher rd=request.getRequestDispatcher("order.jsp");
            rd.include(request,response);
            System.out.println("inside try "+pname);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet deleteItem</title>");
            out.println("</head>");
            out.println("<body>");
            HashMap<String, Integer> items1 = shoppingCart.getCartItems();
            out.println("<table border='1px'>");

            /*for (String key : items.keySet()) {
                out.println("<form action='DeleteItemServlet'><input type='hidden' name='name' value='" + key + "'><tr><td>" + key + " - </td><td>" + "$" + items.get(key) + "</td><td><input type='submit' value='delete'></td></tr></form>");
            }*/
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    

}
