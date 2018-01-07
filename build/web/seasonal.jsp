<%-- 
    Document   : seasonal
    Created on : Nov 26, 2017, 1:13:23 PM
    Author     : Soundarya BM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seasonal Cupcakes </title>
    </head>
    <body background="images/background.jpg">
        
        <form action="${pageContext.request.contextPath}/logout" method="post">
              <input type="submit" value="Logout" />
        </form>
        
              
        <h1 align="center">MENU</h1>
        
        <form action='order.jsp'>click here to add Regular cupcakes...MENU <input type='submit' value='Regular Cupcakes Menu'></form>
        
        
<form action="AddtoCartServlet">
    
    <table>
        <td><img src= "images/cc/christ.jpg"  alt="Christmas Special version 1" height="300" width="300"/></td>
        <td>
            <table id="menudesc" width ="300">                
                <tr><h2>Christmas Special Cupcake - 1</h2></tr>
                
        <tr><p>Christmas Special Cupcake with caramel and cream cheese frosting. </p></tr>
        <tr>Quantity<input type="number" name="quantity"  value="1"></tr><br/><br/>
        <tr><button type="button"   onclick="myFunction()">Christmas Special offer price</button> 
            <p id="demo"></p>
            <script>
            function myFunction()
            {
             var str = "$ 5.5";
             var result = str.strike() + "Special Price is  $2.5 each" ;
             document.getElementById("demo").innerHTML = result;
             }
            </script>
        </tr>
        
        <tr>
        <input type="hidden" name="image" value="images/cc/ps.jpg">
        <input type="hidden" name="name" value="Christmas Special Cupcake-Caramel">
        <input type="hidden" name="price" value="1.50">
        <input type="submit" value="Add to cart">
        </tr>
    </table>
</td>
</table>
   </form>

<form>
    <table>
        <td><img src= "images/cc/mas.jpg"  alt="Christmas Special version 2" height="300" width="300"/></td>
        <td>
            <table id="menudesc" width ="300">                
                <tr><h2>Christmas Special Cupcake -2</h2></tr>
                
        <tr><p>Christmas Special Semisweet chocolate cake topped with semi sweet cream.</p></tr>
        <tr>Quantity<input type="number" name="quantity"  value="1"></tr><br/><br/>
        <tr><button type="button" onclick="myFunction()">Christmas Special offer price</button> 
        <tr><p id="demo"></p>
            
            <script> 
            function myFunction()
            {
             var str = "$ 5.0";
             var result = str.strike() + "Special Price is  $2.5 each" ;
             document.getElementById("demo").innerHTML = result;
             }
            </script>
            
        </tr>
        
        <tr>
        <input type="hidden" name="image" value="images/cc/ps.jpg">
        <input type="hidden" name="name" value="Christmas Special Cupcake-Semisweet">
        <input type="hidden" name="price" value="1.50">
        <input type="submit" value="Add to cart">
        </tr>
    </table>
</td>
</table>
</form>
  
    </body>
</html>