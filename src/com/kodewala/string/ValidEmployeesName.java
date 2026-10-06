package com.kodewala.string;

public class ValidEmployeesName extends ValidEmployeesNameParentClass {
	
	String role;
	String department;
	
	public static void method1(String[] employeeRecords) {
		
		for(String employee: employeeRecords) {
			String[] employeeDetails = employee.split("\\|");
			
			String  employeeId = employeeDetails[0];
			String employeeName = employeeDetails[1];
			String employeeEmailId = employeeDetails[4];
			String employeeRole = employeeDetails[2];
			String employeeDepartment = employeeDetails[3];
			
			if(employeeId.startsWith("EMP") && employeeEmailId.contains("@") && employeeRole.length() > 0 && employeeDepartment.length() > 0 ) {
				ValidEmployeesName employeeObject1 = new ValidEmployeesName(employeeId, employeeName, employeeEmailId, employeeRole, employeeDepartment);
				
				employeeName = employeeName.toUpperCase();
				
				employeeObject1.displayEmployeeProfile();
				
			}
		}
	}
	
	public ValidEmployeesName(String _employeeId, String _employeeName, String _emailId, String _role, String _department) {
		super(_employeeId, _employeeName, _emailId);
		this.role = _role;
		this.department = _department;
	}
	
	public void displayEmployeeProfile() {
		
		System.out.println("Emaployee Id is :" + employeeId);
		System.out.println("Emaployee Name is :" + employeeName);
		System.out.println("Emaployee Email Id is :" + emailId);
		System.out.println("Emaployee Role is :" + role);
		System.out.println("Emaployee department is :" + department);
	}
	

}
