package com.kodewala.string;

public class ValidEmployeesNameParentClass {
	
	String employeeId;
	String employeeName;
	String emailId;
	
	public ValidEmployeesNameParentClass(String _employeeId, String _employeeName, String _emailId) {
		this.employeeId = _employeeId;
		this.employeeName = _employeeName;
		this.emailId = _emailId;
	}
	
	public void displayEmployee() {
		System.out.println("Emaployee Id is :" + employeeId);
		System.out.println("Emaployee Name is :" + employeeName);
		System.out.println("Emaployee Email Id is :" + emailId);
	}

}
