<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${headerMessage}</h1>


<h3> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h3>

<form action="/SpringModelAttributeMVC/submitAdmissionForm.html" method="post">

<table>
		<tr>
			<td>Student's Name : </td><td>        <input type="text" name="studentName" /></td>
		</tr>
		<tr>
			<td>Student's Hobby : </td><td>       <input type="text" name="studentHobby" /></td>
		</tr>
	
			<tr>
			<td>Student's Mobile : </td><td>      <input type="text" name="studentMobile" /></td>
		</tr>
		<tr>
			<td>Student's DOB : </td><td>     	   <input type="text" name="studentDOB" /></td>
		</tr>
		<tr>
			<td>Student's Skills set :</td><td>    <select name="studentSkills" multiple>
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>
													<option value="SQL">SQL</option>
													</select><td>
		</tr>
		
		
			<tr><td>Student's Address : </td></tr> 
		<tr>
			<td>country: <input type="text" name="studentaddress.country"/></td>
			<td>city: <input type="text" name="studentaddress.district" /></td>
			<td>street: <input type="text" name="studentaddress.street" /></td> 
			<td>pincode:<input type="text" name="studentaddress.postalcode" /></td>
		</tr>
		
		<tr><td><input type="submit" value="Submit this form by clicking here" /></td></tr>
		
		</table>


		






</form>

</body>
</html>