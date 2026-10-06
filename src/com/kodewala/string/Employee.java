package com.kodewala.string;

public class Employee {

	String employeeId;
	String name;
	String emailId;
	
	public Employee() {
		this("EMP101");
		System.out.println("Employee Class Parent Constructor 1 got Executed");
	}
	
	public Employee(String _employeeId) {
		this(_employeeId, "Praveen");
		System.out.println("Employee Class Parent Constructor 2 got Executed");
	}
	
	public Employee(String _employeeId, String _name) {
		this(_employeeId, _name, "praveen@gmail.com");
		System.out.println("Employee Class Parent Constructor 3 got Executed");
	}
	
	public Employee(String _employeeId, String _name, String _emailId) {
		this.employeeId = _employeeId;
		this.name = _name;
		this.emailId = _emailId;
		
	}
	
	public void displayEmployee() {
		System.out.println("The EmployeeId is: " + employeeId);
		System.out.println("The Employee Name is: " + name);
		System.out.println("The Employee Email Id is: " + emailId);
	}
}
