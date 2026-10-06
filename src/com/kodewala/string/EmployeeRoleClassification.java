package com.kodewala.string;

public class EmployeeRoleClassification extends EmployeeRoleClassificationParent {
	
	String role;
	double salary;
	
	public static void method1(String[] employeeRecords) {
		for(String employee: employeeRecords) {
			
			String[] employeeDetails = employee.split("\\|");
			
			String employeeId = employeeDetails[0];
			String employeeName = employeeDetails[1];
			String employeeRole = employeeDetails[2];
			double employeeSalary = Double.parseDouble(employeeDetails[3]);
			
			if(employeeId.startsWith("EMP") && employeeName.length() > 0) {
				employeeName = employeeName.toUpperCase();
				
				if(employeeRole.contains("Intern") || employeeSalary > 20000) {
					System.out.println(employeeName + " is an " + "Intern");
				} else if(employeeRole.contains("Senior") || employeeSalary > 75000) {
					System.out.println(employeeName + " is an " + "Senior Software Developer");
				} else {
					System.out.println(employeeName + " is an " + "Mid-level Software Developer");
				}
			}
			
			EmployeeRoleClassification obj1 = new EmployeeRoleClassification(employeeId, employeeName, employeeRole, employeeSalary);
			obj1.displayEmployee();
			
		}
	}
	
	public EmployeeRoleClassification(String _employeeId, String _name,  String _role, double _salary) {
		super(_name, _employeeId);
		this.role = _role;
		this.salary = _salary;
	}
	
	public void displayEmployee() {
		System.out.println("Employee Name is " + name + " and he is a " + role + ", having a salary of " + salary);
		
		
	}

}
