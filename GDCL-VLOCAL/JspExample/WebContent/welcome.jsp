<html>
	<head>
		<title>config implicit object example</title>
	</head>
	<body> 
		<%
			String s=request.getParameter("name");
			out.print("Company website: " + s);
		%>
	</body>
</html>