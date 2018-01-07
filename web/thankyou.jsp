<%-- 
    Document   : thankyou
    Created on : Nov 24, 2017, 10:47:43 AM
    Author     : Soundarya BM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Confirmation</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body background="images/background.jpg">
        <form action="${pageContext.request.contextPath}/logout" method="post">
              <input type="submit" value="Logout" />
        </form>
        
        <h1> Thank you for choosing us!! Enjoy your cupcakes!! </h1>
        <div class="container">
        <table id="register" >     
        <tr>
            <td>Your Email ID is : </td>
            <td><% out.println(session.getAttribute("emailid"));%></td>
        </tr>
        <tr>
            <td><label><b>Order Total</b></label></td>    
            <td><% out.println("$"+session.getAttribute("ototal"));%></td>
        </tr> 
        </table> 
        </div>
        <br/><br/><br/>
        
        <form action="order.jsp">To Shop more .... <input type='submit' value='SHOP MORE !!'></form>
        <br/><br/>
        
        <form action="${pageContext.request.contextPath}/OrderHistoryServlet" method="post">
              <input type="submit" value="Order History" />
        </form>
            
    </body>
</html>



