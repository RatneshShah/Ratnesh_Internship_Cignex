package com.ratnesh.library;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.servlet.*;;


/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDBUtil studentDBUtil;
	
	@Resource(name="jdbc/library_data")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			studentDBUtil = new StudentDBUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String theCommand = request.getParameter("command");
		try{
		if(theCommand.equalsIgnoreCase("ADD"))
			{
				System.out.print("ADD command received");
				addStudent(request,response);
				RequestDispatcher dispatcher= request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request,response);
			}
		else
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request,response);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		
	}
	
	
	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from form data
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String dob = request.getParameter("bdate");
		String borrower_id = request.getParameter("borrower_id");
		String department = request.getParameter("department");
		String contact_number = request.getParameter("contact_number");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		System.out.println("Hello Worlds");
		
		// create a new student object
		Student theStudent = new Student(id,name,dob,borrower_id,department,contact_number,pass,email);
		
		// add the student to the database
		studentDBUtil.addStudent(theStudent);
				
		// send back to main page (the student list)
	}
}
