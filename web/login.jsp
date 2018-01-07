<!DOCTYPE html>
<html>
     <head>
       <title>LOGIN</title>
       <link rel="stylesheet" type="text/css" href="css/style.css">
     </head>
<body background="images/background.jpg">
       <h1>WELCOME !! LOGIN TO CONTINUE SHOPPING!! </h1>
<br/>
<form action="LoginServlet" method="post">
  <div class="container">
<center>
<table id="register" >
<tr>
    <td><label><b>Email</b></label></td>
    <td><input type="text" placeholder="Enter EmailID" name="email" required></td>
</tr>
<tr>
    <td><label><b>Password</b></label></td>
    <td><input type="password" placeholder="Enter Password" name="psw" required></td>
</tr>
</table>
  <div class="clearfix">
      <input type="submit" class="loginbtn" value="login">
     <a href="register.jsp"><button type="button" class="signupbtn">New Customer - Register</button></a>
</div>
</center>
</form>
</body>
</html>
