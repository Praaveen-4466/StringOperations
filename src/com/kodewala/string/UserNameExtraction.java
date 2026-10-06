package com.kodewala.string;

public class UserNameExtraction extends EmployeeRoleClassificationParent {

	String employeeEmailId;
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
						System.out.println(employeeName +"'s is Perfect in all the sense");
					}
				}
				
				if(employeeDept.equals("Information Technology") || employeeDept.equalsIgnoreCase("IT")) {
					System.out.println(employeeName + " belongs to " + employeeDept + " department");
				}
				
				boolean validEmail = true;
				if(!employeeEmail.trim().isEmpty() && employeeEmail.contains("@") && employeeEmail.contains(".com")) {
					if(employeeEmail.indexOf("@") > employeeEmail.indexOf(".com")) {
						validEmail = false;
					}
				} else{
					validEmail = false;
				}
				
				if(validEmail) {
					String emailSubString = employeeEmail.substring(0, employeeEmail.indexOf("@"));
					System.out.println(employeeEmail + " is valid one");
					
					System.out.println(emailSubString + " is the  Sub-String of " + employeeEmail);
				}
				
			}
				
			
			UserNameExtraction obj1 = new UserNameExtraction(employeeId, employeeName, employeeRole, employeeDept, employeeSalary, employeeEmail);
			obj1.displayProfile();
		}
	}
	
	public UserNameExtraction(String _employeeId, String _name,  String _employeeRole, String _employeeDept, int _employeeSalary, String _employeeEmailId) {
		super(_name, _employeeId);
		
		this.employeeEmailId = _employeeEmailId;
		this.employeeRole = _employeeRole;
		this.employeeDept = _employeeDept;
		this.employeeSalary = _employeeSalary;
	}
	
	public void displayProfile() {
		System.out.println("====================================");
		System.out.println("Employee Name is :" + name);
		System.out.println("Employee Role is: " + employeeRole);
		System.out.println("Employee Dept is  " + employeeDept);
		System.out.println("Employee Slaary is " + employeeSalary);
		System.out.println("====================================");
	}
}
