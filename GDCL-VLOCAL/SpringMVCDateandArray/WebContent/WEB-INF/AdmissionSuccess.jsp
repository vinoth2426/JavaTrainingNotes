<html>
<body>
	<h1>${headerMessage}</h1>
 
	<h3>Congratulations!! the Engineering college has processed your Application form successfully</h3>

	<h2>Details submitted by you:: </h2>

	<table>
		<tr>
			<td>Student Name :</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby :</td>
			<td>${student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile :</td>
			<td>${student1.studentMobile}</td>
		</tr>

		<tr>
			<td>Student DOB :</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills :</td>
			<td>${student1.studentSkills}</td>
		</tr>
		
		<tr>
			<td>Student Address :</td>
			<td>country: ${student1.studentaddress.country}
			       city: ${student1.studentaddress.district}
			     street: ${student1.studentaddress.street}
			    pincode: ${student1.studentaddress.postalcode}</td>
		</tr>

	</table>

</body>
</html>
