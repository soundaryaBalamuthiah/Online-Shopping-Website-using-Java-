/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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
@WebServlet(name = "AddtoCartServlet", urlPatterns = {"/AddtoCartServlet"})

public class AddtoCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        if (session.getAttribute("emailid") != null) {
            Cart shoppingCart;
            shoppingCart = (Cart) session.getAttribute("cart");
            if (shoppingCart == null) {
                shoppingCart = new Cart();
                session.setAttribute("cart", shoppingCart);
            }
            String name = request.getParameter("name");
            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
            shoppingCart.addToCart(name, quantity);
            session.setAttribute("cart", shoppingCart);
            double total = 0.00;
            double subtotal = 0.00;
            int pqty=0;
            String pname="";
            try (PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>My Cart");                
                out.println("</title>");
                out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/css/style.css'/ >");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Cupcake successfully added to cart </h1>");
                out.println("<form action='order.jsp'>Add more Cupcakes!!!<input type='submit' value='ADD MORE Cupcakes'></form>");
                out.println("<br/>");
                out.println("<a href='payment.jsp' alt='Payment' value='Checkout'><button name='loginbtn'>CHECKOUT AND PAY!!</button></a>");
                out.println("<hr>");
                out.println("<h2>Cart</h2>");
                HashMap<String, Integer> items = shoppingCart.getCartItems();
                out.println("<table border='1px'>");
                
                
                for (String key : items.keySet()) {
                    session.setAttribute("ototal", total);
                    session.setAttribute("subtotal", subtotal);
                    session.setAttribute("pqty",items.get(key));
                    session.setAttribute("pname", key);
                    pqty=items.get(key);
                    pname=key;
                    
                    subtotal=items.get(key) * 2.5;
                    

                    out.println("<tr>");
                    out.println("<td>" + key + " - </td><td>" + "Qty=" + items.get(key) + "</td>");

                    out.println("<td>" + items.get(key) * 2.5 + "</td>");
                    out.println("<td>");
                    out.println("<form action='DeleteItemServlet'>");
                    out.println("<input type='submit' value='delete'>");
                    out.println("<input type='hidden' name='pname' value='"+key+"'>");
                    out.println("</td>");
                    out.println("<br/>");
                    total = total + subtotal;
                }
                
                
                session.setAttribute("ototal", total);
                session.setAttribute("subtotal", subtotal);
                out.println("</tr>");
                out.println("<td>" + "Cart Total is : " + "</td>");
                out.println("<td colspan='3'>" + total + "</td>");
                out.println("<table>");
                out.println("</body>");
                out.println("</html>");
            out.close();
            }
            
        } else {
            PrintWriter out = response.getWriter();
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            out.println("<font color=red size=10>Please login to continue..!!!</font>");
            rd.include(request, response);
        }
        
    } 

}
