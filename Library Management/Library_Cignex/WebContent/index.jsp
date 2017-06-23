<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library Management System</title>

</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>Library Managment System</h2>
		</div>
	</div>

			<table>
				<tbody>
					<tr>
<td><input type="button" value="Add Student" 
				   onclick="window.location.href='add-student-form.jsp'; return false;"
				   class="add-student-button"
			/></td>
			
<td><input type="button" value="Add Book" 
				   onclick="window.location.href='add-book-form.jsp'; return false;"
				   class="add-student-button"
			/></td>

<td><input type="button" value="Add Staff" 
				   onclick="window.location.href='add-Staff-form.jsp'; return false;"
				   class="add-student-button"
			/></td>
<td>
<td>
<input type="button" value="Issue Book" 
				   onclick="window.location.href='issue-book-form.jsp'; return false;"
				   class="add-student-button"
			/></td></tr></tbody></table>
</body>
</html>