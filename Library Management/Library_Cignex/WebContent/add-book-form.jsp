<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Add Book</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Library Management System</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Book</h3>
		
		<form action="AddBookControllerServlet " method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					<tr>
						<td><label>ISBN Code:</label></td>
						<td><input type="text" name="isbn" /></td>
					</tr>

					<tr>
						<td><label>Language:</label></td>
						<td><input type="text" name="language" /></td>
					</tr>
					<tr>
						<td><label>Publication ID:</label></td>
						<td><input type="text" name="publication_id" /></td>
					</tr>
					<tr>
						<td><label>No. of Actual Copies:</label></td>
						<td><input type="text" name="no_actual_copies" /></td>
					</tr>
					<tr>
						<td><label>No. of Current Copies:</label></td>
						<td><input type="text" name="no_current_copies" /></td>
					</tr>
					<tr>
						<td><label>Category ID:</label></td>
						<td><input type="text" name="category_id" /></td>
					</tr>
					<tr>
						<td><label>Publication Year:</label></td>
						<td><input type="text" name="publication_year" /></td>
					</tr>
	
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="ADD Book" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="index.jsp">Back to List</a>
		</p>
	</div>
</body>

</html>