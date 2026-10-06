package com.kodewala.string;

public class NameValidation extends EmployeeDetailsParentClass {
	
	String emailId;
	String department;
	int salary;
	String role;
	
	public static void method1(String[] employeeDetailRecords) {
		for(String employee: employeeDetailRecords) {
			String[] employeeArray = employee.split("\\|");
			
			String employeeId = employeeArray[0].trim();
			String employeeName = employeeArray[1].trim();
			String employeeRole = employeeArray[2].trim();
			String employeeDepartment = employeeArray[3].trim();
			int employeeSalary = Integer.parseInt(employeeArray[4].trim());
			String employeeEmailId = employeeArray[5].trim();
			
			if(employeeId.startsWith("EMP")) {
				if(Character.isUpperCase(employeeName.charAt(0)) && employeeName.contains(" ")) {
					
					char[] nameArray = employeeName.toCharArray();
					boolean validName = true;
					
					for(char char1: nameArray) {
						if(!Character.isLetter(char1) && char1 != ' ') {
							validName = false;
							break;
						}
					}
					
					if(validName) {
						System.out.println("The name contains everything perfect");
						System.out.println(employeeName +"The First Character is Upper Case and The name does contains the space.");

					}
				}
			}
			NameValidation obj1 = new NameValidation(employeeId, employeeName, employeeEmailId, employeeDepartment, employeeSalary, employeeRole );
			obj1.displayEmployee();
		}
	}
	public NameValidation(String _employeeId, String _name,  String _emailId, String _department, int _salary, String _role) {
		super(_name, _employeeId);
		
		this.emailId = _emailId;
		this.department = _department;
		this.salary = _salary;
		this.role = _role;
	}
	
	
	public void displayEmployee() {		
		System.out.println("The name of the employee are " + this.name  + " and his employeeId is " + this.employeeId );
		System.out.println("The email of the employee is " + emailId); 
		System.out.println("The department of the employee is " + department); 
		System.out.println("The salary of the employee is " + salary);
		System.out.println("The role of the employee is " + role); 
	}

}
