<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: green;">
Current Time: <%= java.util.Calendar.getInstance().getTime() %> 
<form action="Welcome" method="post">  
  
Name:<input type="text" name="userName"/><br/><br/>  
Password:<input type="password" name="userPass"/><br/><br/>  
Email Id:<input type="text" name="email"/><br/><br/> 
Phone Nmuber:<input type="text" name="Number"/><br/><br/> 
Date:<input type="text" name="date"/><br/><br/> 
Country:  
<select name="userCountry">  
<option>India</option>  
<option>Pakistan</option>  
<option>Mumbai</option> 
<option>other</option>  
</select>  
  
<br/><br/>  
<input type="submit" value="register"/>  
  
</form>  
</body>
</html>