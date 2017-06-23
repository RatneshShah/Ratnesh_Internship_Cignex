package com.ratnesh.library;


public class Student {

	private String id;
	private String name;
	private String email;
	private String bdate;
	private String borrower_id;
	private String department;
	private String contact_number;
	private String pass;
	
	public Student(String name,String bdate,String borrower_id,String department,String contact_number,String Pass,String email) {
		this.name = name;
		this.bdate = bdate;
		this.borrower_id=borrower_id;
		this.department=department;
		this.contact_number=contact_number;
		this.pass = Pass;
		this.email = email;
	}

	public Student(String id, String name,String bdate,String borrower_id,String department,String contact_number,String pass,String email) {
		this.id = id;
		this.name = name;	
		this.bdate = bdate;
		this.borrower_id=borrower_id;
		this.department=department;
		this.contact_number=contact_number;
		this.pass=pass;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return contact_number;
	}
	
	public void setContactNumber(String contact_number)
	{
		this.contact_number=contact_number;
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
		return "Student [id=" + id + ", name=" + name + ", bdate=" + bdate + ", borrower_id=" + borrower_id +",department=" + department +",contact_number=" + contact_number +", pass=" + pass + ", email=" + email + "]";
	}	
}

