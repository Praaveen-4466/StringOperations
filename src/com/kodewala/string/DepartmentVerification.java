package com.kodewala.string;

public class DepartmentVerification extends DepartmentVerificationParentClass {
	
	String emailId;
	String employeeRole;
	String employeeDepartment;
	int employeeSalary;
	
	
	public static void method1(String[] employeeDetails) {
		for(String employee: employeeDetails) {
			String[] employeeInfo = employee.split("\\|");
			
			String employeeId = employeeInfo[0].trim();
			String employeeName = employeeInfo[1].trim();			
			String employeeRole = employeeInfo[2].trim();
			String employeeDept = employeeInfo[3].trim();
			int employeeSalary = Integer.parseInt(employeeInfo[4].trim());
			String employeeEmailId = employeeInfo[5].trim();
			
			if(employeeId.startsWith("EMP")) {

				
				if(Character.isUpperCase(employeeName.charAt(0)) && employee.contains(" ")) {
					char[] nameArray = employeeName.toCharArray();
					boolean validName = true;
					
					for(char char1: nameArray) {
						if(!Character.isLetter(char1) && char1 != ' ') {
							validName = false;
							break;
						}
					}
					
					if(validName) {
						System.out.println("=============================================");
						System.out.println(employeeName + ": The name is perfect in every sense.");
					} else{
						System.out.println("Invalid Name");
					}
					
				}
				
				
			}
		
			if(employeeDept.equalsIgnoreCase("IT") || employeeDept.equals("Information Technology")) {
				System.out.println("The person belongs to IT department");
			}
			
			DepartmentVerification obj1 = new DepartmentVerification(employeeId, employeeName, employeeRole, employeeDept, employeeSalary, employeeEmailId);
			obj1.displayProfile();
			System.out.println("=============================================");
			System.out.println("                                                ");

		
		}
	}
	
	public DepartmentVerification(String _employeeId, String _name,  String _employeeRole, String _employeeDepartment, int _employeeSalary, String _emailId) {
		
		super(_name, _employeeId);
		
		this.emailId= _emailId;
		this.employeeRole = _employeeRole;
		this.employeeDepartment = _employeeDepartment;
		this.employeeSalary = _employeeSalary;
		
	}
	
	public void displayProfile() {
		System.out.println("The name of the employee is : " + name);
		System.out.println("The Id of the employee is : " + employeeId);
		System.out.println("The name of the employee is : " + emailId);
		System.out.println("The name of the employee is : " + employeeRole);
		System.out.println("The name of the employee is : " + employeeDepartment);
		System.out.println("The name of the employee is : " + employeeSalary);
		
	}

}
