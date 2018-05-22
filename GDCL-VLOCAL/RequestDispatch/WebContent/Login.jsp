<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: pink;" >
<b>&nbsp;Current  Date 
and time is:&nbsp;  <font color="#FF0000" >
<%= new java.util.Date() %>
</font> </b>
<h1 style="text-align: center">Student Details</h1>

<form action="LoginServlet" method="post">
		Username:<input type="text" name="userName"/>
		<br/><br/>
		Password:<input type="password" name="password"/>
		<br/><br/> 
		<input type="submit" value="login"/> 
</form>  
</body>
</html>