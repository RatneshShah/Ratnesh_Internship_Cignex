package com.ratnesh.library;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.sql.DataSource;


public class StudentDBUtil {

	private DataSource dataSource;
	
	public StudentDBUtil(DataSource theDataSource)
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
			String sql = "insert into student_details"
					   + "(Student_id,Student_Name,Date_Of_Birth,Borrower_id,Department,contact_Number,Pass,email) "
					   + "values (?, ?, ?, ?, ?, ?, ?, ?)";
			System.out.print("Query Page");
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setInt(1, Integer.parseInt(theStudent.getId()));
			myStmt.setString(2, theStudent.getname());
			System.out.println("b4 date");
			myStmt.setString(3,theStudent.getBdate());
			myStmt.setInt(4, Integer.parseInt(theStudent.getBorrowerID()));
			System.out.println("afterdate");
			myStmt.setString(5, theStudent.getDepartment());
			myStmt.setString(6,theStudent.getContactNumber());
			System.out.println("fina");
			myStmt.setString(7,theStudent.getPass());
			myStmt.setString(8, theStudent.getEmail());
			System.out.println("end");
			// execute sql insert
			myStmt.execute();
			System.out.println("Query Executed ....");
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

}
