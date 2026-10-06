package com.kodewala.string;

public class EmployeeDomainExtraction extends EmployeeDetailsParentClass{
	
	String emailId;
	String employeeRole;
	String employeeDept;
	int employeeSalary;
	
	public static void method1(String employeeDetails[]) {
		for(String employee: employeeDetails) {
			String[] employeeInfo = employee.split("\\|");
			
			String employeeId = employeeInfo[0].trim(); 
			String employeeName = employeeInfo[1].trim();
			String employeeRole = employeeInfo[2].trim();
			String employeeDept = employeeInfo[3].trim();
			int employeeSalary = Integer.parseInt(employeeInfo[4].trim());
			String employeeEmail = employeeInfo[5].trim();
			
			if(employeeId.startsWith("EMP")) {
				System.out.println(" ======================================= ");
				if(Character.isUpperCase(employeeName.charAt(0)) && employeeName.contains(" ")) {
					char[] nameArray = employeeName.toCharArray();
					boolean isValidName = true;
					
					for(char char1: nameArray) {
						if(!Character.isLetter(char1) && char1 != ' ') {
							isValidName = false;
							break;
						}
					}
					if(isValidName) {
						System.out.println(employeeName + " is perfect in every sense.");
					} else {
						System.out.println("Invalid Name");
					}
				}
				
				if(employeeDept.equalsIgnoreCase("IT") || employeeDept.equals("Information Technology")) {
					System.out.println(employeeName + ", belongs to the IT Department");
				}
				
				boolean isValidEmail = true;
				if(employeeEmail.contains("@")) {
					if(employeeEmail.indexOf("@") > employeeEmail.indexOf(".com")) {
						isValidEmail = false;
					}
				} else{
					isValidEmail = false;
				}
				if(isValidEmail) {
					System.out.println(employeeEmail + " is a Valid One");
				}
				
				
				String userName = employeeEmail.substring(0, employeeEmail.indexOf("@"));
				String domainName = employeeEmail.substring(employeeEmail.indexOf("@"), employeeEmail.length());
				System.out.println(userName + " is the user name for " + employeeName);
				System.out.println(domainName + " is the domain of name of the " + employeeName);
				System.out.println(employeeName.toUpperCase());
				System.out.println(employeeName.toLowerCase());
				System.out.println(" ======================================= ");
			}
		
		
			EmployeeDomainExtraction obj1 = new EmployeeDomainExtraction(employeeId, employeeName, employeeRole, employeeDept, employeeSalary, employeeEmail);
			obj1.displayProfile();
			System.out.println("********Entire prograam got Executed********");
		}
	}
	
	public EmployeeDomainExtraction(String _employeeId, String _name,  String _employeeRole, String _employeeDept, int _employeeSalary, String _emailId) {
		super(_name, _employeeId);
		
		this.emailId = _emailId;
		this.employeeId = _employeeId;
		this.employeeDept = _employeeDept;
		this.employeeSalary = _employeeSalary;
		System.out.println("Constructor sample got called");
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
