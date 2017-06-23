<!DOCTYPE html>
<html>

<head>
	<title>Add Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Library Managment System</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Student</h3>
		
		<form action="StudentControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Student Id:</label></td>
						<td><input type="text" name="id" /></td>
					</tr>

					<tr>
						<td><label>Name:</label></td>
						<td><input type="text" name="name" /></td>
					</tr>
					<tr>
						<td><label>Date of Birth:</label></td>
						<td><input type="text" name="bdate" /></td>
					</tr>
					<tr>
						<td><label>Borrower ID:</label></td>
						<td><input type="text" name="borrower_id" /></td>
					</tr>
					<tr>
						<td><label>Department:</label></td>
						<td><input type="text" name="department" /></td>
					</tr>
					<tr>
						<td><label>Contact Number: </label></td>
						<td><input type="text" name="contact_number" /></td>
					</tr>
					<tr>
						<td><label>Password:</label></td>
						<td><input type="password" name="pass" /></td>
					</tr>
					
					
					<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="email" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="StudentControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











