<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<!--css-->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href=css/style.css>
<!--Js-->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</head>
<body>
	<h2>Validation|Page</h2>
	<hr>
	<div>
	${emailError}
	</div>
	<form action="LeadNimi" method="post">
		<pre>
First Name <input type="text" name="firstName" />
Last Name <input type="text" name="LastName" />
Email <input type="email" name="email" />
mobile <input type="number" name="mobile" />
Gender:<select name="gender">
 <option value="Male">Male</option>
  <option value="Female">Female</option>
    <option value="Transgender">Transgender</option>
</select>
Date<input type="date" name="date" />
Language:<select name="language">
 <option value="English">English</option>
  <option value="Hindi">Hindi</option>
    <option value="Bhojpuri">Bhojpuri</option>
</select>
State:<select name="state">
 <option value="Bihar">Bihar</option>
   <option value="Jharkhand">Jharkhand</option>
  <option value="MadhyaPardesh">MadhyaPardesh</option>
  <option value="Delhi">Delhi</option>
  <option value="rajasthan">Rajasthan</option>
    <option value="Punjab">Punjab</option>
      <option value="Others">Others</option>
    </select>  
 Qualification:<select name="qualification">  
    <option value="matric">matric</option>
   <option value="intermidiate">intermidiate</option>
  <option value="graduate">graduate</option>
      <option value="Others">Others</option>
</select>
<input type="submit" value="save" />

</pre>
	</form>
</body>
</html>