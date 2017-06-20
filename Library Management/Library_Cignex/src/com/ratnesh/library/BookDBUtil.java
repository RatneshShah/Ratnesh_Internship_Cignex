package com.ratnesh.library;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class BookDBUtil {

	private DataSource dataSource;
	
	public BookDBUtil(DataSource theDataSource)
	{
		dataSource= theDataSource;
	}
	
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public void addStudent(Student theStudent) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql for insert
			String sql = "insert into student_details "
					   + "(Student_id,Student_name, Date_Of_Birth, Borrower_id, Department, contact_Number, Pass, email) "
					   + "values (?, ?, ?, ?, ?, ?, ?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setInt(1, theStudent.getId());
			myStmt.setString(2, theStudent.getname());
			myStmt.setString(3, theStudent.getBdate());
			myStmt.setString(4, theStudent.getBorrowerID());
			myStmt.setString(5, theStudent.getDepartment());
			myStmt.setString(6,theStudent.getContactNumber());
			myStmt.setString(7,theStudent.getPass());
			myStmt.setString(8, theStudent.getEmail());
			// execute sql insert
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

}
