
<html>
<head>
<script type="text/javascript"  src="employeeDetails.js"></script>  
</head>
<body>
<table id="table1">

	<tr>
	<td>First Name:</td>

	<td><input type="text" id="first" onkeyup="validate();" /></td>

	<td><div id="errFirst"></div></td>

	</tr>

	<tr>

	<td>Last Name:</td>

	<td><input type="text" id="last" onkeyup="validate();"/></td>

	<td><div id="errLast"></div></td>

	</tr>

	<tr>

	<td>Email:</td>

	<td><input type="text" id="email" onkeyup="validate();"/></td>

	<td><div id="errEmail"></div></td>

	</tr>

	<tr>

	<td>User Id:</td>

	<td><input type="text" id="uid" onkeyup="validate();"/></td>

	<td><div id="errUid"></div></td>

	</tr>

	<tr>

	<td>Password:</td>

	<td><input type="password" id="password" onkeyup="validate();"/></td>

	<td><div id="errPassword"></div></td>

	</tr>

<!-- 	<tr>    As peruser requir 

	<td>Confirm Password:</td>

	<td><input type="password" id="confirm" onkeyup="validate();"/></td>

	<td><div id="errConfirm"></div></td>

	</tr> -->

	<tr>

	<td><input type="button" id="create" value="Create" onclick="validate();finalValidate();"/></td>

	<td><div id="errFinal"></div></td>

	</tr>

	</table>
	</body>
	</html>