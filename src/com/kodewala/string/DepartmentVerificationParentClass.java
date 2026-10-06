package com.kodewala.string;

public class DepartmentVerificationParentClass {

	String employeeId;
	String name;
	
	public DepartmentVerificationParentClass(String _employeeId, String _name) {
		this.employeeId = _employeeId;
		this.name = _name;
	}
	
	public void displayEmployee() {
		System.out.println("The Employee name is " + name);
		System.out.println("The employee ID is " + employeeId);
	}
}
