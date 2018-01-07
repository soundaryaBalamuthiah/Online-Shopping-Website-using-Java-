<%-- 
    Document   : cart
    Created on : Nov 18, 2017, 9:45:53 PM
    Author     : Soundarya BM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Menu Order</title> 
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body background="images/background.jpg">
        <h1 align="center">MENU</h1>
             
        <form action="${pageContext.request.contextPath}/logout" method="post">
              <input type="submit" value="Logout" />
        </form>
        
        <form action='seasonal.jsp'>click here to add Seasonal cupcakes...Christmas Special <input type='submit' value='Special Cupcakes Menu'></form>
        
        
        <form action="AddtoCartServlet">
            
            <table>   
                

                <td><img src= "images/cc/sc.jpg" alt="Sugared Craneberry Cupcake" height="300" width="300"/></td>
                <td>
                    <table id="menudesc" width ="300">                
                        <tr><h2>Sugared Cranberry Cupcake</h2></tr>
                        <tr><h3>$2.50</h3></td>
                <tr><p>Vanilla cake with cream cheese frosting, filled and topped with house-made cranberry sauce.</p></tr>
                <tr>Quantity<input type="number" name="quantity"  value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/sc.jpg">
                <input type="hidden" name="name" value="Sugared Cranberry Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                
                </tr>               
            </table>
        </td>
    </table>
</form>


<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/ps.jpg"  alt="Pumpkin Spice Cupcake" height="300" width="300"/></td>
        <td>
            <table id="menudesc" width ="300">                
                <tr><h2>Pumpkin Spice Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p>Pumpkin spice cake topped with caramel cream cheese frosting. </p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
        <tr>
        <input type="hidden" name="image" value="images/cc/ps.jpg">
        <input type="hidden" name="name" value="Pumkin Spice Cupcake">
        <input type="hidden" name="price" value="2.50">
        <input type="submit" value="Add to cart">
        </tr>
    </table>
</td>
</table>
</form>

<form action="AddtoCartServlet">
    <table>  
        <td><img src= "images/cc/gc.jpg" alt="German Chocolate Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width="300">                
                <tr><h2>German Chocolate Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
                <tr><p>Semisweet chocolate cake topped with chocolate butter cream and coconut pecan frosting.</p></tr>
                <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/gc.jpg">
                <input type="hidden" name="name" value="German Chocolate Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>
        
<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/ft.jpg" alt="French Toast Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width ="300">                
                <tr><h2>French Toast Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p> Vanilla cake with a brown sugar cinnamon swirl, topped with maple cream cheese frosting and cinnamon sugar.</p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/ft.jpg">
                <input type="hidden" name="name" value="French Toast Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>
        
<form action="AddtoCartServlet">
    <table>
    <td><img src= "images/cc/cpb.jpg" alt="Chocolate Peanut Butter Cupcake" height=300px width=300px/></td>
    <td>
        <table id="menudesc" width ="300">                
            <tr><h2>Chocolate Peanut Butter Cupcake</h2></tr>
            <tr><h3>$2.50</h3></td>
    <tr><p>Chocolate cake with a peanut butter cup baked inside, topped with chocolate and peanut butter butter cream.</p></tr>
    <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/cpb.jpg">
                <input type="hidden" name="name" value="Chocolate Peanut Butter Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>
        
<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/scr.jpg" alt="Salted Caramel Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width="300">                
                <tr><h2>Salted Caramel Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p>Chocolate cake filled with house-made salted caramel sauce, topped with salted caramel butter cream, dark chocolate curls, and a sprinkle of sea salt.</p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/scr.jpg">
                <input type="hidden" name="name" value="Salted Caramel Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>
        
<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/ch.jpg" alt="Chocolate Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width="300">                
                <tr><h2>Chocolate Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p>Chocolate cake with chocolate butter cream, rolled in French chocolate sprinkles.</p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/ch.jpg">
                <input type="hidden" name="name" value="Chocolate Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>

<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/rv.jpg" alt="Red Velvet Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width="300">                
                <tr><h2>Red Velvet Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p>Red velvet cake with cream cheese frosting.</p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/rv.jpg">
                <input type="hidden" name="name" value="Red Velvet Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>

<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/vc.jpg" alt="Vanilla Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width="300">                
                <tr><h2>Vanilla Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p>Vanilla cake with pink vanilla butter cream, topped with a sugar flower.</p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/vc.jpg">
                <input type="hidden" name="name" value="Vanilla Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>
        
<form action="AddtoCartServlet">
    <table>
        <td><img src= "images/cc/cr.jpg" alt="Carrot Cupcake" height=300px width=300px/></td>
        <td>
            <table id="menudesc" width="300">                
                <tr><h2>Carrot Cupcake</h2></tr>
                <tr><h3>$2.50</h3></td>
        <tr><p>Carrot cake with cream cheese frosting, topped with a sugar carrot.</p></tr>
        <tr>Quantity<input type="number" name="quantity" value="1"></tr><br/><br/>
                <tr>
                <input type="hidden" name="image" value="images/cc/cr.jpg">
                <input type="hidden" name="name" value="Carrot Cupcake">
                <input type="hidden" name="price" value="2.50">
                <input type="submit" value="Add to cart">
                </tr>
            </table>
       </td>
    </table>
</form>
        
</body>
</html>
