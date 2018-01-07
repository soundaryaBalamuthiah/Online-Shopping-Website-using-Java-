<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
     <head>
       <title>CUPCAKE CORNER</title>
       <link rel="stylesheet" type="text/css" href="css/style.css">
       <meta name="viewport" content="width=device-width, initial-scale=1">
     </head>
     <body bgcolor="thistle">
             <% 
                 if((String)request.getAttribute("fname") !=null){
             %>
            
             <ul class="navbar" >
             <li><a href="order.jsp">Menu</a></li>    
             <li><a href="seasonal.jsp">Seasonal Special</a></li>  
              
            <li><a href="LogoutServlet">Logout</a></li> 
              </ul>
             
             <% } else {
             %>
             <ul class="navbar" >
             <li><a href="order.jsp">Menu</a></li>    
             <li><a href="seasonal.jsp">Seasonal Special</a></li>
             <li><a href="login.jsp">Login</a></li> 
              </ul>
             <% } %>  
              <img  src="images/logo.jpg" alt="icon" height="200" width="300"/>
              <img src="images/slide1.jpg" alt="slide1" height="200" width="600"/>
              <img src="images/slide2.jpg" alt="slide1" height="200" width="600"/>
           
               
             
</body>
 </html>
