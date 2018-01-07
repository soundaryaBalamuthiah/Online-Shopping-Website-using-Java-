<%-- 
    Document   : register
    Created on : Nov 14, 2017, 2:24:17 PM
    Author     : Soundarya BM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
     <head>
       <title>LOGIN/REGISTER</title>
       <link rel="stylesheet" type="text/css" href="css/style.css">
     </head>
<body background="images/background.jpg">
       <h1>WELCOME TO REGISTRATION </h1>
<br/>
<form action="RegistrationServlet" method="post">
  <div class="container">

<table id="register" >

<tr>  
    <td><label><b>First Name</b></label></td>
    <td><input type="text" placeholder="Enter First Name" name="fname" required></td>
</tr>
<tr>
    <td><label><b>Last Name</b></label></td>
    <td><input type="text" placeholder="Enter Last Name" name="lname" required></td>
</tr>
<tr>
    <td><label><b>Email</b></label></td>
    <td><input type="text" placeholder="Enter Email" name="email" required></td>
</tr>
<tr>
    <td><label><b>Password</b></label></td>
    <td><input type="password" placeholder="Enter Password" name="pwd" required></td>
</tr>
<tr>
    <td><label><b>Phone Number</b></label></td>
    <td><input type="text" placeholder="Enter Phone Number" name="pnum" required></td>
</tr>
 <tr>
    <td><label><b>Address Line 1</b></label></td>
    <td><input type="text" placeholder="Enter Adress Line 1" name="addrl1" required></td>
</tr>
<tr>
    <td><label><b>Address Line 2 </b></label></td>
    <td><input type="text" placeholder="Enter Address Line 2" name="addrl2" required></td>
</tr>
<tr>
    <td><label><b>City</b></label></td>
    <td><input type="text" placeholder="Enter City" name="city" required></td>
</tr>
<tr>
    <td><label><b>State</b></label></td>
    <td><select name="state">
	<option value="AL">Alabama</option>
	<option value="AK">Alaska</option>
	<option value="AZ">Arizona</option>
	<option value="AR">Arkansas</option>
	<option value="CA">California</option>
	<option value="CO">Colorado</option>
	<option value="CT">Connecticut</option>
	<option value="DE">Delaware</option>
	<option value="DC">District Of Columbia</option>
	<option value="FL">Florida</option>
	<option value="GA">Georgia</option>
	<option value="HI">Hawaii</option>
	<option value="ID">Idaho</option>
	<option value="IL">Illinois</option>
	<option value="IN">Indiana</option>
	<option value="IA">Iowa</option>
	<option value="KS">Kansas</option>
	<option value="KY">Kentucky</option>
	<option value="LA">Louisiana</option>
	<option value="ME">Maine</option>
	<option value="MD">Maryland</option>
	<option value="MA">Massachusetts</option>
	<option value="MI">Michigan</option>
	<option value="MN">Minnesota</option>
	<option value="MS">Mississippi</option>
	<option value="MO">Missouri</option>
	<option value="MT">Montana</option>
	<option value="NE">Nebraska</option>
	<option value="NV">Nevada</option>
	<option value="NH">New Hampshire</option>
	<option value="NJ">New Jersey</option>
	<option value="NM">New Mexico</option>
	<option value="NY">New York</option>
	<option value="NC">North Carolina</option>
	<option value="ND">North Dakota</option>
	<option value="OH">Ohio</option>
	<option value="OK">Oklahoma</option>
	<option value="OR">Oregon</option>
	<option value="PA">Pennsylvania</option>
	<option value="RI">Rhode Island</option>
	<option value="SC">South Carolina</option>
	<option value="SD">South Dakota</option>
	<option value="TN">Tennessee</option>
	<option value="TX">Texas</option>
	<option value="UT">Utah</option>
	<option value="VT">Vermont</option>
	<option value="VA">Virginia</option>
	<option value="WA">Washington</option>
	<option value="WV">West Virginia</option>
	<option value="WI">Wisconsin</option>
	<option value="WY">Wyoming</option>
</select></td>
<tr>
    <td><label><b>Zip Code</b></label></td>
    <td><input type="text" placeholder="Enter Zip Code" name="zip" required></td>
</tr>
</table>
    <p>By creating an account you agree to our <a href="tandc.html">Terms & Privacy</a>.</p>
<br/>
    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
     </div>
  </div>
</form>
</body>
</html>