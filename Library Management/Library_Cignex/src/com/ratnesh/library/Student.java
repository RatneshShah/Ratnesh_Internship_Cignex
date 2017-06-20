package com.ratnesh.library;


public class Student {

	private int id;
	private String name;
	private String email;
	private String bdate;
	private String borrower_id;
	private String department;
	private String contactnumber;
	private String pass;
	
	public Student(String name,String email,String bdate,String borrower_id,String department,String contactnumber,String Pass) {
		this.name = name;
		this.email = email;
		this.bdate = bdate;
		this.borrower_id=borrower_id;
		this.department=department;
		this.contactnumber=contactnumber;
		this.pass = Pass;
	}

	public Student(int id, String name,String email,String bdate,String borrower_id,String department,String contactnumber,String pass) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.bdate = bdate;
		this.borrower_id=borrower_id;
		this.department=department;
		this.contactnumber=contactnumber;
		this.pass=pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String Bdate) {
		this.bdate = Bdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBorrowerID() {
		return borrower_id;
	}
	
	public void setBorrowerID(String borrower_id)
	{
		this.borrower_id=borrower_id;
	}

	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department)
	{
		this.department=department;
	}

	public String getContactNumber() {
		return contactnumber;
	}
	
	public void setContactNumber(String contactnumber)
	{
		this.contactnumber=contactnumber;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", bdate=" + bdate + ",borrower_id=" + borrower_id +",department=" + department +",contactnumber=" + contactnumber +"]";
	}	
}

