package com.kodewala.string;

public class EmployeeOnboarding extends Employee {

	String role;
	String department;
	
	public EmployeeOnboarding(String _employeeId, String _name, String _emailId, String _role, String _department) {
		
		super(_employeeId, _name, _emailId);
		
		this.role = _role;
		this.department = _department;
		
		System.out.println("Child Constructor Got Executed");
	}
	
	public void displayProfile() {
		System.out.println();
        System.out.println("==================================");
        System.out.println("       EMPLOYEE PROFILE");
        System.out.println("==================================");

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Role        : " + role);
        System.out.println("Department  : " + department);
        System.out.println("Email       : " + emailId);

        System.out.println("==================================");
	}
	
}
