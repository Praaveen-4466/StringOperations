package com.kodewala.string;

public class EmailVerificationChildClass extends EmailVerification {

	String emailId;
	String employeeRole;
	String employeeDept;
	int employeeSalary;
	
	public static void method1(String[] employeeDetails) {
		for(String employee: employeeDetails) {
			String[] employeeInfo = employee.split("\\|");
			
			String employeeId = employeeInfo[0].trim();
			String employeeName = employeeInfo[1].trim();
			String employeeRole = employeeInfo[2].trim();
			String employeeDept = employeeInfo[3].trim();
			int employeeSalary = Integer.parseInt(employeeInfo[4].trim());
			String employeeEmail = employeeInfo[5].trim();
			
			if(employeeId.startsWith("EMP")) {
				if(employeeName.contains(" ") && Character.isUpperCase(employeeName.charAt(0))) {					
					char[] nameArray = employeeName.toCharArray();
					boolean validName = true;					
					for(char char1: nameArray) {
						if(!Character.isLetter(char1) && char1 != ' ') {
							validName = false;
							break;
						}
					}					
					if(validName) {
						System.out.println("================================" );
						System.out.println(employeeName + " is Perfect in all the sense");
					}
					
				}
				
				if(employeeDept.equalsIgnoreCase("IT") || employeeDept.equals("Information technology")) {
					System.out.println("The employee belongs to the " + employeeDept + " department");
				}
				
				boolean validEmail = true;
				if(!employeeEmail.trim().isEmpty() && employeeEmail.contains("@") && employeeEmail.endsWith(".com")) {
					if(employeeEmail.indexOf("@") > employeeEmail.indexOf("com")) {
						validEmail = false;
						
					}
				} else {
					validEmail = false;
				}
				
				if(validEmail) {
					System.out.println(employeeName + "'s email is a Valid One");
				}
				
				EmailVerificationChildClass obj1 = new EmailVerificationChildClass(employeeId, employeeName, employeeRole, employeeDept, employeeSalary, employeeEmail);
				obj1.displayProfile();
				System.out.println("=======================");
			}
		}
		
		
		
	}
	
	public EmailVerificationChildClass(String _employeeId, String _name,  String _employeeRole, String _employeeDept, int _employeeSalary, String _emailId) {
		super(_name, _employeeId);
		
		this.emailId =  _emailId;
		this.employeeRole = _employeeRole;
		this.employeeDept = _employeeDept;
		this.employeeSalary = _employeeSalary;
	}
	
	public void displayProfile() {
		System.out.println("========================");
		System.out.println("Employee Name is " + name);
		System.out.println("Employee id is " + employeeId);
		System.out.println("Employee email is " + emailId);
		System.out.println("Employee Role is " + employeeRole);
		System.out.println("Employee Dept is " + employeeDept);
		System.out.println("Employee Salary is " + employeeSalary);
		System.out.println("========================");
		System.out.println("                                                    ");
	}
}
